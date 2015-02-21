/*
 * Copyright (C) 2015 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.singhinderjeet.gracenoteapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.singhinderjeet.json2java.ClassDefCollection;
import com.singhinderjeet.json2java.CustomMappings;
import com.singhinderjeet.json2java.Json2Java;

/**
 * Main class to generate the Gracenote classes.
 *
 * @author Inderjeet Singh
 */
public class Generator {

  public static void main(String[] args) throws Exception {
    File outputDir = new File("../model/src/main/java");
    String pkgName = "com.singhinderjeet.gracenoteapi";
    String fileCopyrightNotice = readAsString(new InputStreamReader(
        Generator.class.getResourceAsStream("/class-file-copyright-notice.txt")));
    String defaultClassComment = readAsString(new InputStreamReader(
        Generator.class.getResourceAsStream("/default-class-comment.txt")));
    Generator generator = new Generator(outputDir, pkgName, fileCopyrightNotice, defaultClassComment);
    generator.generateClasses();
  }

  public static String readAsString(Reader reader) {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader bufReader = new BufferedReader(reader)) {
      while (bufReader.ready()) {
        sb.append(bufReader.readLine()).append("\n");
      }
    } catch (IOException ignored) { }
    return sb.toString();
  }

  private final File outputDir;
  private final String pkgName;
  private final String fileCopyrightNotice;
  private final String defaultClassComment;
  private final Json2Java converter = new Json2Java();

  public Generator(File outputDir, String pkgName, String fileCopyrightNotice, String defaultClassComment) {
    this.outputDir = outputDir;
    this.pkgName = pkgName;
    this.fileCopyrightNotice = fileCopyrightNotice;
    this.defaultClassComment = defaultClassComment;
  }

  public void generateClasses() throws Exception {
    processJson("/lineup-details.json", "LineupDetails", null);
    processJson("/lineups-by-postal-code1.json", "LineupDetails", null);
    processJson("/lineups-by-postal-code2.json", "LineupDetails", null);

    CustomMappings imageMappings = new CustomMappings(); // Size and Aspect can be enums
    processJson("/images.json", "Image", imageMappings);

    CustomMappings channelMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapType("PreferredImage", "Image");
    processJson("/lineup-channels.json", "Channel", channelMappings);

    CustomMappings stationMappings = new CustomMappings()
      .addMappings(channelMappings);
    processJson("/station-details.json", "Station", stationMappings);

    processJson("/credits.json", "Credit", null);
    processJson("/awards.json", "Award", null);

    CustomMappings keywordMappings = new CustomMappings()
      .mapFieldName("Keywords", "Mood", "mood")
      .mapFieldName("Keywords", "Time Period", "timePeriod")
      .mapFieldName("Keywords", "Theme", "theme")
      .mapFieldName("Keywords", "Time Period", "timePeriod");

    CustomMappings programMappings = new CustomMappings()
      .mapType("OrigAirDate", "Date")
      .mapToArrayType("Cast", "Credit")
      .mapToArrayType("Crew", "Credit")
      .mapType("PreferredImage", "Image")
      .mapToArrayType("Ratings", "Rating")
      .mapToArrayType("Awards", "Award")
      .mapToArrayType("Recommendations", "Recommendation")
      .addMappings(imageMappings)
      .addMappings(keywordMappings);
    processJson("/program-details.json", "Program", programMappings);

    CustomMappings episodicProgramMappings = new CustomMappings()
      .addMappings(programMappings)
      .mapFieldName("EpisodicProgram", "shortdescription", "shortDescription");
    processJson("/episodic-program.json", "EpisodicProgram", episodicProgramMappings);

    CustomMappings movieMappings = new CustomMappings()
      .addMappings(programMappings);
    processJson("/movie-program.json", "Movie", movieMappings);

    CustomMappings airingMappings = new CustomMappings()
      .mapType("StartTime", "Date")
      .mapType("EndTime", "Date")
      .addMappings(programMappings);

    CustomMappings airingsMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapToArrayType("Airings", "Airing")
      .addMappings(airingMappings)
      .addMappings(programMappings);
    processJson("/lineup-airings-basic-size.json", "LineupAirings", airingsMappings);
    processJson("/lineup-airings-detailed-size.json", "LineupAirings", airingsMappings);

    CustomMappings stationAiringsMappings = new CustomMappings()
      .addMappings(airingMappings)
      .addMappings(stationMappings);
    processJson("/station-airings.json", "StationAiring", stationAiringsMappings);

    ClassDefCollection classes = converter.getClasses();
    classes.setFileCopyrightNotice(fileCopyrightNotice);
    classes.setDefaultClassComment(defaultClassComment);
    classes.generateClasses(outputDir, "    ");
  }

  private void processJson(String file, String rootClass, CustomMappings mappings) throws Exception {
    InputStream json = Generator.class.getResourceAsStream(file);
    InputStreamReader reader = new InputStreamReader(json, "UTF-8");
    converter.processJson(reader, pkgName, rootClass, mappings);
  }
}

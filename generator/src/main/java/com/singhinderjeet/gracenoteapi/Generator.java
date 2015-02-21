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

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

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
    Generator generator = new Generator();

    generator.processJson("/lineup-details.json", "LineupDetails", null);
    generator.processJson("/lineups-by-postal-code1.json", "LineupDetails", null);
    generator.processJson("/lineups-by-postal-code2.json", "LineupDetails", null);

    CustomMappings imageMappings = new CustomMappings(); // Size and Aspect can be enums
    generator.processJson("/images.json", "Image", imageMappings);

    CustomMappings channelMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapType("PreferredImage", "Image");
    generator.processJson("/lineup-channels.json", "Channel", channelMappings);

    CustomMappings stationMappings = new CustomMappings()
      .addMappings(channelMappings);
    generator.processJson("/station-details.json", "Station", stationMappings);

    generator.processJson("/credits.json", "Credit", null);
    generator.processJson("/awards.json", "Award", null);

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
    generator.processJson("/program-details.json", "Program", programMappings);

    CustomMappings episodicProgramMappings = new CustomMappings()
      .addMappings(programMappings)
      .mapFieldName("EpisodicProgram", "shortdescription", "shortDescription");
    generator.processJson("/episodic-program.json", "EpisodicProgram", episodicProgramMappings);

    CustomMappings movieMappings = new CustomMappings()
      .addMappings(programMappings);
    generator.processJson("/movie-program.json", "Movie", movieMappings);

    CustomMappings airingMappings = new CustomMappings()
      .mapType("StartTime", "Date")
      .mapType("EndTime", "Date")
      .addMappings(programMappings);

    CustomMappings airingsMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapToArrayType("Airings", "Airing")
      .addMappings(airingMappings)
      .addMappings(programMappings);
    generator.processJson("/lineup-airings-basic-size.json", "LineupAirings", airingsMappings);
    generator.processJson("/lineup-airings-detailed-size.json", "LineupAirings", airingsMappings);

    CustomMappings stationAiringsMappings = new CustomMappings()
      .addMappings(airingMappings)
      .addMappings(stationMappings);
    generator.processJson("/station-airings.json", "StationAiring", stationAiringsMappings);

    generator.generateClasses();
  }

  private final Json2Java converter = new Json2Java();

  private void processJson(String file, String rootClass, CustomMappings mappings) throws Exception {
    InputStream json = Generator.class.getResourceAsStream(file);
    InputStreamReader reader = new InputStreamReader(json, "UTF-8");
    converter.processJson(reader, "com.singhinderjeet.gracenoteapi", rootClass, mappings);
  }

  private void generateClasses() throws Exception {
    File dir = new File("../model/src/main/java");
    ClassDefCollection classes = converter.getClasses();
    classes.generateClasses(dir, "    ");
  }
}

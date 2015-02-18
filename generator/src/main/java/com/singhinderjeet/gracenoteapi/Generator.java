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
    CustomMappings msoMappings = new CustomMappings()
      .mapType("Id", "String");
    CustomMappings lineupMappings = new CustomMappings()
      .mapType("Type", "String")
      .mapType("LineupId", "String")
      .mapType("Name", "String")
      .mapType("Device", "String")
      .mapType("Location", "String")
      .addMappings(msoMappings);

    generator.processJson("/lineup-details.json", "LineupDetails", lineupMappings);
    generator.processJson("/lineups-by-postal-code1.json", "LineupDetails", lineupMappings);
    generator.processJson("/lineups-by-postal-code2.json", "LineupDetails", lineupMappings);

    CustomMappings imageMappings = new CustomMappings()
      .mapType("Uri", "String")
      .mapType("Height", "int")
      .mapType("Width", "int")
      .mapType("Primary", "boolean")
      .mapType("Category", "String")
      .mapType("Text", "String")
      .mapType("Tier", "String");
    CustomMappings channelMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapType("CallSign", "String")
      .mapType("Channel", "String")
      .mapType("StationId", "String")
      .mapType("AffiliateId", "String")
      .mapType("AffiliateCallSign", "String")
      .mapType("PreferredImage", "Image");
    generator.processJson("/lineup-channels.json", "Channel", channelMappings);
    CustomMappings stationMappings = new CustomMappings()
      .addMappings(channelMappings)
      .mapType("Name", "String")
      .mapToArrayType("BcastLangs", "String")
      .mapToArrayType("EdLangs", "String")
      .mapType("Type", "String");
    generator.processJson("/station-details.json", "Station", stationMappings);

    CustomMappings ratingMappings = new CustomMappings()
      .mapType("Body", "String")
      .mapType("Code", "String");

    CustomMappings programMappings = new CustomMappings()
      .mapType("TmsId", "String")
      .mapType("RootId", "String")
      .mapType("SeriesId", "String")
      .mapType("SubType", "String")
      .mapType("Title", "String")
      .mapType("ReleaseYear", "String")
      .mapType("ReleaseDate", "String")
      .mapType("OrigAirDate", "Date")
      .mapType("TitleLang", "String")
      .mapType("DescriptionLang", "String")
      .mapType("EntityType", "String")
      .mapToArrayType("Genres", "String")
      .mapType("ShortDescription", "String")
      .mapType("LongDescription", "String")
      .mapToArrayType("TopCast", "String")
      .mapToArrayType("Directors", "String")
      .mapType("PreferredImage", "Image")
      .addMappings(ratingMappings);

    CustomMappings airingMappings = new CustomMappings()
      .mapType("StartTime", "Date")
      .mapType("EndTime", "Date")
      .mapType("Duration", "int")
      .mapToArrayType("Qualifiers", "String")
      .mapType("StationId", "String")
      .mapToArrayType("Channels", "String")
      .mapToArrayType("Ratings", "Rating")
      .addMappings(programMappings);

    CustomMappings airingsMappings = new CustomMappings()
      .mapType("StationId", "String")
      .mapType("CallSign", "String")
      .mapType("Channel", "String")
      .addMappings(imageMappings)
      .mapToArrayType("Airings", "Airing")
      .addMappings(airingMappings)
      .addMappings(programMappings);
    generator.processJson("/lineup-airings-basic-size.json", "LineupAirings", airingsMappings);
    generator.processJson("/lineup-airings-detailed-size.json", "LineupAirings", airingsMappings);
    //generator.applyCustomMappings();
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

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
    generator.processJson("/lineup-details.json", "LineupDetails");
    generator.processJson("/lineups-by-postal-code1.json", "Lineup");
    generator.processJson("/lineups-by-postal-code2.json", "Lineup");
    generator.processJson("/lineup-channels.json", "ChannelDetails");
    generator.processJson("/lineup-airings-basic-size.json", "LineupAirings");
    generator.processJson("/lineup-airings-detailed-size.json", "LineupAirings");
    generator.applyCustomMappings();
    generator.generateClasses();
  }

  private final Json2Java converter = new Json2Java();

  private void processJson(String file, String rootClass) throws Exception {
    InputStream json = Generator.class.getResourceAsStream(file);
    InputStreamReader reader = new InputStreamReader(json, "UTF-8");
    converter.processJson(reader, "com.singhinderjeet.gracenoteapi", rootClass);
  }

  private void applyCustomMappings() {
    CustomMappings mappings = new CustomMappings()
      .mapType("LineupId", "String")
      .mapType("Id", "String")
      .mapType("Name", "String")
      .mapType("Type", "String")
      .mapType("Device", "String")
      .mapType("Location", "String")
      // channel
      .mapType("CallSign", "String")
      .mapType("Channel", "String")
      .mapType("StationId", "String")
      .mapType("AffiliateId", "String")
      .mapType("AffiliateCallSign", "String")
      .mapType("PreferredImage", "Image")
      // Image details
      .mapType("Uri", "String")
      .mapType("Height", "int")
      .mapType("Width", "int")
      .mapType("Primary", "boolean")
      .mapType("Category", "String")
      .mapType("Text", "String")
      .mapType("Tier", "String")
      // LineupAirings
      .mapType("Airings", "Airing")
      .mapType("Qualifiers", "String")
      .mapType("Channels", "String")
      .mapType("StartTime", "Date")
      .mapType("EndTime", "Date")
      .mapType("Duration", "Date")
      .mapType("Ratings", "Rating")
      // Airing - Rating
      .mapType("Body", "String")
      .mapType("Code", "String")
      // Program
      .mapType("TmsId", "String")
      .mapType("RootId", "String")
      .mapType("SeriesId", "String")
      .mapType("SubType", "String")
      .mapType("Title", "String")
      .mapType("ReleaseYear", "String")
      .mapType("ReleaseDate", "Date")
      .mapType("OrigAirDate", "Date")
      .mapType("TitleLang", "String")
      .mapType("DescriptionLang", "String")
      .mapType("EntityType", "String")
      .mapType("Genres", "String")
      .mapType("ShortDescription", "String")
      .mapType("LongDescription", "String")
      .mapType("TopCast", "String")
      ;
    converter.transform(mappings);
    mappings = new CustomMappings()
      .mapType("ChannelDetails", "Channel"); // Rename ChannelDetails to Channel
    converter.transform(mappings);
  }

  private void generateClasses() throws Exception {
    File dir = new File("../model/src/main/java");
    ClassDefCollection classes = converter.getClasses();
    classes.generateClasses(dir, "    ");
  }
}

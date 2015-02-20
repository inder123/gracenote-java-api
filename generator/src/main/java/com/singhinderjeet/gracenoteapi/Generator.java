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

    CustomMappings commonMappings = new CustomMappings()
      .mapType("TmsId", "String")
      .mapType("RootId", "String")
      .mapType("Lang", "String");

    CustomMappings imageMappings = new CustomMappings()
      .mapType("Uri", "String")
      .mapType("Height", "int")
      .mapType("Width", "int")
      .mapType("Primary", "boolean")
      .mapType("Category", "String")
      .mapType("Text", "String")
      .mapType("Tier", "String")
      .mapType("Size", "String")  // could be enum
      .mapType("Aspect", "String")  // could be enum
      .mapType("Content", "String")
      .addMappings(commonMappings);
    generator.processJson("/images.json", "Image", imageMappings);

    CustomMappings channelMappings = new CustomMappings()
      .addMappings(imageMappings)
      .mapType("CallSign", "String")
      .mapType("Channel", "String")
      .mapType("StationId", "String")
      .mapType("AffiliateId", "String")
      .mapType("AffiliateCallSign", "String")
      .mapType("PreferredImage", "Image");
    // ChannelDetails will be renamed to Channel later.
    // We name it something different because Channel occurs otherwise in JSON as a String.
    generator.processJson("/lineup-channels.json", "ChannelDetails", channelMappings);
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

    CustomMappings creditMappings = new CustomMappings()
      .mapType("PersonId", "String")
      .mapType("NameId", "String")
      .mapType("Name", "String")
      .mapType("Title", "String")
      .mapType("Role", "String")
      .mapType("BillingOrder", "String")
      .mapType("CharacterName", "String")
      .mapType("Year", "String")
      .mapType("Type", "String")
      .addMappings(commonMappings);
    generator.processJson("/credits.json", "Credit", creditMappings);

    CustomMappings recommendationMappings = new CustomMappings()
      .addMappings(commonMappings)
      .mapType("Root", "String")
      .mapType("Title", "String");

    CustomMappings awardMappings = new CustomMappings()
      .addMappings(commonMappings)
      .mapType("AwardId", "String")
      .mapType("Recipient", "String")
      .mapType("Name", "String")
      .mapType("AwardName", "String")
      .mapType("PersonId", "String")
      .mapType("Year", "String")
      .mapType("Won", "boolean")
      .mapType("Category", "String")
      .mapType("AwardCatId", "String");
    generator.processJson("/awards.json", "Award", awardMappings);

    CustomMappings keywordMappings = new CustomMappings()
      .mapToArrayType("Mood", "String")
      .mapFieldName("Keywords", "Mood", "mood")
      .mapFieldName("Keywords", "Time Period", "timePeriod")
      .mapFieldName("Keywords", "Theme", "theme")
      .mapFieldName("Keywords", "Time Period", "timePeriod")
      .mapToArrayType("Time Period", "String")
      .mapToArrayType("Theme", "String")
      .mapToArrayType("Character", "String")
      .mapToArrayType("Setting", "String")
      .mapToArrayType("Subject", "String");

    CustomMappings qualityRatingMappings = new CustomMappings()
      .mapType("RatingsBody", "String")
      .mapType("Value", "String");

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
      .mapType("TotalEpisodes", "int")
      .mapType("TotalSeasons", "int")
      .mapToArrayType("Cast", "Credit")
      .mapToArrayType("Crew", "Credit")
      .mapToArrayType("TopCast", "String")
      .mapToArrayType("Directors", "String")
      .mapType("PreferredImage", "Image")
      .mapToArrayType("Ratings", "Rating")
      .mapToArrayType("Awards", "Award")
      .mapToArrayType("Recommendations", "Recommendation")
      .addMappings(imageMappings)
      .addMappings(ratingMappings)
      .addMappings(creditMappings)
      .addMappings(recommendationMappings)
      .addMappings(awardMappings)
      .addMappings(keywordMappings);
    generator.processJson("/program-details.json", "Program", programMappings);

    CustomMappings episodicProgramMappings = new CustomMappings()
      .addMappings(programMappings)
      .mapFieldName("EpisodicProgram", "shortdescription", "shortDescription")
      .mapType("Shortdescription", "String")
      .mapType("EpisodeTitle", "String")
      .mapType("SeasonNum", "int")
      .mapType("EpisodeNum", "int");
    generator.processJson("/episodic-program.json", "EpisodicProgram", episodicProgramMappings);

    CustomMappings movieMappings = new CustomMappings()
      .addMappings(programMappings)
      .addMappings(qualityRatingMappings)
      .mapType("OfficialUrl", "String")
      .mapType("RunTime", "String")
      .mapToArrayType("Advisories", "String");
    generator.processJson("/movie-program.json", "Movie", movieMappings);

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

    CustomMappings stationAiringsMappings = new CustomMappings()
      .addMappings(airingMappings)
      .addMappings(stationMappings);
    generator.processJson("/station-airings.json", "StationAiring", stationAiringsMappings);

    CustomMappings adjustments = new CustomMappings()
      .mapType("ChannelDetails", "Channel");
    generator.apply(adjustments);
    generator.generateClasses();
  }

  private final Json2Java converter = new Json2Java();

  private void processJson(String file, String rootClass, CustomMappings mappings) throws Exception {
    InputStream json = Generator.class.getResourceAsStream(file);
    InputStreamReader reader = new InputStreamReader(json, "UTF-8");
    converter.processJson(reader, "com.singhinderjeet.gracenoteapi", rootClass, mappings);
  }

  private void apply(CustomMappings mappings) {
    converter.transform(mappings);
  }

  private void generateClasses() throws Exception {
    File dir = new File("../model/src/main/java");
    ClassDefCollection classes = converter.getClasses();
    classes.generateClasses(dir, "    ");
  }
}

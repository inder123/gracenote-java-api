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

import java.util.List;

/**
 * The SportsEventProgram class
 *
 * @author Inderjeet Singh
 */
public class SportsEventProgram extends Program {

    private final String eventTitle;
    private final String gameDate;
    private final String gameTime;
    private final String gameTimeZone;
    private final String organizationId;
    private final Season season;
    private final String sportsId;
    private final List<Team> teams;
    private final Venue venue;

    public SportsEventProgram(List<Award> awards, List<Credit> cast, List<Credit> crew, String descriptionLang, List<String> directors, String entityType, String episodeTitle, List<String> genres, Keywords keywords, String longDescription, String origAirDate, Image preferredImage, List<Rating> ratings, List<Recommendation> recommendations, String releaseDate, int releaseYear, String rootId, String seriesId, String shortDescription, String subType, String title, String titleLang, String tmsId, List<String> topCast, String eventTitle, String gameDate, String gameTime, String gameTimeZone, String organizationId, Season season, String sportsId, List<Team> teams, Venue venue) {
        super(awards, cast, crew, descriptionLang, directors, entityType, episodeTitle, genres, keywords, longDescription, origAirDate, preferredImage, ratings, recommendations, releaseDate, releaseYear, rootId, seriesId, shortDescription, subType, title, titleLang, tmsId, topCast);
        this.eventTitle = eventTitle;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
        this.gameTimeZone = gameTimeZone;
        this.organizationId = organizationId;
        this.season = season;
        this.sportsId = sportsId;
        this.teams = teams;
        this.venue = venue;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getGameDate() {
        return gameDate;
    }

    public String getGameTime() {
        return gameTime;
    }

    public String getGameTimeZone() {
        return gameTimeZone;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public Season getSeason() {
        return season;
    }

    public String getSportsId() {
        return sportsId;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Venue getVenue() {
        return venue;
    }
}

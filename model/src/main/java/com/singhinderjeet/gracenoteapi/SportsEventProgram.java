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

import java.util.Date;
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
    private final String sportsId;
    private final List<Team> teams;
    private final Venue venue;
    private final Season season;

    public SportsEventProgram(String tmsId, String rootId, String subType, String title, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String longDescription, String shortDescription, List<Credit> cast, List<Credit> crew, List<Award> awards, Keywords keywords, List<Rating> ratings, List<Recommendation> recommendations, Image preferredImage, String seriesId, String episodeTitle, int releaseYear, String releaseDate, List<String> topCast, List<String> directors, String eventTitle, String gameDate, String gameTime, String gameTimeZone, String organizationId, String sportsId, List<Team> teams, Venue venue, Season season) {
        super(tmsId, rootId, subType, title, origAirDate, titleLang, descriptionLang, entityType, genres, longDescription, shortDescription, cast, crew, awards, keywords, ratings, recommendations, preferredImage, seriesId, episodeTitle, releaseYear, releaseDate, topCast, directors);
        this.eventTitle = eventTitle;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
        this.gameTimeZone = gameTimeZone;
        this.organizationId = organizationId;
        this.sportsId = sportsId;
        this.teams = teams;
        this.venue = venue;
        this.season = season;
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

    public String getSportsId() {
        return sportsId;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Venue getVenue() {
        return venue;
    }

    public Season getSeason() {
        return season;
    }
}

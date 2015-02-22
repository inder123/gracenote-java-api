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
public class SportsEventProgram {

    private final String tmsId;
    private final String rootId;
    private final String seriesId;
    private final String title;
    private final String titleLang;
    private final String shortDescription;
    private final String longDescription;
    private final String descriptionLang;
    private final List<String> genres;
    private final String eventTitle;
    private final String subType;
    private final String gameDate;
    private final String gameTime;
    private final String gameTimeZone;
    private final String organizationId;
    private final String sportsId;
    private final List<Team> teams;
    private final Venue venue;
    private final Season season;
    private final Image preferredImage;
    private final String entityType;

    public SportsEventProgram(String tmsId, String rootId, String seriesId, String title, String titleLang, String shortDescription, String longDescription, String descriptionLang, List<String> genres, String eventTitle, String subType, String gameDate, String gameTime, String gameTimeZone, String organizationId, String sportsId, List<Team> teams, Venue venue, Season season, Image preferredImage, String entityType) {
        this.tmsId = tmsId;
        this.rootId = rootId;
        this.seriesId = seriesId;
        this.title = title;
        this.titleLang = titleLang;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.descriptionLang = descriptionLang;
        this.genres = genres;
        this.eventTitle = eventTitle;
        this.subType = subType;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
        this.gameTimeZone = gameTimeZone;
        this.organizationId = organizationId;
        this.sportsId = sportsId;
        this.teams = teams;
        this.venue = venue;
        this.season = season;
        this.preferredImage = preferredImage;
        this.entityType = entityType;
    }

    public String getTmsId() {
        return tmsId;
    }

    public String getRootId() {
        return rootId;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLang() {
        return titleLang;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getDescriptionLang() {
        return descriptionLang;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getSubType() {
        return subType;
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

    public Image getPreferredImage() {
        return preferredImage;
    }

    public String getEntityType() {
        return entityType;
    }
}

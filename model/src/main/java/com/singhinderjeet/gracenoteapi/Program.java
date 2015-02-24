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
 * The Program class
 *
 * @author Inderjeet Singh
 */
public class Program {

    private final String tmsId;
    private final String rootId;
    private final String subType;
    private final String title;
    private final Date origAirDate;
    private final String titleLang;
    private final String descriptionLang;
    private final String entityType;
    private final List<String> genres;
    private final String longDescription;
    private final String shortDescription;
    private final List<Credit> cast;
    private final List<Credit> crew;
    private final List<Award> awards;
    private final Keywords keywords;
    private final List<Rating> ratings;
    private final List<Recommendation> recommendations;
    private final Image preferredImage;
    private final String seriesId;
    private final String episodeTitle;
    private final int releaseYear;
    private final String releaseDate;
    private final List<String> topCast;
    private final List<String> directors;

    public Program(String tmsId, String rootId, String subType, String title, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String longDescription, String shortDescription, List<Credit> cast, List<Credit> crew, List<Award> awards, Keywords keywords, List<Rating> ratings, List<Recommendation> recommendations, Image preferredImage, String seriesId, String episodeTitle, int releaseYear, String releaseDate, List<String> topCast, List<String> directors) {
        this.tmsId = tmsId;
        this.rootId = rootId;
        this.subType = subType;
        this.title = title;
        this.origAirDate = origAirDate;
        this.titleLang = titleLang;
        this.descriptionLang = descriptionLang;
        this.entityType = entityType;
        this.genres = genres;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.cast = cast;
        this.crew = crew;
        this.awards = awards;
        this.keywords = keywords;
        this.ratings = ratings;
        this.recommendations = recommendations;
        this.preferredImage = preferredImage;
        this.seriesId = seriesId;
        this.episodeTitle = episodeTitle;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
        this.topCast = topCast;
        this.directors = directors;
    }

    public String getTmsId() {
        return tmsId;
    }

    public String getRootId() {
        return rootId;
    }

    public String getSubType() {
        return subType;
    }

    public String getTitle() {
        return title;
    }

    public Date getOrigAirDate() {
        return origAirDate;
    }

    public String getTitleLang() {
        return titleLang;
    }

    public String getDescriptionLang() {
        return descriptionLang;
    }

    public String getEntityType() {
        return entityType;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public List<Credit> getCast() {
        return cast;
    }

    public List<Credit> getCrew() {
        return crew;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getTopCast() {
        return topCast;
    }

    public List<String> getDirectors() {
        return directors;
    }
}

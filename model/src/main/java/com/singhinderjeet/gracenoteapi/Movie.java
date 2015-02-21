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

public class Movie {

    private final List<String> advisories;
    private final List<Credit> cast;
    private final List<Credit> crew;
    private final String descriptionLang;
    private final List<String> directors;
    private final String entityType;
    private final List<String> genres;
    private final Keywords keywords;
    private final String longDescription;
    private final String officialUrl;
    private final Image preferredImage;
    private final QualityRating qualityRating;
    private final List<Rating> ratings;
    private final List<Recommendation> recommendations;
    private final int releaseYear;
    private final String rootId;
    private final String runTime;
    private final String shortDescription;
    private final String subType;
    private final String title;
    private final String titleLang;
    private final String tmsId;

    public Movie(List<String> advisories, List<Credit> cast, List<Credit> crew, String descriptionLang, List<String> directors, String entityType, List<String> genres, Keywords keywords, String longDescription, String officialUrl, Image preferredImage, QualityRating qualityRating, List<Rating> ratings, List<Recommendation> recommendations, int releaseYear, String rootId, String runTime, String shortDescription, String subType, String title, String titleLang, String tmsId) {
        this.advisories = advisories;
        this.cast = cast;
        this.crew = crew;
        this.descriptionLang = descriptionLang;
        this.directors = directors;
        this.entityType = entityType;
        this.genres = genres;
        this.keywords = keywords;
        this.longDescription = longDescription;
        this.officialUrl = officialUrl;
        this.preferredImage = preferredImage;
        this.qualityRating = qualityRating;
        this.ratings = ratings;
        this.recommendations = recommendations;
        this.releaseYear = releaseYear;
        this.rootId = rootId;
        this.runTime = runTime;
        this.shortDescription = shortDescription;
        this.subType = subType;
        this.title = title;
        this.titleLang = titleLang;
        this.tmsId = tmsId;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public List<Credit> getCast() {
        return cast;
    }

    public List<Credit> getCrew() {
        return crew;
    }

    public String getDescriptionLang() {
        return descriptionLang;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public String getEntityType() {
        return entityType;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getOfficialUrl() {
        return officialUrl;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public QualityRating getQualityRating() {
        return qualityRating;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getRootId() {
        return rootId;
    }

    public String getRunTime() {
        return runTime;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSubType() {
        return subType;
    }

    public String getTitle() {
        return title;
    }

    public String getTitleLang() {
        return titleLang;
    }

    public String getTmsId() {
        return tmsId;
    }
}

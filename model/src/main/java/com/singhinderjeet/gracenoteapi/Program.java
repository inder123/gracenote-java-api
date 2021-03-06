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
 * The Program class
 *
 * @author Inderjeet Singh
 */
public class Program {

    private final List<Award> awards;
    private final List<Credit> cast;
    private final List<Credit> crew;
    private final String descriptionLang;
    private final String entityType;
    private final List<String> genres;
    private final Keywords keywords;
    private final String longDescription;
    private final String origAirDate;
    private final Image preferredImage;
    private final List<Rating> ratings;
    private final List<Recommendation> recommendations;
    private final String releaseDate;
    private final String rootId;
    private final String shortDescription;
    private final String subType;
    private final String title;
    private final String titleLang;
    private final String tmsId;
    private final List<String> topCast;

    public Program(List<Award> awards, List<Credit> cast, List<Credit> crew, String descriptionLang, String entityType, List<String> genres, Keywords keywords, String longDescription, String origAirDate, Image preferredImage, List<Rating> ratings, List<Recommendation> recommendations, String releaseDate, String rootId, String shortDescription, String subType, String title, String titleLang, String tmsId, List<String> topCast) {
        this.awards = awards;
        this.cast = cast;
        this.crew = crew;
        this.descriptionLang = descriptionLang;
        this.entityType = entityType;
        this.genres = genres;
        this.keywords = keywords;
        this.longDescription = longDescription;
        this.origAirDate = origAirDate;
        this.preferredImage = preferredImage;
        this.ratings = ratings;
        this.recommendations = recommendations;
        this.releaseDate = releaseDate;
        this.rootId = rootId;
        this.shortDescription = shortDescription;
        this.subType = subType;
        this.title = title;
        this.titleLang = titleLang;
        this.tmsId = tmsId;
        this.topCast = topCast;
    }

    public List<Award> getAwards() {
        return awards;
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

    public String getOrigAirDate() {
        return origAirDate;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRootId() {
        return rootId;
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

    public List<String> getTopCast() {
        return topCast;
    }
}

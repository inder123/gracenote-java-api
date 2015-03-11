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
 * The Movie class
 *
 * @author Inderjeet Singh
 */
public class Movie extends Program {

    private final List<String> advisories;
    private final List<String> directors;
    private final String officialUrl;
    private final QualityRating qualityRating;
    private final int releaseYear;
    private final String runTime;

    public Movie(List<Award> awards, List<Credit> cast, List<Credit> crew, String descriptionLang, String entityType, List<String> genres, Keywords keywords, String longDescription, String origAirDate, Image preferredImage, List<Rating> ratings, List<Recommendation> recommendations, String releaseDate, String rootId, String shortDescription, String subType, String title, String titleLang, String tmsId, List<String> topCast, List<String> advisories, List<String> directors, String officialUrl, QualityRating qualityRating, int releaseYear, String runTime) {
        super(awards, cast, crew, descriptionLang, entityType, genres, keywords, longDescription, origAirDate, preferredImage, ratings, recommendations, releaseDate, rootId, shortDescription, subType, title, titleLang, tmsId, topCast);
        this.advisories = advisories;
        this.directors = directors;
        this.officialUrl = officialUrl;
        this.qualityRating = qualityRating;
        this.releaseYear = releaseYear;
        this.runTime = runTime;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public String getOfficialUrl() {
        return officialUrl;
    }

    public QualityRating getQualityRating() {
        return qualityRating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getRunTime() {
        return runTime;
    }
}

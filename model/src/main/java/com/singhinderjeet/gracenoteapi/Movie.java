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
 * The Movie class
 *
 * @author Inderjeet Singh
 */
public class Movie extends Program {

    private final List<String> advisories;
    private final String officialUrl;
    private final QualityRating qualityRating;
    private final String runTime;

    public Movie(List<Award> awards, List<Credit> cast, List<Credit> crew, String descriptionLang, List<String> directors, String entityType, String episodeTitle, List<String> genres, Keywords keywords, String longDescription, Date origAirDate, Image preferredImage, List<Rating> ratings, List<Recommendation> recommendations, String releaseDate, int releaseYear, String rootId, String seriesId, String shortDescription, String subType, String title, String titleLang, String tmsId, List<String> topCast, List<String> advisories, String officialUrl, QualityRating qualityRating, String runTime) {
        super(awards, cast, crew, descriptionLang, directors, entityType, episodeTitle, genres, keywords, longDescription, origAirDate, preferredImage, ratings, recommendations, releaseDate, releaseYear, rootId, seriesId, shortDescription, subType, title, titleLang, tmsId, topCast);
        this.advisories = advisories;
        this.officialUrl = officialUrl;
        this.qualityRating = qualityRating;
        this.runTime = runTime;
    }

    public List<String> getAdvisories() {
        return advisories;
    }

    public String getOfficialUrl() {
        return officialUrl;
    }

    public QualityRating getQualityRating() {
        return qualityRating;
    }

    public String getRunTime() {
        return runTime;
    }
}

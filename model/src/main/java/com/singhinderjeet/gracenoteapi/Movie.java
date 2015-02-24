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

    public Movie(String tmsId, String rootId, String subType, String title, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String longDescription, String shortDescription, List<Credit> cast, List<Credit> crew, List<Award> awards, Keywords keywords, List<Rating> ratings, List<Recommendation> recommendations, Image preferredImage, String seriesId, String episodeTitle, int releaseYear, String releaseDate, List<String> topCast, List<String> directors, List<String> advisories, String officialUrl, QualityRating qualityRating, String runTime) {
        super(tmsId, rootId, subType, title, origAirDate, titleLang, descriptionLang, entityType, genres, longDescription, shortDescription, cast, crew, awards, keywords, ratings, recommendations, preferredImage, seriesId, episodeTitle, releaseYear, releaseDate, topCast, directors);
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

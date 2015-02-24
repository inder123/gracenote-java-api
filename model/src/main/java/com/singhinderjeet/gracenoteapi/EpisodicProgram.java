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
 * The EpisodicProgram class
 *
 * @author Inderjeet Singh
 */
public class EpisodicProgram extends Program {

    private final int totalEpisodes;
    private final String totalSeasons;
    private final int seasonNum;
    private final int episodeNum;

    public EpisodicProgram(String tmsId, String rootId, String subType, String title, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String longDescription, String shortDescription, List<Credit> cast, List<Credit> crew, List<Award> awards, Keywords keywords, List<Rating> ratings, List<Recommendation> recommendations, Image preferredImage, String seriesId, String episodeTitle, int releaseYear, String releaseDate, List<String> topCast, List<String> directors, int totalEpisodes, String totalSeasons, int seasonNum, int episodeNum) {
        super(tmsId, rootId, subType, title, origAirDate, titleLang, descriptionLang, entityType, genres, longDescription, shortDescription, cast, crew, awards, keywords, ratings, recommendations, preferredImage, seriesId, episodeTitle, releaseYear, releaseDate, topCast, directors);
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
        this.seasonNum = seasonNum;
        this.episodeNum = episodeNum;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }
}

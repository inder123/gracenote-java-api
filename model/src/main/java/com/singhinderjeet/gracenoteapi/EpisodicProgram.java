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
 * The EpisodicProgram class
 *
 * @author Inderjeet Singh
 */
public class EpisodicProgram extends Program {

    private final Image episodeImage;
    private final int episodeNum;
    private final String episodeTitle;
    private final int seasonNum;
    private final String seriesId;
    private final int totalEpisodes;
    private final String totalSeasons;

    public EpisodicProgram(List<Award> awards, List<Credit> cast, List<Credit> crew, String descriptionLang, String entityType, List<String> genres, Keywords keywords, String longDescription, String origAirDate, Image preferredImage, List<Rating> ratings, List<Recommendation> recommendations, String releaseDate, String rootId, String shortDescription, String subType, String title, String titleLang, String tmsId, List<String> topCast, Image episodeImage, int episodeNum, String episodeTitle, int seasonNum, String seriesId, int totalEpisodes, String totalSeasons) {
        super(awards, cast, crew, descriptionLang, entityType, genres, keywords, longDescription, origAirDate, preferredImage, ratings, recommendations, releaseDate, rootId, shortDescription, subType, title, titleLang, tmsId, topCast);
        this.episodeImage = episodeImage;
        this.episodeNum = episodeNum;
        this.episodeTitle = episodeTitle;
        this.seasonNum = seasonNum;
        this.seriesId = seriesId;
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
    }

    public Image getEpisodeImage() {
        return episodeImage;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }
}

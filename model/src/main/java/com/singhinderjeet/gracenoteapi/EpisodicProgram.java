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

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class EpisodicProgram {

    private final String tmsId;
    private final String rootId;
    private final String seriesId;
    private final String title;
    private final String titleLang;
    @SerializedName("shortdescription")
    private final String shortDescription;
    private final String longDescription;
    private final String descriptionLang;
    private final String subType;
    private final List<String> genres;
    private final Date origAirDate;
    private final Image preferredImage;
    private final String episodeTitle;
    private final int seasonNum;
    private final int episodeNum;
    private final String entityType;

    public EpisodicProgram(String tmsId, String rootId, String seriesId, String title, String titleLang, String shortDescription, String longDescription, String descriptionLang, String subType, List<String> genres, Date origAirDate, Image preferredImage, String episodeTitle, int seasonNum, int episodeNum, String entityType) {
        this.tmsId = tmsId;
        this.rootId = rootId;
        this.seriesId = seriesId;
        this.title = title;
        this.titleLang = titleLang;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.descriptionLang = descriptionLang;
        this.subType = subType;
        this.genres = genres;
        this.origAirDate = origAirDate;
        this.preferredImage = preferredImage;
        this.episodeTitle = episodeTitle;
        this.seasonNum = seasonNum;
        this.episodeNum = episodeNum;
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

    public String getSubType() {
        return subType;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Date getOrigAirDate() {
        return origAirDate;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getSeasonNum() {
        return seasonNum;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }

    public String getEntityType() {
        return entityType;
    }
}

package com.singhinderjeet.gracenoteapi;

import java.util.Date;
import java.util.List;

public class Program {

    private final String tmsId;
    private final String rootId;
    private final String seriesId;
    private final String subType;
    private final String title;
    private final String releaseYear;
    private final String releaseDate;
    private final Date origAirDate;
    private final String titleLang;
    private final String descriptionLang;
    private final String entityType;
    private final List<String> genres;
    private final String shortDescription;
    private final String longDescription;
    private final List<String> topCast;
    private final Image preferredImage;
    private final List<String> directors;

    public Program(String tmsId, String rootId, String seriesId, String subType, String title, String releaseYear, String releaseDate, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String shortDescription, String longDescription, List<String> topCast, Image preferredImage, List<String> directors) {
        this.tmsId = tmsId;
        this.rootId = rootId;
        this.seriesId = seriesId;
        this.subType = subType;
        this.title = title;
        this.releaseYear = releaseYear;
        this.releaseDate = releaseDate;
        this.origAirDate = origAirDate;
        this.titleLang = titleLang;
        this.descriptionLang = descriptionLang;
        this.entityType = entityType;
        this.genres = genres;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.topCast = topCast;
        this.preferredImage = preferredImage;
        this.directors = directors;
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

    public String getSubType() {
        return subType;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getReleaseDate() {
        return releaseDate;
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

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public List<String> getTopCast() {
        return topCast;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public List<String> getDirectors() {
        return directors;
    }
}

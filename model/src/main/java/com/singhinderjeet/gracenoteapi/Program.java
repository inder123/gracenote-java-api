package com.singhinderjeet.gracenoteapi;

import java.util.Date;
import java.util.List;

public class Program {

    private final String tmsId;
    private final String rootId;
    private final String seriesId;
    private final String subType;
    private final String title;
    private final Date origAirDate;
    private final String titleLang;
    private final String descriptionLang;
    private final String entityType;
    private final List<String> genres;
    private final String longDescription;
    private final String shortDescription;
    private final int totalEpisodes;
    private final String totalSeasons;
    private final List<Credit> cast;
    private final List<Credit> crew;
    private final List<Award> awards;
    private final Keywords keywords;
    private final List<Rating> ratings;
    private final List<Recommendation> recommendations;
    private final Image preferredImage;
    private final int releaseYear;
    private final String releaseDate;
    private final List<String> topCast;
    private final List<String> directors;

    public Program(String tmsId, String rootId, String seriesId, String subType, String title, Date origAirDate, String titleLang, String descriptionLang, String entityType, List<String> genres, String longDescription, String shortDescription, int totalEpisodes, String totalSeasons, List<Credit> cast, List<Credit> crew, List<Award> awards, Keywords keywords, List<Rating> ratings, List<Recommendation> recommendations, Image preferredImage, int releaseYear, String releaseDate, List<String> topCast, List<String> directors) {
        this.tmsId = tmsId;
        this.rootId = rootId;
        this.seriesId = seriesId;
        this.subType = subType;
        this.title = title;
        this.origAirDate = origAirDate;
        this.titleLang = titleLang;
        this.descriptionLang = descriptionLang;
        this.entityType = entityType;
        this.genres = genres;
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
        this.cast = cast;
        this.crew = crew;
        this.awards = awards;
        this.keywords = keywords;
        this.ratings = ratings;
        this.recommendations = recommendations;
        this.preferredImage = preferredImage;
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

    public String getSeriesId() {
        return seriesId;
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

    public int getTotalEpisodes() {
        return totalEpisodes;
    }

    public String getTotalSeasons() {
        return totalSeasons;
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

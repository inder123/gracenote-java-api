package com.singhinderjeet.gracenoteapi;

public class QualityRating {

    private final String ratingsBody;
    private final String value;

    public QualityRating(String ratingsBody, String value) {
        this.ratingsBody = ratingsBody;
        this.value = value;
    }

    public String getRatingsBody() {
        return ratingsBody;
    }

    public String getValue() {
        return value;
    }
}

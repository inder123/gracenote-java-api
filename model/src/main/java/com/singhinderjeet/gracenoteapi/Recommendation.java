package com.singhinderjeet.gracenoteapi;

public class Recommendation {

    private final String tmsId;
    private final String root;
    private final String title;

    public Recommendation(String tmsId, String root, String title) {
        this.tmsId = tmsId;
        this.root = root;
        this.title = title;
    }

    public String getTmsId() {
        return tmsId;
    }

    public String getRoot() {
        return root;
    }

    public String getTitle() {
        return title;
    }
}

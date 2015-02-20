package com.singhinderjeet.gracenoteapi;

public class Recommendation {

    private final String tmsId;
    private final String root;
    private final String title;
    private final String rootId;

    public Recommendation(String tmsId, String root, String title, String rootId) {
        this.tmsId = tmsId;
        this.root = root;
        this.title = title;
        this.rootId = rootId;
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

    public String getRootId() {
        return rootId;
    }
}

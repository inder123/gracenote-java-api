package com.singhinderjeet.gracenoteapi;

public class Image {

    private final String uri;
    private final int height;
    private final int width;
    private final boolean primary;
    private final String category;

    public Image(String uri, int height, int width, boolean primary, String category) {
        this.uri = uri;
        this.height = height;
        this.width = width;
        this.primary = primary;
        this.category = category;
    }

    public String getUri() {
        return uri;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean getPrimary() {
        return primary;
    }

    public String getCategory() {
        return category;
    }
}

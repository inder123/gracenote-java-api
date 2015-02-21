package com.singhinderjeet.gracenoteapi;

public class Image {

    private final String width;
    private final String height;
    private final Caption caption;
    private final String uri;
    private final String size;
    private final String aspect;
    private final String category;
    private final String text;
    private final boolean primary;
    private final String tier;

    public Image(String width, String height, Caption caption, String uri, String size, String aspect, String category, String text, boolean primary, String tier) {
        this.width = width;
        this.height = height;
        this.caption = caption;
        this.uri = uri;
        this.size = size;
        this.aspect = aspect;
        this.category = category;
        this.text = text;
        this.primary = primary;
        this.tier = tier;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public Caption getCaption() {
        return caption;
    }

    public String getUri() {
        return uri;
    }

    public String getSize() {
        return size;
    }

    public String getAspect() {
        return aspect;
    }

    public String getCategory() {
        return category;
    }

    public String getText() {
        return text;
    }

    public boolean getPrimary() {
        return primary;
    }

    public String getTier() {
        return tier;
    }
}

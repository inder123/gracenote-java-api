package com.singhinderjeet.gracenoteapi;

public class Caption {

    private final String content;
    private final String lang;

    public Caption(String content, String lang) {
        this.content = content;
        this.lang = lang;
    }

    public String getContent() {
        return content;
    }

    public String getLang() {
        return lang;
    }
}

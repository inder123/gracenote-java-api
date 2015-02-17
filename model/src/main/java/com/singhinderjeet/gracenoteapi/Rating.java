package com.singhinderjeet.gracenoteapi;

public class Rating {

    private final String body;
    private final String code;

    public Rating(String body, String code) {
        this.body = body;
        this.code = code;
    }

    public String getBody() {
        return body;
    }

    public String getCode() {
        return code;
    }
}

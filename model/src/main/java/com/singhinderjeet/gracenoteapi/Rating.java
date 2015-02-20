package com.singhinderjeet.gracenoteapi;

public class Rating {

    private final String code;
    private final String body;

    public Rating(String code, String body) {
        this.code = code;
        this.body = body;
    }

    public String getCode() {
        return code;
    }

    public String getBody() {
        return body;
    }
}

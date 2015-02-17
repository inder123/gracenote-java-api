package com.singhinderjeet.gracenoteapi;

public class Mso {

    private final String id;
    private final String name;

    public Mso(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

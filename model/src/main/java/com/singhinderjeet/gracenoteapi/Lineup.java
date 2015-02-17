package com.singhinderjeet.gracenoteapi;

public class Lineup {

    private final String lineupId;
    private final String name;
    private final String type;

    public Lineup(String lineupId, String name, String type) {
        this.lineupId = lineupId;
        this.name = name;
        this.type = type;
    }

    public String getLineupId() {
        return lineupId;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

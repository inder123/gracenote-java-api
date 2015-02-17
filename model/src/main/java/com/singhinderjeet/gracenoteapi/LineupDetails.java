package com.singhinderjeet.gracenoteapi;

public class LineupDetails {

    private final String type;
    private final String lineupId;
    private final String name;
    private final String device;
    private final String location;
    private final Mso mso;

    public LineupDetails(String type, String lineupId, String name, String device, String location, Mso mso) {
        this.type = type;
        this.lineupId = lineupId;
        this.name = name;
        this.device = device;
        this.location = location;
        this.mso = mso;
    }

    public String getType() {
        return type;
    }

    public String getLineupId() {
        return lineupId;
    }

    public String getName() {
        return name;
    }

    public String getDevice() {
        return device;
    }

    public String getLocation() {
        return location;
    }

    public Mso getMso() {
        return mso;
    }
}

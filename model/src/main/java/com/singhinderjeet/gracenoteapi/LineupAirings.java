package com.singhinderjeet.gracenoteapi;

import java.util.List;

public class LineupAirings {

    private final String stationId;
    private final String callSign;
    private final Image preferredImage;
    private final List<Airing> airings;
    private final String channel;

    public LineupAirings(String stationId, String callSign, Image preferredImage, List<Airing> airings, String channel) {
        this.stationId = stationId;
        this.callSign = callSign;
        this.preferredImage = preferredImage;
        this.airings = airings;
        this.channel = channel;
    }

    public String getStationId() {
        return stationId;
    }

    public String getCallSign() {
        return callSign;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public List<Airing> getAirings() {
        return airings;
    }

    public String getChannel() {
        return channel;
    }
}

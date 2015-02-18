package com.singhinderjeet.gracenoteapi;

import java.util.Date;
import java.util.List;

public class Airing {

    private final Date startTime;
    private final Date endTime;
    private final int duration;
    private final List<String> qualifiers;
    private final String stationId;
    private final Program program;
    private final List<String> channels;
    private final List<Rating> ratings;

    public Airing(Date startTime, Date endTime, int duration, List<String> qualifiers, String stationId, Program program, List<String> channels, List<Rating> ratings) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.qualifiers = qualifiers;
        this.stationId = stationId;
        this.program = program;
        this.channels = channels;
        this.ratings = ratings;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public int getDuration() {
        return duration;
    }

    public List<String> getQualifiers() {
        return qualifiers;
    }

    public String getStationId() {
        return stationId;
    }

    public Program getProgram() {
        return program;
    }

    public List<String> getChannels() {
        return channels;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}

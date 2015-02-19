package com.singhinderjeet.gracenoteapi;

import java.util.Date;
import java.util.List;

public class StationAiring {

    private final Date startTime;
    private final Date endTime;
    private final int duration;
    private final List<String> qualifiers;
    private final Program program;
    private final Station station;

    public StationAiring(Date startTime, Date endTime, int duration, List<String> qualifiers, Program program, Station station) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.qualifiers = qualifiers;
        this.program = program;
        this.station = station;
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

    public Program getProgram() {
        return program;
    }

    public Station getStation() {
        return station;
    }
}

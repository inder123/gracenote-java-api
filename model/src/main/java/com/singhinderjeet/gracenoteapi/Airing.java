/*
 * Copyright (C) 2015 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.singhinderjeet.gracenoteapi;

import java.util.Date;
import java.util.List;

/**
 * The Airing class
 *
 * @author Inderjeet Singh
 */
public class Airing {

    private final Date startTime;
    private final Date endTime;
    private final int duration;
    private final List<String> qualifiers;
    private final List<String> channels;
    private final Program program;
    private final String stationId;
    private final Station station;
    private final List<Rating> ratings;

    public Airing(Date startTime, Date endTime, int duration, List<String> qualifiers, List<String> channels, Program program, String stationId, Station station, List<Rating> ratings) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.qualifiers = qualifiers;
        this.channels = channels;
        this.program = program;
        this.stationId = stationId;
        this.station = station;
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

    public List<String> getChannels() {
        return channels;
    }

    public Program getProgram() {
        return program;
    }

    public String getStationId() {
        return stationId;
    }

    public Station getStation() {
        return station;
    }

    public List<Rating> getRatings() {
        return ratings;
    }
}

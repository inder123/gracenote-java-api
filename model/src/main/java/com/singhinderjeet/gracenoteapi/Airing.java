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

    private final List<String> channels;
    private final int duration;
    private final Date endTime;
    private final Program program;
    private final List<String> qualifiers;
    private final List<Rating> ratings;
    private final Date startTime;
    private final Station station;
    private final String stationId;

    public Airing(List<String> channels, int duration, Date endTime, Program program, List<String> qualifiers, List<Rating> ratings, Date startTime, Station station, String stationId) {
        this.channels = channels;
        this.duration = duration;
        this.endTime = endTime;
        this.program = program;
        this.qualifiers = qualifiers;
        this.ratings = ratings;
        this.startTime = startTime;
        this.station = station;
        this.stationId = stationId;
    }

    public List<String> getChannels() {
        return channels;
    }

    public int getDuration() {
        return duration;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Program getProgram() {
        return program;
    }

    public List<String> getQualifiers() {
        return qualifiers;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Station getStation() {
        return station;
    }

    public String getStationId() {
        return stationId;
    }
}

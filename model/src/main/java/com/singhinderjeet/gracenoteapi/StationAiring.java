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
 * The StationAiring class
 *
 * @author Inderjeet Singh
 */
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

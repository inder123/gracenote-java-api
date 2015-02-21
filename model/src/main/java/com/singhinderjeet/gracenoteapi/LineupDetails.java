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

/**
 * The LineupDetails class
 *
 * @author Inderjeet Singh
 */
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

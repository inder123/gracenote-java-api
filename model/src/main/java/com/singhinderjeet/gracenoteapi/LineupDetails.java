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

    private final String device;
    private final String lineupId;
    private final String location;
    private final Mso mso;
    private final String name;
    private final String type;

    public LineupDetails(String device, String lineupId, String location, Mso mso, String name, String type) {
        this.device = device;
        this.lineupId = lineupId;
        this.location = location;
        this.mso = mso;
        this.name = name;
        this.type = type;
    }

    public String getDevice() {
        return device;
    }

    public String getLineupId() {
        return lineupId;
    }

    public String getLocation() {
        return location;
    }

    public Mso getMso() {
        return mso;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

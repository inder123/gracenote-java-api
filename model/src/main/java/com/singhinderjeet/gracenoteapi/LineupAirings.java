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

import java.util.List;

/**
 * The LineupAirings class
 *
 * @author Inderjeet Singh
 */
public class LineupAirings {

    private final List<Airing> airings;
    private final String callSign;
    private final String channel;
    private final Image preferredImage;
    private final String stationId;

    public LineupAirings(List<Airing> airings, String callSign, String channel, Image preferredImage, String stationId) {
        this.airings = airings;
        this.callSign = callSign;
        this.channel = channel;
        this.preferredImage = preferredImage;
        this.stationId = stationId;
    }

    public List<Airing> getAirings() {
        return airings;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getChannel() {
        return channel;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public String getStationId() {
        return stationId;
    }
}

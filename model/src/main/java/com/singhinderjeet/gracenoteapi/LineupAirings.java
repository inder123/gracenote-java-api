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

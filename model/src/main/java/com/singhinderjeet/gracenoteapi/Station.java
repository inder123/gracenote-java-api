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

public class Station {

    private final String stationId;
    private final String callSign;
    private final String affiliateCallSign;
    private final String affiliateId;
    private final String name;
    private final String channel;
    private final List<String> bcastLangs;
    private final List<String> edLangs;
    private final String type;
    private final Image preferredImage;

    public Station(String stationId, String callSign, String affiliateCallSign, String affiliateId, String name, String channel, List<String> bcastLangs, List<String> edLangs, String type, Image preferredImage) {
        this.stationId = stationId;
        this.callSign = callSign;
        this.affiliateCallSign = affiliateCallSign;
        this.affiliateId = affiliateId;
        this.name = name;
        this.channel = channel;
        this.bcastLangs = bcastLangs;
        this.edLangs = edLangs;
        this.type = type;
        this.preferredImage = preferredImage;
    }

    public String getStationId() {
        return stationId;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getAffiliateCallSign() {
        return affiliateCallSign;
    }

    public String getAffiliateId() {
        return affiliateId;
    }

    public String getName() {
        return name;
    }

    public String getChannel() {
        return channel;
    }

    public List<String> getBcastLangs() {
        return bcastLangs;
    }

    public List<String> getEdLangs() {
        return edLangs;
    }

    public String getType() {
        return type;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }
}

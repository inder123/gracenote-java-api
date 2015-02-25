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
 * The Station class
 *
 * @author Inderjeet Singh
 */
public class Station {

    private final String affiliateCallSign;
    private final String affiliateId;
    private final List<String> bcastLangs;
    private final String callSign;
    private final String channel;
    private final List<String> edLangs;
    private final String name;
    private final Image preferredImage;
    private final String stationId;
    private final String type;

    public Station(String affiliateCallSign, String affiliateId, List<String> bcastLangs, String callSign, String channel, List<String> edLangs, String name, Image preferredImage, String stationId, String type) {
        this.affiliateCallSign = affiliateCallSign;
        this.affiliateId = affiliateId;
        this.bcastLangs = bcastLangs;
        this.callSign = callSign;
        this.channel = channel;
        this.edLangs = edLangs;
        this.name = name;
        this.preferredImage = preferredImage;
        this.stationId = stationId;
        this.type = type;
    }

    public String getAffiliateCallSign() {
        return affiliateCallSign;
    }

    public String getAffiliateId() {
        return affiliateId;
    }

    public List<String> getBcastLangs() {
        return bcastLangs;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getChannel() {
        return channel;
    }

    public List<String> getEdLangs() {
        return edLangs;
    }

    public String getName() {
        return name;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }

    public String getStationId() {
        return stationId;
    }

    public String getType() {
        return type;
    }
}

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

public class Channel {

    private final String channel;
    private final String callSign;
    private final String stationId;
    private final String affiliateId;
    private final String affiliateCallSign;
    private final Image preferredImage;

    public Channel(String channel, String callSign, String stationId, String affiliateId, String affiliateCallSign, Image preferredImage) {
        this.channel = channel;
        this.callSign = callSign;
        this.stationId = stationId;
        this.affiliateId = affiliateId;
        this.affiliateCallSign = affiliateCallSign;
        this.preferredImage = preferredImage;
    }

    public String getChannel() {
        return channel;
    }

    public String getCallSign() {
        return callSign;
    }

    public String getStationId() {
        return stationId;
    }

    public String getAffiliateId() {
        return affiliateId;
    }

    public String getAffiliateCallSign() {
        return affiliateCallSign;
    }

    public Image getPreferredImage() {
        return preferredImage;
    }
}

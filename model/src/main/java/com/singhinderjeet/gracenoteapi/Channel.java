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

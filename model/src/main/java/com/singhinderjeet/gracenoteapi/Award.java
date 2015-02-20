package com.singhinderjeet.gracenoteapi;

public class Award {

    private final String awardId;
    private final String name;
    private final String awardName;
    private final boolean won;
    private final String year;
    private final String category;
    private final String awardCatId;
    private final String recipient;
    private final String personId;

    public Award(String awardId, String name, String awardName, boolean won, String year, String category, String awardCatId, String recipient, String personId) {
        this.awardId = awardId;
        this.name = name;
        this.awardName = awardName;
        this.won = won;
        this.year = year;
        this.category = category;
        this.awardCatId = awardCatId;
        this.recipient = recipient;
        this.personId = personId;
    }

    public String getAwardId() {
        return awardId;
    }

    public String getName() {
        return name;
    }

    public String getAwardName() {
        return awardName;
    }

    public boolean getWon() {
        return won;
    }

    public String getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getAwardCatId() {
        return awardCatId;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getPersonId() {
        return personId;
    }
}

package com.singhinderjeet.gracenoteapi;

public class Award {

    private final String awardId;
    private final String rootId;
    private final String name;
    private final String category;
    private final String awardCatId;
    private final String year;
    private final String personId;
    private final String recipient;
    private final boolean won;
    private final String awardName;

    public Award(String awardId, String rootId, String name, String category, String awardCatId, String year, String personId, String recipient, boolean won, String awardName) {
        this.awardId = awardId;
        this.rootId = rootId;
        this.name = name;
        this.category = category;
        this.awardCatId = awardCatId;
        this.year = year;
        this.personId = personId;
        this.recipient = recipient;
        this.won = won;
        this.awardName = awardName;
    }

    public String getAwardId() {
        return awardId;
    }

    public String getRootId() {
        return rootId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getAwardCatId() {
        return awardCatId;
    }

    public String getYear() {
        return year;
    }

    public String getPersonId() {
        return personId;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean getWon() {
        return won;
    }

    public String getAwardName() {
        return awardName;
    }
}

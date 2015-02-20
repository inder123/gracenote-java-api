package com.singhinderjeet.gracenoteapi;

public class Credit {

    private final String personId;
    private final String nameId;
    private final String name;
    private final String rootId;
    private final String title;
    private final String role;
    private final String billingOrder;
    private final String characterName;
    private final String year;
    private final String type;

    public Credit(String personId, String nameId, String name, String rootId, String title, String role, String billingOrder, String characterName, String year, String type) {
        this.personId = personId;
        this.nameId = nameId;
        this.name = name;
        this.rootId = rootId;
        this.title = title;
        this.role = role;
        this.billingOrder = billingOrder;
        this.characterName = characterName;
        this.year = year;
        this.type = type;
    }

    public String getPersonId() {
        return personId;
    }

    public String getNameId() {
        return nameId;
    }

    public String getName() {
        return name;
    }

    public String getRootId() {
        return rootId;
    }

    public String getTitle() {
        return title;
    }

    public String getRole() {
        return role;
    }

    public String getBillingOrder() {
        return billingOrder;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }
}

package com.singhinderjeet.gracenoteapi;

public class Credit {

    private final String billingOrder;
    private final String role;
    private final String nameId;
    private final String personId;
    private final String name;

    public Credit(String billingOrder, String role, String nameId, String personId, String name) {
        this.billingOrder = billingOrder;
        this.role = role;
        this.nameId = nameId;
        this.personId = personId;
        this.name = name;
    }

    public String getBillingOrder() {
        return billingOrder;
    }

    public String getRole() {
        return role;
    }

    public String getNameId() {
        return nameId;
    }

    public String getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }
}

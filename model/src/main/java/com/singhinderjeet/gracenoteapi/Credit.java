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

/**
 * The Credit class
 *
 * @author Inderjeet Singh
 */
public class Credit {

    private final String billingOrder;
    private final String characterName;
    private final String name;
    private final String nameId;
    private final String personId;
    private final String role;
    private final String rootId;
    private final String title;
    private final String type;
    private final String year;

    public Credit(String billingOrder, String characterName, String name, String nameId, String personId, String role, String rootId, String title, String type, String year) {
        this.billingOrder = billingOrder;
        this.characterName = characterName;
        this.name = name;
        this.nameId = nameId;
        this.personId = personId;
        this.role = role;
        this.rootId = rootId;
        this.title = title;
        this.type = type;
        this.year = year;
    }

    public String getBillingOrder() {
        return billingOrder;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String getName() {
        return name;
    }

    public String getNameId() {
        return nameId;
    }

    public String getPersonId() {
        return personId;
    }

    public String getRole() {
        return role;
    }

    public String getRootId() {
        return rootId;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getYear() {
        return year;
    }
}

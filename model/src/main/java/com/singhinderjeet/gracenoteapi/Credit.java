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

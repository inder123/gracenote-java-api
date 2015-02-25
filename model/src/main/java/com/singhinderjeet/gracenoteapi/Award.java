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
 * The Award class
 *
 * @author Inderjeet Singh
 */
public class Award {

    private final String awardCatId;
    private final String awardId;
    private final String awardName;
    private final String category;
    private final String name;
    private final String personId;
    private final String recipient;
    private final String rootId;
    private final boolean won;
    private final String year;

    public Award(String awardCatId, String awardId, String awardName, String category, String name, String personId, String recipient, String rootId, boolean won, String year) {
        this.awardCatId = awardCatId;
        this.awardId = awardId;
        this.awardName = awardName;
        this.category = category;
        this.name = name;
        this.personId = personId;
        this.recipient = recipient;
        this.rootId = rootId;
        this.won = won;
        this.year = year;
    }

    public String getAwardCatId() {
        return awardCatId;
    }

    public String getAwardId() {
        return awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getRootId() {
        return rootId;
    }

    public boolean getWon() {
        return won;
    }

    public String getYear() {
        return year;
    }
}

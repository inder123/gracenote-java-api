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

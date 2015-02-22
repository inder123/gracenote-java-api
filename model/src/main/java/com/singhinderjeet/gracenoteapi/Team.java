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
 * The Team class
 *
 * @author Inderjeet Singh
 */
public class Team {

    private final String name;
    private final String teamBrandId;
    private final boolean isHome;

    public Team(String name, String teamBrandId, boolean isHome) {
        this.name = name;
        this.teamBrandId = teamBrandId;
        this.isHome = isHome;
    }

    public String getName() {
        return name;
    }

    public String getTeamBrandId() {
        return teamBrandId;
    }

    public boolean getIsHome() {
        return isHome;
    }
}

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

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Keywords {

    @SerializedName("Mood")
    private final List<String> mood;
    @SerializedName("Time Period")
    private final List<String> timePeriod;
    @SerializedName("Theme")
    private final List<String> theme;
    @SerializedName("Character")
    private final List<String> character;
    @SerializedName("Setting")
    private final List<String> setting;
    @SerializedName("Subject")
    private final List<String> subject;

    public Keywords(List<String> mood, List<String> timePeriod, List<String> theme, List<String> character, List<String> setting, List<String> subject) {
        this.mood = mood;
        this.timePeriod = timePeriod;
        this.theme = theme;
        this.character = character;
        this.setting = setting;
        this.subject = subject;
    }

    public List<String> getMood() {
        return mood;
    }

    public List<String> getTimePeriod() {
        return timePeriod;
    }

    public List<String> getTheme() {
        return theme;
    }

    public List<String> getCharacter() {
        return character;
    }

    public List<String> getSetting() {
        return setting;
    }

    public List<String> getSubject() {
        return subject;
    }
}

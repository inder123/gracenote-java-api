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

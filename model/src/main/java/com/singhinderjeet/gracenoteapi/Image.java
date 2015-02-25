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
 * The Image class
 *
 * @author Inderjeet Singh
 */
public class Image {

    private final String aspect;
    private final Caption caption;
    private final String category;
    private final String height;
    private final boolean primary;
    private final String size;
    private final String text;
    private final String tier;
    private final String uri;
    private final String width;

    public Image(String aspect, Caption caption, String category, String height, boolean primary, String size, String text, String tier, String uri, String width) {
        this.aspect = aspect;
        this.caption = caption;
        this.category = category;
        this.height = height;
        this.primary = primary;
        this.size = size;
        this.text = text;
        this.tier = tier;
        this.uri = uri;
        this.width = width;
    }

    public String getAspect() {
        return aspect;
    }

    public Caption getCaption() {
        return caption;
    }

    public String getCategory() {
        return category;
    }

    public String getHeight() {
        return height;
    }

    public boolean getPrimary() {
        return primary;
    }

    public String getSize() {
        return size;
    }

    public String getText() {
        return text;
    }

    public String getTier() {
        return tier;
    }

    public String getUri() {
        return uri;
    }

    public String getWidth() {
        return width;
    }
}

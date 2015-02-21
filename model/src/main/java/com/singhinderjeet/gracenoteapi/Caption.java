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
 * The Caption class
 *
 * @author Inderjeet Singh
 */
public class Caption {

    private final String content;
    private final String lang;

    public Caption(String content, String lang) {
        this.content = content;
        this.lang = lang;
    }

    public String getContent() {
        return content;
    }

    public String getLang() {
        return lang;
    }
}

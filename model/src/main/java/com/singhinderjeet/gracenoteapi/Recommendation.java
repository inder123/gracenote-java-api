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
 * The Recommendation class
 *
 * @author Inderjeet Singh
 */
public class Recommendation {

    private final String root;
    private final String rootId;
    private final String title;
    private final String tmsId;

    public Recommendation(String root, String rootId, String title, String tmsId) {
        this.root = root;
        this.rootId = rootId;
        this.title = title;
        this.tmsId = tmsId;
    }

    public String getRoot() {
        return root;
    }

    public String getRootId() {
        return rootId;
    }

    public String getTitle() {
        return title;
    }

    public String getTmsId() {
        return tmsId;
    }
}

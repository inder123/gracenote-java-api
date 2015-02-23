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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.singhinderjeet.gracenoteapi.json.GracenoteApiTypeAdapterFactory;

/**
 * Unit tests for {@link Airing}.
 *
 * @author Inderjeet Singh
 */
public class AiringTest {
  private final Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(new GracenoteApiTypeAdapterFactory())
    .create();

  @Test
  public void testAiringJson() throws Exception {
    Type airingsListType = new TypeToken<List<Airing>>(){}.getType();
    InputStream is = AiringTest.class.getResourceAsStream("/station-airings.json");
    List<Airing> airings = gson.fromJson(new InputStreamReader(is), airingsListType);
    assertEquals(1, airings.size());
    Airing airing = airings.get(0);
    assertEquals("10161", airing.getStation().getStationId());
    String json = gson.toJson(airings);
    assertTrue(json.contains("assets/p10261471_b_v5_aa.jpg"));

    is = AiringTest.class.getResourceAsStream("/series-airings.json");
    airings = gson.fromJson(new InputStreamReader(is), airingsListType);
    assertEquals(1, airings.size());
    airing = airings.get(0);
    assertEquals("h3/NowShowing/11207/s11207_h3_aa.png", airing.getStation().getPreferredImage().getUri());
    json = gson.toJson(airings);
    assertTrue(json.contains("House determines that a patient has a rare condition that makes her completely insensitive to pain."));
  }
}

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
public class LineupAiringsTest {
  private final Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(new GracenoteApiTypeAdapterFactory())
    .create();

  @Test
  public void testLineupAiringJson() throws Exception {
    Type lineupAiringsArrayType = new TypeToken<List<LineupAirings>>(){}.getType();
    InputStream is = LineupAiringsTest.class.getResourceAsStream("/lineup-airings-basic-size.json");
    List<LineupAirings> airingsLineups = gson.fromJson(new InputStreamReader(is), lineupAiringsArrayType);
    LineupAirings airings = airingsLineups.get(0);
    assertEquals(3, airings.getAirings().size());
    assertEquals("10142", airings.getStationId());
    String json = gson.toJson(airings);
    assertTrue(json.contains("10142"));

    is = LineupAiringsTest.class.getResourceAsStream("/lineup-airings-detailed-size.json");
    airingsLineups = gson.fromJson(new InputStreamReader(is), lineupAiringsArrayType);
    airings = airingsLineups.get(0);
    assertEquals(2, airings.getAirings().size());
    assertEquals("POPSD", airings.getCallSign());
    json = gson.toJson(airings);
    assertTrue(json.contains("16715"));
  }
}

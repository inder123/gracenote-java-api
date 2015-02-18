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
 * Unit tests for {@link LineupDetails}.
 *
 * @author Inderjeet Singh
 */
public class LineupDetailsTest {
  private final Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(new GracenoteApiTypeAdapterFactory())
    .create();

  @Test
  public void testLineupDetailsJson() throws Exception {
    InputStream is = LineupDetailsTest.class.getResourceAsStream("/lineup-details.json");
    LineupDetails lineup = gson.fromJson(new InputStreamReader(is), LineupDetails.class);
    assertEquals("USA-NC32461-X", lineup.getLineupId());
    String json = gson.toJson(lineup);
    assertTrue(json.contains("Durham"));

    Type lineupDetailsListType = new TypeToken<List<LineupDetails>>(){}.getType();
    is = LineupDetailsTest.class.getResourceAsStream("/lineups-by-postal-code1.json");
    List<LineupDetails> lineups = gson.fromJson(new InputStreamReader(is), lineupDetailsListType);
    assertEquals(6, lineups.size());
    lineup = lineups.get(1);
    assertEquals("17304", lineup.getMso().getId());
    json = gson.toJson(lineups);
    assertTrue(json.contains("Cary"));

    is = LineupDetailsTest.class.getResourceAsStream("/lineups-by-postal-code2.json");
    lineups = gson.fromJson(new InputStreamReader(is), lineupDetailsListType);
    assertEquals(3, lineups.size());
    lineup = lineups.get(2);
    assertEquals("Freeview - Central (South) - Cable", lineup.getName());
    json = gson.toJson(lineups);
    assertTrue(json.contains("Virgin Media Oxford Digital"));
  }
}

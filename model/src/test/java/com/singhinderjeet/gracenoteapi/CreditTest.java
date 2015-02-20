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
 * Unit tests for {@link Credit}.
 *
 * @author Inderjeet Singh
 */
public class CreditTest {
  private final Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(new GracenoteApiTypeAdapterFactory())
    .create();

  @Test
  public void testCreditJson() throws Exception {
    Type creditsType = new TypeToken<List<Credit>>(){}.getType();
    InputStream is = CreditTest.class.getResourceAsStream("/credits.json");
    List<Credit> credits = gson.fromJson(new InputStreamReader(is), creditsType);
    assertEquals(2, credits.size());
    Credit station = credits.get(0);
    assertEquals("Happy Feet Two", station.getTitle());
    String json = gson.toJson(credits);
    assertTrue(json.contains("Paul Livingston"));
  }
}

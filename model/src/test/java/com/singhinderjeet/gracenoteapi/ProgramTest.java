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

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.singhinderjeet.gracenoteapi.json.GracenoteApiTypeAdapterFactory;

/**
 * Unit tests for {@link Program}.
 *
 * @author Inderjeet Singh
 */
public class ProgramTest {
  private final Gson gson = new GsonBuilder()
    .registerTypeAdapterFactory(new GracenoteApiTypeAdapterFactory())
    .create();

  @Test
  public void testProgramJson() throws Exception {
    InputStream is = ProgramTest.class.getResourceAsStream("/program-details.json");
    Program program = gson.fromJson(new InputStreamReader(is), Program.class);
    assertEquals("Hugh Laurie", program.getCast().get(0).getName());
    assertEquals("Fascinating", program.getKeywords().getMood().get(0));
    String json = gson.toJson(program);
    assertTrue(json.contains("Time Period"));

    is = ProgramTest.class.getResourceAsStream("/series.json");
    program = gson.fromJson(new InputStreamReader(is), Program.class);
    assertEquals("Medical profession", program.getKeywords().getSubject().get(0));
    json = gson.toJson(program);
    assertTrue(json.contains("assets/p185044_b_v5_aa.jpg"));
  }
}

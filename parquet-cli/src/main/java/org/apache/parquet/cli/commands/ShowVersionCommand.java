/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.parquet.cli.commands;

import com.beust.jcommander.Parameters;
import java.util.Collections;
import java.util.List;
import org.apache.parquet.Version;
import org.apache.parquet.cli.BaseCommand;
import org.slf4j.Logger;

@Parameters(commandDescription = "Print version of the Parquet CLI tool")
public class ShowVersionCommand extends BaseCommand {

  public ShowVersionCommand(Logger console) {
    super(console);
  }

  @Override
  public int run() {
    console.info(Version.FULL_VERSION);
    return 0;
  }

  @Override
  public List<String> getExamples() {
    return Collections.emptyList();
  }
}

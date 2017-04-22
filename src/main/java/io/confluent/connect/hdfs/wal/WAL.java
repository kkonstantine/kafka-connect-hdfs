/**
 * Copyright 2015 Confluent Inc.
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
 **/

package io.confluent.connect.hdfs.wal;

import org.apache.kafka.connect.errors.ConnectException;

@Deprecated
public interface WAL extends io.confluent.connect.storage.wal.WAL {
  String beginMarker = "BEGIN";
  String endMarker = "END";

  @Override
  void acquireLease() throws ConnectException;

  @Override
  void append(String tempFile, String committedFile) throws ConnectException;

  @Override
  void apply() throws ConnectException;

  @Override
  void truncate() throws ConnectException;

  @Override
  void close() throws ConnectException;

  @Override
  String getLogFile();
}

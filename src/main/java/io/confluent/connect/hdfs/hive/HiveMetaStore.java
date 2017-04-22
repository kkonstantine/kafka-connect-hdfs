/**
 * Copyright 2015 Confluent Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package io.confluent.connect.hdfs.hive;

import io.confluent.connect.hdfs.HdfsSinkConnectorConfig;
import io.confluent.connect.hdfs.errors.HiveMetaStoreException;
import org.apache.hadoop.conf.Configuration;

@Deprecated
public class HiveMetaStore extends io.confluent.connect.storage.hive.HiveMetaStore {

  public HiveMetaStore(Configuration conf, HdfsSinkConnectorConfig connectorConfig) throws HiveMetaStoreException {
    super(conf, connectorConfig);
  }

  public String tableNameConverter(String table){
    return table == null ? table : table.replaceAll("\\.", "_");
  }
}

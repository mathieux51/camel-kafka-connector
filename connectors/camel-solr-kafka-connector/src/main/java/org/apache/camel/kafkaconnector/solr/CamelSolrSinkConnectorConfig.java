/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.solr;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelSolrSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_SOLR_PATH_URL_CONF = "camel.sink.path.url";
    public static final String CAMEL_SINK_SOLR_PATH_URL_DOC = "Hostname and port for the Solr server(s). Multiple hosts can be specified, separated with a comma. See the solrClient parameter for more information on the SolrClient used to connect to Solr.";
    public static final String CAMEL_SINK_SOLR_PATH_URL_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_CONF = "camel.sink.endpoint.autoCommit";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_DOC = "If true, each producer operation will be automatically followed by a commit";
    public static final Boolean CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_DEFAULT = false;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_CONF = "camel.sink.endpoint.connectionTimeout";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_DOC = "Sets the connection timeout on the SolrClient";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_CONF = "camel.sink.endpoint.defaultMaxConnectionsPerHost";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_DOC = "maxConnectionsPerHost on the underlying HttpConnectionManager";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_CONF = "camel.sink.endpoint.httpClient";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_DOC = "Sets the http client to be used by the solrClient. This is only applicable when solrClient is not set.";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_CONF = "camel.sink.endpoint.maxRetries";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_DOC = "Maximum number of retries to attempt in the event of transient errors";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_CONF = "camel.sink.endpoint.maxTotalConnections";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_DOC = "maxTotalConnection on the underlying HttpConnectionManager";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_CONF = "camel.sink.endpoint.requestHandler";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_DOC = "Set the request handler to be used";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_CONF = "camel.sink.endpoint.solrClient";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_DOC = "Uses the provided solr client to connect to solr. When this parameter is not specified, camel applies the following rules to determine the SolrClient: 1) when zkHost or zkChroot (=zookeeper root) parameter is set, then the CloudSolrClient is used. 2) when multiple hosts are specified in the uri (separated with a comma), then the CloudSolrClient (uri scheme is 'solrCloud') or the LBHttpSolrClient (uri scheme is not 'solrCloud') is used. 3) when the solr operation is INSERT_STREAMING, then the ConcurrentUpdateSolrClient is used. 4) otherwise, the HttpSolrClient is used. Note: A CloudSolrClient should point to zookeeper endpoint(s); other clients point to Solr endpoint(s). The SolrClient can also be set via the exchange header 'CamelSolrClient'.";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_CONF = "camel.sink.endpoint.soTimeout";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_DOC = "Sets the socket timeout on the SolrClient";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_CONF = "camel.sink.endpoint.streamingQueueSize";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_DOC = "Sets the queue size for the ConcurrentUpdateSolrClient";
    public static final Integer CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_DEFAULT = 10;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_CONF = "camel.sink.endpoint.streamingThreadCount";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_DOC = "Sets the number of threads for the ConcurrentUpdateSolrClient";
    public static final Integer CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_DEFAULT = 2;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_CONF = "camel.sink.endpoint.collection";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_DOC = "Set the default collection for SolrCloud";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_CONF = "camel.sink.endpoint.zkChroot";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_DOC = "Set the chroot of the zookeeper connection (include the leading slash; e.g. '/mychroot')";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_CONF = "camel.sink.endpoint.zkHost";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_DOC = "Set the ZooKeeper host(s) urls which the CloudSolrClient uses, e.g. zkHost=localhost:2181,localhost:2182. Optionally add the chroot, e.g. zkHost=localhost:2181,localhost:2182/rootformysolr. In case the first part of the url path (='contextroot') is set to 'solr' (e.g. 'localhost:2181/solr' or 'localhost:2181/solr/..'), then that path is not considered as zookeeper chroot for backward compatibility reasons (this behaviour can be overridden via zkChroot parameter).";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_CONF = "camel.sink.endpoint.allowCompression";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_DOC = "Server side must support gzip or deflate for this to have any effect";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_CONF = "camel.sink.endpoint.followRedirects";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_DOC = "Indicates whether redirects are used to get to the Solr server";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_CONF = "camel.sink.endpoint.password";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_DOC = "Sets password for basic auth plugin enabled servers";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_ENDPOINT_USERNAME_CONF = "camel.sink.endpoint.username";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_USERNAME_DOC = "Sets username for basic auth plugin enabled servers";
    public static final String CAMEL_SINK_SOLR_ENDPOINT_USERNAME_DEFAULT = null;
    public static final String CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.solr.lazyStartProducer";
    public static final String CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.solr.autowiredEnabled";
    public static final String CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;

    public CamelSolrSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelSolrSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_SOLR_PATH_URL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_PATH_URL_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_SOLR_PATH_URL_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_AUTO_COMMIT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_CONNECTION_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_SOLR_ENDPOINT_DEFAULT_MAX_CONNECTIONS_PER_HOST_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_HTTP_CLIENT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_SOLR_ENDPOINT_MAX_RETRIES_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_DEFAULT, ConfigDef.Importance.LOW, CAMEL_SINK_SOLR_ENDPOINT_MAX_TOTAL_CONNECTIONS_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_REQUEST_HANDLER_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_SOLR_CLIENT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_SO_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_STREAMING_QUEUE_SIZE_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_STREAMING_THREAD_COUNT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_COLLECTION_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_ZK_CHROOT_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_ZK_HOST_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_ALLOW_COMPRESSION_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_FOLLOW_REDIRECTS_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_PASSWORD_DOC);
        conf.define(CAMEL_SINK_SOLR_ENDPOINT_USERNAME_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_SOLR_ENDPOINT_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_ENDPOINT_USERNAME_DOC);
        conf.define(CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_SOLR_COMPONENT_AUTOWIRED_ENABLED_DOC);
        return conf;
    }
}
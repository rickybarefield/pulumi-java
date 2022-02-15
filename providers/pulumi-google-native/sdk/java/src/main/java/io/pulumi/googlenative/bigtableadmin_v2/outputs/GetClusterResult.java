// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.ClusterConfigResponse;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.EncryptionConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    private final ClusterConfigResponse clusterConfig;
    private final String defaultStorageType;
    private final EncryptionConfigResponse encryptionConfig;
    private final String location;
    private final String name;
    private final Integer serveNodes;
    private final String state;

    @OutputCustomType.Constructor({"clusterConfig","defaultStorageType","encryptionConfig","location","name","serveNodes","state"})
    private GetClusterResult(
        ClusterConfigResponse clusterConfig,
        String defaultStorageType,
        EncryptionConfigResponse encryptionConfig,
        String location,
        String name,
        Integer serveNodes,
        String state) {
        this.clusterConfig = Objects.requireNonNull(clusterConfig);
        this.defaultStorageType = Objects.requireNonNull(defaultStorageType);
        this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.serveNodes = Objects.requireNonNull(serveNodes);
        this.state = Objects.requireNonNull(state);
    }

    public ClusterConfigResponse getClusterConfig() {
        return this.clusterConfig;
    }
    public String getDefaultStorageType() {
        return this.defaultStorageType;
    }
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Integer getServeNodes() {
        return this.serveNodes;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigResponse clusterConfig;
        private String defaultStorageType;
        private EncryptionConfigResponse encryptionConfig;
        private String location;
        private String name;
        private Integer serveNodes;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterConfig = defaults.clusterConfig;
    	      this.defaultStorageType = defaults.defaultStorageType;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.serveNodes = defaults.serveNodes;
    	      this.state = defaults.state;
        }

        public Builder setClusterConfig(ClusterConfigResponse clusterConfig) {
            this.clusterConfig = Objects.requireNonNull(clusterConfig);
            return this;
        }

        public Builder setDefaultStorageType(String defaultStorageType) {
            this.defaultStorageType = Objects.requireNonNull(defaultStorageType);
            return this;
        }

        public Builder setEncryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setServeNodes(Integer serveNodes) {
            this.serveNodes = Objects.requireNonNull(serveNodes);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(clusterConfig, defaultStorageType, encryptionConfig, location, name, serveNodes, state);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1alpha2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudbuild_v1alpha2.outputs.NetworkConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1alpha2.outputs.WorkerConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetWorkerPoolResult {
    private final String createTime;
    private final String deleteTime;
    private final String name;
    private final NetworkConfigResponse networkConfig;
    private final String region;
    private final String state;
    private final String updateTime;
    private final WorkerConfigResponse workerConfig;

    @OutputCustomType.Constructor({"createTime","deleteTime","name","networkConfig","region","state","updateTime","workerConfig"})
    private GetWorkerPoolResult(
        String createTime,
        String deleteTime,
        String name,
        NetworkConfigResponse networkConfig,
        String region,
        String state,
        String updateTime,
        WorkerConfigResponse workerConfig) {
        this.createTime = Objects.requireNonNull(createTime);
        this.deleteTime = Objects.requireNonNull(deleteTime);
        this.name = Objects.requireNonNull(name);
        this.networkConfig = Objects.requireNonNull(networkConfig);
        this.region = Objects.requireNonNull(region);
        this.state = Objects.requireNonNull(state);
        this.updateTime = Objects.requireNonNull(updateTime);
        this.workerConfig = Objects.requireNonNull(workerConfig);
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public String getDeleteTime() {
        return this.deleteTime;
    }
    public String getName() {
        return this.name;
    }
    public NetworkConfigResponse getNetworkConfig() {
        return this.networkConfig;
    }
    public String getRegion() {
        return this.region;
    }
    public String getState() {
        return this.state;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }
    public WorkerConfigResponse getWorkerConfig() {
        return this.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkerPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String name;
        private NetworkConfigResponse networkConfig;
        private String region;
        private String state;
        private String updateTime;
        private WorkerConfigResponse workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkerPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.region = defaults.region;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkConfig(NetworkConfigResponse networkConfig) {
            this.networkConfig = Objects.requireNonNull(networkConfig);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public Builder setWorkerConfig(WorkerConfigResponse workerConfig) {
            this.workerConfig = Objects.requireNonNull(workerConfig);
            return this;
        }

        public GetWorkerPoolResult build() {
            return new GetWorkerPoolResult(createTime, deleteTime, name, networkConfig, region, state, updateTime, workerConfig);
        }
    }
}
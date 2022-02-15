// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MultiClusterRoutingUseAnyResponse {
    private final List<String> clusterIds;

    @OutputCustomType.Constructor({"clusterIds"})
    private MultiClusterRoutingUseAnyResponse(List<String> clusterIds) {
        this.clusterIds = Objects.requireNonNull(clusterIds);
    }

    public List<String> getClusterIds() {
        return this.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiClusterRoutingUseAnyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> clusterIds;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiClusterRoutingUseAnyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIds = defaults.clusterIds;
        }

        public Builder setClusterIds(List<String> clusterIds) {
            this.clusterIds = Objects.requireNonNull(clusterIds);
            return this;
        }

        public MultiClusterRoutingUseAnyResponse build() {
            return new MultiClusterRoutingUseAnyResponse(clusterIds);
        }
    }
}
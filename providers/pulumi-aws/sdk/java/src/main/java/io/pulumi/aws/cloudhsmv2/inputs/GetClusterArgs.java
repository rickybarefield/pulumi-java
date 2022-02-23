// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The id of Cloud HSM v2 cluster.
     * 
     */
    @InputImport(name="clusterId", required=true)
    private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * The state of the cluster to be found.
     * 
     */
    @InputImport(name="clusterState")
    private final @Nullable String clusterState;

    public Optional<String> getClusterState() {
        return this.clusterState == null ? Optional.empty() : Optional.ofNullable(this.clusterState);
    }

    public GetClusterArgs(
        String clusterId,
        @Nullable String clusterState) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.clusterState = clusterState;
    }

    private GetClusterArgs() {
        this.clusterId = null;
        this.clusterState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private @Nullable String clusterState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterState(@Nullable String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public GetClusterArgs build() {
            return new GetClusterArgs(clusterId, clusterState);
        }
    }
}
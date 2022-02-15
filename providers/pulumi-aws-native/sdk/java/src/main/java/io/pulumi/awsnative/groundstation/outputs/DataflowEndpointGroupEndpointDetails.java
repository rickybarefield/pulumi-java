// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupDataflowEndpoint;
import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupSecurityDetails;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataflowEndpointGroupEndpointDetails {
    private final @Nullable DataflowEndpointGroupDataflowEndpoint endpoint;
    private final @Nullable DataflowEndpointGroupSecurityDetails securityDetails;

    @OutputCustomType.Constructor({"endpoint","securityDetails"})
    private DataflowEndpointGroupEndpointDetails(
        @Nullable DataflowEndpointGroupDataflowEndpoint endpoint,
        @Nullable DataflowEndpointGroupSecurityDetails securityDetails) {
        this.endpoint = endpoint;
        this.securityDetails = securityDetails;
    }

    public Optional<DataflowEndpointGroupDataflowEndpoint> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<DataflowEndpointGroupSecurityDetails> getSecurityDetails() {
        return Optional.ofNullable(this.securityDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupEndpointDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataflowEndpointGroupDataflowEndpoint endpoint;
        private @Nullable DataflowEndpointGroupSecurityDetails securityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupEndpointDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.securityDetails = defaults.securityDetails;
        }

        public Builder setEndpoint(@Nullable DataflowEndpointGroupDataflowEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setSecurityDetails(@Nullable DataflowEndpointGroupSecurityDetails securityDetails) {
            this.securityDetails = securityDetails;
            return this;
        }

        public DataflowEndpointGroupEndpointDetails build() {
            return new DataflowEndpointGroupEndpointDetails(endpoint, securityDetails);
        }
    }
}
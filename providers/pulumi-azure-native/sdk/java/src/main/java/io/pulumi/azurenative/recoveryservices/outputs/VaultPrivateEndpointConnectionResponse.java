// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VaultPrivateEndpointConnectionResponse {
    private final PrivateEndpointResponse privateEndpoint;
    private final VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    private final String provisioningState;

    @OutputCustomType.Constructor({"privateEndpoint","privateLinkServiceConnectionState","provisioningState"})
    private VaultPrivateEndpointConnectionResponse(
        PrivateEndpointResponse privateEndpoint,
        VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState) {
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    public PrivateEndpointResponse getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    public VaultPrivateLinkServiceConnectionStateResponse getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPrivateEndpointConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointResponse privateEndpoint;
        private VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPrivateEndpointConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setPrivateEndpoint(PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(VaultPrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public VaultPrivateEndpointConnectionResponse build() {
            return new VaultPrivateEndpointConnectionResponse(privateEndpoint, privateLinkServiceConnectionState, provisioningState);
        }
    }
}
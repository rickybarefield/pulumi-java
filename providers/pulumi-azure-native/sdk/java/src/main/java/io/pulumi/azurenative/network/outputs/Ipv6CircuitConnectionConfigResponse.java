// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Ipv6CircuitConnectionConfigResponse {
    private final @Nullable String addressPrefix;
    private final String circuitConnectionStatus;

    @OutputCustomType.Constructor({"addressPrefix","circuitConnectionStatus"})
    private Ipv6CircuitConnectionConfigResponse(
        @Nullable String addressPrefix,
        String circuitConnectionStatus) {
        this.addressPrefix = addressPrefix;
        this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
    }

    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    public String getCircuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6CircuitConnectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String circuitConnectionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6CircuitConnectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setCircuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }

        public Ipv6CircuitConnectionConfigResponse build() {
            return new Ipv6CircuitConnectionConfigResponse(addressPrefix, circuitConnectionStatus);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EndpointAccessNetworkInterface {
    private final @Nullable String availabilityZone;
    private final @Nullable String networkInterfaceId;
    private final @Nullable String privateIpAddress;
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor({"availabilityZone","networkInterfaceId","privateIpAddress","subnetId"})
    private EndpointAccessNetworkInterface(
        @Nullable String availabilityZone,
        @Nullable String networkInterfaceId,
        @Nullable String privateIpAddress,
        @Nullable String subnetId) {
        this.availabilityZone = availabilityZone;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIpAddress = privateIpAddress;
        this.subnetId = subnetId;
    }

    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public Optional<String> getNetworkInterfaceId() {
        return Optional.ofNullable(this.networkInterfaceId);
    }
    public Optional<String> getPrivateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAccessNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String networkInterfaceId;
        private @Nullable String privateIpAddress;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAccessNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setNetworkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder setPrivateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public EndpointAccessNetworkInterface build() {
            return new EndpointAccessNetworkInterface(availabilityZone, networkInterfaceId, privateIpAddress, subnetId);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.azurenative.vmwarecloudsimple.inputs.GuestOSNICCustomizationResponse;
import io.pulumi.azurenative.vmwarecloudsimple.inputs.VirtualNetworkResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNicResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNicResponse Empty = new VirtualNicResponse();

    @InputImport(name="customization")
    private final @Nullable GuestOSNICCustomizationResponse customization;

    public Optional<GuestOSNICCustomizationResponse> getCustomization() {
        return this.customization == null ? Optional.empty() : Optional.ofNullable(this.customization);
    }

    @InputImport(name="ipAddresses")
    private final @Nullable List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    @InputImport(name="macAddress")
    private final @Nullable String macAddress;

    public Optional<String> getMacAddress() {
        return this.macAddress == null ? Optional.empty() : Optional.ofNullable(this.macAddress);
    }

    @InputImport(name="network", required=true)
    private final VirtualNetworkResponse network;

    public VirtualNetworkResponse getNetwork() {
        return this.network;
    }

    @InputImport(name="nicType", required=true)
    private final String nicType;

    public String getNicType() {
        return this.nicType;
    }

    @InputImport(name="powerOnBoot")
    private final @Nullable Boolean powerOnBoot;

    public Optional<Boolean> getPowerOnBoot() {
        return this.powerOnBoot == null ? Optional.empty() : Optional.ofNullable(this.powerOnBoot);
    }

    @InputImport(name="virtualNicId")
    private final @Nullable String virtualNicId;

    public Optional<String> getVirtualNicId() {
        return this.virtualNicId == null ? Optional.empty() : Optional.ofNullable(this.virtualNicId);
    }

    @InputImport(name="virtualNicName", required=true)
    private final String virtualNicName;

    public String getVirtualNicName() {
        return this.virtualNicName;
    }

    public VirtualNicResponse(
        @Nullable GuestOSNICCustomizationResponse customization,
        @Nullable List<String> ipAddresses,
        @Nullable String macAddress,
        VirtualNetworkResponse network,
        String nicType,
        @Nullable Boolean powerOnBoot,
        @Nullable String virtualNicId,
        String virtualNicName) {
        this.customization = customization;
        this.ipAddresses = ipAddresses;
        this.macAddress = macAddress;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.nicType = Objects.requireNonNull(nicType, "expected parameter 'nicType' to be non-null");
        this.powerOnBoot = powerOnBoot;
        this.virtualNicId = virtualNicId;
        this.virtualNicName = Objects.requireNonNull(virtualNicName, "expected parameter 'virtualNicName' to be non-null");
    }

    private VirtualNicResponse() {
        this.customization = null;
        this.ipAddresses = List.of();
        this.macAddress = null;
        this.network = null;
        this.nicType = null;
        this.powerOnBoot = null;
        this.virtualNicId = null;
        this.virtualNicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNicResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GuestOSNICCustomizationResponse customization;
        private @Nullable List<String> ipAddresses;
        private @Nullable String macAddress;
        private VirtualNetworkResponse network;
        private String nicType;
        private @Nullable Boolean powerOnBoot;
        private @Nullable String virtualNicId;
        private String virtualNicName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNicResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customization = defaults.customization;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.macAddress = defaults.macAddress;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
    	      this.virtualNicId = defaults.virtualNicId;
    	      this.virtualNicName = defaults.virtualNicName;
        }

        public Builder setCustomization(@Nullable GuestOSNICCustomizationResponse customization) {
            this.customization = customization;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setMacAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder setNetwork(VirtualNetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Boolean powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public Builder setVirtualNicId(@Nullable String virtualNicId) {
            this.virtualNicId = virtualNicId;
            return this;
        }

        public Builder setVirtualNicName(String virtualNicName) {
            this.virtualNicName = Objects.requireNonNull(virtualNicName);
            return this;
        }

        public VirtualNicResponse build() {
            return new VirtualNicResponse(customization, ipAddresses, macAddress, network, nicType, powerOnBoot, virtualNicId, virtualNicName);
        }
    }
}
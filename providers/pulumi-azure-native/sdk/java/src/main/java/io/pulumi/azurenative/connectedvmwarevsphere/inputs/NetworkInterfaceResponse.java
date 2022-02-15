// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.NicIPSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkInterfaceResponse Empty = new NetworkInterfaceResponse();

    @InputImport(name="deviceKey")
    private final @Nullable Integer deviceKey;

    public Optional<Integer> getDeviceKey() {
        return this.deviceKey == null ? Optional.empty() : Optional.ofNullable(this.deviceKey);
    }

    @InputImport(name="ipAddresses", required=true)
    private final List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    @InputImport(name="ipSettings")
    private final @Nullable NicIPSettingsResponse ipSettings;

    public Optional<NicIPSettingsResponse> getIpSettings() {
        return this.ipSettings == null ? Optional.empty() : Optional.ofNullable(this.ipSettings);
    }

    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    @InputImport(name="macAddress", required=true)
    private final String macAddress;

    public String getMacAddress() {
        return this.macAddress;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="networkId")
    private final @Nullable String networkId;

    public Optional<String> getNetworkId() {
        return this.networkId == null ? Optional.empty() : Optional.ofNullable(this.networkId);
    }

    @InputImport(name="networkMoName", required=true)
    private final String networkMoName;

    public String getNetworkMoName() {
        return this.networkMoName;
    }

    @InputImport(name="networkMoRefId", required=true)
    private final String networkMoRefId;

    public String getNetworkMoRefId() {
        return this.networkMoRefId;
    }

    @InputImport(name="nicType")
    private final @Nullable String nicType;

    public Optional<String> getNicType() {
        return this.nicType == null ? Optional.empty() : Optional.ofNullable(this.nicType);
    }

    @InputImport(name="powerOnBoot")
    private final @Nullable String powerOnBoot;

    public Optional<String> getPowerOnBoot() {
        return this.powerOnBoot == null ? Optional.empty() : Optional.ofNullable(this.powerOnBoot);
    }

    public NetworkInterfaceResponse(
        @Nullable Integer deviceKey,
        List<String> ipAddresses,
        @Nullable NicIPSettingsResponse ipSettings,
        String label,
        String macAddress,
        @Nullable String name,
        @Nullable String networkId,
        String networkMoName,
        String networkMoRefId,
        @Nullable String nicType,
        @Nullable String powerOnBoot) {
        this.deviceKey = deviceKey;
        this.ipAddresses = Objects.requireNonNull(ipAddresses, "expected parameter 'ipAddresses' to be non-null");
        this.ipSettings = ipSettings;
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.macAddress = Objects.requireNonNull(macAddress, "expected parameter 'macAddress' to be non-null");
        this.name = name;
        this.networkId = networkId;
        this.networkMoName = Objects.requireNonNull(networkMoName, "expected parameter 'networkMoName' to be non-null");
        this.networkMoRefId = Objects.requireNonNull(networkMoRefId, "expected parameter 'networkMoRefId' to be non-null");
        this.nicType = nicType;
        this.powerOnBoot = powerOnBoot;
    }

    private NetworkInterfaceResponse() {
        this.deviceKey = null;
        this.ipAddresses = List.of();
        this.ipSettings = null;
        this.label = null;
        this.macAddress = null;
        this.name = null;
        this.networkId = null;
        this.networkMoName = null;
        this.networkMoRefId = null;
        this.nicType = null;
        this.powerOnBoot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer deviceKey;
        private List<String> ipAddresses;
        private @Nullable NicIPSettingsResponse ipSettings;
        private String label;
        private String macAddress;
        private @Nullable String name;
        private @Nullable String networkId;
        private String networkMoName;
        private String networkMoRefId;
        private @Nullable String nicType;
        private @Nullable String powerOnBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceKey = defaults.deviceKey;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.ipSettings = defaults.ipSettings;
    	      this.label = defaults.label;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.networkMoName = defaults.networkMoName;
    	      this.networkMoRefId = defaults.networkMoRefId;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
        }

        public Builder setDeviceKey(@Nullable Integer deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }

        public Builder setIpAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder setIpSettings(@Nullable NicIPSettingsResponse ipSettings) {
            this.ipSettings = ipSettings;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setMacAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkId(@Nullable String networkId) {
            this.networkId = networkId;
            return this;
        }

        public Builder setNetworkMoName(String networkMoName) {
            this.networkMoName = Objects.requireNonNull(networkMoName);
            return this;
        }

        public Builder setNetworkMoRefId(String networkMoRefId) {
            this.networkMoRefId = Objects.requireNonNull(networkMoRefId);
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setPowerOnBoot(@Nullable String powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(deviceKey, ipAddresses, ipSettings, label, macAddress, name, networkId, networkMoName, networkMoRefId, nicType, powerOnBoot);
        }
    }
}
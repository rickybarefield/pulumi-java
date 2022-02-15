// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VpnConnectionResponse;
import io.pulumi.azurenative.network.outputs.VpnGatewayIpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.VpnGatewayNatRuleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpnGatewayResult {
    private final @Nullable BgpSettingsResponse bgpSettings;
    private final @Nullable List<VpnConnectionResponse> connections;
    private final String etag;
    private final @Nullable String id;
    private final List<VpnGatewayIpConfigurationResponse> ipConfigurations;
    private final @Nullable Boolean isRoutingPreferenceInternet;
    private final String location;
    private final String name;
    private final @Nullable List<VpnGatewayNatRuleResponse> natRules;
    private final String provisioningState;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable SubResourceResponse virtualHub;
    private final @Nullable Integer vpnGatewayScaleUnit;

    @OutputCustomType.Constructor({"bgpSettings","connections","etag","id","ipConfigurations","isRoutingPreferenceInternet","location","name","natRules","provisioningState","tags","type","virtualHub","vpnGatewayScaleUnit"})
    private GetVpnGatewayResult(
        @Nullable BgpSettingsResponse bgpSettings,
        @Nullable List<VpnConnectionResponse> connections,
        String etag,
        @Nullable String id,
        List<VpnGatewayIpConfigurationResponse> ipConfigurations,
        @Nullable Boolean isRoutingPreferenceInternet,
        String location,
        String name,
        @Nullable List<VpnGatewayNatRuleResponse> natRules,
        String provisioningState,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable SubResourceResponse virtualHub,
        @Nullable Integer vpnGatewayScaleUnit) {
        this.bgpSettings = bgpSettings;
        this.connections = connections;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.natRules = natRules;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.virtualHub = virtualHub;
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
    }

    public Optional<BgpSettingsResponse> getBgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }
    public List<VpnConnectionResponse> getConnections() {
        return this.connections == null ? List.of() : this.connections;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<VpnGatewayIpConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    public Optional<Boolean> getIsRoutingPreferenceInternet() {
        return Optional.ofNullable(this.isRoutingPreferenceInternet);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public List<VpnGatewayNatRuleResponse> getNatRules() {
        return this.natRules == null ? List.of() : this.natRules;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<SubResourceResponse> getVirtualHub() {
        return Optional.ofNullable(this.virtualHub);
    }
    public Optional<Integer> getVpnGatewayScaleUnit() {
        return Optional.ofNullable(this.vpnGatewayScaleUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BgpSettingsResponse bgpSettings;
        private @Nullable List<VpnConnectionResponse> connections;
        private String etag;
        private @Nullable String id;
        private List<VpnGatewayIpConfigurationResponse> ipConfigurations;
        private @Nullable Boolean isRoutingPreferenceInternet;
        private String location;
        private String name;
        private @Nullable List<VpnGatewayNatRuleResponse> natRules;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable SubResourceResponse virtualHub;
        private @Nullable Integer vpnGatewayScaleUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.connections = defaults.connections;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.isRoutingPreferenceInternet = defaults.isRoutingPreferenceInternet;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.natRules = defaults.natRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHub = defaults.virtualHub;
    	      this.vpnGatewayScaleUnit = defaults.vpnGatewayScaleUnit;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsResponse bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setConnections(@Nullable List<VpnConnectionResponse> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIpConfigurations(List<VpnGatewayIpConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder setIsRoutingPreferenceInternet(@Nullable Boolean isRoutingPreferenceInternet) {
            this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
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

        public Builder setNatRules(@Nullable List<VpnGatewayNatRuleResponse> natRules) {
            this.natRules = natRules;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceResponse virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder setVpnGatewayScaleUnit(@Nullable Integer vpnGatewayScaleUnit) {
            this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
            return this;
        }

        public GetVpnGatewayResult build() {
            return new GetVpnGatewayResult(bgpSettings, connections, etag, id, ipConfigurations, isRoutingPreferenceInternet, location, name, natRules, provisioningState, tags, type, virtualHub, vpnGatewayScaleUnit);
        }
    }
}
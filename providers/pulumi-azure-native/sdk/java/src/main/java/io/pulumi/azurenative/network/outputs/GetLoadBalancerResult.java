// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.BackendAddressPoolResponse;
import io.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.outputs.FrontendIPConfigurationResponse;
import io.pulumi.azurenative.network.outputs.InboundNatPoolResponse;
import io.pulumi.azurenative.network.outputs.InboundNatRuleResponse;
import io.pulumi.azurenative.network.outputs.LoadBalancerSkuResponse;
import io.pulumi.azurenative.network.outputs.LoadBalancingRuleResponse;
import io.pulumi.azurenative.network.outputs.OutboundRuleResponse;
import io.pulumi.azurenative.network.outputs.ProbeResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoadBalancerResult {
    private final @Nullable List<BackendAddressPoolResponse> backendAddressPools;
    private final String etag;
    private final @Nullable ExtendedLocationResponse extendedLocation;
    private final @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations;
    private final @Nullable String id;
    private final @Nullable List<InboundNatPoolResponse> inboundNatPools;
    private final @Nullable List<InboundNatRuleResponse> inboundNatRules;
    private final @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
    private final @Nullable String location;
    private final String name;
    private final @Nullable List<OutboundRuleResponse> outboundRules;
    private final @Nullable List<ProbeResponse> probes;
    private final String provisioningState;
    private final String resourceGuid;
    private final @Nullable LoadBalancerSkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"backendAddressPools","etag","extendedLocation","frontendIPConfigurations","id","inboundNatPools","inboundNatRules","loadBalancingRules","location","name","outboundRules","probes","provisioningState","resourceGuid","sku","tags","type"})
    private GetLoadBalancerResult(
        @Nullable List<BackendAddressPoolResponse> backendAddressPools,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations,
        @Nullable String id,
        @Nullable List<InboundNatPoolResponse> inboundNatPools,
        @Nullable List<InboundNatRuleResponse> inboundNatRules,
        @Nullable List<LoadBalancingRuleResponse> loadBalancingRules,
        @Nullable String location,
        String name,
        @Nullable List<OutboundRuleResponse> outboundRules,
        @Nullable List<ProbeResponse> probes,
        String provisioningState,
        String resourceGuid,
        @Nullable LoadBalancerSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.backendAddressPools = backendAddressPools;
        this.etag = Objects.requireNonNull(etag);
        this.extendedLocation = extendedLocation;
        this.frontendIPConfigurations = frontendIPConfigurations;
        this.id = id;
        this.inboundNatPools = inboundNatPools;
        this.inboundNatRules = inboundNatRules;
        this.loadBalancingRules = loadBalancingRules;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.outboundRules = outboundRules;
        this.probes = probes;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public List<BackendAddressPoolResponse> getBackendAddressPools() {
        return this.backendAddressPools == null ? List.of() : this.backendAddressPools;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    public List<FrontendIPConfigurationResponse> getFrontendIPConfigurations() {
        return this.frontendIPConfigurations == null ? List.of() : this.frontendIPConfigurations;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<InboundNatPoolResponse> getInboundNatPools() {
        return this.inboundNatPools == null ? List.of() : this.inboundNatPools;
    }
    public List<InboundNatRuleResponse> getInboundNatRules() {
        return this.inboundNatRules == null ? List.of() : this.inboundNatRules;
    }
    public List<LoadBalancingRuleResponse> getLoadBalancingRules() {
        return this.loadBalancingRules == null ? List.of() : this.loadBalancingRules;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public List<OutboundRuleResponse> getOutboundRules() {
        return this.outboundRules == null ? List.of() : this.outboundRules;
    }
    public List<ProbeResponse> getProbes() {
        return this.probes == null ? List.of() : this.probes;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    public Optional<LoadBalancerSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BackendAddressPoolResponse> backendAddressPools;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations;
        private @Nullable String id;
        private @Nullable List<InboundNatPoolResponse> inboundNatPools;
        private @Nullable List<InboundNatRuleResponse> inboundNatRules;
        private @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
        private @Nullable String location;
        private String name;
        private @Nullable List<OutboundRuleResponse> outboundRules;
        private @Nullable List<ProbeResponse> probes;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable LoadBalancerSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPools = defaults.backendAddressPools;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.frontendIPConfigurations = defaults.frontendIPConfigurations;
    	      this.id = defaults.id;
    	      this.inboundNatPools = defaults.inboundNatPools;
    	      this.inboundNatRules = defaults.inboundNatRules;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outboundRules = defaults.outboundRules;
    	      this.probes = defaults.probes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setBackendAddressPools(@Nullable List<BackendAddressPoolResponse> backendAddressPools) {
            this.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setFrontendIPConfigurations(@Nullable List<FrontendIPConfigurationResponse> frontendIPConfigurations) {
            this.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundNatPools(@Nullable List<InboundNatPoolResponse> inboundNatPools) {
            this.inboundNatPools = inboundNatPools;
            return this;
        }

        public Builder setInboundNatRules(@Nullable List<InboundNatRuleResponse> inboundNatRules) {
            this.inboundNatRules = inboundNatRules;
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable List<LoadBalancingRuleResponse> loadBalancingRules) {
            this.loadBalancingRules = loadBalancingRules;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutboundRules(@Nullable List<OutboundRuleResponse> outboundRules) {
            this.outboundRules = outboundRules;
            return this;
        }

        public Builder setProbes(@Nullable List<ProbeResponse> probes) {
            this.probes = probes;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setSku(@Nullable LoadBalancerSkuResponse sku) {
            this.sku = sku;
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

        public GetLoadBalancerResult build() {
            return new GetLoadBalancerResult(backendAddressPools, etag, extendedLocation, frontendIPConfigurations, id, inboundNatPools, inboundNatRules, loadBalancingRules, location, name, outboundRules, probes, provisioningState, resourceGuid, sku, tags, type);
        }
    }
}
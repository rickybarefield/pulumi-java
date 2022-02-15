// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.inputs;

import io.pulumi.azurenative.analysisservices.inputs.IPv4FirewallRuleResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IPv4FirewallSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPv4FirewallSettingsResponse Empty = new IPv4FirewallSettingsResponse();

    @InputImport(name="enablePowerBIService")
    private final @Nullable Boolean enablePowerBIService;

    public Optional<Boolean> getEnablePowerBIService() {
        return this.enablePowerBIService == null ? Optional.empty() : Optional.ofNullable(this.enablePowerBIService);
    }

    @InputImport(name="firewallRules")
    private final @Nullable List<IPv4FirewallRuleResponse> firewallRules;

    public List<IPv4FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules == null ? List.of() : this.firewallRules;
    }

    public IPv4FirewallSettingsResponse(
        @Nullable Boolean enablePowerBIService,
        @Nullable List<IPv4FirewallRuleResponse> firewallRules) {
        this.enablePowerBIService = enablePowerBIService;
        this.firewallRules = firewallRules;
    }

    private IPv4FirewallSettingsResponse() {
        this.enablePowerBIService = null;
        this.firewallRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPv4FirewallSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enablePowerBIService;
        private @Nullable List<IPv4FirewallRuleResponse> firewallRules;

        public Builder() {
    	      // Empty
        }

        public Builder(IPv4FirewallSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePowerBIService = defaults.enablePowerBIService;
    	      this.firewallRules = defaults.firewallRules;
        }

        public Builder setEnablePowerBIService(@Nullable Boolean enablePowerBIService) {
            this.enablePowerBIService = enablePowerBIService;
            return this;
        }

        public Builder setFirewallRules(@Nullable List<IPv4FirewallRuleResponse> firewallRules) {
            this.firewallRules = firewallRules;
            return this;
        }

        public IPv4FirewallSettingsResponse build() {
            return new IPv4FirewallSettingsResponse(enablePowerBIService, firewallRules);
        }
    }
}
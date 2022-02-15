// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.FirewallPolicyLogAnalyticsResourcesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyInsightsResponse {
    private final @Nullable Boolean isEnabled;
    private final @Nullable FirewallPolicyLogAnalyticsResourcesResponse logAnalyticsResources;
    private final @Nullable Integer retentionDays;

    @OutputCustomType.Constructor({"isEnabled","logAnalyticsResources","retentionDays"})
    private FirewallPolicyInsightsResponse(
        @Nullable Boolean isEnabled,
        @Nullable FirewallPolicyLogAnalyticsResourcesResponse logAnalyticsResources,
        @Nullable Integer retentionDays) {
        this.isEnabled = isEnabled;
        this.logAnalyticsResources = logAnalyticsResources;
        this.retentionDays = retentionDays;
    }

    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }
    public Optional<FirewallPolicyLogAnalyticsResourcesResponse> getLogAnalyticsResources() {
        return Optional.ofNullable(this.logAnalyticsResources);
    }
    public Optional<Integer> getRetentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyInsightsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEnabled;
        private @Nullable FirewallPolicyLogAnalyticsResourcesResponse logAnalyticsResources;
        private @Nullable Integer retentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyInsightsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.logAnalyticsResources = defaults.logAnalyticsResources;
    	      this.retentionDays = defaults.retentionDays;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setLogAnalyticsResources(@Nullable FirewallPolicyLogAnalyticsResourcesResponse logAnalyticsResources) {
            this.logAnalyticsResources = logAnalyticsResources;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public FirewallPolicyInsightsResponse build() {
            return new FirewallPolicyInsightsResponse(isEnabled, logAnalyticsResources, retentionDays);
        }
    }
}
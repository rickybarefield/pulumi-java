// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.DestinationsSpecResponseAzureMonitorMetrics;
import io.pulumi.azurenative.insights.outputs.LogAnalyticsDestinationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataCollectionRuleResponseDestinations {
    private final @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics;
    private final @Nullable List<LogAnalyticsDestinationResponse> logAnalytics;

    @OutputCustomType.Constructor({"azureMonitorMetrics","logAnalytics"})
    private DataCollectionRuleResponseDestinations(
        @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics,
        @Nullable List<LogAnalyticsDestinationResponse> logAnalytics) {
        this.azureMonitorMetrics = azureMonitorMetrics;
        this.logAnalytics = logAnalytics;
    }

    public Optional<DestinationsSpecResponseAzureMonitorMetrics> getAzureMonitorMetrics() {
        return Optional.ofNullable(this.azureMonitorMetrics);
    }
    public List<LogAnalyticsDestinationResponse> getLogAnalytics() {
        return this.logAnalytics == null ? List.of() : this.logAnalytics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionRuleResponseDestinations defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics;
        private @Nullable List<LogAnalyticsDestinationResponse> logAnalytics;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionRuleResponseDestinations defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureMonitorMetrics = defaults.azureMonitorMetrics;
    	      this.logAnalytics = defaults.logAnalytics;
        }

        public Builder setAzureMonitorMetrics(@Nullable DestinationsSpecResponseAzureMonitorMetrics azureMonitorMetrics) {
            this.azureMonitorMetrics = azureMonitorMetrics;
            return this;
        }

        public Builder setLogAnalytics(@Nullable List<LogAnalyticsDestinationResponse> logAnalytics) {
            this.logAnalytics = logAnalytics;
            return this;
        }

        public DataCollectionRuleResponseDestinations build() {
            return new DataCollectionRuleResponseDestinations(azureMonitorMetrics, logAnalytics);
        }
    }
}
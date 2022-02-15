// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationAggregatorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationAggregatorArgs Empty = new GetConfigurationAggregatorArgs();

    @InputImport(name="configurationAggregatorName", required=true)
    private final String configurationAggregatorName;

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    public GetConfigurationAggregatorArgs(String configurationAggregatorName) {
        this.configurationAggregatorName = Objects.requireNonNull(configurationAggregatorName, "expected parameter 'configurationAggregatorName' to be non-null");
    }

    private GetConfigurationAggregatorArgs() {
        this.configurationAggregatorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationAggregatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationAggregatorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationAggregatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationAggregatorName = defaults.configurationAggregatorName;
        }

        public Builder setConfigurationAggregatorName(String configurationAggregatorName) {
            this.configurationAggregatorName = Objects.requireNonNull(configurationAggregatorName);
            return this;
        }

        public GetConfigurationAggregatorArgs build() {
            return new GetConfigurationAggregatorArgs(configurationAggregatorName);
        }
    }
}
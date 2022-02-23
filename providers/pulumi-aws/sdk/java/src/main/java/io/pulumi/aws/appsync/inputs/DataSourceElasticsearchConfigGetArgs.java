// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceElasticsearchConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceElasticsearchConfigGetArgs Empty = new DataSourceElasticsearchConfigGetArgs();

    /**
     * HTTP URL.
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint;
    }

    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public DataSourceElasticsearchConfigGetArgs(
        Input<String> endpoint,
        @Nullable Input<String> region) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
        this.region = region;
    }

    private DataSourceElasticsearchConfigGetArgs() {
        this.endpoint = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceElasticsearchConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpoint;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceElasticsearchConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder setEndpoint(Input<String> endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Input.of(Objects.requireNonNull(endpoint));
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public DataSourceElasticsearchConfigGetArgs build() {
            return new DataSourceElasticsearchConfigGetArgs(endpoint, region);
        }
    }
}
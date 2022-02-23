// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersJira {
    /**
     * The base URL of the Jira instance's site to which to connect.
     * 
     */
    private final String siteBaseUrl;

    @OutputCustomType.Constructor({"siteBaseUrl"})
    private DataSourceParametersJira(String siteBaseUrl) {
        this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
    }

    /**
     * The base URL of the Jira instance's site to which to connect.
     * 
     */
    public String getSiteBaseUrl() {
        return this.siteBaseUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersJira defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String siteBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersJira defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteBaseUrl = defaults.siteBaseUrl;
        }

        public Builder setSiteBaseUrl(String siteBaseUrl) {
            this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
            return this;
        }
        public DataSourceParametersJira build() {
            return new DataSourceParametersJira(siteBaseUrl);
        }
    }
}
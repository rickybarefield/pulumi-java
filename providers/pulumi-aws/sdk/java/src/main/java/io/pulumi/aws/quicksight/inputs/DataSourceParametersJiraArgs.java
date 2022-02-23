// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersJiraArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersJiraArgs Empty = new DataSourceParametersJiraArgs();

    /**
     * The base URL of the Jira instance's site to which to connect.
     * 
     */
    @InputImport(name="siteBaseUrl", required=true)
    private final Input<String> siteBaseUrl;

    public Input<String> getSiteBaseUrl() {
        return this.siteBaseUrl;
    }

    public DataSourceParametersJiraArgs(Input<String> siteBaseUrl) {
        this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl, "expected parameter 'siteBaseUrl' to be non-null");
    }

    private DataSourceParametersJiraArgs() {
        this.siteBaseUrl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersJiraArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> siteBaseUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersJiraArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteBaseUrl = defaults.siteBaseUrl;
        }

        public Builder setSiteBaseUrl(Input<String> siteBaseUrl) {
            this.siteBaseUrl = Objects.requireNonNull(siteBaseUrl);
            return this;
        }

        public Builder setSiteBaseUrl(String siteBaseUrl) {
            this.siteBaseUrl = Input.of(Objects.requireNonNull(siteBaseUrl));
            return this;
        }
        public DataSourceParametersJiraArgs build() {
            return new DataSourceParametersJiraArgs(siteBaseUrl);
        }
    }
}
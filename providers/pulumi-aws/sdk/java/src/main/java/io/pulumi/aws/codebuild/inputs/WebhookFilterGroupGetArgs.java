// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.WebhookFilterGroupFilterGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookFilterGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookFilterGroupGetArgs Empty = new WebhookFilterGroupGetArgs();

    /**
     * A webhook filter for the group. Filter blocks are documented below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable Input<List<WebhookFilterGroupFilterGetArgs>> filters;

    public Input<List<WebhookFilterGroupFilterGetArgs>> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    public WebhookFilterGroupGetArgs(@Nullable Input<List<WebhookFilterGroupFilterGetArgs>> filters) {
        this.filters = filters;
    }

    private WebhookFilterGroupGetArgs() {
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilterGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WebhookFilterGroupFilterGetArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilterGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(@Nullable Input<List<WebhookFilterGroupFilterGetArgs>> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable List<WebhookFilterGroupFilterGetArgs> filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }
        public WebhookFilterGroupGetArgs build() {
            return new WebhookFilterGroupGetArgs(filters);
        }
    }
}
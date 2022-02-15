// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.awsnative.lambda.outputs.EventSourceMappingFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FilterCriteriaProperties {
    private final @Nullable List<EventSourceMappingFilter> filters;

    @OutputCustomType.Constructor({"filters"})
    private FilterCriteriaProperties(@Nullable List<EventSourceMappingFilter> filters) {
        this.filters = filters;
    }

    public List<EventSourceMappingFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterCriteriaProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventSourceMappingFilter> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterCriteriaProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(@Nullable List<EventSourceMappingFilter> filters) {
            this.filters = filters;
            return this;
        }

        public FilterCriteriaProperties build() {
            return new FilterCriteriaProperties(filters);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.EventSourceMappingFilterCriteriaFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSourceMappingFilterCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingFilterCriteriaArgs Empty = new EventSourceMappingFilterCriteriaArgs();

    /**
     * A set of up to 5 filter. If an event satisfies at least one, Lambda sends the event to the function or adds it to the next batch. Detailed below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable Input<List<EventSourceMappingFilterCriteriaFilterArgs>> filters;

    public Input<List<EventSourceMappingFilterCriteriaFilterArgs>> getFilters() {
        return this.filters == null ? Input.empty() : this.filters;
    }

    public EventSourceMappingFilterCriteriaArgs(@Nullable Input<List<EventSourceMappingFilterCriteriaFilterArgs>> filters) {
        this.filters = filters;
    }

    private EventSourceMappingFilterCriteriaArgs() {
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingFilterCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventSourceMappingFilterCriteriaFilterArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingFilterCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(@Nullable Input<List<EventSourceMappingFilterCriteriaFilterArgs>> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setFilters(@Nullable List<EventSourceMappingFilterCriteriaFilterArgs> filters) {
            this.filters = Input.ofNullable(filters);
            return this;
        }
        public EventSourceMappingFilterCriteriaArgs build() {
            return new EventSourceMappingFilterCriteriaArgs(filters);
        }
    }
}
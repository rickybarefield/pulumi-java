// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrailAdvancedEventSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailAdvancedEventSelectorArgs Empty = new TrailAdvancedEventSelectorArgs();

    /**
     * Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    @InputImport(name="fieldSelectors", required=true)
    private final Input<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors;

    public Input<List<TrailAdvancedEventSelectorFieldSelectorArgs>> getFieldSelectors() {
        return this.fieldSelectors;
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public TrailAdvancedEventSelectorArgs(
        Input<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors,
        @Nullable Input<String> name) {
        this.fieldSelectors = Objects.requireNonNull(fieldSelectors, "expected parameter 'fieldSelectors' to be non-null");
        this.name = name;
    }

    private TrailAdvancedEventSelectorArgs() {
        this.fieldSelectors = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailAdvancedEventSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailAdvancedEventSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        public Builder setFieldSelectors(Input<List<TrailAdvancedEventSelectorFieldSelectorArgs>> fieldSelectors) {
            this.fieldSelectors = Objects.requireNonNull(fieldSelectors);
            return this;
        }

        public Builder setFieldSelectors(List<TrailAdvancedEventSelectorFieldSelectorArgs> fieldSelectors) {
            this.fieldSelectors = Input.of(Objects.requireNonNull(fieldSelectors));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public TrailAdvancedEventSelectorArgs build() {
            return new TrailAdvancedEventSelectorArgs(fieldSelectors, name);
        }
    }
}
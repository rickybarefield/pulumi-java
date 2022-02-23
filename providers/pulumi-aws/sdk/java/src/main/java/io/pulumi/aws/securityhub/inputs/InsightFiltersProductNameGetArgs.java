// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersProductNameGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersProductNameGetArgs Empty = new InsightFiltersProductNameGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @InputImport(name="comparison", required=true)
    private final Input<String> comparison;

    public Input<String> getComparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public InsightFiltersProductNameGetArgs(
        Input<String> comparison,
        Input<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersProductNameGetArgs() {
        this.comparison = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersProductNameGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparison;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersProductNameGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder setComparison(Input<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Input.of(Objects.requireNonNull(comparison));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public InsightFiltersProductNameGetArgs build() {
            return new InsightFiltersProductNameGetArgs(comparison, value);
        }
    }
}
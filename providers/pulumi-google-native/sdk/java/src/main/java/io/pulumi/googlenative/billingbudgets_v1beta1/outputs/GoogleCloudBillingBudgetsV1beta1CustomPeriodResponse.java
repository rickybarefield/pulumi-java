// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.billingbudgets_v1beta1.outputs.GoogleTypeDateResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse {
    private final GoogleTypeDateResponse endDate;
    private final GoogleTypeDateResponse startDate;

    @OutputCustomType.Constructor({"endDate","startDate"})
    private GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse(
        GoogleTypeDateResponse endDate,
        GoogleTypeDateResponse startDate) {
        this.endDate = Objects.requireNonNull(endDate);
        this.startDate = Objects.requireNonNull(startDate);
    }

    public GoogleTypeDateResponse getEndDate() {
        return this.endDate;
    }
    public GoogleTypeDateResponse getStartDate() {
        return this.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeDateResponse endDate;
        private GoogleTypeDateResponse startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder setEndDate(GoogleTypeDateResponse endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }

        public Builder setStartDate(GoogleTypeDateResponse startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }

        public GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse build() {
            return new GoogleCloudBillingBudgetsV1beta1CustomPeriodResponse(endDate, startDate);
        }
    }
}
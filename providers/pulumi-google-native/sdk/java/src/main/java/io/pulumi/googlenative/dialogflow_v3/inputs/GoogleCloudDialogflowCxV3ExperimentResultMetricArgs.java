// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3ExperimentResultMetricCountType;
import io.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3ExperimentResultMetricType;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowCxV3ExperimentResultMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultMetricArgs Empty = new GoogleCloudDialogflowCxV3ExperimentResultMetricArgs();

    @InputImport(name="confidenceInterval")
    private final @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs> confidenceInterval;

    public Input<GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs> getConfidenceInterval() {
        return this.confidenceInterval == null ? Input.empty() : this.confidenceInterval;
    }

    @InputImport(name="count")
    private final @Nullable Input<Double> count;

    public Input<Double> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    @InputImport(name="countType")
    private final @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricCountType> countType;

    public Input<GoogleCloudDialogflowCxV3ExperimentResultMetricCountType> getCountType() {
        return this.countType == null ? Input.empty() : this.countType;
    }

    @InputImport(name="ratio")
    private final @Nullable Input<Double> ratio;

    public Input<Double> getRatio() {
        return this.ratio == null ? Input.empty() : this.ratio;
    }

    @InputImport(name="type")
    private final @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricType> type;

    public Input<GoogleCloudDialogflowCxV3ExperimentResultMetricType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GoogleCloudDialogflowCxV3ExperimentResultMetricArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs> confidenceInterval,
        @Nullable Input<Double> count,
        @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricCountType> countType,
        @Nullable Input<Double> ratio,
        @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricType> type) {
        this.confidenceInterval = confidenceInterval;
        this.count = count;
        this.countType = countType;
        this.ratio = ratio;
        this.type = type;
    }

    private GoogleCloudDialogflowCxV3ExperimentResultMetricArgs() {
        this.confidenceInterval = Input.empty();
        this.count = Input.empty();
        this.countType = Input.empty();
        this.ratio = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs> confidenceInterval;
        private @Nullable Input<Double> count;
        private @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricCountType> countType;
        private @Nullable Input<Double> ratio;
        private @Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceInterval = defaults.confidenceInterval;
    	      this.count = defaults.count;
    	      this.countType = defaults.countType;
    	      this.ratio = defaults.ratio;
    	      this.type = defaults.type;
        }

        public Builder setConfidenceInterval(@Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs> confidenceInterval) {
            this.confidenceInterval = confidenceInterval;
            return this;
        }

        public Builder setConfidenceInterval(@Nullable GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalArgs confidenceInterval) {
            this.confidenceInterval = Input.ofNullable(confidenceInterval);
            return this;
        }

        public Builder setCount(@Nullable Input<Double> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Double count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setCountType(@Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricCountType> countType) {
            this.countType = countType;
            return this;
        }

        public Builder setCountType(@Nullable GoogleCloudDialogflowCxV3ExperimentResultMetricCountType countType) {
            this.countType = Input.ofNullable(countType);
            return this;
        }

        public Builder setRatio(@Nullable Input<Double> ratio) {
            this.ratio = ratio;
            return this;
        }

        public Builder setRatio(@Nullable Double ratio) {
            this.ratio = Input.ofNullable(ratio);
            return this;
        }

        public Builder setType(@Nullable Input<GoogleCloudDialogflowCxV3ExperimentResultMetricType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable GoogleCloudDialogflowCxV3ExperimentResultMetricType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public GoogleCloudDialogflowCxV3ExperimentResultMetricArgs build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultMetricArgs(confidenceInterval, count, countType, ratio, type);
        }
    }
}
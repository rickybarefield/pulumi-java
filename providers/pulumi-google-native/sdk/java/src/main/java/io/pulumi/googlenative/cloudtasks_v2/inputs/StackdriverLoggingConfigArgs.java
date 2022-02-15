// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackdriverLoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackdriverLoggingConfigArgs Empty = new StackdriverLoggingConfigArgs();

    @InputImport(name="samplingRatio")
    private final @Nullable Input<Double> samplingRatio;

    public Input<Double> getSamplingRatio() {
        return this.samplingRatio == null ? Input.empty() : this.samplingRatio;
    }

    public StackdriverLoggingConfigArgs(@Nullable Input<Double> samplingRatio) {
        this.samplingRatio = samplingRatio;
    }

    private StackdriverLoggingConfigArgs() {
        this.samplingRatio = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackdriverLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> samplingRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(StackdriverLoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samplingRatio = defaults.samplingRatio;
        }

        public Builder setSamplingRatio(@Nullable Input<Double> samplingRatio) {
            this.samplingRatio = samplingRatio;
            return this;
        }

        public Builder setSamplingRatio(@Nullable Double samplingRatio) {
            this.samplingRatio = Input.ofNullable(samplingRatio);
            return this;
        }

        public StackdriverLoggingConfigArgs build() {
            return new StackdriverLoggingConfigArgs(samplingRatio);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ModelInferenceExecutionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelInferenceExecutionConfigArgs Empty = new ModelInferenceExecutionConfigArgs();

    /**
     * The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
     * 
     */
    @InputImport(name="mode", required=true)
    private final Input<String> mode;

    public Input<String> getMode() {
        return this.mode;
    }

    public ModelInferenceExecutionConfigArgs(Input<String> mode) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private ModelInferenceExecutionConfigArgs() {
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelInferenceExecutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelInferenceExecutionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(Input<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Input.of(Objects.requireNonNull(mode));
            return this;
        }
        public ModelInferenceExecutionConfigArgs build() {
            return new ModelInferenceExecutionConfigArgs(mode);
        }
    }
}
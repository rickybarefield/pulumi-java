// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs Empty = new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs();

    /**
     * When restoring from a snapshot, specifies whether the runtime is allowed to skip a state that cannot be mapped to the new program. Default is `false`.
     * 
     */
    @InputImport(name="allowNonRestoredState")
    private final @Nullable Input<Boolean> allowNonRestoredState;

    public Input<Boolean> getAllowNonRestoredState() {
        return this.allowNonRestoredState == null ? Input.empty() : this.allowNonRestoredState;
    }

    public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs(@Nullable Input<Boolean> allowNonRestoredState) {
        this.allowNonRestoredState = allowNonRestoredState;
    }

    private ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs() {
        this.allowNonRestoredState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowNonRestoredState;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNonRestoredState = defaults.allowNonRestoredState;
        }

        public Builder setAllowNonRestoredState(@Nullable Input<Boolean> allowNonRestoredState) {
            this.allowNonRestoredState = allowNonRestoredState;
            return this;
        }

        public Builder setAllowNonRestoredState(@Nullable Boolean allowNonRestoredState) {
            this.allowNonRestoredState = Input.ofNullable(allowNonRestoredState);
            return this;
        }
        public ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationRunConfigurationFlinkRunConfigurationGetArgs(allowNonRestoredState);
        }
    }
}
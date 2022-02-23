// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobDefinitionRetryStrategyEvaluateOnExitArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobDefinitionRetryStrategyEvaluateOnExitArgs Empty = new JobDefinitionRetryStrategyEvaluateOnExitArgs();

    /**
     * Specifies the action to take if all of the specified conditions are met. The values are not case sensitive. Valid values: `RETRY`, `EXIT`.
     * 
     */
    @InputImport(name="action", required=true)
    private final Input<String> action;

    public Input<String> getAction() {
        return this.action;
    }

    /**
     * A glob pattern to match against the decimal representation of the exit code returned for a job.
     * 
     */
    @InputImport(name="onExitCode")
    private final @Nullable Input<String> onExitCode;

    public Input<String> getOnExitCode() {
        return this.onExitCode == null ? Input.empty() : this.onExitCode;
    }

    /**
     * A glob pattern to match against the reason returned for a job.
     * 
     */
    @InputImport(name="onReason")
    private final @Nullable Input<String> onReason;

    public Input<String> getOnReason() {
        return this.onReason == null ? Input.empty() : this.onReason;
    }

    /**
     * A glob pattern to match against the status reason returned for a job.
     * 
     */
    @InputImport(name="onStatusReason")
    private final @Nullable Input<String> onStatusReason;

    public Input<String> getOnStatusReason() {
        return this.onStatusReason == null ? Input.empty() : this.onStatusReason;
    }

    public JobDefinitionRetryStrategyEvaluateOnExitArgs(
        Input<String> action,
        @Nullable Input<String> onExitCode,
        @Nullable Input<String> onReason,
        @Nullable Input<String> onStatusReason) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.onExitCode = onExitCode;
        this.onReason = onReason;
        this.onStatusReason = onStatusReason;
    }

    private JobDefinitionRetryStrategyEvaluateOnExitArgs() {
        this.action = Input.empty();
        this.onExitCode = Input.empty();
        this.onReason = Input.empty();
        this.onStatusReason = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDefinitionRetryStrategyEvaluateOnExitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> action;
        private @Nullable Input<String> onExitCode;
        private @Nullable Input<String> onReason;
        private @Nullable Input<String> onStatusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDefinitionRetryStrategyEvaluateOnExitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.onExitCode = defaults.onExitCode;
    	      this.onReason = defaults.onReason;
    	      this.onStatusReason = defaults.onStatusReason;
        }

        public Builder setAction(Input<String> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(String action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setOnExitCode(@Nullable Input<String> onExitCode) {
            this.onExitCode = onExitCode;
            return this;
        }

        public Builder setOnExitCode(@Nullable String onExitCode) {
            this.onExitCode = Input.ofNullable(onExitCode);
            return this;
        }

        public Builder setOnReason(@Nullable Input<String> onReason) {
            this.onReason = onReason;
            return this;
        }

        public Builder setOnReason(@Nullable String onReason) {
            this.onReason = Input.ofNullable(onReason);
            return this;
        }

        public Builder setOnStatusReason(@Nullable Input<String> onStatusReason) {
            this.onStatusReason = onStatusReason;
            return this;
        }

        public Builder setOnStatusReason(@Nullable String onStatusReason) {
            this.onStatusReason = Input.ofNullable(onStatusReason);
            return this;
        }
        public JobDefinitionRetryStrategyEvaluateOnExitArgs build() {
            return new JobDefinitionRetryStrategyEvaluateOnExitArgs(action, onExitCode, onReason, onStatusReason);
        }
    }
}
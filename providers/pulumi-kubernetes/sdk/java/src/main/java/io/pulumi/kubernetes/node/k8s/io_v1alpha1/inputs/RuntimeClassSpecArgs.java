// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs.OverheadArgs;
import io.pulumi.kubernetes.node.k8s.io_v1alpha1.inputs.SchedulingArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeClassSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeClassSpecArgs Empty = new RuntimeClassSpecArgs();

    @InputImport(name="overhead")
    private final @Nullable Input<OverheadArgs> overhead;

    public Input<OverheadArgs> getOverhead() {
        return this.overhead == null ? Input.empty() : this.overhead;
    }

    @InputImport(name="runtimeHandler", required=true)
    private final Input<String> runtimeHandler;

    public Input<String> getRuntimeHandler() {
        return this.runtimeHandler;
    }

    @InputImport(name="scheduling")
    private final @Nullable Input<SchedulingArgs> scheduling;

    public Input<SchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    public RuntimeClassSpecArgs(
        @Nullable Input<OverheadArgs> overhead,
        Input<String> runtimeHandler,
        @Nullable Input<SchedulingArgs> scheduling) {
        this.overhead = overhead;
        this.runtimeHandler = Objects.requireNonNull(runtimeHandler, "expected parameter 'runtimeHandler' to be non-null");
        this.scheduling = scheduling;
    }

    private RuntimeClassSpecArgs() {
        this.overhead = Input.empty();
        this.runtimeHandler = Input.empty();
        this.scheduling = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeClassSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OverheadArgs> overhead;
        private Input<String> runtimeHandler;
        private @Nullable Input<SchedulingArgs> scheduling;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeClassSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overhead = defaults.overhead;
    	      this.runtimeHandler = defaults.runtimeHandler;
    	      this.scheduling = defaults.scheduling;
        }

        public Builder setOverhead(@Nullable Input<OverheadArgs> overhead) {
            this.overhead = overhead;
            return this;
        }

        public Builder setOverhead(@Nullable OverheadArgs overhead) {
            this.overhead = Input.ofNullable(overhead);
            return this;
        }

        public Builder setRuntimeHandler(Input<String> runtimeHandler) {
            this.runtimeHandler = Objects.requireNonNull(runtimeHandler);
            return this;
        }

        public Builder setRuntimeHandler(String runtimeHandler) {
            this.runtimeHandler = Input.of(Objects.requireNonNull(runtimeHandler));
            return this;
        }

        public Builder setScheduling(@Nullable Input<SchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable SchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public RuntimeClassSpecArgs build() {
            return new RuntimeClassSpecArgs(overhead, runtimeHandler, scheduling);
        }
    }
}
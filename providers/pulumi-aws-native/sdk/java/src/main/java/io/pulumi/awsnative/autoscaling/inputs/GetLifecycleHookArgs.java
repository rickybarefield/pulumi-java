// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLifecycleHookArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLifecycleHookArgs Empty = new GetLifecycleHookArgs();

    @InputImport(name="autoScalingGroupName", required=true)
    private final String autoScalingGroupName;

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    @InputImport(name="lifecycleHookName", required=true)
    private final String lifecycleHookName;

    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    public GetLifecycleHookArgs(
        String autoScalingGroupName,
        String lifecycleHookName) {
        this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName, "expected parameter 'autoScalingGroupName' to be non-null");
        this.lifecycleHookName = Objects.requireNonNull(lifecycleHookName, "expected parameter 'lifecycleHookName' to be non-null");
    }

    private GetLifecycleHookArgs() {
        this.autoScalingGroupName = null;
        this.lifecycleHookName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLifecycleHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoScalingGroupName;
        private String lifecycleHookName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLifecycleHookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingGroupName = defaults.autoScalingGroupName;
    	      this.lifecycleHookName = defaults.lifecycleHookName;
        }

        public Builder setAutoScalingGroupName(String autoScalingGroupName) {
            this.autoScalingGroupName = Objects.requireNonNull(autoScalingGroupName);
            return this;
        }

        public Builder setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = Objects.requireNonNull(lifecycleHookName);
            return this;
        }

        public GetLifecycleHookArgs build() {
            return new GetLifecycleHookArgs(autoScalingGroupName, lifecycleHookName);
        }
    }
}
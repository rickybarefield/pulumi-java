// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class AutoscalarAutoscalingPolicyLoadBalancingUtilization {
    private final Double target;

    @OutputCustomType.Constructor({"target"})
    private AutoscalarAutoscalingPolicyLoadBalancingUtilization(Double target) {
        this.target = Objects.requireNonNull(target);
    }

    public Double getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyLoadBalancingUtilization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double target;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyLoadBalancingUtilization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(Double target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public AutoscalarAutoscalingPolicyLoadBalancingUtilization build() {
            return new AutoscalarAutoscalingPolicyLoadBalancingUtilization(target);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LoadBalancerStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceStatusArgs Empty = new ServiceStatusArgs();

    @InputImport(name="conditions")
    private final @Nullable Input<List<ConditionArgs>> conditions;

    public Input<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="loadBalancer")
    private final @Nullable Input<LoadBalancerStatusArgs> loadBalancer;

    public Input<LoadBalancerStatusArgs> getLoadBalancer() {
        return this.loadBalancer == null ? Input.empty() : this.loadBalancer;
    }

    public ServiceStatusArgs(
        @Nullable Input<List<ConditionArgs>> conditions,
        @Nullable Input<LoadBalancerStatusArgs> loadBalancer) {
        this.conditions = conditions;
        this.loadBalancer = loadBalancer;
    }

    private ServiceStatusArgs() {
        this.conditions = Input.empty();
        this.loadBalancer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ConditionArgs>> conditions;
        private @Nullable Input<LoadBalancerStatusArgs> loadBalancer;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.loadBalancer = defaults.loadBalancer;
        }

        public Builder setConditions(@Nullable Input<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setLoadBalancer(@Nullable Input<LoadBalancerStatusArgs> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        public Builder setLoadBalancer(@Nullable LoadBalancerStatusArgs loadBalancer) {
            this.loadBalancer = Input.ofNullable(loadBalancer);
            return this;
        }

        public ServiceStatusArgs build() {
            return new ServiceStatusArgs(conditions, loadBalancer);
        }
    }
}
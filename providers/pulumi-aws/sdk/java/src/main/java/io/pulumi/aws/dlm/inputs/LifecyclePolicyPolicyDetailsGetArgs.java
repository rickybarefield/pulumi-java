// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsGetArgs Empty = new LifecyclePolicyPolicyDetailsGetArgs();

    /**
     * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
     * 
     */
    @InputImport(name="resourceTypes", required=true)
    private final Input<List<String>> resourceTypes;

    public Input<List<String>> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * See the `schedule` configuration block.
     * 
     */
    @InputImport(name="schedules", required=true)
    private final Input<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules;

    public Input<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> getSchedules() {
        return this.schedules;
    }

    /**
     * A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     */
    @InputImport(name="targetTags", required=true)
    private final Input<Map<String,String>> targetTags;

    public Input<Map<String,String>> getTargetTags() {
        return this.targetTags;
    }

    public LifecyclePolicyPolicyDetailsGetArgs(
        Input<List<String>> resourceTypes,
        Input<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules,
        Input<Map<String,String>> targetTags) {
        this.resourceTypes = Objects.requireNonNull(resourceTypes, "expected parameter 'resourceTypes' to be non-null");
        this.schedules = Objects.requireNonNull(schedules, "expected parameter 'schedules' to be non-null");
        this.targetTags = Objects.requireNonNull(targetTags, "expected parameter 'targetTags' to be non-null");
    }

    private LifecyclePolicyPolicyDetailsGetArgs() {
        this.resourceTypes = Input.empty();
        this.schedules = Input.empty();
        this.targetTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> resourceTypes;
        private Input<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules;
        private Input<Map<String,String>> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceTypes = defaults.resourceTypes;
    	      this.schedules = defaults.schedules;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder setResourceTypes(Input<List<String>> resourceTypes) {
            this.resourceTypes = Objects.requireNonNull(resourceTypes);
            return this;
        }

        public Builder setResourceTypes(List<String> resourceTypes) {
            this.resourceTypes = Input.of(Objects.requireNonNull(resourceTypes));
            return this;
        }

        public Builder setSchedules(Input<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules) {
            this.schedules = Objects.requireNonNull(schedules);
            return this;
        }

        public Builder setSchedules(List<LifecyclePolicyPolicyDetailsScheduleGetArgs> schedules) {
            this.schedules = Input.of(Objects.requireNonNull(schedules));
            return this;
        }

        public Builder setTargetTags(Input<Map<String,String>> targetTags) {
            this.targetTags = Objects.requireNonNull(targetTags);
            return this;
        }

        public Builder setTargetTags(Map<String,String> targetTags) {
            this.targetTags = Input.of(Objects.requireNonNull(targetTags));
            return this;
        }
        public LifecyclePolicyPolicyDetailsGetArgs build() {
            return new LifecyclePolicyPolicyDetailsGetArgs(resourceTypes, schedules, targetTags);
        }
    }
}
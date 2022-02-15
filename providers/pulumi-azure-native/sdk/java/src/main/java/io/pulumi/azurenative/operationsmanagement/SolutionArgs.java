// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement;

import io.pulumi.azurenative.operationsmanagement.inputs.SolutionPlanArgs;
import io.pulumi.azurenative.operationsmanagement.inputs.SolutionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SolutionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SolutionArgs Empty = new SolutionArgs();

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="plan")
    private final @Nullable Input<SolutionPlanArgs> plan;

    public Input<SolutionPlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="properties")
    private final @Nullable Input<SolutionPropertiesArgs> properties;

    public Input<SolutionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="solutionName")
    private final @Nullable Input<String> solutionName;

    public Input<String> getSolutionName() {
        return this.solutionName == null ? Input.empty() : this.solutionName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SolutionArgs(
        @Nullable Input<String> location,
        @Nullable Input<SolutionPlanArgs> plan,
        @Nullable Input<SolutionPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> solutionName,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.plan = plan;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = solutionName;
        this.tags = tags;
    }

    private SolutionArgs() {
        this.location = Input.empty();
        this.plan = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.solutionName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<SolutionPlanArgs> plan;
        private @Nullable Input<SolutionPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> solutionName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPlan(@Nullable Input<SolutionPlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable SolutionPlanArgs plan) {
            this.plan = Input.ofNullable(plan);
            return this;
        }

        public Builder setProperties(@Nullable Input<SolutionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable SolutionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSolutionName(@Nullable Input<String> solutionName) {
            this.solutionName = solutionName;
            return this;
        }

        public Builder setSolutionName(@Nullable String solutionName) {
            this.solutionName = Input.ofNullable(solutionName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public SolutionArgs build() {
            return new SolutionArgs(location, plan, properties, resourceGroupName, solutionName, tags);
        }
    }
}
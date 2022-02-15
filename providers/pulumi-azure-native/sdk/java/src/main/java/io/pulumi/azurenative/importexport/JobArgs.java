// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport;

import io.pulumi.azurenative.importexport.inputs.JobDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    @InputImport(name="jobName")
    private final @Nullable Input<String> jobName;

    public Input<String> getJobName() {
        return this.jobName == null ? Input.empty() : this.jobName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties")
    private final @Nullable Input<JobDetailsArgs> properties;

    public Input<JobDetailsArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Object> tags;

    public Input<Object> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public JobArgs(
        @Nullable Input<String> jobName,
        @Nullable Input<String> location,
        @Nullable Input<JobDetailsArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Object> tags) {
        this.jobName = jobName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private JobArgs() {
        this.jobName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> jobName;
        private @Nullable Input<String> location;
        private @Nullable Input<JobDetailsArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobName = defaults.jobName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setJobName(@Nullable Input<String> jobName) {
            this.jobName = jobName;
            return this;
        }

        public Builder setJobName(@Nullable String jobName) {
            this.jobName = Input.ofNullable(jobName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<JobDetailsArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable JobDetailsArgs properties) {
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

        public Builder setTags(@Nullable Input<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public JobArgs build() {
            return new JobArgs(jobName, location, properties, resourceGroupName, tags);
        }
    }
}
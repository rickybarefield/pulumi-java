// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AssignmentStatusResponse {
    private final String lastModified;
    private final List<String> managedResources;
    private final String timeCreated;

    @OutputCustomType.Constructor({"lastModified","managedResources","timeCreated"})
    private AssignmentStatusResponse(
        String lastModified,
        List<String> managedResources,
        String timeCreated) {
        this.lastModified = Objects.requireNonNull(lastModified);
        this.managedResources = Objects.requireNonNull(managedResources);
        this.timeCreated = Objects.requireNonNull(timeCreated);
    }

    public String getLastModified() {
        return this.lastModified;
    }
    public List<String> getManagedResources() {
        return this.managedResources;
    }
    public String getTimeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastModified;
        private List<String> managedResources;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastModified = defaults.lastModified;
    	      this.managedResources = defaults.managedResources;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setManagedResources(List<String> managedResources) {
            this.managedResources = Objects.requireNonNull(managedResources);
            return this;
        }

        public Builder setTimeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }

        public AssignmentStatusResponse build() {
            return new AssignmentStatusResponse(lastModified, managedResources, timeCreated);
        }
    }
}
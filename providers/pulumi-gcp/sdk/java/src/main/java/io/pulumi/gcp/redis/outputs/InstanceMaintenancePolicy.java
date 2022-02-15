// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.redis.outputs.InstanceMaintenancePolicyWeeklyMaintenanceWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceMaintenancePolicy {
    private final @Nullable String createTime;
    private final @Nullable String description;
    private final @Nullable String updateTime;
    private final @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

    @OutputCustomType.Constructor({"createTime","description","updateTime","weeklyMaintenanceWindows"})
    private InstanceMaintenancePolicy(
        @Nullable String createTime,
        @Nullable String description,
        @Nullable String updateTime,
        @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
        this.createTime = createTime;
        this.description = description;
        this.updateTime = updateTime;
        this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
    }

    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }
    public List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> getWeeklyMaintenanceWindows() {
        return this.weeklyMaintenanceWindows == null ? List.of() : this.weeklyMaintenanceWindows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createTime;
        private @Nullable String description;
        private @Nullable String updateTime;
        private @Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
    	      this.weeklyMaintenanceWindows = defaults.weeklyMaintenanceWindows;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setWeeklyMaintenanceWindows(@Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindow> weeklyMaintenanceWindows) {
            this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
            return this;
        }

        public InstanceMaintenancePolicy build() {
            return new InstanceMaintenancePolicy(createTime, description, updateTime, weeklyMaintenanceWindows);
        }
    }
}
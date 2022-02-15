// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__SchedulingResponse {
    private final String maxRunningTime;
    private final String maxWaitTime;
    private final Integer priority;

    @OutputCustomType.Constructor({"maxRunningTime","maxWaitTime","priority"})
    private GoogleCloudMlV1__SchedulingResponse(
        String maxRunningTime,
        String maxWaitTime,
        Integer priority) {
        this.maxRunningTime = Objects.requireNonNull(maxRunningTime);
        this.maxWaitTime = Objects.requireNonNull(maxWaitTime);
        this.priority = Objects.requireNonNull(priority);
    }

    public String getMaxRunningTime() {
        return this.maxRunningTime;
    }
    public String getMaxWaitTime() {
        return this.maxWaitTime;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SchedulingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxRunningTime;
        private String maxWaitTime;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SchedulingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRunningTime = defaults.maxRunningTime;
    	      this.maxWaitTime = defaults.maxWaitTime;
    	      this.priority = defaults.priority;
        }

        public Builder setMaxRunningTime(String maxRunningTime) {
            this.maxRunningTime = Objects.requireNonNull(maxRunningTime);
            return this;
        }

        public Builder setMaxWaitTime(String maxWaitTime) {
            this.maxWaitTime = Objects.requireNonNull(maxWaitTime);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public GoogleCloudMlV1__SchedulingResponse build() {
            return new GoogleCloudMlV1__SchedulingResponse(maxRunningTime, maxWaitTime, priority);
        }
    }
}
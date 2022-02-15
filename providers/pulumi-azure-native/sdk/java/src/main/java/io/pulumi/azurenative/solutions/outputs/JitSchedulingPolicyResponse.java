// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JitSchedulingPolicyResponse {
    private final String duration;
    private final String startTime;
    private final String type;

    @OutputCustomType.Constructor({"duration","startTime","type"})
    private JitSchedulingPolicyResponse(
        String duration,
        String startTime,
        String type) {
        this.duration = Objects.requireNonNull(duration);
        this.startTime = Objects.requireNonNull(startTime);
        this.type = Objects.requireNonNull(type);
    }

    public String getDuration() {
        return this.duration;
    }
    public String getStartTime() {
        return this.startTime;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitSchedulingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JitSchedulingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public JitSchedulingPolicyResponse build() {
            return new JitSchedulingPolicyResponse(duration, startTime, type);
        }
    }
}
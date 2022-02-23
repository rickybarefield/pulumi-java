// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorFilterRuleSourcePortRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorFilterRuleSourcePortRangeArgs Empty = new TrafficMirrorFilterRuleSourcePortRangeArgs();

    /**
     * Starting port of the range
     * 
     */
    @InputImport(name="fromPort")
    private final @Nullable Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort == null ? Input.empty() : this.fromPort;
    }

    /**
     * Ending port of the range
     * 
     */
    @InputImport(name="toPort")
    private final @Nullable Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort == null ? Input.empty() : this.toPort;
    }

    public TrafficMirrorFilterRuleSourcePortRangeArgs(
        @Nullable Input<Integer> fromPort,
        @Nullable Input<Integer> toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    private TrafficMirrorFilterRuleSourcePortRangeArgs() {
        this.fromPort = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterRuleSourcePortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fromPort;
        private @Nullable Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorFilterRuleSourcePortRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(@Nullable Input<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder setFromPort(@Nullable Integer fromPort) {
            this.fromPort = Input.ofNullable(fromPort);
            return this;
        }

        public Builder setToPort(@Nullable Input<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }

        public Builder setToPort(@Nullable Integer toPort) {
            this.toPort = Input.ofNullable(toPort);
            return this;
        }
        public TrafficMirrorFilterRuleSourcePortRangeArgs build() {
            return new TrafficMirrorFilterRuleSourcePortRangeArgs(fromPort, toPort);
        }
    }
}
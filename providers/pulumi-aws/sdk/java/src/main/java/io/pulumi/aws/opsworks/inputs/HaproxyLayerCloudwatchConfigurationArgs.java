// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.HaproxyLayerCloudwatchConfigurationLogStreamArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaproxyLayerCloudwatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final HaproxyLayerCloudwatchConfigurationArgs Empty = new HaproxyLayerCloudwatchConfigurationArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logStreams")
    private final @Nullable Input<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

    public Input<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public HaproxyLayerCloudwatchConfigurationArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private HaproxyLayerCloudwatchConfigurationArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaproxyLayerCloudwatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(HaproxyLayerCloudwatchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogStreams(@Nullable Input<List<HaproxyLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder setLogStreams(@Nullable List<HaproxyLayerCloudwatchConfigurationLogStreamArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public HaproxyLayerCloudwatchConfigurationArgs build() {
            return new HaproxyLayerCloudwatchConfigurationArgs(enabled, logStreams);
        }
    }
}
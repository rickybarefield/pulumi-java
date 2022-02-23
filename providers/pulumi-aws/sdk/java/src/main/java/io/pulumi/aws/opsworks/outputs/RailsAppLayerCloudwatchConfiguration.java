// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.aws.opsworks.outputs.RailsAppLayerCloudwatchConfigurationLogStream;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RailsAppLayerCloudwatchConfiguration {
    private final @Nullable Boolean enabled;
    private final @Nullable List<RailsAppLayerCloudwatchConfigurationLogStream> logStreams;

    @OutputCustomType.Constructor({"enabled","logStreams"})
    private RailsAppLayerCloudwatchConfiguration(
        @Nullable Boolean enabled,
        @Nullable List<RailsAppLayerCloudwatchConfigurationLogStream> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<RailsAppLayerCloudwatchConfigurationLogStream> getLogStreams() {
        return this.logStreams == null ? List.of() : this.logStreams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RailsAppLayerCloudwatchConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<RailsAppLayerCloudwatchConfigurationLogStream> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(RailsAppLayerCloudwatchConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setLogStreams(@Nullable List<RailsAppLayerCloudwatchConfigurationLogStream> logStreams) {
            this.logStreams = logStreams;
            return this;
        }
        public RailsAppLayerCloudwatchConfiguration build() {
            return new RailsAppLayerCloudwatchConfiguration(enabled, logStreams);
        }
    }
}
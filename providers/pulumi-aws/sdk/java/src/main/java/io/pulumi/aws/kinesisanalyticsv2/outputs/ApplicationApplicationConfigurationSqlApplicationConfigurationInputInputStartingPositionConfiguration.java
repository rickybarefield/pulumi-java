// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    private final @Nullable String inputStartingPosition;

    @OutputCustomType.Constructor({"inputStartingPosition"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration(@Nullable String inputStartingPosition) {
        this.inputStartingPosition = inputStartingPosition;
    }

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    public Optional<String> getInputStartingPosition() {
        return Optional.ofNullable(this.inputStartingPosition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String inputStartingPosition;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputStartingPosition = defaults.inputStartingPosition;
        }

        public Builder setInputStartingPosition(@Nullable String inputStartingPosition) {
            this.inputStartingPosition = inputStartingPosition;
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration(inputStartingPosition);
        }
    }
}
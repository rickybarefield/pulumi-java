// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.StreamingPolicyFairPlayConfigurationResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyPlayReadyConfigurationResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyWidevineConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CbcsDrmConfigurationResponse {
    private final @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;
    private final @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
    private final @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

    @OutputCustomType.Constructor({"fairPlay","playReady","widevine"})
    private CbcsDrmConfigurationResponse(
        @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay,
        @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady,
        @Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
        this.fairPlay = fairPlay;
        this.playReady = playReady;
        this.widevine = widevine;
    }

    public Optional<StreamingPolicyFairPlayConfigurationResponse> getFairPlay() {
        return Optional.ofNullable(this.fairPlay);
    }
    public Optional<StreamingPolicyPlayReadyConfigurationResponse> getPlayReady() {
        return Optional.ofNullable(this.playReady);
    }
    public Optional<StreamingPolicyWidevineConfigurationResponse> getWidevine() {
        return Optional.ofNullable(this.widevine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CbcsDrmConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;
        private @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
        private @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CbcsDrmConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairPlay = defaults.fairPlay;
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder setFairPlay(@Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay) {
            this.fairPlay = fairPlay;
            return this;
        }

        public Builder setPlayReady(@Nullable StreamingPolicyPlayReadyConfigurationResponse playReady) {
            this.playReady = playReady;
            return this;
        }

        public Builder setWidevine(@Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
            this.widevine = widevine;
            return this;
        }

        public CbcsDrmConfigurationResponse build() {
            return new CbcsDrmConfigurationResponse(fairPlay, playReady, widevine);
        }
    }
}
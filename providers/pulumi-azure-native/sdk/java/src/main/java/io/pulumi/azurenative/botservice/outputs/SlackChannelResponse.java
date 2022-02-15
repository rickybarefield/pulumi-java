// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.SlackChannelPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SlackChannelResponse {
    private final String channelName;
    private final @Nullable String etag;
    private final @Nullable String location;
    private final @Nullable SlackChannelPropertiesResponse properties;
    private final String provisioningState;

    @OutputCustomType.Constructor({"channelName","etag","location","properties","provisioningState"})
    private SlackChannelResponse(
        String channelName,
        @Nullable String etag,
        @Nullable String location,
        @Nullable SlackChannelPropertiesResponse properties,
        String provisioningState) {
        this.channelName = Objects.requireNonNull(channelName);
        this.etag = etag;
        this.location = location;
        this.properties = properties;
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    public String getChannelName() {
        return this.channelName;
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<SlackChannelPropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlackChannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private @Nullable String etag;
        private @Nullable String location;
        private @Nullable SlackChannelPropertiesResponse properties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(SlackChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setProperties(@Nullable SlackChannelPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public SlackChannelResponse build() {
            return new SlackChannelResponse(channelName, etag, location, properties, provisioningState);
        }
    }
}
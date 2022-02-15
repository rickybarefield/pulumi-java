// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.securitycenter.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.securitycenter.inputs.NotificationConfigStreamingConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationConfigState extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigState Empty = new NotificationConfigState();

    @InputImport(name="configId")
    private final @Nullable Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId == null ? Input.empty() : this.configId;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organization")
    private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    @InputImport(name="pubsubTopic")
    private final @Nullable Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic == null ? Input.empty() : this.pubsubTopic;
    }

    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    @InputImport(name="streamingConfig")
    private final @Nullable Input<NotificationConfigStreamingConfigGetArgs> streamingConfig;

    public Input<NotificationConfigStreamingConfigGetArgs> getStreamingConfig() {
        return this.streamingConfig == null ? Input.empty() : this.streamingConfig;
    }

    public NotificationConfigState(
        @Nullable Input<String> configId,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> organization,
        @Nullable Input<String> pubsubTopic,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<NotificationConfigStreamingConfigGetArgs> streamingConfig) {
        this.configId = configId;
        this.description = description;
        this.name = name;
        this.organization = organization;
        this.pubsubTopic = pubsubTopic;
        this.serviceAccount = serviceAccount;
        this.streamingConfig = streamingConfig;
    }

    private NotificationConfigState() {
        this.configId = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.organization = Input.empty();
        this.pubsubTopic = Input.empty();
        this.serviceAccount = Input.empty();
        this.streamingConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> organization;
        private @Nullable Input<String> pubsubTopic;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<NotificationConfigStreamingConfigGetArgs> streamingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.organization = defaults.organization;
    	      this.pubsubTopic = defaults.pubsubTopic;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.streamingConfig = defaults.streamingConfig;
        }

        public Builder setConfigId(@Nullable Input<String> configId) {
            this.configId = configId;
            return this;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = Input.ofNullable(configId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOrganization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder setOrganization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder setPubsubTopic(@Nullable Input<String> pubsubTopic) {
            this.pubsubTopic = pubsubTopic;
            return this;
        }

        public Builder setPubsubTopic(@Nullable String pubsubTopic) {
            this.pubsubTopic = Input.ofNullable(pubsubTopic);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setStreamingConfig(@Nullable Input<NotificationConfigStreamingConfigGetArgs> streamingConfig) {
            this.streamingConfig = streamingConfig;
            return this;
        }

        public Builder setStreamingConfig(@Nullable NotificationConfigStreamingConfigGetArgs streamingConfig) {
            this.streamingConfig = Input.ofNullable(streamingConfig);
            return this;
        }

        public NotificationConfigState build() {
            return new NotificationConfigState(configId, description, name, organization, pubsubTopic, serviceAccount, streamingConfig);
        }
    }
}
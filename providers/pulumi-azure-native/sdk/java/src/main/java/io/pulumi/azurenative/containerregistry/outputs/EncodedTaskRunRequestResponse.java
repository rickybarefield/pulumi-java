// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.AgentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.CredentialsResponse;
import io.pulumi.azurenative.containerregistry.outputs.PlatformPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SetValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncodedTaskRunRequestResponse {
    private final @Nullable AgentPropertiesResponse agentConfiguration;
    private final @Nullable String agentPoolName;
    private final @Nullable CredentialsResponse credentials;
    private final String encodedTaskContent;
    private final @Nullable String encodedValuesContent;
    private final @Nullable Boolean isArchiveEnabled;
    private final @Nullable String logTemplate;
    private final PlatformPropertiesResponse platform;
    private final @Nullable String sourceLocation;
    private final @Nullable Integer timeout;
    private final String type;
    private final @Nullable List<SetValueResponse> values;

    @OutputCustomType.Constructor({"agentConfiguration","agentPoolName","credentials","encodedTaskContent","encodedValuesContent","isArchiveEnabled","logTemplate","platform","sourceLocation","timeout","type","values"})
    private EncodedTaskRunRequestResponse(
        @Nullable AgentPropertiesResponse agentConfiguration,
        @Nullable String agentPoolName,
        @Nullable CredentialsResponse credentials,
        String encodedTaskContent,
        @Nullable String encodedValuesContent,
        @Nullable Boolean isArchiveEnabled,
        @Nullable String logTemplate,
        PlatformPropertiesResponse platform,
        @Nullable String sourceLocation,
        @Nullable Integer timeout,
        String type,
        @Nullable List<SetValueResponse> values) {
        this.agentConfiguration = agentConfiguration;
        this.agentPoolName = agentPoolName;
        this.credentials = credentials;
        this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
        this.encodedValuesContent = encodedValuesContent;
        this.isArchiveEnabled = isArchiveEnabled;
        this.logTemplate = logTemplate;
        this.platform = Objects.requireNonNull(platform);
        this.sourceLocation = sourceLocation;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type);
        this.values = values;
    }

    public Optional<AgentPropertiesResponse> getAgentConfiguration() {
        return Optional.ofNullable(this.agentConfiguration);
    }
    public Optional<String> getAgentPoolName() {
        return Optional.ofNullable(this.agentPoolName);
    }
    public Optional<CredentialsResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    public String getEncodedTaskContent() {
        return this.encodedTaskContent;
    }
    public Optional<String> getEncodedValuesContent() {
        return Optional.ofNullable(this.encodedValuesContent);
    }
    public Optional<Boolean> getIsArchiveEnabled() {
        return Optional.ofNullable(this.isArchiveEnabled);
    }
    public Optional<String> getLogTemplate() {
        return Optional.ofNullable(this.logTemplate);
    }
    public PlatformPropertiesResponse getPlatform() {
        return this.platform;
    }
    public Optional<String> getSourceLocation() {
        return Optional.ofNullable(this.sourceLocation);
    }
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    public String getType() {
        return this.type;
    }
    public List<SetValueResponse> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncodedTaskRunRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPropertiesResponse agentConfiguration;
        private @Nullable String agentPoolName;
        private @Nullable CredentialsResponse credentials;
        private String encodedTaskContent;
        private @Nullable String encodedValuesContent;
        private @Nullable Boolean isArchiveEnabled;
        private @Nullable String logTemplate;
        private PlatformPropertiesResponse platform;
        private @Nullable String sourceLocation;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable List<SetValueResponse> values;

        public Builder() {
    	      // Empty
        }

        public Builder(EncodedTaskRunRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentConfiguration = defaults.agentConfiguration;
    	      this.agentPoolName = defaults.agentPoolName;
    	      this.credentials = defaults.credentials;
    	      this.encodedTaskContent = defaults.encodedTaskContent;
    	      this.encodedValuesContent = defaults.encodedValuesContent;
    	      this.isArchiveEnabled = defaults.isArchiveEnabled;
    	      this.logTemplate = defaults.logTemplate;
    	      this.platform = defaults.platform;
    	      this.sourceLocation = defaults.sourceLocation;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder setAgentConfiguration(@Nullable AgentPropertiesResponse agentConfiguration) {
            this.agentConfiguration = agentConfiguration;
            return this;
        }

        public Builder setAgentPoolName(@Nullable String agentPoolName) {
            this.agentPoolName = agentPoolName;
            return this;
        }

        public Builder setCredentials(@Nullable CredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setEncodedTaskContent(String encodedTaskContent) {
            this.encodedTaskContent = Objects.requireNonNull(encodedTaskContent);
            return this;
        }

        public Builder setEncodedValuesContent(@Nullable String encodedValuesContent) {
            this.encodedValuesContent = encodedValuesContent;
            return this;
        }

        public Builder setIsArchiveEnabled(@Nullable Boolean isArchiveEnabled) {
            this.isArchiveEnabled = isArchiveEnabled;
            return this;
        }

        public Builder setLogTemplate(@Nullable String logTemplate) {
            this.logTemplate = logTemplate;
            return this;
        }

        public Builder setPlatform(PlatformPropertiesResponse platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setSourceLocation(@Nullable String sourceLocation) {
            this.sourceLocation = sourceLocation;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValues(@Nullable List<SetValueResponse> values) {
            this.values = values;
            return this;
        }

        public EncodedTaskRunRequestResponse build() {
            return new EncodedTaskRunRequestResponse(agentConfiguration, agentPoolName, credentials, encodedTaskContent, encodedValuesContent, isArchiveEnabled, logTemplate, platform, sourceLocation, timeout, type, values);
        }
    }
}
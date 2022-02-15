// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ParameterDefinitionsValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPolicyDefinitionResult {
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final String id;
    private final @Nullable Object metadata;
    private final @Nullable String mode;
    private final String name;
    private final @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
    private final @Nullable Object policyRule;
    private final @Nullable String policyType;
    private final String type;

    @OutputCustomType.Constructor({"description","displayName","id","metadata","mode","name","parameters","policyRule","policyType","type"})
    private GetPolicyDefinitionResult(
        @Nullable String description,
        @Nullable String displayName,
        String id,
        @Nullable Object metadata,
        @Nullable String mode,
        String name,
        @Nullable Map<String,ParameterDefinitionsValueResponse> parameters,
        @Nullable Object policyRule,
        @Nullable String policyType,
        String type) {
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.metadata = metadata;
        this.mode = mode;
        this.name = Objects.requireNonNull(name);
        this.parameters = parameters;
        this.policyRule = policyRule;
        this.policyType = policyType;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Object> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public String getName() {
        return this.name;
    }
    public Map<String,ParameterDefinitionsValueResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Object> getPolicyRule() {
        return Optional.ofNullable(this.policyRule);
    }
    public Optional<String> getPolicyType() {
        return Optional.ofNullable(this.policyType);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private @Nullable Object metadata;
        private @Nullable String mode;
        private String name;
        private @Nullable Map<String,ParameterDefinitionsValueResponse> parameters;
        private @Nullable Object policyRule;
        private @Nullable String policyType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.metadata = defaults.metadata;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.policyRule = defaults.policyRule;
    	      this.policyType = defaults.policyType;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMetadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterDefinitionsValueResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPolicyRule(@Nullable Object policyRule) {
            this.policyRule = policyRule;
            return this;
        }

        public Builder setPolicyType(@Nullable String policyType) {
            this.policyType = policyType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPolicyDefinitionResult build() {
            return new GetPolicyDefinitionResult(description, displayName, id, metadata, mode, name, parameters, policyRule, policyType, type);
        }
    }
}
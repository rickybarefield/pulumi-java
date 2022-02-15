// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.ParameterValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTemplateArtifactResult {
    private final @Nullable List<String> dependsOn;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final String id;
    private final String kind;
    private final String name;
    private final Map<String,ParameterValueResponse> parameters;
    private final @Nullable String resourceGroup;
    private final Object template;
    private final String type;

    @OutputCustomType.Constructor({"dependsOn","description","displayName","id","kind","name","parameters","resourceGroup","template","type"})
    private GetTemplateArtifactResult(
        @Nullable List<String> dependsOn,
        @Nullable String description,
        @Nullable String displayName,
        String id,
        String kind,
        String name,
        Map<String,ParameterValueResponse> parameters,
        @Nullable String resourceGroup,
        Object template,
        String type) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
        this.resourceGroup = resourceGroup;
        this.template = Objects.requireNonNull(template);
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
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
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Map<String,ParameterValueResponse> getParameters() {
        return this.parameters;
    }
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    public Object getTemplate() {
        return this.template;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateArtifactResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOn;
        private @Nullable String description;
        private @Nullable String displayName;
        private String id;
        private String kind;
        private String name;
        private Map<String,ParameterValueResponse> parameters;
        private @Nullable String resourceGroup;
        private Object template;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTemplateArtifactResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.template = defaults.template;
    	      this.type = defaults.type;
        }

        public Builder setDependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
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

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(Map<String,ParameterValueResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setTemplate(Object template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTemplateArtifactResult build() {
            return new GetTemplateArtifactResult(dependsOn, description, displayName, id, kind, name, parameters, resourceGroup, template, type);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.azurenative.operationsmanagement.inputs.ArmTemplateParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementConfigurationPropertiesArgs Empty = new ManagementConfigurationPropertiesArgs();

    @InputImport(name="applicationId")
    private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    @InputImport(name="parameters", required=true)
    private final Input<List<ArmTemplateParameterArgs>> parameters;

    public Input<List<ArmTemplateParameterArgs>> getParameters() {
        return this.parameters;
    }

    @InputImport(name="parentResourceType", required=true)
    private final Input<String> parentResourceType;

    public Input<String> getParentResourceType() {
        return this.parentResourceType;
    }

    @InputImport(name="template", required=true)
    private final Input<Object> template;

    public Input<Object> getTemplate() {
        return this.template;
    }

    public ManagementConfigurationPropertiesArgs(
        @Nullable Input<String> applicationId,
        Input<List<ArmTemplateParameterArgs>> parameters,
        Input<String> parentResourceType,
        Input<Object> template) {
        this.applicationId = applicationId;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private ManagementConfigurationPropertiesArgs() {
        this.applicationId = Input.empty();
        this.parameters = Input.empty();
        this.parentResourceType = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationId;
        private Input<List<ArmTemplateParameterArgs>> parameters;
        private Input<String> parentResourceType;
        private Input<Object> template;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.parameters = defaults.parameters;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.template = defaults.template;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setParameters(Input<List<ArmTemplateParameterArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(List<ArmTemplateParameterArgs> parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setParentResourceType(Input<String> parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Input.of(Objects.requireNonNull(parentResourceType));
            return this;
        }

        public Builder setTemplate(Input<Object> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder setTemplate(Object template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public ManagementConfigurationPropertiesArgs build() {
            return new ManagementConfigurationPropertiesArgs(applicationId, parameters, parentResourceType, template);
        }
    }
}
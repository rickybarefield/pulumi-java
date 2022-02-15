// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.FieldDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionTypeArgs Empty = new ConnectionTypeArgs();

    @InputImport(name="automationAccountName", required=true)
    private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    @InputImport(name="connectionTypeName")
    private final @Nullable Input<String> connectionTypeName;

    public Input<String> getConnectionTypeName() {
        return this.connectionTypeName == null ? Input.empty() : this.connectionTypeName;
    }

    @InputImport(name="fieldDefinitions", required=true)
    private final Input<Map<String,FieldDefinitionArgs>> fieldDefinitions;

    public Input<Map<String,FieldDefinitionArgs>> getFieldDefinitions() {
        return this.fieldDefinitions;
    }

    @InputImport(name="isGlobal")
    private final @Nullable Input<Boolean> isGlobal;

    public Input<Boolean> getIsGlobal() {
        return this.isGlobal == null ? Input.empty() : this.isGlobal;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ConnectionTypeArgs(
        Input<String> automationAccountName,
        @Nullable Input<String> connectionTypeName,
        Input<Map<String,FieldDefinitionArgs>> fieldDefinitions,
        @Nullable Input<Boolean> isGlobal,
        Input<String> name,
        Input<String> resourceGroupName) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.connectionTypeName = connectionTypeName;
        this.fieldDefinitions = Objects.requireNonNull(fieldDefinitions, "expected parameter 'fieldDefinitions' to be non-null");
        this.isGlobal = isGlobal;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ConnectionTypeArgs() {
        this.automationAccountName = Input.empty();
        this.connectionTypeName = Input.empty();
        this.fieldDefinitions = Input.empty();
        this.isGlobal = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private @Nullable Input<String> connectionTypeName;
        private Input<Map<String,FieldDefinitionArgs>> fieldDefinitions;
        private @Nullable Input<Boolean> isGlobal;
        private Input<String> name;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.connectionTypeName = defaults.connectionTypeName;
    	      this.fieldDefinitions = defaults.fieldDefinitions;
    	      this.isGlobal = defaults.isGlobal;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setConnectionTypeName(@Nullable Input<String> connectionTypeName) {
            this.connectionTypeName = connectionTypeName;
            return this;
        }

        public Builder setConnectionTypeName(@Nullable String connectionTypeName) {
            this.connectionTypeName = Input.ofNullable(connectionTypeName);
            return this;
        }

        public Builder setFieldDefinitions(Input<Map<String,FieldDefinitionArgs>> fieldDefinitions) {
            this.fieldDefinitions = Objects.requireNonNull(fieldDefinitions);
            return this;
        }

        public Builder setFieldDefinitions(Map<String,FieldDefinitionArgs> fieldDefinitions) {
            this.fieldDefinitions = Input.of(Objects.requireNonNull(fieldDefinitions));
            return this;
        }

        public Builder setIsGlobal(@Nullable Input<Boolean> isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }

        public Builder setIsGlobal(@Nullable Boolean isGlobal) {
            this.isGlobal = Input.ofNullable(isGlobal);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public ConnectionTypeArgs build() {
            return new ConnectionTypeArgs(automationAccountName, connectionTypeName, fieldDefinitions, isGlobal, name, resourceGroupName);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIntegrationAccountSchemaArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationAccountSchemaArgs Empty = new GetIntegrationAccountSchemaArgs();

    @InputImport(name="integrationAccountName", required=true)
    private final String integrationAccountName;

    public String getIntegrationAccountName() {
        return this.integrationAccountName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="schemaName", required=true)
    private final String schemaName;

    public String getSchemaName() {
        return this.schemaName;
    }

    public GetIntegrationAccountSchemaArgs(
        String integrationAccountName,
        String resourceGroupName,
        String schemaName) {
        this.integrationAccountName = Objects.requireNonNull(integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaName = Objects.requireNonNull(schemaName, "expected parameter 'schemaName' to be non-null");
    }

    private GetIntegrationAccountSchemaArgs() {
        this.integrationAccountName = null;
        this.resourceGroupName = null;
        this.schemaName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationAccountSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationAccountName;
        private String resourceGroupName;
        private String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationAccountName = defaults.integrationAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder setIntegrationAccountName(String integrationAccountName) {
            this.integrationAccountName = Objects.requireNonNull(integrationAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSchemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }

        public GetIntegrationAccountSchemaArgs build() {
            return new GetIntegrationAccountSchemaArgs(integrationAccountName, resourceGroupName, schemaName);
        }
    }
}
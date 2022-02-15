// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentAtTenantScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeploymentAtTenantScopeArgs Empty = new GetDeploymentAtTenantScopeArgs();

    @InputImport(name="deploymentName", required=true)
    private final String deploymentName;

    public String getDeploymentName() {
        return this.deploymentName;
    }

    public GetDeploymentAtTenantScopeArgs(String deploymentName) {
        this.deploymentName = Objects.requireNonNull(deploymentName, "expected parameter 'deploymentName' to be non-null");
    }

    private GetDeploymentAtTenantScopeArgs() {
        this.deploymentName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentAtTenantScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentAtTenantScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
        }

        public Builder setDeploymentName(String deploymentName) {
            this.deploymentName = Objects.requireNonNull(deploymentName);
            return this;
        }

        public GetDeploymentAtTenantScopeArgs build() {
            return new GetDeploymentAtTenantScopeArgs(deploymentName);
        }
    }
}
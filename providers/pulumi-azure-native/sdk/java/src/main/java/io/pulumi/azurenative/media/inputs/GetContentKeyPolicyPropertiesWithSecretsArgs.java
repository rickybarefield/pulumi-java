// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContentKeyPolicyPropertiesWithSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContentKeyPolicyPropertiesWithSecretsArgs Empty = new GetContentKeyPolicyPropertiesWithSecretsArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="contentKeyPolicyName", required=true)
    private final String contentKeyPolicyName;

    public String getContentKeyPolicyName() {
        return this.contentKeyPolicyName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetContentKeyPolicyPropertiesWithSecretsArgs(
        String accountName,
        String contentKeyPolicyName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.contentKeyPolicyName = Objects.requireNonNull(contentKeyPolicyName, "expected parameter 'contentKeyPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetContentKeyPolicyPropertiesWithSecretsArgs() {
        this.accountName = null;
        this.contentKeyPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentKeyPolicyPropertiesWithSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String contentKeyPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentKeyPolicyPropertiesWithSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.contentKeyPolicyName = defaults.contentKeyPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setContentKeyPolicyName(String contentKeyPolicyName) {
            this.contentKeyPolicyName = Objects.requireNonNull(contentKeyPolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetContentKeyPolicyPropertiesWithSecretsArgs build() {
            return new GetContentKeyPolicyPropertiesWithSecretsArgs(accountName, contentKeyPolicyName, resourceGroupName);
        }
    }
}
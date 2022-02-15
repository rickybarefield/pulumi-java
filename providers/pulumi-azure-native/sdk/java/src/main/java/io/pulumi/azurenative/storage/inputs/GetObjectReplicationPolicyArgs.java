// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetObjectReplicationPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetObjectReplicationPolicyArgs Empty = new GetObjectReplicationPolicyArgs();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="objectReplicationPolicyId", required=true)
    private final String objectReplicationPolicyId;

    public String getObjectReplicationPolicyId() {
        return this.objectReplicationPolicyId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetObjectReplicationPolicyArgs(
        String accountName,
        String objectReplicationPolicyId,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.objectReplicationPolicyId = Objects.requireNonNull(objectReplicationPolicyId, "expected parameter 'objectReplicationPolicyId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetObjectReplicationPolicyArgs() {
        this.accountName = null;
        this.objectReplicationPolicyId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String objectReplicationPolicyId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectReplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.objectReplicationPolicyId = defaults.objectReplicationPolicyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setObjectReplicationPolicyId(String objectReplicationPolicyId) {
            this.objectReplicationPolicyId = Objects.requireNonNull(objectReplicationPolicyId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetObjectReplicationPolicyArgs build() {
            return new GetObjectReplicationPolicyArgs(accountName, objectReplicationPolicyId, resourceGroupName);
        }
    }
}
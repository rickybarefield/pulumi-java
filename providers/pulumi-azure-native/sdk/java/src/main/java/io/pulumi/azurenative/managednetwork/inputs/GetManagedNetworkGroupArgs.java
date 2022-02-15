// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagedNetworkGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagedNetworkGroupArgs Empty = new GetManagedNetworkGroupArgs();

    @InputImport(name="managedNetworkGroupName", required=true)
    private final String managedNetworkGroupName;

    public String getManagedNetworkGroupName() {
        return this.managedNetworkGroupName;
    }

    @InputImport(name="managedNetworkName", required=true)
    private final String managedNetworkName;

    public String getManagedNetworkName() {
        return this.managedNetworkName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagedNetworkGroupArgs(
        String managedNetworkGroupName,
        String managedNetworkName,
        String resourceGroupName) {
        this.managedNetworkGroupName = Objects.requireNonNull(managedNetworkGroupName, "expected parameter 'managedNetworkGroupName' to be non-null");
        this.managedNetworkName = Objects.requireNonNull(managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagedNetworkGroupArgs() {
        this.managedNetworkGroupName = null;
        this.managedNetworkName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedNetworkGroupName;
        private String managedNetworkName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedNetworkGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedNetworkGroupName = defaults.managedNetworkGroupName;
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setManagedNetworkGroupName(String managedNetworkGroupName) {
            this.managedNetworkGroupName = Objects.requireNonNull(managedNetworkGroupName);
            return this;
        }

        public Builder setManagedNetworkName(String managedNetworkName) {
            this.managedNetworkName = Objects.requireNonNull(managedNetworkName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetManagedNetworkGroupArgs build() {
            return new GetManagedNetworkGroupArgs(managedNetworkGroupName, managedNetworkName, resourceGroupName);
        }
    }
}
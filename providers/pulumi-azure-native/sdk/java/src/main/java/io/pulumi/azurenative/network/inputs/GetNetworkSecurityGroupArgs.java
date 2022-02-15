// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkSecurityGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkSecurityGroupArgs Empty = new GetNetworkSecurityGroupArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="networkSecurityGroupName", required=true)
    private final String networkSecurityGroupName;

    public String getNetworkSecurityGroupName() {
        return this.networkSecurityGroupName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNetworkSecurityGroupArgs(
        @Nullable String expand,
        String networkSecurityGroupName,
        String resourceGroupName) {
        this.expand = expand;
        this.networkSecurityGroupName = Objects.requireNonNull(networkSecurityGroupName, "expected parameter 'networkSecurityGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkSecurityGroupArgs() {
        this.expand = null;
        this.networkSecurityGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String networkSecurityGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.networkSecurityGroupName = defaults.networkSecurityGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setNetworkSecurityGroupName(String networkSecurityGroupName) {
            this.networkSecurityGroupName = Objects.requireNonNull(networkSecurityGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNetworkSecurityGroupArgs build() {
            return new GetNetworkSecurityGroupArgs(expand, networkSecurityGroupName, resourceGroupName);
        }
    }
}
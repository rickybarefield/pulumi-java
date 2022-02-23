// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetNetworkAclsFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkAclsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkAclsArgs Empty = new GetNetworkAclsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetNetworkAclsFilter> filters;

    public List<GetNetworkAclsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired network ACLs.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The VPC ID that you want to filter from.
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable String vpcId;

    public Optional<String> getVpcId() {
        return this.vpcId == null ? Optional.empty() : Optional.ofNullable(this.vpcId);
    }

    public GetNetworkAclsArgs(
        @Nullable List<GetNetworkAclsFilter> filters,
        @Nullable Map<String,String> tags,
        @Nullable String vpcId) {
        this.filters = filters;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private GetNetworkAclsArgs() {
        this.filters = List.of();
        this.tags = Map.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetNetworkAclsFilter> filters;
        private @Nullable Map<String,String> tags;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkAclsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setFilters(@Nullable List<GetNetworkAclsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public GetNetworkAclsArgs build() {
            return new GetNetworkAclsArgs(filters, tags, vpcId);
        }
    }
}
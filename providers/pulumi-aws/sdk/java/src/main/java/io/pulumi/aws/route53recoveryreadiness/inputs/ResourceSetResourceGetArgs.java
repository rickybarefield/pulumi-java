// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.inputs;

import io.pulumi.aws.route53recoveryreadiness.inputs.ResourceSetResourceDnsTargetResourceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceSetResourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetResourceGetArgs Empty = new ResourceSetResourceGetArgs();

    @InputImport(name="componentId")
    private final @Nullable Input<String> componentId;

    public Input<String> getComponentId() {
        return this.componentId == null ? Input.empty() : this.componentId;
    }

    /**
     * Component for DNS/Routing Control Readiness Checks.
     * 
     */
    @InputImport(name="dnsTargetResource")
    private final @Nullable Input<ResourceSetResourceDnsTargetResourceGetArgs> dnsTargetResource;

    public Input<ResourceSetResourceDnsTargetResourceGetArgs> getDnsTargetResource() {
        return this.dnsTargetResource == null ? Input.empty() : this.dnsTargetResource;
    }

    /**
     * Recovery group ARN or cell ARN that contains this resource set.
     * 
     */
    @InputImport(name="readinessScopes")
    private final @Nullable Input<List<String>> readinessScopes;

    public Input<List<String>> getReadinessScopes() {
        return this.readinessScopes == null ? Input.empty() : this.readinessScopes;
    }

    /**
     * ARN of the resource.
     * 
     */
    @InputImport(name="resourceArn")
    private final @Nullable Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn == null ? Input.empty() : this.resourceArn;
    }

    public ResourceSetResourceGetArgs(
        @Nullable Input<String> componentId,
        @Nullable Input<ResourceSetResourceDnsTargetResourceGetArgs> dnsTargetResource,
        @Nullable Input<List<String>> readinessScopes,
        @Nullable Input<String> resourceArn) {
        this.componentId = componentId;
        this.dnsTargetResource = dnsTargetResource;
        this.readinessScopes = readinessScopes;
        this.resourceArn = resourceArn;
    }

    private ResourceSetResourceGetArgs() {
        this.componentId = Input.empty();
        this.dnsTargetResource = Input.empty();
        this.readinessScopes = Input.empty();
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetResourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> componentId;
        private @Nullable Input<ResourceSetResourceDnsTargetResourceGetArgs> dnsTargetResource;
        private @Nullable Input<List<String>> readinessScopes;
        private @Nullable Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetResourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.dnsTargetResource = defaults.dnsTargetResource;
    	      this.readinessScopes = defaults.readinessScopes;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setComponentId(@Nullable Input<String> componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder setComponentId(@Nullable String componentId) {
            this.componentId = Input.ofNullable(componentId);
            return this;
        }

        public Builder setDnsTargetResource(@Nullable Input<ResourceSetResourceDnsTargetResourceGetArgs> dnsTargetResource) {
            this.dnsTargetResource = dnsTargetResource;
            return this;
        }

        public Builder setDnsTargetResource(@Nullable ResourceSetResourceDnsTargetResourceGetArgs dnsTargetResource) {
            this.dnsTargetResource = Input.ofNullable(dnsTargetResource);
            return this;
        }

        public Builder setReadinessScopes(@Nullable Input<List<String>> readinessScopes) {
            this.readinessScopes = readinessScopes;
            return this;
        }

        public Builder setReadinessScopes(@Nullable List<String> readinessScopes) {
            this.readinessScopes = Input.ofNullable(readinessScopes);
            return this;
        }

        public Builder setResourceArn(@Nullable Input<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder setResourceArn(@Nullable String resourceArn) {
            this.resourceArn = Input.ofNullable(resourceArn);
            return this;
        }
        public ResourceSetResourceGetArgs build() {
            return new ResourceSetResourceGetArgs(componentId, dnsTargetResource, readinessScopes, resourceArn);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs Empty = new GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs();

    /**
     * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualServiceName", required=true)
    private final Input<String> virtualServiceName;

    public Input<String> getVirtualServiceName() {
        return this.virtualServiceName;
    }

    public GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs(Input<String> virtualServiceName) {
        this.virtualServiceName = Objects.requireNonNull(virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs() {
        this.virtualServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> virtualServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        public Builder setVirtualServiceName(Input<String> virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }

        public Builder setVirtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Input.of(Objects.requireNonNull(virtualServiceName));
            return this;
        }
        public GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs build() {
            return new GatewayRouteSpecHttpRouteActionTargetVirtualServiceGetArgs(virtualServiceName);
        }
    }
}
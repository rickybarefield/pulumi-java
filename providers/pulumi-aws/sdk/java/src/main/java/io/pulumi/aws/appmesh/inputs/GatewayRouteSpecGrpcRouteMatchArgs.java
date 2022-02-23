// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteMatchArgs Empty = new GatewayRouteSpecGrpcRouteMatchArgs();

    /**
     * The fully qualified domain name for the service to match from the request.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayRouteSpecGrpcRouteMatchArgs(Input<String> serviceName) {
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteMatchArgs() {
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayRouteSpecGrpcRouteMatchArgs build() {
            return new GatewayRouteSpecGrpcRouteMatchArgs(serviceName);
        }
    }
}
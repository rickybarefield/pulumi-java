// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetVirtualServiceSpecProviderVirtualNode {
    /**
     * The name of the virtual node that is acting as a service provider.
     * 
     */
    private final String virtualNodeName;

    @OutputCustomType.Constructor({"virtualNodeName"})
    private GetVirtualServiceSpecProviderVirtualNode(String virtualNodeName) {
        this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
    }

    /**
     * The name of the virtual node that is acting as a service provider.
     * 
     */
    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualServiceSpecProviderVirtualNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder setVirtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }
        public GetVirtualServiceSpecProviderVirtualNode build() {
            return new GetVirtualServiceSpecProviderVirtualNode(virtualNodeName);
        }
    }
}
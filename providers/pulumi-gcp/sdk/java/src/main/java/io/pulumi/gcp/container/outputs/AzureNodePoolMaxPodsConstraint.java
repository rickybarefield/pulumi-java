// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class AzureNodePoolMaxPodsConstraint {
    private final Integer maxPodsPerNode;

    @OutputCustomType.Constructor({"maxPodsPerNode"})
    private AzureNodePoolMaxPodsConstraint(Integer maxPodsPerNode) {
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
    }

    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolMaxPodsConstraint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolMaxPodsConstraint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public AzureNodePoolMaxPodsConstraint build() {
            return new AzureNodePoolMaxPodsConstraint(maxPodsPerNode);
        }
    }
}
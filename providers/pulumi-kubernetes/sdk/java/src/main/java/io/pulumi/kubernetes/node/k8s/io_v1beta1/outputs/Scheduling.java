// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.node.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.Toleration;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class Scheduling {
    private final @Nullable Map<String,String> nodeSelector;
    private final @Nullable List<Toleration> tolerations;

    @OutputCustomType.Constructor({"nodeSelector","tolerations"})
    private Scheduling(
        @Nullable Map<String,String> nodeSelector,
        @Nullable List<Toleration> tolerations) {
        this.nodeSelector = nodeSelector;
        this.tolerations = tolerations;
    }

    public Map<String,String> getNodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    public List<Toleration> getTolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Scheduling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> nodeSelector;
        private @Nullable List<Toleration> tolerations;

        public Builder() {
    	      // Empty
        }

        public Builder(Scheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.tolerations = defaults.tolerations;
        }

        public Builder setNodeSelector(@Nullable Map<String,String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public Builder setTolerations(@Nullable List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        public Scheduling build() {
            return new Scheduling(nodeSelector, tolerations);
        }
    }
}
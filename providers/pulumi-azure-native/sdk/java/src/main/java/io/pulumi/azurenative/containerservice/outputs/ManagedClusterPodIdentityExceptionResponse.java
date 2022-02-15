// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ManagedClusterPodIdentityExceptionResponse {
    private final String name;
    private final String namespace;
    private final Map<String,String> podLabels;

    @OutputCustomType.Constructor({"name","namespace","podLabels"})
    private ManagedClusterPodIdentityExceptionResponse(
        String name,
        String namespace,
        Map<String,String> podLabels) {
        this.name = Objects.requireNonNull(name);
        this.namespace = Objects.requireNonNull(namespace);
        this.podLabels = Objects.requireNonNull(podLabels);
    }

    public String getName() {
        return this.name;
    }
    public String getNamespace() {
        return this.namespace;
    }
    public Map<String,String> getPodLabels() {
        return this.podLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityExceptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String namespace;
        private Map<String,String> podLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityExceptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.podLabels = defaults.podLabels;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setPodLabels(Map<String,String> podLabels) {
            this.podLabels = Objects.requireNonNull(podLabels);
            return this;
        }

        public ManagedClusterPodIdentityExceptionResponse build() {
            return new ManagedClusterPodIdentityExceptionResponse(name, namespace, podLabels);
        }
    }
}
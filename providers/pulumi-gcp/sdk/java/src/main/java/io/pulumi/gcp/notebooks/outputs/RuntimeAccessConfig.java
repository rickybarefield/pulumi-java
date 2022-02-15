// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuntimeAccessConfig {
    private final @Nullable String accessType;
    private final @Nullable String proxyUri;
    private final @Nullable String runtimeOwner;

    @OutputCustomType.Constructor({"accessType","proxyUri","runtimeOwner"})
    private RuntimeAccessConfig(
        @Nullable String accessType,
        @Nullable String proxyUri,
        @Nullable String runtimeOwner) {
        this.accessType = accessType;
        this.proxyUri = proxyUri;
        this.runtimeOwner = runtimeOwner;
    }

    public Optional<String> getAccessType() {
        return Optional.ofNullable(this.accessType);
    }
    public Optional<String> getProxyUri() {
        return Optional.ofNullable(this.proxyUri);
    }
    public Optional<String> getRuntimeOwner() {
        return Optional.ofNullable(this.runtimeOwner);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessType;
        private @Nullable String proxyUri;
        private @Nullable String runtimeOwner;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.proxyUri = defaults.proxyUri;
    	      this.runtimeOwner = defaults.runtimeOwner;
        }

        public Builder setAccessType(@Nullable String accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder setProxyUri(@Nullable String proxyUri) {
            this.proxyUri = proxyUri;
            return this;
        }

        public Builder setRuntimeOwner(@Nullable String runtimeOwner) {
            this.runtimeOwner = runtimeOwner;
            return this;
        }

        public RuntimeAccessConfig build() {
            return new RuntimeAccessConfig(accessType, proxyUri, runtimeOwner);
        }
    }
}
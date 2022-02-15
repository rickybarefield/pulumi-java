// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodSpec;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodTemplateSpec {
    private final @Nullable ObjectMeta metadata;
    private final @Nullable PodSpec spec;

    @OutputCustomType.Constructor({"metadata","spec"})
    private PodTemplateSpec(
        @Nullable ObjectMeta metadata,
        @Nullable PodSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<PodSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodTemplateSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ObjectMeta metadata;
        private @Nullable PodSpec spec;

        public Builder() {
    	      // Empty
        }

        public Builder(PodTemplateSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSpec(@Nullable PodSpec spec) {
            this.spec = spec;
            return this;
        }

        public PodTemplateSpec build() {
            return new PodTemplateSpec(metadata, spec);
        }
    }
}
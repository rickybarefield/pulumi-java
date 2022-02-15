// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StackSetAutoDeployment {
    private final @Nullable Boolean enabled;
    private final @Nullable Boolean retainStacksOnAccountRemoval;

    @OutputCustomType.Constructor({"enabled","retainStacksOnAccountRemoval"})
    private StackSetAutoDeployment(
        @Nullable Boolean enabled,
        @Nullable Boolean retainStacksOnAccountRemoval) {
        this.enabled = enabled;
        this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> getRetainStacksOnAccountRemoval() {
        return Optional.ofNullable(this.retainStacksOnAccountRemoval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackSetAutoDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Boolean retainStacksOnAccountRemoval;

        public Builder() {
    	      // Empty
        }

        public Builder(StackSetAutoDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.retainStacksOnAccountRemoval = defaults.retainStacksOnAccountRemoval;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRetainStacksOnAccountRemoval(@Nullable Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }

        public StackSetAutoDeployment build() {
            return new StackSetAutoDeployment(enabled, retainStacksOnAccountRemoval);
        }
    }
}
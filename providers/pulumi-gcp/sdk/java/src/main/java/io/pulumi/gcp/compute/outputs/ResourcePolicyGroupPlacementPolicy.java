// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourcePolicyGroupPlacementPolicy {
    private final @Nullable Integer availabilityDomainCount;
    private final @Nullable String collocation;
    private final @Nullable Integer vmCount;

    @OutputCustomType.Constructor({"availabilityDomainCount","collocation","vmCount"})
    private ResourcePolicyGroupPlacementPolicy(
        @Nullable Integer availabilityDomainCount,
        @Nullable String collocation,
        @Nullable Integer vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.vmCount = vmCount;
    }

    public Optional<Integer> getAvailabilityDomainCount() {
        return Optional.ofNullable(this.availabilityDomainCount);
    }
    public Optional<String> getCollocation() {
        return Optional.ofNullable(this.collocation);
    }
    public Optional<Integer> getVmCount() {
        return Optional.ofNullable(this.vmCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availabilityDomainCount;
        private @Nullable String collocation;
        private @Nullable Integer vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder setAvailabilityDomainCount(@Nullable Integer availabilityDomainCount) {
            this.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        public Builder setCollocation(@Nullable String collocation) {
            this.collocation = collocation;
            return this;
        }

        public Builder setVmCount(@Nullable Integer vmCount) {
            this.vmCount = vmCount;
            return this;
        }

        public ResourcePolicyGroupPlacementPolicy build() {
            return new ResourcePolicyGroupPlacementPolicy(availabilityDomainCount, collocation, vmCount);
        }
    }
}
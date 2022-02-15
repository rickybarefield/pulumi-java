// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.gkehub.outputs.MembershipEndpointGkeCluster;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MembershipEndpoint {
    private final @Nullable MembershipEndpointGkeCluster gkeCluster;

    @OutputCustomType.Constructor({"gkeCluster"})
    private MembershipEndpoint(@Nullable MembershipEndpointGkeCluster gkeCluster) {
        this.gkeCluster = gkeCluster;
    }

    public Optional<MembershipEndpointGkeCluster> getGkeCluster() {
        return Optional.ofNullable(this.gkeCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MembershipEndpointGkeCluster gkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeCluster = defaults.gkeCluster;
        }

        public Builder setGkeCluster(@Nullable MembershipEndpointGkeCluster gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }

        public MembershipEndpoint build() {
            return new MembershipEndpoint(gkeCluster);
        }
    }
}
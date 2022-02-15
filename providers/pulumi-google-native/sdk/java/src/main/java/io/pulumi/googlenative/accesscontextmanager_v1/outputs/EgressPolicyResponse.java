// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.EgressFromResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.outputs.EgressToResponse;
import java.util.Objects;

@OutputCustomType
public final class EgressPolicyResponse {
    private final EgressFromResponse egressFrom;
    private final EgressToResponse egressTo;

    @OutputCustomType.Constructor({"egressFrom","egressTo"})
    private EgressPolicyResponse(
        EgressFromResponse egressFrom,
        EgressToResponse egressTo) {
        this.egressFrom = Objects.requireNonNull(egressFrom);
        this.egressTo = Objects.requireNonNull(egressTo);
    }

    public EgressFromResponse getEgressFrom() {
        return this.egressFrom;
    }
    public EgressToResponse getEgressTo() {
        return this.egressTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EgressFromResponse egressFrom;
        private EgressToResponse egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(EgressFromResponse egressFrom) {
            this.egressFrom = Objects.requireNonNull(egressFrom);
            return this;
        }

        public Builder setEgressTo(EgressToResponse egressTo) {
            this.egressTo = Objects.requireNonNull(egressTo);
            return this;
        }

        public EgressPolicyResponse build() {
            return new EgressPolicyResponse(egressFrom, egressTo);
        }
    }
}
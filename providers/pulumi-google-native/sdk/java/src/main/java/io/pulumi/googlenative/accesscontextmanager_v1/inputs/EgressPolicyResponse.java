// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressFromResponse;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.EgressToResponse;
import java.util.Objects;


public final class EgressPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final EgressPolicyResponse Empty = new EgressPolicyResponse();

    @InputImport(name="egressFrom", required=true)
    private final EgressFromResponse egressFrom;

    public EgressFromResponse getEgressFrom() {
        return this.egressFrom;
    }

    @InputImport(name="egressTo", required=true)
    private final EgressToResponse egressTo;

    public EgressToResponse getEgressTo() {
        return this.egressTo;
    }

    public EgressPolicyResponse(
        EgressFromResponse egressFrom,
        EgressToResponse egressTo) {
        this.egressFrom = Objects.requireNonNull(egressFrom, "expected parameter 'egressFrom' to be non-null");
        this.egressTo = Objects.requireNonNull(egressTo, "expected parameter 'egressTo' to be non-null");
    }

    private EgressPolicyResponse() {
        this.egressFrom = null;
        this.egressTo = null;
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
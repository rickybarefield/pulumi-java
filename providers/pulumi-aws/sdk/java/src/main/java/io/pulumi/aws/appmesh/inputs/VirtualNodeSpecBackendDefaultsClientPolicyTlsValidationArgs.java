// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs();

    /**
     * The SANs for a TLS validation context.
     * 
     */
    @InputImport(name="subjectAlternativeNames")
    private final @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Input.empty() : this.subjectAlternativeNames;
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @InputImport(name="trust", required=true)
    private final Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust;

    public Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> getTrust() {
        return this.trust;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs(
        @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames,
        Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust, "expected parameter 'trust' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs() {
        this.subjectAlternativeNames = Input.empty();
        this.trust = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;
        private Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder setSubjectAlternativeNames(@Nullable Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            this.subjectAlternativeNames = Input.ofNullable(subjectAlternativeNames);
            return this;
        }

        public Builder setTrust(Input<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }

        public Builder setTrust(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs trust) {
            this.trust = Input.of(Objects.requireNonNull(trust));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs(subjectAlternativeNames, trust);
        }
    }
}
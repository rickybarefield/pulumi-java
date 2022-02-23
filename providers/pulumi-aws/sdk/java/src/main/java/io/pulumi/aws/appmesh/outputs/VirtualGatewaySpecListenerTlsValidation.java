// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationTrust;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecListenerTlsValidation {
    /**
     * The SANs for a virtual gateway's listener's Transport Layer Security (TLS) validation context.
     * 
     */
    private final @Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * The TLS validation context trust.
     * 
     */
    private final VirtualGatewaySpecListenerTlsValidationTrust trust;

    @OutputCustomType.Constructor({"subjectAlternativeNames","trust"})
    private VirtualGatewaySpecListenerTlsValidation(
        @Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        VirtualGatewaySpecListenerTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust);
    }

    /**
     * The SANs for a virtual gateway's listener's Transport Layer Security (TLS) validation context.
     * 
     */
    public Optional<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames> getSubjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * The TLS validation context trust.
     * 
     */
    public VirtualGatewaySpecListenerTlsValidationTrust getTrust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualGatewaySpecListenerTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder setSubjectAlternativeNames(@Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setTrust(VirtualGatewaySpecListenerTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidation build() {
            return new VirtualGatewaySpecListenerTlsValidation(subjectAlternativeNames, trust);
        }
    }
}
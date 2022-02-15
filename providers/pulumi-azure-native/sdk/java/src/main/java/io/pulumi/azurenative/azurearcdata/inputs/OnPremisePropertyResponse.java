// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OnPremisePropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnPremisePropertyResponse Empty = new OnPremisePropertyResponse();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    @InputImport(name="publicSigningKey", required=true)
    private final String publicSigningKey;

    public String getPublicSigningKey() {
        return this.publicSigningKey;
    }

    @InputImport(name="signingCertificateThumbprint")
    private final @Nullable String signingCertificateThumbprint;

    public Optional<String> getSigningCertificateThumbprint() {
        return this.signingCertificateThumbprint == null ? Optional.empty() : Optional.ofNullable(this.signingCertificateThumbprint);
    }

    public OnPremisePropertyResponse(
        String id,
        String publicSigningKey,
        @Nullable String signingCertificateThumbprint) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.publicSigningKey = Objects.requireNonNull(publicSigningKey, "expected parameter 'publicSigningKey' to be non-null");
        this.signingCertificateThumbprint = signingCertificateThumbprint;
    }

    private OnPremisePropertyResponse() {
        this.id = null;
        this.publicSigningKey = null;
        this.signingCertificateThumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisePropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String publicSigningKey;
        private @Nullable String signingCertificateThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisePropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.publicSigningKey = defaults.publicSigningKey;
    	      this.signingCertificateThumbprint = defaults.signingCertificateThumbprint;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPublicSigningKey(String publicSigningKey) {
            this.publicSigningKey = Objects.requireNonNull(publicSigningKey);
            return this;
        }

        public Builder setSigningCertificateThumbprint(@Nullable String signingCertificateThumbprint) {
            this.signingCertificateThumbprint = signingCertificateThumbprint;
            return this;
        }

        public OnPremisePropertyResponse build() {
            return new OnPremisePropertyResponse(id, publicSigningKey, signingCertificateThumbprint);
        }
    }
}
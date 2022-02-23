// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationSslConfiguration {
    /**
     * The contents of the certificate's domain.crt file.
     * 
     */
    private final String certificate;
    /**
     * Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    private final @Nullable String chain;
    /**
     * The private key; the contents of the certificate's domain.key file.
     * 
     */
    private final String privateKey;

    @OutputCustomType.Constructor({"certificate","chain","privateKey"})
    private ApplicationSslConfiguration(
        String certificate,
        @Nullable String chain,
        String privateKey) {
        this.certificate = Objects.requireNonNull(certificate);
        this.chain = chain;
        this.privateKey = Objects.requireNonNull(privateKey);
    }

    /**
     * The contents of the certificate's domain.crt file.
     * 
     */
    public String getCertificate() {
        return this.certificate;
    }
    /**
     * Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    public Optional<String> getChain() {
        return Optional.ofNullable(this.chain);
    }
    /**
     * The private key; the contents of the certificate's domain.key file.
     * 
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSslConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private @Nullable String chain;
        private String privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSslConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.chain = defaults.chain;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setChain(@Nullable String chain) {
            this.chain = chain;
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }
        public ApplicationSslConfiguration build() {
            return new ApplicationSslConfiguration(certificate, chain, privateKey);
        }
    }
}
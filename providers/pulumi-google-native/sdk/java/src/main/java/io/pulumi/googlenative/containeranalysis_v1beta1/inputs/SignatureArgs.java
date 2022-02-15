// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SignatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final SignatureArgs Empty = new SignatureArgs();

    @InputImport(name="publicKeyId")
    private final @Nullable Input<String> publicKeyId;

    public Input<String> getPublicKeyId() {
        return this.publicKeyId == null ? Input.empty() : this.publicKeyId;
    }

    @InputImport(name="signature")
    private final @Nullable Input<String> signature;

    public Input<String> getSignature() {
        return this.signature == null ? Input.empty() : this.signature;
    }

    public SignatureArgs(
        @Nullable Input<String> publicKeyId,
        @Nullable Input<String> signature) {
        this.publicKeyId = publicKeyId;
        this.signature = signature;
    }

    private SignatureArgs() {
        this.publicKeyId = Input.empty();
        this.signature = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> publicKeyId;
        private @Nullable Input<String> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(SignatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyId = defaults.publicKeyId;
    	      this.signature = defaults.signature;
        }

        public Builder setPublicKeyId(@Nullable Input<String> publicKeyId) {
            this.publicKeyId = publicKeyId;
            return this;
        }

        public Builder setPublicKeyId(@Nullable String publicKeyId) {
            this.publicKeyId = Input.ofNullable(publicKeyId);
            return this;
        }

        public Builder setSignature(@Nullable Input<String> signature) {
            this.signature = signature;
            return this;
        }

        public Builder setSignature(@Nullable String signature) {
            this.signature = Input.ofNullable(signature);
            return this;
        }

        public SignatureArgs build() {
            return new SignatureArgs(publicKeyId, signature);
        }
    }
}
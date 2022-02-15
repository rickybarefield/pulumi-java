// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.SymmetricKeyResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticationResponse Empty = new AuthenticationResponse();

    @InputImport(name="symmetricKey")
    private final @Nullable SymmetricKeyResponse symmetricKey;

    public Optional<SymmetricKeyResponse> getSymmetricKey() {
        return this.symmetricKey == null ? Optional.empty() : Optional.ofNullable(this.symmetricKey);
    }

    public AuthenticationResponse(@Nullable SymmetricKeyResponse symmetricKey) {
        this.symmetricKey = symmetricKey;
    }

    private AuthenticationResponse() {
        this.symmetricKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SymmetricKeyResponse symmetricKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.symmetricKey = defaults.symmetricKey;
        }

        public Builder setSymmetricKey(@Nullable SymmetricKeyResponse symmetricKey) {
            this.symmetricKey = symmetricKey;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(symmetricKey);
        }
    }
}
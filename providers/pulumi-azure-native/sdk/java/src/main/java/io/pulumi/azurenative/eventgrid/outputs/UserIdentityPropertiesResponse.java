// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserIdentityPropertiesResponse {
    private final @Nullable String clientId;
    private final @Nullable String principalId;

    @OutputCustomType.Constructor({"clientId","principalId"})
    private UserIdentityPropertiesResponse(
        @Nullable String clientId,
        @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setPrincipalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public UserIdentityPropertiesResponse build() {
            return new UserIdentityPropertiesResponse(clientId, principalId);
        }
    }
}
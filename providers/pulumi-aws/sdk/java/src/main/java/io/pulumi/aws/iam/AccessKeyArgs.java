// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessKeyArgs Empty = new AccessKeyArgs();

    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute.
     * 
     */
    @InputImport(name="pgpKey")
    private final @Nullable Input<String> pgpKey;

    public Input<String> getPgpKey() {
        return this.pgpKey == null ? Input.empty() : this.pgpKey;
    }

    /**
     * Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * IAM user to associate with this access key.
     * 
     */
    @InputImport(name="user", required=true)
    private final Input<String> user;

    public Input<String> getUser() {
        return this.user;
    }

    public AccessKeyArgs(
        @Nullable Input<String> pgpKey,
        @Nullable Input<String> status,
        Input<String> user) {
        this.pgpKey = pgpKey;
        this.status = status;
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private AccessKeyArgs() {
        this.pgpKey = Input.empty();
        this.status = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> pgpKey;
        private @Nullable Input<String> status;
        private Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pgpKey = defaults.pgpKey;
    	      this.status = defaults.status;
    	      this.user = defaults.user;
        }

        public Builder setPgpKey(@Nullable Input<String> pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }

        public Builder setPgpKey(@Nullable String pgpKey) {
            this.pgpKey = Input.ofNullable(pgpKey);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setUser(Input<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder setUser(String user) {
            this.user = Input.of(Objects.requireNonNull(user));
            return this;
        }
        public AccessKeyArgs build() {
            return new AccessKeyArgs(pgpKey, status, user);
        }
    }
}
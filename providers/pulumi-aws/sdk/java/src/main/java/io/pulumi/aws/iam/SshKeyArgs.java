// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SshKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshKeyArgs Empty = new SshKeyArgs();

    /**
     * Specifies the public key encoding format to use in the response. To retrieve the public key in ssh-rsa format, use `SSH`. To retrieve the public key in PEM format, use `PEM`.
     * 
     */
    @InputImport(name="encoding", required=true)
    private final Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding;
    }

    /**
     * The SSH public key. The public key must be encoded in ssh-rsa format or PEM format.
     * 
     */
    @InputImport(name="publicKey", required=true)
    private final Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey;
    }

    /**
     * The status to assign to the SSH public key. Active means the key can be used for authentication with an AWS CodeCommit repository. Inactive means the key cannot be used. Default is `active`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The name of the IAM user to associate the SSH public key with.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public SshKeyArgs(
        Input<String> encoding,
        Input<String> publicKey,
        @Nullable Input<String> status,
        Input<String> username) {
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.status = status;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private SshKeyArgs() {
        this.encoding = Input.empty();
        this.publicKey = Input.empty();
        this.status = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> encoding;
        private Input<String> publicKey;
        private @Nullable Input<String> status;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(SshKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.username = defaults.username;
        }

        public Builder setEncoding(Input<String> encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Input.of(Objects.requireNonNull(encoding));
            return this;
        }

        public Builder setPublicKey(Input<String> publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }

        public Builder setPublicKey(String publicKey) {
            this.publicKey = Input.of(Objects.requireNonNull(publicKey));
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

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public SshKeyArgs build() {
            return new SshKeyArgs(encoding, publicKey, status, username);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretVersionArgs Empty = new SecretVersionArgs();

    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @InputImport(name="secretBinary")
    private final @Nullable Input<String> secretBinary;

    public Input<String> getSecretBinary() {
        return this.secretBinary == null ? Input.empty() : this.secretBinary;
    }

    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @InputImport(name="secretId", required=true)
    private final Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId;
    }

    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @InputImport(name="secretString")
    private final @Nullable Input<String> secretString;

    public Input<String> getSecretString() {
        return this.secretString == null ? Input.empty() : this.secretString;
    }

    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that's already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     */
    @InputImport(name="versionStages")
    private final @Nullable Input<List<String>> versionStages;

    public Input<List<String>> getVersionStages() {
        return this.versionStages == null ? Input.empty() : this.versionStages;
    }

    public SecretVersionArgs(
        @Nullable Input<String> secretBinary,
        Input<String> secretId,
        @Nullable Input<String> secretString,
        @Nullable Input<List<String>> versionStages) {
        this.secretBinary = secretBinary;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
        this.secretString = secretString;
        this.versionStages = versionStages;
    }

    private SecretVersionArgs() {
        this.secretBinary = Input.empty();
        this.secretId = Input.empty();
        this.secretString = Input.empty();
        this.versionStages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> secretBinary;
        private Input<String> secretId;
        private @Nullable Input<String> secretString;
        private @Nullable Input<List<String>> versionStages;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretBinary = defaults.secretBinary;
    	      this.secretId = defaults.secretId;
    	      this.secretString = defaults.secretString;
    	      this.versionStages = defaults.versionStages;
        }

        public Builder setSecretBinary(@Nullable Input<String> secretBinary) {
            this.secretBinary = secretBinary;
            return this;
        }

        public Builder setSecretBinary(@Nullable String secretBinary) {
            this.secretBinary = Input.ofNullable(secretBinary);
            return this;
        }

        public Builder setSecretId(Input<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Input.of(Objects.requireNonNull(secretId));
            return this;
        }

        public Builder setSecretString(@Nullable Input<String> secretString) {
            this.secretString = secretString;
            return this;
        }

        public Builder setSecretString(@Nullable String secretString) {
            this.secretString = Input.ofNullable(secretString);
            return this;
        }

        public Builder setVersionStages(@Nullable Input<List<String>> versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public Builder setVersionStages(@Nullable List<String> versionStages) {
            this.versionStages = Input.ofNullable(versionStages);
            return this;
        }
        public SecretVersionArgs build() {
            return new SecretVersionArgs(secretBinary, secretId, secretString, versionStages);
        }
    }
}
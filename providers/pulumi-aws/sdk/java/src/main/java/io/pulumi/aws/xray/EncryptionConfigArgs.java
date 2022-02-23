// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.xray;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @InputImport(name="keyId")
    private final @Nullable Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId == null ? Input.empty() : this.keyId;
    }

    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EncryptionConfigArgs(
        @Nullable Input<String> keyId,
        Input<String> type) {
        this.keyId = keyId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EncryptionConfigArgs() {
        this.keyId = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyId;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.type = defaults.type;
        }

        public Builder setKeyId(@Nullable Input<String> keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setKeyId(@Nullable String keyId) {
            this.keyId = Input.ofNullable(keyId);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public EncryptionConfigArgs build() {
            return new EncryptionConfigArgs(keyId, type);
        }
    }
}
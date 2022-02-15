// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.AccountEncryptionKeyType;
import io.pulumi.azurenative.media.inputs.KeyVaultPropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    @InputImport(name="keyVaultProperties")
    private final @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;

    public Input<KeyVaultPropertiesArgs> getKeyVaultProperties() {
        return this.keyVaultProperties == null ? Input.empty() : this.keyVaultProperties;
    }

    @InputImport(name="type", required=true)
    private final Input<Either<String,AccountEncryptionKeyType>> type;

    public Input<Either<String,AccountEncryptionKeyType>> getType() {
        return this.type;
    }

    public AccountEncryptionArgs(
        @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties,
        Input<Either<String,AccountEncryptionKeyType>> type) {
        this.keyVaultProperties = keyVaultProperties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AccountEncryptionArgs() {
        this.keyVaultProperties = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties;
        private Input<Either<String,AccountEncryptionKeyType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.type = defaults.type;
        }

        public Builder setKeyVaultProperties(@Nullable Input<KeyVaultPropertiesArgs> keyVaultProperties) {
            this.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder setKeyVaultProperties(@Nullable KeyVaultPropertiesArgs keyVaultProperties) {
            this.keyVaultProperties = Input.ofNullable(keyVaultProperties);
            return this;
        }

        public Builder setType(Input<Either<String,AccountEncryptionKeyType>> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(Either<String,AccountEncryptionKeyType> type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AccountEncryptionArgs build() {
            return new AccountEncryptionArgs(keyVaultProperties, type);
        }
    }
}
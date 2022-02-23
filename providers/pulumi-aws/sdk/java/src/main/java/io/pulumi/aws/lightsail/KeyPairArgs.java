// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyPairArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyPairArgs Empty = new KeyPairArgs();

    /**
     * The name of the Lightsail Key Pair. If omitted, a unique
     * name will be generated by this provider
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="namePrefix")
    private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * An optional PGP key to encrypt the resulting private
     * key material. Only used when creating a new key pair
     * 
     */
    @InputImport(name="pgpKey")
    private final @Nullable Input<String> pgpKey;

    public Input<String> getPgpKey() {
        return this.pgpKey == null ? Input.empty() : this.pgpKey;
    }

    /**
     * The public key material. This public key will be
     * imported into Lightsail
     * 
     */
    @InputImport(name="publicKey")
    private final @Nullable Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    public KeyPairArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> pgpKey,
        @Nullable Input<String> publicKey) {
        this.name = name;
        this.namePrefix = namePrefix;
        this.pgpKey = pgpKey;
        this.publicKey = publicKey;
    }

    private KeyPairArgs() {
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.pgpKey = Input.empty();
        this.publicKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPairArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> pgpKey;
        private @Nullable Input<String> publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPairArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.pgpKey = defaults.pgpKey;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPgpKey(@Nullable Input<String> pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }

        public Builder setPgpKey(@Nullable String pgpKey) {
            this.pgpKey = Input.ofNullable(pgpKey);
            return this;
        }

        public Builder setPublicKey(@Nullable Input<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
            return this;
        }
        public KeyPairArgs build() {
            return new KeyPairArgs(name, namePrefix, pgpKey, publicKey);
        }
    }
}
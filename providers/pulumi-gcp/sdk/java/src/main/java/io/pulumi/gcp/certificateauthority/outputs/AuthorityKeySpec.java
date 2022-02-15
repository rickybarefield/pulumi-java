// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AuthorityKeySpec {
    private final @Nullable String algorithm;
    private final @Nullable String cloudKmsKeyVersion;

    @OutputCustomType.Constructor({"algorithm","cloudKmsKeyVersion"})
    private AuthorityKeySpec(
        @Nullable String algorithm,
        @Nullable String cloudKmsKeyVersion) {
        this.algorithm = algorithm;
        this.cloudKmsKeyVersion = cloudKmsKeyVersion;
    }

    public Optional<String> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public Optional<String> getCloudKmsKeyVersion() {
        return Optional.ofNullable(this.cloudKmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityKeySpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable String cloudKmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityKeySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.cloudKmsKeyVersion = defaults.cloudKmsKeyVersion;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setCloudKmsKeyVersion(@Nullable String cloudKmsKeyVersion) {
            this.cloudKmsKeyVersion = cloudKmsKeyVersion;
            return this;
        }

        public AuthorityKeySpec build() {
            return new AuthorityKeySpec(algorithm, cloudKmsKeyVersion);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionInTransitPropertiesResponse {
    private final @Nullable Boolean isEncryptionInTransitEnabled;

    @OutputCustomType.Constructor({"isEncryptionInTransitEnabled"})
    private EncryptionInTransitPropertiesResponse(@Nullable Boolean isEncryptionInTransitEnabled) {
        this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled;
    }

    public Optional<Boolean> getIsEncryptionInTransitEnabled() {
        return Optional.ofNullable(this.isEncryptionInTransitEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionInTransitPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEncryptionInTransitEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionInTransitPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncryptionInTransitEnabled = defaults.isEncryptionInTransitEnabled;
        }

        public Builder setIsEncryptionInTransitEnabled(@Nullable Boolean isEncryptionInTransitEnabled) {
            this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled;
            return this;
        }

        public EncryptionInTransitPropertiesResponse build() {
            return new EncryptionInTransitPropertiesResponse(isEncryptionInTransitEnabled);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeVmInstanceViewStatusResponse {
    private final @Nullable String code;
    private final @Nullable String displayStatus;
    private final @Nullable String message;

    @OutputCustomType.Constructor({"code","displayStatus","message"})
    private ComputeVmInstanceViewStatusResponse(
        @Nullable String code,
        @Nullable String displayStatus,
        @Nullable String message) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.message = message;
    }

    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    public Optional<String> getDisplayStatus() {
        return Optional.ofNullable(this.displayStatus);
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeVmInstanceViewStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String displayStatus;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeVmInstanceViewStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public ComputeVmInstanceViewStatusResponse build() {
            return new ComputeVmInstanceViewStatusResponse(code, displayStatus, message);
        }
    }
}
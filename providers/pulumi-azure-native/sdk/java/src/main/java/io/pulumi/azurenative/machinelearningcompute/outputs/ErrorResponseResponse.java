// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.ErrorDetailResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ErrorResponseResponse {
    private final String code;
    private final @Nullable List<ErrorDetailResponse> details;
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private ErrorResponseResponse(
        String code,
        @Nullable List<ErrorDetailResponse> details,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.details = details;
        this.message = Objects.requireNonNull(message);
    }

    public String getCode() {
        return this.code;
    }
    public List<ErrorDetailResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<ErrorDetailResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<ErrorDetailResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public ErrorResponseResponse build() {
            return new ErrorResponseResponse(code, details, message);
        }
    }
}
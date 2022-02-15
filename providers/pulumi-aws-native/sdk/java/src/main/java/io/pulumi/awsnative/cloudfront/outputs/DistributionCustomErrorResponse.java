// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionCustomErrorResponse {
    private final @Nullable Double errorCachingMinTTL;
    private final Integer errorCode;
    private final @Nullable Integer responseCode;
    private final @Nullable String responsePagePath;

    @OutputCustomType.Constructor({"errorCachingMinTTL","errorCode","responseCode","responsePagePath"})
    private DistributionCustomErrorResponse(
        @Nullable Double errorCachingMinTTL,
        Integer errorCode,
        @Nullable Integer responseCode,
        @Nullable String responsePagePath) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        this.errorCode = Objects.requireNonNull(errorCode);
        this.responseCode = responseCode;
        this.responsePagePath = responsePagePath;
    }

    public Optional<Double> getErrorCachingMinTTL() {
        return Optional.ofNullable(this.errorCachingMinTTL);
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }
    public Optional<Integer> getResponseCode() {
        return Optional.ofNullable(this.responseCode);
    }
    public Optional<String> getResponsePagePath() {
        return Optional.ofNullable(this.responsePagePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double errorCachingMinTTL;
        private Integer errorCode;
        private @Nullable Integer responseCode;
        private @Nullable String responsePagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCachingMinTTL = defaults.errorCachingMinTTL;
    	      this.errorCode = defaults.errorCode;
    	      this.responseCode = defaults.responseCode;
    	      this.responsePagePath = defaults.responsePagePath;
        }

        public Builder setErrorCachingMinTTL(@Nullable Double errorCachingMinTTL) {
            this.errorCachingMinTTL = errorCachingMinTTL;
            return this;
        }

        public Builder setErrorCode(Integer errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setResponseCode(@Nullable Integer responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        public Builder setResponsePagePath(@Nullable String responsePagePath) {
            this.responsePagePath = responsePagePath;
            return this;
        }

        public DistributionCustomErrorResponse build() {
            return new DistributionCustomErrorResponse(errorCachingMinTTL, errorCode, responseCode, responsePagePath);
        }
    }
}
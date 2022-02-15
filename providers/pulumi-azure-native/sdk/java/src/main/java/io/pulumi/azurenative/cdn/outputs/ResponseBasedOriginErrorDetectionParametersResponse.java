// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.HttpErrorRangeParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResponseBasedOriginErrorDetectionParametersResponse {
    private final @Nullable List<HttpErrorRangeParametersResponse> httpErrorRanges;
    private final @Nullable String responseBasedDetectedErrorTypes;
    private final @Nullable Integer responseBasedFailoverThresholdPercentage;

    @OutputCustomType.Constructor({"httpErrorRanges","responseBasedDetectedErrorTypes","responseBasedFailoverThresholdPercentage"})
    private ResponseBasedOriginErrorDetectionParametersResponse(
        @Nullable List<HttpErrorRangeParametersResponse> httpErrorRanges,
        @Nullable String responseBasedDetectedErrorTypes,
        @Nullable Integer responseBasedFailoverThresholdPercentage) {
        this.httpErrorRanges = httpErrorRanges;
        this.responseBasedDetectedErrorTypes = responseBasedDetectedErrorTypes;
        this.responseBasedFailoverThresholdPercentage = responseBasedFailoverThresholdPercentage;
    }

    public List<HttpErrorRangeParametersResponse> getHttpErrorRanges() {
        return this.httpErrorRanges == null ? List.of() : this.httpErrorRanges;
    }
    public Optional<String> getResponseBasedDetectedErrorTypes() {
        return Optional.ofNullable(this.responseBasedDetectedErrorTypes);
    }
    public Optional<Integer> getResponseBasedFailoverThresholdPercentage() {
        return Optional.ofNullable(this.responseBasedFailoverThresholdPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseBasedOriginErrorDetectionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HttpErrorRangeParametersResponse> httpErrorRanges;
        private @Nullable String responseBasedDetectedErrorTypes;
        private @Nullable Integer responseBasedFailoverThresholdPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseBasedOriginErrorDetectionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpErrorRanges = defaults.httpErrorRanges;
    	      this.responseBasedDetectedErrorTypes = defaults.responseBasedDetectedErrorTypes;
    	      this.responseBasedFailoverThresholdPercentage = defaults.responseBasedFailoverThresholdPercentage;
        }

        public Builder setHttpErrorRanges(@Nullable List<HttpErrorRangeParametersResponse> httpErrorRanges) {
            this.httpErrorRanges = httpErrorRanges;
            return this;
        }

        public Builder setResponseBasedDetectedErrorTypes(@Nullable String responseBasedDetectedErrorTypes) {
            this.responseBasedDetectedErrorTypes = responseBasedDetectedErrorTypes;
            return this;
        }

        public Builder setResponseBasedFailoverThresholdPercentage(@Nullable Integer responseBasedFailoverThresholdPercentage) {
            this.responseBasedFailoverThresholdPercentage = responseBasedFailoverThresholdPercentage;
            return this;
        }

        public ResponseBasedOriginErrorDetectionParametersResponse build() {
            return new ResponseBasedOriginErrorDetectionParametersResponse(httpErrorRanges, responseBasedDetectedErrorTypes, responseBasedFailoverThresholdPercentage);
        }
    }
}
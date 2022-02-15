// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SearchParameterResponse {
    private final String canonicalUrl;
    private final String parameter;

    @OutputCustomType.Constructor({"canonicalUrl","parameter"})
    private SearchParameterResponse(
        String canonicalUrl,
        String parameter) {
        this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
        this.parameter = Objects.requireNonNull(parameter);
    }

    public String getCanonicalUrl() {
        return this.canonicalUrl;
    }
    public String getParameter() {
        return this.parameter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalUrl;
        private String parameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalUrl = defaults.canonicalUrl;
    	      this.parameter = defaults.parameter;
        }

        public Builder setCanonicalUrl(String canonicalUrl) {
            this.canonicalUrl = Objects.requireNonNull(canonicalUrl);
            return this;
        }

        public Builder setParameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }

        public SearchParameterResponse build() {
            return new SearchParameterResponse(canonicalUrl, parameter);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.Int64RangeMatchResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class HttpHeaderMatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpHeaderMatchResponse Empty = new HttpHeaderMatchResponse();

    @InputImport(name="exactMatch", required=true)
    private final String exactMatch;

    public String getExactMatch() {
        return this.exactMatch;
    }

    @InputImport(name="headerName", required=true)
    private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="invertMatch", required=true)
    private final Boolean invertMatch;

    public Boolean getInvertMatch() {
        return this.invertMatch;
    }

    @InputImport(name="prefixMatch", required=true)
    private final String prefixMatch;

    public String getPrefixMatch() {
        return this.prefixMatch;
    }

    @InputImport(name="presentMatch", required=true)
    private final Boolean presentMatch;

    public Boolean getPresentMatch() {
        return this.presentMatch;
    }

    @InputImport(name="rangeMatch", required=true)
    private final Int64RangeMatchResponse rangeMatch;

    public Int64RangeMatchResponse getRangeMatch() {
        return this.rangeMatch;
    }

    @InputImport(name="regexMatch", required=true)
    private final String regexMatch;

    public String getRegexMatch() {
        return this.regexMatch;
    }

    @InputImport(name="suffixMatch", required=true)
    private final String suffixMatch;

    public String getSuffixMatch() {
        return this.suffixMatch;
    }

    public HttpHeaderMatchResponse(
        String exactMatch,
        String headerName,
        Boolean invertMatch,
        String prefixMatch,
        Boolean presentMatch,
        Int64RangeMatchResponse rangeMatch,
        String regexMatch,
        String suffixMatch) {
        this.exactMatch = Objects.requireNonNull(exactMatch, "expected parameter 'exactMatch' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.invertMatch = Objects.requireNonNull(invertMatch, "expected parameter 'invertMatch' to be non-null");
        this.prefixMatch = Objects.requireNonNull(prefixMatch, "expected parameter 'prefixMatch' to be non-null");
        this.presentMatch = Objects.requireNonNull(presentMatch, "expected parameter 'presentMatch' to be non-null");
        this.rangeMatch = Objects.requireNonNull(rangeMatch, "expected parameter 'rangeMatch' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
        this.suffixMatch = Objects.requireNonNull(suffixMatch, "expected parameter 'suffixMatch' to be non-null");
    }

    private HttpHeaderMatchResponse() {
        this.exactMatch = null;
        this.headerName = null;
        this.invertMatch = null;
        this.prefixMatch = null;
        this.presentMatch = null;
        this.rangeMatch = null;
        this.regexMatch = null;
        this.suffixMatch = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private String headerName;
        private Boolean invertMatch;
        private String prefixMatch;
        private Boolean presentMatch;
        private Int64RangeMatchResponse rangeMatch;
        private String regexMatch;
        private String suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder setExactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setInvertMatch(Boolean invertMatch) {
            this.invertMatch = Objects.requireNonNull(invertMatch);
            return this;
        }

        public Builder setPrefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }

        public Builder setPresentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }

        public Builder setRangeMatch(Int64RangeMatchResponse rangeMatch) {
            this.rangeMatch = Objects.requireNonNull(rangeMatch);
            return this;
        }

        public Builder setRegexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }

        public Builder setSuffixMatch(String suffixMatch) {
            this.suffixMatch = Objects.requireNonNull(suffixMatch);
            return this;
        }

        public HttpHeaderMatchResponse build() {
            return new HttpHeaderMatchResponse(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
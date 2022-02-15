// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class QueryInterpretationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryInterpretationConfigResponse Empty = new QueryInterpretationConfigResponse();

    @InputImport(name="forceDisableSupplementalResults", required=true)
    private final Boolean forceDisableSupplementalResults;

    public Boolean getForceDisableSupplementalResults() {
        return this.forceDisableSupplementalResults;
    }

    @InputImport(name="forceVerbatimMode", required=true)
    private final Boolean forceVerbatimMode;

    public Boolean getForceVerbatimMode() {
        return this.forceVerbatimMode;
    }

    public QueryInterpretationConfigResponse(
        Boolean forceDisableSupplementalResults,
        Boolean forceVerbatimMode) {
        this.forceDisableSupplementalResults = Objects.requireNonNull(forceDisableSupplementalResults, "expected parameter 'forceDisableSupplementalResults' to be non-null");
        this.forceVerbatimMode = Objects.requireNonNull(forceVerbatimMode, "expected parameter 'forceVerbatimMode' to be non-null");
    }

    private QueryInterpretationConfigResponse() {
        this.forceDisableSupplementalResults = null;
        this.forceVerbatimMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryInterpretationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean forceDisableSupplementalResults;
        private Boolean forceVerbatimMode;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryInterpretationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDisableSupplementalResults = defaults.forceDisableSupplementalResults;
    	      this.forceVerbatimMode = defaults.forceVerbatimMode;
        }

        public Builder setForceDisableSupplementalResults(Boolean forceDisableSupplementalResults) {
            this.forceDisableSupplementalResults = Objects.requireNonNull(forceDisableSupplementalResults);
            return this;
        }

        public Builder setForceVerbatimMode(Boolean forceVerbatimMode) {
            this.forceVerbatimMode = Objects.requireNonNull(forceVerbatimMode);
            return this;
        }

        public QueryInterpretationConfigResponse build() {
            return new QueryInterpretationConfigResponse(forceDisableSupplementalResults, forceVerbatimMode);
        }
    }
}
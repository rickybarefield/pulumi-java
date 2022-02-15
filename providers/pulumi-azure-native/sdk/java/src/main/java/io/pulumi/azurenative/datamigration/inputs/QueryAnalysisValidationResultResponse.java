// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.QueryExecutionResultResponse;
import io.pulumi.azurenative.datamigration.inputs.ValidationErrorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class QueryAnalysisValidationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final QueryAnalysisValidationResultResponse Empty = new QueryAnalysisValidationResultResponse();

    @InputImport(name="queryResults", required=true)
    private final QueryExecutionResultResponse queryResults;

    public QueryExecutionResultResponse getQueryResults() {
        return this.queryResults;
    }

    @InputImport(name="validationErrors", required=true)
    private final ValidationErrorResponse validationErrors;

    public ValidationErrorResponse getValidationErrors() {
        return this.validationErrors;
    }

    public QueryAnalysisValidationResultResponse(
        QueryExecutionResultResponse queryResults,
        ValidationErrorResponse validationErrors) {
        this.queryResults = Objects.requireNonNull(queryResults, "expected parameter 'queryResults' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private QueryAnalysisValidationResultResponse() {
        this.queryResults = null;
        this.validationErrors = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryAnalysisValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueryExecutionResultResponse queryResults;
        private ValidationErrorResponse validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryAnalysisValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryResults = defaults.queryResults;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder setQueryResults(QueryExecutionResultResponse queryResults) {
            this.queryResults = Objects.requireNonNull(queryResults);
            return this;
        }

        public Builder setValidationErrors(ValidationErrorResponse validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }

        public QueryAnalysisValidationResultResponse build() {
            return new QueryAnalysisValidationResultResponse(queryResults, validationErrors);
        }
    }
}
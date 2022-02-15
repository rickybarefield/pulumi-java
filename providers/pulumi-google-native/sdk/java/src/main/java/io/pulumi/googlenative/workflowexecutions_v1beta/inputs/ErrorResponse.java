// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.workflowexecutions_v1beta.inputs.StackTraceResponse;
import java.lang.String;
import java.util.Objects;


public final class ErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ErrorResponse Empty = new ErrorResponse();

    @InputImport(name="context", required=true)
    private final String context;

    public String getContext() {
        return this.context;
    }

    @InputImport(name="payload", required=true)
    private final String payload;

    public String getPayload() {
        return this.payload;
    }

    @InputImport(name="stackTrace", required=true)
    private final StackTraceResponse stackTrace;

    public StackTraceResponse getStackTrace() {
        return this.stackTrace;
    }

    public ErrorResponse(
        String context,
        String payload,
        StackTraceResponse stackTrace) {
        this.context = Objects.requireNonNull(context, "expected parameter 'context' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.stackTrace = Objects.requireNonNull(stackTrace, "expected parameter 'stackTrace' to be non-null");
    }

    private ErrorResponse() {
        this.context = null;
        this.payload = null;
        this.stackTrace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String context;
        private String payload;
        private StackTraceResponse stackTrace;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.payload = defaults.payload;
    	      this.stackTrace = defaults.stackTrace;
        }

        public Builder setContext(String context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setStackTrace(StackTraceResponse stackTrace) {
            this.stackTrace = Objects.requireNonNull(stackTrace);
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(context, payload, stackTrace);
        }
    }
}
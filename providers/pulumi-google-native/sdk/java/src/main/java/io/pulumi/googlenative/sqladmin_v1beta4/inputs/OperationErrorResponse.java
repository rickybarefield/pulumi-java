// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class OperationErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final OperationErrorResponse Empty = new OperationErrorResponse();

    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public OperationErrorResponse(
        String code,
        String kind,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private OperationErrorResponse() {
        this.code = null;
        this.kind = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String kind;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.kind = defaults.kind;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public OperationErrorResponse build() {
            return new OperationErrorResponse(code, kind, message);
        }
    }
}
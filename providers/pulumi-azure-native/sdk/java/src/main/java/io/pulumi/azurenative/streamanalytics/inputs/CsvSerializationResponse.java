// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CsvSerializationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CsvSerializationResponse Empty = new CsvSerializationResponse();

    @InputImport(name="encoding")
    private final @Nullable String encoding;

    public Optional<String> getEncoding() {
        return this.encoding == null ? Optional.empty() : Optional.ofNullable(this.encoding);
    }

    @InputImport(name="fieldDelimiter")
    private final @Nullable String fieldDelimiter;

    public Optional<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Optional.empty() : Optional.ofNullable(this.fieldDelimiter);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public CsvSerializationResponse(
        @Nullable String encoding,
        @Nullable String fieldDelimiter,
        String type) {
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CsvSerializationResponse() {
        this.encoding = null;
        this.fieldDelimiter = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvSerializationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encoding;
        private @Nullable String fieldDelimiter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvSerializationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.type = defaults.type;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setFieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public CsvSerializationResponse build() {
            return new CsvSerializationResponse(encoding, fieldDelimiter, type);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetCompressionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatasetCompressionResponse Empty = new DatasetCompressionResponse();

    @InputImport(name="level")
    private final @Nullable Object level;

    public Optional<Object> getLevel() {
        return this.level == null ? Optional.empty() : Optional.ofNullable(this.level);
    }

    @InputImport(name="type", required=true)
    private final Object type;

    public Object getType() {
        return this.type;
    }

    public DatasetCompressionResponse(
        @Nullable Object level,
        Object type) {
        this.level = level;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DatasetCompressionResponse() {
        this.level = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCompressionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object level;
        private Object type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCompressionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.type = defaults.type;
        }

        public Builder setLevel(@Nullable Object level) {
            this.level = level;
            return this;
        }

        public Builder setType(Object type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public DatasetCompressionResponse build() {
            return new DatasetCompressionResponse(level, type);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.IndexesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IncludedPathResponse {
    private final @Nullable List<IndexesResponse> indexes;
    private final @Nullable String path;

    @OutputCustomType.Constructor({"indexes","path"})
    private IncludedPathResponse(
        @Nullable List<IndexesResponse> indexes,
        @Nullable String path) {
        this.indexes = indexes;
        this.path = path;
    }

    public List<IndexesResponse> getIndexes() {
        return this.indexes == null ? List.of() : this.indexes;
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncludedPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IndexesResponse> indexes;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(IncludedPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexes = defaults.indexes;
    	      this.path = defaults.path;
        }

        public Builder setIndexes(@Nullable List<IndexesResponse> indexes) {
            this.indexes = indexes;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public IncludedPathResponse build() {
            return new IncludedPathResponse(indexes, path);
        }
    }
}
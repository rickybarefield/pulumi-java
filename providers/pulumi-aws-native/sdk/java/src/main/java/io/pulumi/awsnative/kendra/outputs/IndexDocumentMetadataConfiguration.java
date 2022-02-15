// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.IndexDocumentAttributeValueType;
import io.pulumi.awsnative.kendra.outputs.IndexRelevance;
import io.pulumi.awsnative.kendra.outputs.IndexSearch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IndexDocumentMetadataConfiguration {
    private final String name;
    private final @Nullable IndexRelevance relevance;
    private final @Nullable IndexSearch search;
    private final IndexDocumentAttributeValueType type;

    @OutputCustomType.Constructor({"name","relevance","search","type"})
    private IndexDocumentMetadataConfiguration(
        String name,
        @Nullable IndexRelevance relevance,
        @Nullable IndexSearch search,
        IndexDocumentAttributeValueType type) {
        this.name = Objects.requireNonNull(name);
        this.relevance = relevance;
        this.search = search;
        this.type = Objects.requireNonNull(type);
    }

    public String getName() {
        return this.name;
    }
    public Optional<IndexRelevance> getRelevance() {
        return Optional.ofNullable(this.relevance);
    }
    public Optional<IndexSearch> getSearch() {
        return Optional.ofNullable(this.search);
    }
    public IndexDocumentAttributeValueType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexDocumentMetadataConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable IndexRelevance relevance;
        private @Nullable IndexSearch search;
        private IndexDocumentAttributeValueType type;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexDocumentMetadataConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.relevance = defaults.relevance;
    	      this.search = defaults.search;
    	      this.type = defaults.type;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRelevance(@Nullable IndexRelevance relevance) {
            this.relevance = relevance;
            return this;
        }

        public Builder setSearch(@Nullable IndexSearch search) {
            this.search = search;
            return this;
        }

        public Builder setType(IndexDocumentAttributeValueType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public IndexDocumentMetadataConfiguration build() {
            return new IndexDocumentMetadataConfiguration(name, relevance, search, type);
        }
    }
}
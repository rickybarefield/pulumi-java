// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceServiceNowKnowledgeArticleConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceServiceNowKnowledgeArticleConfiguration Empty = new DataSourceServiceNowKnowledgeArticleConfiguration();

    @InputImport(name="crawlAttachments")
    private final @Nullable Boolean crawlAttachments;

    public Optional<Boolean> getCrawlAttachments() {
        return this.crawlAttachments == null ? Optional.empty() : Optional.ofNullable(this.crawlAttachments);
    }

    @InputImport(name="documentDataFieldName", required=true)
    private final String documentDataFieldName;

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }

    @InputImport(name="documentTitleFieldName")
    private final @Nullable String documentTitleFieldName;

    public Optional<String> getDocumentTitleFieldName() {
        return this.documentTitleFieldName == null ? Optional.empty() : Optional.ofNullable(this.documentTitleFieldName);
    }

    @InputImport(name="excludeAttachmentFilePatterns")
    private final @Nullable List<String> excludeAttachmentFilePatterns;

    public List<String> getExcludeAttachmentFilePatterns() {
        return this.excludeAttachmentFilePatterns == null ? List.of() : this.excludeAttachmentFilePatterns;
    }

    @InputImport(name="fieldMappings")
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    @InputImport(name="filterQuery")
    private final @Nullable String filterQuery;

    public Optional<String> getFilterQuery() {
        return this.filterQuery == null ? Optional.empty() : Optional.ofNullable(this.filterQuery);
    }

    @InputImport(name="includeAttachmentFilePatterns")
    private final @Nullable List<String> includeAttachmentFilePatterns;

    public List<String> getIncludeAttachmentFilePatterns() {
        return this.includeAttachmentFilePatterns == null ? List.of() : this.includeAttachmentFilePatterns;
    }

    public DataSourceServiceNowKnowledgeArticleConfiguration(
        @Nullable Boolean crawlAttachments,
        String documentDataFieldName,
        @Nullable String documentTitleFieldName,
        @Nullable List<String> excludeAttachmentFilePatterns,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @Nullable String filterQuery,
        @Nullable List<String> includeAttachmentFilePatterns) {
        this.crawlAttachments = crawlAttachments;
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
        this.documentTitleFieldName = documentTitleFieldName;
        this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
        this.fieldMappings = fieldMappings;
        this.filterQuery = filterQuery;
        this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
    }

    private DataSourceServiceNowKnowledgeArticleConfiguration() {
        this.crawlAttachments = null;
        this.documentDataFieldName = null;
        this.documentTitleFieldName = null;
        this.excludeAttachmentFilePatterns = List.of();
        this.fieldMappings = List.of();
        this.filterQuery = null;
        this.includeAttachmentFilePatterns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceServiceNowKnowledgeArticleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlAttachments;
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<String> excludeAttachmentFilePatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable String filterQuery;
        private @Nullable List<String> includeAttachmentFilePatterns;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceServiceNowKnowledgeArticleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlAttachments = defaults.crawlAttachments;
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.excludeAttachmentFilePatterns = defaults.excludeAttachmentFilePatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.filterQuery = defaults.filterQuery;
    	      this.includeAttachmentFilePatterns = defaults.includeAttachmentFilePatterns;
        }

        public Builder setCrawlAttachments(@Nullable Boolean crawlAttachments) {
            this.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder setDocumentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setExcludeAttachmentFilePatterns(@Nullable List<String> excludeAttachmentFilePatterns) {
            this.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setFilterQuery(@Nullable String filterQuery) {
            this.filterQuery = filterQuery;
            return this;
        }

        public Builder setIncludeAttachmentFilePatterns(@Nullable List<String> includeAttachmentFilePatterns) {
            this.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public DataSourceServiceNowKnowledgeArticleConfiguration build() {
            return new DataSourceServiceNowKnowledgeArticleConfiguration(crawlAttachments, documentDataFieldName, documentTitleFieldName, excludeAttachmentFilePatterns, fieldMappings, filterQuery, includeAttachmentFilePatterns);
        }
    }
}
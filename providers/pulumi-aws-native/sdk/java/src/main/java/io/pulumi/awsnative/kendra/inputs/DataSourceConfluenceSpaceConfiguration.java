// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceConfluenceSpaceToIndexFieldMapping;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceSpaceConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceSpaceConfiguration Empty = new DataSourceConfluenceSpaceConfiguration();

    @InputImport(name="crawlArchivedSpaces")
    private final @Nullable Boolean crawlArchivedSpaces;

    public Optional<Boolean> getCrawlArchivedSpaces() {
        return this.crawlArchivedSpaces == null ? Optional.empty() : Optional.ofNullable(this.crawlArchivedSpaces);
    }

    @InputImport(name="crawlPersonalSpaces")
    private final @Nullable Boolean crawlPersonalSpaces;

    public Optional<Boolean> getCrawlPersonalSpaces() {
        return this.crawlPersonalSpaces == null ? Optional.empty() : Optional.ofNullable(this.crawlPersonalSpaces);
    }

    @InputImport(name="excludeSpaces")
    private final @Nullable List<String> excludeSpaces;

    public List<String> getExcludeSpaces() {
        return this.excludeSpaces == null ? List.of() : this.excludeSpaces;
    }

    @InputImport(name="includeSpaces")
    private final @Nullable List<String> includeSpaces;

    public List<String> getIncludeSpaces() {
        return this.includeSpaces == null ? List.of() : this.includeSpaces;
    }

    @InputImport(name="spaceFieldMappings")
    private final @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings;

    public List<DataSourceConfluenceSpaceToIndexFieldMapping> getSpaceFieldMappings() {
        return this.spaceFieldMappings == null ? List.of() : this.spaceFieldMappings;
    }

    public DataSourceConfluenceSpaceConfiguration(
        @Nullable Boolean crawlArchivedSpaces,
        @Nullable Boolean crawlPersonalSpaces,
        @Nullable List<String> excludeSpaces,
        @Nullable List<String> includeSpaces,
        @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
        this.crawlArchivedSpaces = crawlArchivedSpaces;
        this.crawlPersonalSpaces = crawlPersonalSpaces;
        this.excludeSpaces = excludeSpaces;
        this.includeSpaces = includeSpaces;
        this.spaceFieldMappings = spaceFieldMappings;
    }

    private DataSourceConfluenceSpaceConfiguration() {
        this.crawlArchivedSpaces = null;
        this.crawlPersonalSpaces = null;
        this.excludeSpaces = List.of();
        this.includeSpaces = List.of();
        this.spaceFieldMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceSpaceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean crawlArchivedSpaces;
        private @Nullable Boolean crawlPersonalSpaces;
        private @Nullable List<String> excludeSpaces;
        private @Nullable List<String> includeSpaces;
        private @Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceSpaceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlArchivedSpaces = defaults.crawlArchivedSpaces;
    	      this.crawlPersonalSpaces = defaults.crawlPersonalSpaces;
    	      this.excludeSpaces = defaults.excludeSpaces;
    	      this.includeSpaces = defaults.includeSpaces;
    	      this.spaceFieldMappings = defaults.spaceFieldMappings;
        }

        public Builder setCrawlArchivedSpaces(@Nullable Boolean crawlArchivedSpaces) {
            this.crawlArchivedSpaces = crawlArchivedSpaces;
            return this;
        }

        public Builder setCrawlPersonalSpaces(@Nullable Boolean crawlPersonalSpaces) {
            this.crawlPersonalSpaces = crawlPersonalSpaces;
            return this;
        }

        public Builder setExcludeSpaces(@Nullable List<String> excludeSpaces) {
            this.excludeSpaces = excludeSpaces;
            return this;
        }

        public Builder setIncludeSpaces(@Nullable List<String> includeSpaces) {
            this.includeSpaces = includeSpaces;
            return this;
        }

        public Builder setSpaceFieldMappings(@Nullable List<DataSourceConfluenceSpaceToIndexFieldMapping> spaceFieldMappings) {
            this.spaceFieldMappings = spaceFieldMappings;
            return this;
        }

        public DataSourceConfluenceSpaceConfiguration build() {
            return new DataSourceConfluenceSpaceConfiguration(crawlArchivedSpaces, crawlPersonalSpaces, excludeSpaces, includeSpaces, spaceFieldMappings);
        }
    }
}
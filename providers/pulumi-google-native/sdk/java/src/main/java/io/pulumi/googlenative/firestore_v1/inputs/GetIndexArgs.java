// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIndexArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIndexArgs Empty = new GetIndexArgs();

    @InputImport(name="collectionGroupId", required=true)
    private final String collectionGroupId;

    public String getCollectionGroupId() {
        return this.collectionGroupId;
    }

    @InputImport(name="databaseId", required=true)
    private final String databaseId;

    public String getDatabaseId() {
        return this.databaseId;
    }

    @InputImport(name="indexId", required=true)
    private final String indexId;

    public String getIndexId() {
        return this.indexId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetIndexArgs(
        String collectionGroupId,
        String databaseId,
        String indexId,
        @Nullable String project) {
        this.collectionGroupId = Objects.requireNonNull(collectionGroupId, "expected parameter 'collectionGroupId' to be non-null");
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.indexId = Objects.requireNonNull(indexId, "expected parameter 'indexId' to be non-null");
        this.project = project;
    }

    private GetIndexArgs() {
        this.collectionGroupId = null;
        this.databaseId = null;
        this.indexId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collectionGroupId;
        private String databaseId;
        private String indexId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionGroupId = defaults.collectionGroupId;
    	      this.databaseId = defaults.databaseId;
    	      this.indexId = defaults.indexId;
    	      this.project = defaults.project;
        }

        public Builder setCollectionGroupId(String collectionGroupId) {
            this.collectionGroupId = Objects.requireNonNull(collectionGroupId);
            return this;
        }

        public Builder setDatabaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }

        public Builder setIndexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetIndexArgs build() {
            return new GetIndexArgs(collectionGroupId, databaseId, indexId, project);
        }
    }
}
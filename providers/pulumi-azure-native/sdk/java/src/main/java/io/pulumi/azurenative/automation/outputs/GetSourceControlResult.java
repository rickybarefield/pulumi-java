// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSourceControlResult {
    private final @Nullable Boolean autoSync;
    private final @Nullable String branch;
    private final @Nullable String creationTime;
    private final @Nullable String description;
    private final @Nullable String folderPath;
    private final String id;
    private final @Nullable String lastModifiedTime;
    private final String name;
    private final @Nullable Boolean publishRunbook;
    private final @Nullable String repoUrl;
    private final @Nullable String sourceType;
    private final String type;

    @OutputCustomType.Constructor({"autoSync","branch","creationTime","description","folderPath","id","lastModifiedTime","name","publishRunbook","repoUrl","sourceType","type"})
    private GetSourceControlResult(
        @Nullable Boolean autoSync,
        @Nullable String branch,
        @Nullable String creationTime,
        @Nullable String description,
        @Nullable String folderPath,
        String id,
        @Nullable String lastModifiedTime,
        String name,
        @Nullable Boolean publishRunbook,
        @Nullable String repoUrl,
        @Nullable String sourceType,
        String type) {
        this.autoSync = autoSync;
        this.branch = branch;
        this.creationTime = creationTime;
        this.description = description;
        this.folderPath = folderPath;
        this.id = Objects.requireNonNull(id);
        this.lastModifiedTime = lastModifiedTime;
        this.name = Objects.requireNonNull(name);
        this.publishRunbook = publishRunbook;
        this.repoUrl = repoUrl;
        this.sourceType = sourceType;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Boolean> getAutoSync() {
        return Optional.ofNullable(this.autoSync);
    }
    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    public Optional<String> getCreationTime() {
        return Optional.ofNullable(this.creationTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getPublishRunbook() {
        return Optional.ofNullable(this.publishRunbook);
    }
    public Optional<String> getRepoUrl() {
        return Optional.ofNullable(this.repoUrl);
    }
    public Optional<String> getSourceType() {
        return Optional.ofNullable(this.sourceType);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSourceControlResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoSync;
        private @Nullable String branch;
        private @Nullable String creationTime;
        private @Nullable String description;
        private @Nullable String folderPath;
        private String id;
        private @Nullable String lastModifiedTime;
        private String name;
        private @Nullable Boolean publishRunbook;
        private @Nullable String repoUrl;
        private @Nullable String sourceType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSourceControlResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoSync = defaults.autoSync;
    	      this.branch = defaults.branch;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.name = defaults.name;
    	      this.publishRunbook = defaults.publishRunbook;
    	      this.repoUrl = defaults.repoUrl;
    	      this.sourceType = defaults.sourceType;
    	      this.type = defaults.type;
        }

        public Builder setAutoSync(@Nullable Boolean autoSync) {
            this.autoSync = autoSync;
            return this;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setCreationTime(@Nullable String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublishRunbook(@Nullable Boolean publishRunbook) {
            this.publishRunbook = publishRunbook;
            return this;
        }

        public Builder setRepoUrl(@Nullable String repoUrl) {
            this.repoUrl = repoUrl;
            return this;
        }

        public Builder setSourceType(@Nullable String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetSourceControlResult build() {
            return new GetSourceControlResult(autoSync, branch, creationTime, description, folderPath, id, lastModifiedTime, name, publishRunbook, repoUrl, sourceType, type);
        }
    }
}
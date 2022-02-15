// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureBlobFSLocationResponse {
    private final @Nullable Object fileName;
    private final @Nullable Object fileSystem;
    private final @Nullable Object folderPath;
    private final String type;

    @OutputCustomType.Constructor({"fileName","fileSystem","folderPath","type"})
    private AzureBlobFSLocationResponse(
        @Nullable Object fileName,
        @Nullable Object fileSystem,
        @Nullable Object folderPath,
        String type) {
        this.fileName = fileName;
        this.fileSystem = fileSystem;
        this.folderPath = folderPath;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    public Optional<Object> getFileSystem() {
        return Optional.ofNullable(this.fileSystem);
    }
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobFSLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object fileName;
        private @Nullable Object fileSystem;
        private @Nullable Object folderPath;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobFSLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileName = defaults.fileName;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.type = defaults.type;
        }

        public Builder setFileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setFileSystem(@Nullable Object fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }

        public Builder setFolderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureBlobFSLocationResponse build() {
            return new AzureBlobFSLocationResponse(fileName, fileSystem, folderPath, type);
        }
    }
}
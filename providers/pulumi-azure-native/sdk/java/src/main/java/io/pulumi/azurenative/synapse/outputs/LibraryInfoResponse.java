// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LibraryInfoResponse {
    private final @Nullable String containerName;
    private final String creatorId;
    private final @Nullable String name;
    private final @Nullable String path;
    private final String provisioningStatus;
    private final @Nullable String type;
    private final String uploadedTimestamp;

    @OutputCustomType.Constructor({"containerName","creatorId","name","path","provisioningStatus","type","uploadedTimestamp"})
    private LibraryInfoResponse(
        @Nullable String containerName,
        String creatorId,
        @Nullable String name,
        @Nullable String path,
        String provisioningStatus,
        @Nullable String type,
        String uploadedTimestamp) {
        this.containerName = containerName;
        this.creatorId = Objects.requireNonNull(creatorId);
        this.name = name;
        this.path = path;
        this.provisioningStatus = Objects.requireNonNull(provisioningStatus);
        this.type = type;
        this.uploadedTimestamp = Objects.requireNonNull(uploadedTimestamp);
    }

    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public String getCreatorId() {
        return this.creatorId;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public String getUploadedTimestamp() {
        return this.uploadedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private String creatorId;
        private @Nullable String name;
        private @Nullable String path;
        private String provisioningStatus;
        private @Nullable String type;
        private String uploadedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.creatorId = defaults.creatorId;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.provisioningStatus = defaults.provisioningStatus;
    	      this.type = defaults.type;
    	      this.uploadedTimestamp = defaults.uploadedTimestamp;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setCreatorId(String creatorId) {
            this.creatorId = Objects.requireNonNull(creatorId);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setProvisioningStatus(String provisioningStatus) {
            this.provisioningStatus = Objects.requireNonNull(provisioningStatus);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUploadedTimestamp(String uploadedTimestamp) {
            this.uploadedTimestamp = Objects.requireNonNull(uploadedTimestamp);
            return this;
        }

        public LibraryInfoResponse build() {
            return new LibraryInfoResponse(containerName, creatorId, name, path, provisioningStatus, type, uploadedTimestamp);
        }
    }
}
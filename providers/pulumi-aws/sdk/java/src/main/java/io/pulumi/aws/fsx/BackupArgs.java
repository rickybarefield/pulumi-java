// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    /**
     * The ID of the file system to back up. Required if backing up Lustre or Windows file systems.
     * 
     */
    @InputImport(name="fileSystemId")
    private final @Nullable Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId == null ? Input.empty() : this.fileSystemId;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the volume to back up. Required if backing up a ONTAP Volume.
     * 
     */
    @InputImport(name="volumeId")
    private final @Nullable Input<String> volumeId;

    public Input<String> getVolumeId() {
        return this.volumeId == null ? Input.empty() : this.volumeId;
    }

    public BackupArgs(
        @Nullable Input<String> fileSystemId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> volumeId) {
        this.fileSystemId = fileSystemId;
        this.tags = tags;
        this.volumeId = volumeId;
    }

    private BackupArgs() {
        this.fileSystemId = Input.empty();
        this.tags = Input.empty();
        this.volumeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fileSystemId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.tags = defaults.tags;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder setFileSystemId(@Nullable Input<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder setFileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Input.ofNullable(fileSystemId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVolumeId(@Nullable Input<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        public Builder setVolumeId(@Nullable String volumeId) {
            this.volumeId = Input.ofNullable(volumeId);
            return this;
        }
        public BackupArgs build() {
            return new BackupArgs(fileSystemId, tags, volumeId);
        }
    }
}
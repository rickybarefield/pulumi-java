// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDiskVolumeSourceArgs Empty = new AzureDiskVolumeSourceArgs();

    @InputImport(name="cachingMode")
    private final @Nullable Input<String> cachingMode;

    public Input<String> getCachingMode() {
        return this.cachingMode == null ? Input.empty() : this.cachingMode;
    }

    @InputImport(name="diskName", required=true)
    private final Input<String> diskName;

    public Input<String> getDiskName() {
        return this.diskName;
    }

    @InputImport(name="diskURI", required=true)
    private final Input<String> diskURI;

    public Input<String> getDiskURI() {
        return this.diskURI;
    }

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="readOnly")
    private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    public AzureDiskVolumeSourceArgs(
        @Nullable Input<String> cachingMode,
        Input<String> diskName,
        Input<String> diskURI,
        @Nullable Input<String> fsType,
        @Nullable Input<String> kind,
        @Nullable Input<Boolean> readOnly) {
        this.cachingMode = cachingMode;
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskURI = Objects.requireNonNull(diskURI, "expected parameter 'diskURI' to be non-null");
        this.fsType = fsType;
        this.kind = kind;
        this.readOnly = readOnly;
    }

    private AzureDiskVolumeSourceArgs() {
        this.cachingMode = Input.empty();
        this.diskName = Input.empty();
        this.diskURI = Input.empty();
        this.fsType = Input.empty();
        this.kind = Input.empty();
        this.readOnly = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cachingMode;
        private Input<String> diskName;
        private Input<String> diskURI;
        private @Nullable Input<String> fsType;
        private @Nullable Input<String> kind;
        private @Nullable Input<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachingMode = defaults.cachingMode;
    	      this.diskName = defaults.diskName;
    	      this.diskURI = defaults.diskURI;
    	      this.fsType = defaults.fsType;
    	      this.kind = defaults.kind;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder setCachingMode(@Nullable Input<String> cachingMode) {
            this.cachingMode = cachingMode;
            return this;
        }

        public Builder setCachingMode(@Nullable String cachingMode) {
            this.cachingMode = Input.ofNullable(cachingMode);
            return this;
        }

        public Builder setDiskName(Input<String> diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Input.of(Objects.requireNonNull(diskName));
            return this;
        }

        public Builder setDiskURI(Input<String> diskURI) {
            this.diskURI = Objects.requireNonNull(diskURI);
            return this;
        }

        public Builder setDiskURI(String diskURI) {
            this.diskURI = Input.of(Objects.requireNonNull(diskURI));
            return this;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public AzureDiskVolumeSourceArgs build() {
            return new AzureDiskVolumeSourceArgs(cachingMode, diskName, diskURI, fsType, kind, readOnly);
        }
    }
}
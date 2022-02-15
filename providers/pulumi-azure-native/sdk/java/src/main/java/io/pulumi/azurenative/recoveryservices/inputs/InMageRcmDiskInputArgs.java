// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.DiskAccountType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InMageRcmDiskInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final InMageRcmDiskInputArgs Empty = new InMageRcmDiskInputArgs();

    @InputImport(name="diskEncryptionSetId")
    private final @Nullable Input<String> diskEncryptionSetId;

    public Input<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Input.empty() : this.diskEncryptionSetId;
    }

    @InputImport(name="diskId")
    private final @Nullable Input<String> diskId;

    public Input<String> getDiskId() {
        return this.diskId == null ? Input.empty() : this.diskId;
    }

    @InputImport(name="diskType")
    private final @Nullable Input<Either<String,DiskAccountType>> diskType;

    public Input<Either<String,DiskAccountType>> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    @InputImport(name="logStorageAccountId")
    private final @Nullable Input<String> logStorageAccountId;

    public Input<String> getLogStorageAccountId() {
        return this.logStorageAccountId == null ? Input.empty() : this.logStorageAccountId;
    }

    public InMageRcmDiskInputArgs(
        @Nullable Input<String> diskEncryptionSetId,
        @Nullable Input<String> diskId,
        @Nullable Input<Either<String,DiskAccountType>> diskType,
        @Nullable Input<String> logStorageAccountId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.diskId = diskId;
        this.diskType = diskType;
        this.logStorageAccountId = logStorageAccountId;
    }

    private InMageRcmDiskInputArgs() {
        this.diskEncryptionSetId = Input.empty();
        this.diskId = Input.empty();
        this.diskType = Input.empty();
        this.logStorageAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmDiskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskEncryptionSetId;
        private @Nullable Input<String> diskId;
        private @Nullable Input<Either<String,DiskAccountType>> diskType;
        private @Nullable Input<String> logStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmDiskInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.diskId = defaults.diskId;
    	      this.diskType = defaults.diskType;
    	      this.logStorageAccountId = defaults.logStorageAccountId;
        }

        public Builder setDiskEncryptionSetId(@Nullable Input<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Input.ofNullable(diskEncryptionSetId);
            return this;
        }

        public Builder setDiskId(@Nullable Input<String> diskId) {
            this.diskId = diskId;
            return this;
        }

        public Builder setDiskId(@Nullable String diskId) {
            this.diskId = Input.ofNullable(diskId);
            return this;
        }

        public Builder setDiskType(@Nullable Input<Either<String,DiskAccountType>> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable Either<String,DiskAccountType> diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable Input<String> logStorageAccountId) {
            this.logStorageAccountId = logStorageAccountId;
            return this;
        }

        public Builder setLogStorageAccountId(@Nullable String logStorageAccountId) {
            this.logStorageAccountId = Input.ofNullable(logStorageAccountId);
            return this;
        }

        public InMageRcmDiskInputArgs build() {
            return new InMageRcmDiskInputArgs(diskEncryptionSetId, diskId, diskType, logStorageAccountId);
        }
    }
}
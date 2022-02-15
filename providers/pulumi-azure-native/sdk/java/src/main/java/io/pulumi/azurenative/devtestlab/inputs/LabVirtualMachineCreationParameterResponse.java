// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactInstallPropertiesResponse;
import io.pulumi.azurenative.devtestlab.inputs.BulkCreationParametersResponse;
import io.pulumi.azurenative.devtestlab.inputs.DataDiskPropertiesResponse;
import io.pulumi.azurenative.devtestlab.inputs.GalleryImageReferenceResponse;
import io.pulumi.azurenative.devtestlab.inputs.NetworkInterfacePropertiesResponse;
import io.pulumi.azurenative.devtestlab.inputs.ScheduleCreationParameterResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabVirtualMachineCreationParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabVirtualMachineCreationParameterResponse Empty = new LabVirtualMachineCreationParameterResponse();

    @InputImport(name="allowClaim")
    private final @Nullable Boolean allowClaim;

    public Optional<Boolean> getAllowClaim() {
        return this.allowClaim == null ? Optional.empty() : Optional.ofNullable(this.allowClaim);
    }

    @InputImport(name="artifacts")
    private final @Nullable List<ArtifactInstallPropertiesResponse> artifacts;

    public List<ArtifactInstallPropertiesResponse> getArtifacts() {
        return this.artifacts == null ? List.of() : this.artifacts;
    }

    @InputImport(name="bulkCreationParameters")
    private final @Nullable BulkCreationParametersResponse bulkCreationParameters;

    public Optional<BulkCreationParametersResponse> getBulkCreationParameters() {
        return this.bulkCreationParameters == null ? Optional.empty() : Optional.ofNullable(this.bulkCreationParameters);
    }

    @InputImport(name="createdDate")
    private final @Nullable String createdDate;

    public Optional<String> getCreatedDate() {
        return this.createdDate == null ? Optional.empty() : Optional.ofNullable(this.createdDate);
    }

    @InputImport(name="customImageId")
    private final @Nullable String customImageId;

    public Optional<String> getCustomImageId() {
        return this.customImageId == null ? Optional.empty() : Optional.ofNullable(this.customImageId);
    }

    @InputImport(name="dataDiskParameters")
    private final @Nullable List<DataDiskPropertiesResponse> dataDiskParameters;

    public List<DataDiskPropertiesResponse> getDataDiskParameters() {
        return this.dataDiskParameters == null ? List.of() : this.dataDiskParameters;
    }

    @InputImport(name="disallowPublicIpAddress")
    private final @Nullable Boolean disallowPublicIpAddress;

    public Optional<Boolean> getDisallowPublicIpAddress() {
        return this.disallowPublicIpAddress == null ? Optional.empty() : Optional.ofNullable(this.disallowPublicIpAddress);
    }

    @InputImport(name="environmentId")
    private final @Nullable String environmentId;

    public Optional<String> getEnvironmentId() {
        return this.environmentId == null ? Optional.empty() : Optional.ofNullable(this.environmentId);
    }

    @InputImport(name="expirationDate")
    private final @Nullable String expirationDate;

    public Optional<String> getExpirationDate() {
        return this.expirationDate == null ? Optional.empty() : Optional.ofNullable(this.expirationDate);
    }

    @InputImport(name="galleryImageReference")
    private final @Nullable GalleryImageReferenceResponse galleryImageReference;

    public Optional<GalleryImageReferenceResponse> getGalleryImageReference() {
        return this.galleryImageReference == null ? Optional.empty() : Optional.ofNullable(this.galleryImageReference);
    }

    @InputImport(name="isAuthenticationWithSshKey")
    private final @Nullable Boolean isAuthenticationWithSshKey;

    public Optional<Boolean> getIsAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey == null ? Optional.empty() : Optional.ofNullable(this.isAuthenticationWithSshKey);
    }

    @InputImport(name="labSubnetName")
    private final @Nullable String labSubnetName;

    public Optional<String> getLabSubnetName() {
        return this.labSubnetName == null ? Optional.empty() : Optional.ofNullable(this.labSubnetName);
    }

    @InputImport(name="labVirtualNetworkId")
    private final @Nullable String labVirtualNetworkId;

    public Optional<String> getLabVirtualNetworkId() {
        return this.labVirtualNetworkId == null ? Optional.empty() : Optional.ofNullable(this.labVirtualNetworkId);
    }

    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="networkInterface")
    private final @Nullable NetworkInterfacePropertiesResponse networkInterface;

    public Optional<NetworkInterfacePropertiesResponse> getNetworkInterface() {
        return this.networkInterface == null ? Optional.empty() : Optional.ofNullable(this.networkInterface);
    }

    @InputImport(name="notes")
    private final @Nullable String notes;

    public Optional<String> getNotes() {
        return this.notes == null ? Optional.empty() : Optional.ofNullable(this.notes);
    }

    @InputImport(name="ownerObjectId")
    private final @Nullable String ownerObjectId;

    public Optional<String> getOwnerObjectId() {
        return this.ownerObjectId == null ? Optional.empty() : Optional.ofNullable(this.ownerObjectId);
    }

    @InputImport(name="ownerUserPrincipalName")
    private final @Nullable String ownerUserPrincipalName;

    public Optional<String> getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName == null ? Optional.empty() : Optional.ofNullable(this.ownerUserPrincipalName);
    }

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="planId")
    private final @Nullable String planId;

    public Optional<String> getPlanId() {
        return this.planId == null ? Optional.empty() : Optional.ofNullable(this.planId);
    }

    @InputImport(name="scheduleParameters")
    private final @Nullable List<ScheduleCreationParameterResponse> scheduleParameters;

    public List<ScheduleCreationParameterResponse> getScheduleParameters() {
        return this.scheduleParameters == null ? List.of() : this.scheduleParameters;
    }

    @InputImport(name="size")
    private final @Nullable String size;

    public Optional<String> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    @InputImport(name="sshKey")
    private final @Nullable String sshKey;

    public Optional<String> getSshKey() {
        return this.sshKey == null ? Optional.empty() : Optional.ofNullable(this.sshKey);
    }

    @InputImport(name="storageType")
    private final @Nullable String storageType;

    public Optional<String> getStorageType() {
        return this.storageType == null ? Optional.empty() : Optional.ofNullable(this.storageType);
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    @InputImport(name="userName")
    private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public LabVirtualMachineCreationParameterResponse(
        @Nullable Boolean allowClaim,
        @Nullable List<ArtifactInstallPropertiesResponse> artifacts,
        @Nullable BulkCreationParametersResponse bulkCreationParameters,
        @Nullable String createdDate,
        @Nullable String customImageId,
        @Nullable List<DataDiskPropertiesResponse> dataDiskParameters,
        @Nullable Boolean disallowPublicIpAddress,
        @Nullable String environmentId,
        @Nullable String expirationDate,
        @Nullable GalleryImageReferenceResponse galleryImageReference,
        @Nullable Boolean isAuthenticationWithSshKey,
        @Nullable String labSubnetName,
        @Nullable String labVirtualNetworkId,
        @Nullable String location,
        @Nullable String name,
        @Nullable NetworkInterfacePropertiesResponse networkInterface,
        @Nullable String notes,
        @Nullable String ownerObjectId,
        @Nullable String ownerUserPrincipalName,
        @Nullable String password,
        @Nullable String planId,
        @Nullable List<ScheduleCreationParameterResponse> scheduleParameters,
        @Nullable String size,
        @Nullable String sshKey,
        @Nullable String storageType,
        @Nullable Map<String,String> tags,
        @Nullable String userName) {
        this.allowClaim = allowClaim == null ? false : allowClaim;
        this.artifacts = artifacts;
        this.bulkCreationParameters = bulkCreationParameters;
        this.createdDate = createdDate;
        this.customImageId = customImageId;
        this.dataDiskParameters = dataDiskParameters;
        this.disallowPublicIpAddress = disallowPublicIpAddress == null ? false : disallowPublicIpAddress;
        this.environmentId = environmentId;
        this.expirationDate = expirationDate;
        this.galleryImageReference = galleryImageReference;
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        this.labSubnetName = labSubnetName;
        this.labVirtualNetworkId = labVirtualNetworkId;
        this.location = location;
        this.name = name;
        this.networkInterface = networkInterface;
        this.notes = notes;
        this.ownerObjectId = ownerObjectId == null ? "dynamicValue" : ownerObjectId;
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        this.password = password;
        this.planId = planId;
        this.scheduleParameters = scheduleParameters;
        this.size = size;
        this.sshKey = sshKey;
        this.storageType = storageType == null ? "labStorageType" : storageType;
        this.tags = tags;
        this.userName = userName;
    }

    private LabVirtualMachineCreationParameterResponse() {
        this.allowClaim = null;
        this.artifacts = List.of();
        this.bulkCreationParameters = null;
        this.createdDate = null;
        this.customImageId = null;
        this.dataDiskParameters = List.of();
        this.disallowPublicIpAddress = null;
        this.environmentId = null;
        this.expirationDate = null;
        this.galleryImageReference = null;
        this.isAuthenticationWithSshKey = null;
        this.labSubnetName = null;
        this.labVirtualNetworkId = null;
        this.location = null;
        this.name = null;
        this.networkInterface = null;
        this.notes = null;
        this.ownerObjectId = null;
        this.ownerUserPrincipalName = null;
        this.password = null;
        this.planId = null;
        this.scheduleParameters = List.of();
        this.size = null;
        this.sshKey = null;
        this.storageType = null;
        this.tags = Map.of();
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabVirtualMachineCreationParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowClaim;
        private @Nullable List<ArtifactInstallPropertiesResponse> artifacts;
        private @Nullable BulkCreationParametersResponse bulkCreationParameters;
        private @Nullable String createdDate;
        private @Nullable String customImageId;
        private @Nullable List<DataDiskPropertiesResponse> dataDiskParameters;
        private @Nullable Boolean disallowPublicIpAddress;
        private @Nullable String environmentId;
        private @Nullable String expirationDate;
        private @Nullable GalleryImageReferenceResponse galleryImageReference;
        private @Nullable Boolean isAuthenticationWithSshKey;
        private @Nullable String labSubnetName;
        private @Nullable String labVirtualNetworkId;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable NetworkInterfacePropertiesResponse networkInterface;
        private @Nullable String notes;
        private @Nullable String ownerObjectId;
        private @Nullable String ownerUserPrincipalName;
        private @Nullable String password;
        private @Nullable String planId;
        private @Nullable List<ScheduleCreationParameterResponse> scheduleParameters;
        private @Nullable String size;
        private @Nullable String sshKey;
        private @Nullable String storageType;
        private @Nullable Map<String,String> tags;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabVirtualMachineCreationParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClaim = defaults.allowClaim;
    	      this.artifacts = defaults.artifacts;
    	      this.bulkCreationParameters = defaults.bulkCreationParameters;
    	      this.createdDate = defaults.createdDate;
    	      this.customImageId = defaults.customImageId;
    	      this.dataDiskParameters = defaults.dataDiskParameters;
    	      this.disallowPublicIpAddress = defaults.disallowPublicIpAddress;
    	      this.environmentId = defaults.environmentId;
    	      this.expirationDate = defaults.expirationDate;
    	      this.galleryImageReference = defaults.galleryImageReference;
    	      this.isAuthenticationWithSshKey = defaults.isAuthenticationWithSshKey;
    	      this.labSubnetName = defaults.labSubnetName;
    	      this.labVirtualNetworkId = defaults.labVirtualNetworkId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.notes = defaults.notes;
    	      this.ownerObjectId = defaults.ownerObjectId;
    	      this.ownerUserPrincipalName = defaults.ownerUserPrincipalName;
    	      this.password = defaults.password;
    	      this.planId = defaults.planId;
    	      this.scheduleParameters = defaults.scheduleParameters;
    	      this.size = defaults.size;
    	      this.sshKey = defaults.sshKey;
    	      this.storageType = defaults.storageType;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
        }

        public Builder setAllowClaim(@Nullable Boolean allowClaim) {
            this.allowClaim = allowClaim;
            return this;
        }

        public Builder setArtifacts(@Nullable List<ArtifactInstallPropertiesResponse> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder setBulkCreationParameters(@Nullable BulkCreationParametersResponse bulkCreationParameters) {
            this.bulkCreationParameters = bulkCreationParameters;
            return this;
        }

        public Builder setCreatedDate(@Nullable String createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder setCustomImageId(@Nullable String customImageId) {
            this.customImageId = customImageId;
            return this;
        }

        public Builder setDataDiskParameters(@Nullable List<DataDiskPropertiesResponse> dataDiskParameters) {
            this.dataDiskParameters = dataDiskParameters;
            return this;
        }

        public Builder setDisallowPublicIpAddress(@Nullable Boolean disallowPublicIpAddress) {
            this.disallowPublicIpAddress = disallowPublicIpAddress;
            return this;
        }

        public Builder setEnvironmentId(@Nullable String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setGalleryImageReference(@Nullable GalleryImageReferenceResponse galleryImageReference) {
            this.galleryImageReference = galleryImageReference;
            return this;
        }

        public Builder setIsAuthenticationWithSshKey(@Nullable Boolean isAuthenticationWithSshKey) {
            this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
            return this;
        }

        public Builder setLabSubnetName(@Nullable String labSubnetName) {
            this.labSubnetName = labSubnetName;
            return this;
        }

        public Builder setLabVirtualNetworkId(@Nullable String labVirtualNetworkId) {
            this.labVirtualNetworkId = labVirtualNetworkId;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkInterface(@Nullable NetworkInterfacePropertiesResponse networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = notes;
            return this;
        }

        public Builder setOwnerObjectId(@Nullable String ownerObjectId) {
            this.ownerObjectId = ownerObjectId;
            return this;
        }

        public Builder setOwnerUserPrincipalName(@Nullable String ownerUserPrincipalName) {
            this.ownerUserPrincipalName = ownerUserPrincipalName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPlanId(@Nullable String planId) {
            this.planId = planId;
            return this;
        }

        public Builder setScheduleParameters(@Nullable List<ScheduleCreationParameterResponse> scheduleParameters) {
            this.scheduleParameters = scheduleParameters;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setSshKey(@Nullable String sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder setStorageType(@Nullable String storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        public LabVirtualMachineCreationParameterResponse build() {
            return new LabVirtualMachineCreationParameterResponse(allowClaim, artifacts, bulkCreationParameters, createdDate, customImageId, dataDiskParameters, disallowPublicIpAddress, environmentId, expirationDate, galleryImageReference, isAuthenticationWithSshKey, labSubnetName, labVirtualNetworkId, location, name, networkInterface, notes, ownerObjectId, ownerUserPrincipalName, password, planId, scheduleParameters, size, sshKey, storageType, tags, userName);
        }
    }
}
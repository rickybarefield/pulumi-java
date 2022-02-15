// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetRegionDiskResult {
    private final String architecture;
    private final String creationTimestamp;
    private final String description;
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    private final Boolean eraseWindowsVssSignature;
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    private final String kind;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String lastAttachTimestamp;
    private final String lastDetachTimestamp;
    private final List<String> licenseCodes;
    private final List<String> licenses;
    private final String locationHint;
    private final Boolean locked;
    private final Boolean multiWriter;
    private final String name;
    private final String options;
    private final String physicalBlockSizeBytes;
    private final String provisionedIops;
    private final String region;
    private final List<String> replicaZones;
    private final List<String> resourcePolicies;
    private final Boolean satisfiesPzs;
    private final String selfLink;
    private final String selfLinkWithId;
    private final String sizeGb;
    private final String sourceDisk;
    private final String sourceDiskId;
    private final String sourceImage;
    private final CustomerEncryptionKeyResponse sourceImageEncryptionKey;
    private final String sourceImageId;
    private final String sourceInstantSnapshot;
    private final String sourceInstantSnapshotId;
    private final String sourceSnapshot;
    private final CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
    private final String sourceSnapshotId;
    private final String sourceStorageObject;
    private final String status;
    private final String type;
    private final List<String> userLicenses;
    private final List<String> users;
    private final String zone;

    @OutputCustomType.Constructor({"architecture","creationTimestamp","description","diskEncryptionKey","eraseWindowsVssSignature","guestOsFeatures","kind","labelFingerprint","labels","lastAttachTimestamp","lastDetachTimestamp","licenseCodes","licenses","locationHint","locked","multiWriter","name","options","physicalBlockSizeBytes","provisionedIops","region","replicaZones","resourcePolicies","satisfiesPzs","selfLink","selfLinkWithId","sizeGb","sourceDisk","sourceDiskId","sourceImage","sourceImageEncryptionKey","sourceImageId","sourceInstantSnapshot","sourceInstantSnapshotId","sourceSnapshot","sourceSnapshotEncryptionKey","sourceSnapshotId","sourceStorageObject","status","type","userLicenses","users","zone"})
    private GetRegionDiskResult(
        String architecture,
        String creationTimestamp,
        String description,
        CustomerEncryptionKeyResponse diskEncryptionKey,
        Boolean eraseWindowsVssSignature,
        List<GuestOsFeatureResponse> guestOsFeatures,
        String kind,
        String labelFingerprint,
        Map<String,String> labels,
        String lastAttachTimestamp,
        String lastDetachTimestamp,
        List<String> licenseCodes,
        List<String> licenses,
        String locationHint,
        Boolean locked,
        Boolean multiWriter,
        String name,
        String options,
        String physicalBlockSizeBytes,
        String provisionedIops,
        String region,
        List<String> replicaZones,
        List<String> resourcePolicies,
        Boolean satisfiesPzs,
        String selfLink,
        String selfLinkWithId,
        String sizeGb,
        String sourceDisk,
        String sourceDiskId,
        String sourceImage,
        CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        String sourceImageId,
        String sourceInstantSnapshot,
        String sourceInstantSnapshotId,
        String sourceSnapshot,
        CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey,
        String sourceSnapshotId,
        String sourceStorageObject,
        String status,
        String type,
        List<String> userLicenses,
        List<String> users,
        String zone) {
        this.architecture = Objects.requireNonNull(architecture);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
        this.eraseWindowsVssSignature = Objects.requireNonNull(eraseWindowsVssSignature);
        this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
        this.kind = Objects.requireNonNull(kind);
        this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
        this.labels = Objects.requireNonNull(labels);
        this.lastAttachTimestamp = Objects.requireNonNull(lastAttachTimestamp);
        this.lastDetachTimestamp = Objects.requireNonNull(lastDetachTimestamp);
        this.licenseCodes = Objects.requireNonNull(licenseCodes);
        this.licenses = Objects.requireNonNull(licenses);
        this.locationHint = Objects.requireNonNull(locationHint);
        this.locked = Objects.requireNonNull(locked);
        this.multiWriter = Objects.requireNonNull(multiWriter);
        this.name = Objects.requireNonNull(name);
        this.options = Objects.requireNonNull(options);
        this.physicalBlockSizeBytes = Objects.requireNonNull(physicalBlockSizeBytes);
        this.provisionedIops = Objects.requireNonNull(provisionedIops);
        this.region = Objects.requireNonNull(region);
        this.replicaZones = Objects.requireNonNull(replicaZones);
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
        this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.sizeGb = Objects.requireNonNull(sizeGb);
        this.sourceDisk = Objects.requireNonNull(sourceDisk);
        this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
        this.sourceImage = Objects.requireNonNull(sourceImage);
        this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
        this.sourceImageId = Objects.requireNonNull(sourceImageId);
        this.sourceInstantSnapshot = Objects.requireNonNull(sourceInstantSnapshot);
        this.sourceInstantSnapshotId = Objects.requireNonNull(sourceInstantSnapshotId);
        this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
        this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
        this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
        this.sourceStorageObject = Objects.requireNonNull(sourceStorageObject);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
        this.userLicenses = Objects.requireNonNull(userLicenses);
        this.users = Objects.requireNonNull(users);
        this.zone = Objects.requireNonNull(zone);
    }

    public String getArchitecture() {
        return this.architecture;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    public Boolean getEraseWindowsVssSignature() {
        return this.eraseWindowsVssSignature;
    }
    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLastAttachTimestamp() {
        return this.lastAttachTimestamp;
    }
    public String getLastDetachTimestamp() {
        return this.lastDetachTimestamp;
    }
    public List<String> getLicenseCodes() {
        return this.licenseCodes;
    }
    public List<String> getLicenses() {
        return this.licenses;
    }
    public String getLocationHint() {
        return this.locationHint;
    }
    public Boolean getLocked() {
        return this.locked;
    }
    public Boolean getMultiWriter() {
        return this.multiWriter;
    }
    public String getName() {
        return this.name;
    }
    public String getOptions() {
        return this.options;
    }
    public String getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes;
    }
    public String getProvisionedIops() {
        return this.provisionedIops;
    }
    public String getRegion() {
        return this.region;
    }
    public List<String> getReplicaZones() {
        return this.replicaZones;
    }
    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    public String getSizeGb() {
        return this.sizeGb;
    }
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }
    public String getSourceImage() {
        return this.sourceImage;
    }
    public CustomerEncryptionKeyResponse getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    public String getSourceImageId() {
        return this.sourceImageId;
    }
    public String getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot;
    }
    public String getSourceInstantSnapshotId() {
        return this.sourceInstantSnapshotId;
    }
    public String getSourceSnapshot() {
        return this.sourceSnapshot;
    }
    public CustomerEncryptionKeyResponse getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    public String getSourceStorageObject() {
        return this.sourceStorageObject;
    }
    public String getStatus() {
        return this.status;
    }
    public String getType() {
        return this.type;
    }
    public List<String> getUserLicenses() {
        return this.userLicenses;
    }
    public List<String> getUsers() {
        return this.users;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionDiskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String creationTimestamp;
        private String description;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private Boolean eraseWindowsVssSignature;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String lastAttachTimestamp;
        private String lastDetachTimestamp;
        private List<String> licenseCodes;
        private List<String> licenses;
        private String locationHint;
        private Boolean locked;
        private Boolean multiWriter;
        private String name;
        private String options;
        private String physicalBlockSizeBytes;
        private String provisionedIops;
        private String region;
        private List<String> replicaZones;
        private List<String> resourcePolicies;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private String sizeGb;
        private String sourceDisk;
        private String sourceDiskId;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceImageId;
        private String sourceInstantSnapshot;
        private String sourceInstantSnapshotId;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
        private String sourceSnapshotId;
        private String sourceStorageObject;
        private String status;
        private String type;
        private List<String> userLicenses;
        private List<String> users;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.eraseWindowsVssSignature = defaults.eraseWindowsVssSignature;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.lastAttachTimestamp = defaults.lastAttachTimestamp;
    	      this.lastDetachTimestamp = defaults.lastDetachTimestamp;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locationHint = defaults.locationHint;
    	      this.locked = defaults.locked;
    	      this.multiWriter = defaults.multiWriter;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.sizeGb = defaults.sizeGb;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceInstantSnapshotId = defaults.sourceInstantSnapshotId;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.sourceStorageObject = defaults.sourceStorageObject;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
    	      this.userLicenses = defaults.userLicenses;
    	      this.users = defaults.users;
    	      this.zone = defaults.zone;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }

        public Builder setEraseWindowsVssSignature(Boolean eraseWindowsVssSignature) {
            this.eraseWindowsVssSignature = Objects.requireNonNull(eraseWindowsVssSignature);
            return this;
        }

        public Builder setGuestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLastAttachTimestamp(String lastAttachTimestamp) {
            this.lastAttachTimestamp = Objects.requireNonNull(lastAttachTimestamp);
            return this;
        }

        public Builder setLastDetachTimestamp(String lastDetachTimestamp) {
            this.lastDetachTimestamp = Objects.requireNonNull(lastDetachTimestamp);
            return this;
        }

        public Builder setLicenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }

        public Builder setLicenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder setLocationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }

        public Builder setLocked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder setMultiWriter(Boolean multiWriter) {
            this.multiWriter = Objects.requireNonNull(multiWriter);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(String options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(String physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Objects.requireNonNull(physicalBlockSizeBytes);
            return this;
        }

        public Builder setProvisionedIops(String provisionedIops) {
            this.provisionedIops = Objects.requireNonNull(provisionedIops);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setReplicaZones(List<String> replicaZones) {
            this.replicaZones = Objects.requireNonNull(replicaZones);
            return this;
        }

        public Builder setResourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder setSatisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setSizeGb(String sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setSourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder setSourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }

        public Builder setSourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }

        public Builder setSourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }

        public Builder setSourceImageId(String sourceImageId) {
            this.sourceImageId = Objects.requireNonNull(sourceImageId);
            return this;
        }

        public Builder setSourceInstantSnapshot(String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Objects.requireNonNull(sourceInstantSnapshot);
            return this;
        }

        public Builder setSourceInstantSnapshotId(String sourceInstantSnapshotId) {
            this.sourceInstantSnapshotId = Objects.requireNonNull(sourceInstantSnapshotId);
            return this;
        }

        public Builder setSourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder setSourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
            return this;
        }

        public Builder setSourceStorageObject(String sourceStorageObject) {
            this.sourceStorageObject = Objects.requireNonNull(sourceStorageObject);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserLicenses(List<String> userLicenses) {
            this.userLicenses = Objects.requireNonNull(userLicenses);
            return this;
        }

        public Builder setUsers(List<String> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetRegionDiskResult build() {
            return new GetRegionDiskResult(architecture, creationTimestamp, description, diskEncryptionKey, eraseWindowsVssSignature, guestOsFeatures, kind, labelFingerprint, labels, lastAttachTimestamp, lastDetachTimestamp, licenseCodes, licenses, locationHint, locked, multiWriter, name, options, physicalBlockSizeBytes, provisionedIops, region, replicaZones, resourcePolicies, satisfiesPzs, selfLink, selfLinkWithId, sizeGb, sourceDisk, sourceDiskId, sourceImage, sourceImageEncryptionKey, sourceImageId, sourceInstantSnapshot, sourceInstantSnapshotId, sourceSnapshot, sourceSnapshotEncryptionKey, sourceSnapshotId, sourceStorageObject, status, type, userLicenses, users, zone);
        }
    }
}
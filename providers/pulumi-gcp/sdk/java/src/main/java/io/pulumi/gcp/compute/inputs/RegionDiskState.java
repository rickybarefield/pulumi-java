// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionDiskDiskEncryptionKeyGetArgs;
import io.pulumi.gcp.compute.inputs.RegionDiskSourceSnapshotEncryptionKeyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskState extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskState Empty = new RegionDiskState();

    @InputImport(name="creationTimestamp")
    private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="diskEncryptionKey")
    private final @Nullable Input<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;

    public Input<RegionDiskDiskEncryptionKeyGetArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    @InputImport(name="interface")
    private final @Nullable Input<String> $interface;

    @Deprecated /* This field is no longer in use, disk interfaces will be automatically determined on attachment. To resolve this issue, remove this field from your config. */
    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    @InputImport(name="labelFingerprint")
    private final @Nullable Input<String> labelFingerprint;

    public Input<String> getLabelFingerprint() {
        return this.labelFingerprint == null ? Input.empty() : this.labelFingerprint;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="lastAttachTimestamp")
    private final @Nullable Input<String> lastAttachTimestamp;

    public Input<String> getLastAttachTimestamp() {
        return this.lastAttachTimestamp == null ? Input.empty() : this.lastAttachTimestamp;
    }

    @InputImport(name="lastDetachTimestamp")
    private final @Nullable Input<String> lastDetachTimestamp;

    public Input<String> getLastDetachTimestamp() {
        return this.lastDetachTimestamp == null ? Input.empty() : this.lastDetachTimestamp;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="physicalBlockSizeBytes")
    private final @Nullable Input<Integer> physicalBlockSizeBytes;

    public Input<Integer> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Input.empty() : this.physicalBlockSizeBytes;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    @InputImport(name="replicaZones")
    private final @Nullable Input<List<String>> replicaZones;

    public Input<List<String>> getReplicaZones() {
        return this.replicaZones == null ? Input.empty() : this.replicaZones;
    }

    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    @InputImport(name="size")
    private final @Nullable Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    @InputImport(name="snapshot")
    private final @Nullable Input<String> snapshot;

    public Input<String> getSnapshot() {
        return this.snapshot == null ? Input.empty() : this.snapshot;
    }

    @InputImport(name="sourceSnapshotEncryptionKey")
    private final @Nullable Input<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey;

    public Input<RegionDiskSourceSnapshotEncryptionKeyGetArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Input.empty() : this.sourceSnapshotEncryptionKey;
    }

    @InputImport(name="sourceSnapshotId")
    private final @Nullable Input<String> sourceSnapshotId;

    public Input<String> getSourceSnapshotId() {
        return this.sourceSnapshotId == null ? Input.empty() : this.sourceSnapshotId;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="users")
    private final @Nullable Input<List<String>> users;

    public Input<List<String>> getUsers() {
        return this.users == null ? Input.empty() : this.users;
    }

    public RegionDiskState(
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey,
        @Nullable Input<String> $interface,
        @Nullable Input<String> labelFingerprint,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> lastAttachTimestamp,
        @Nullable Input<String> lastDetachTimestamp,
        @Nullable Input<String> name,
        @Nullable Input<Integer> physicalBlockSizeBytes,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<List<String>> replicaZones,
        @Nullable Input<String> selfLink,
        @Nullable Input<Integer> size,
        @Nullable Input<String> snapshot,
        @Nullable Input<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey,
        @Nullable Input<String> sourceSnapshotId,
        @Nullable Input<String> type,
        @Nullable Input<List<String>> users) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.$interface = $interface;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.lastAttachTimestamp = lastAttachTimestamp;
        this.lastDetachTimestamp = lastDetachTimestamp;
        this.name = name;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.region = region;
        this.replicaZones = replicaZones;
        this.selfLink = selfLink;
        this.size = size;
        this.snapshot = snapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceSnapshotId = sourceSnapshotId;
        this.type = type;
        this.users = users;
    }

    private RegionDiskState() {
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.diskEncryptionKey = Input.empty();
        this.$interface = Input.empty();
        this.labelFingerprint = Input.empty();
        this.labels = Input.empty();
        this.lastAttachTimestamp = Input.empty();
        this.lastDetachTimestamp = Input.empty();
        this.name = Input.empty();
        this.physicalBlockSizeBytes = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.replicaZones = Input.empty();
        this.selfLink = Input.empty();
        this.size = Input.empty();
        this.snapshot = Input.empty();
        this.sourceSnapshotEncryptionKey = Input.empty();
        this.sourceSnapshotId = Input.empty();
        this.type = Input.empty();
        this.users = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;
        private @Nullable Input<String> $interface;
        private @Nullable Input<String> labelFingerprint;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> lastAttachTimestamp;
        private @Nullable Input<String> lastDetachTimestamp;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> physicalBlockSizeBytes;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<List<String>> replicaZones;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<Integer> size;
        private @Nullable Input<String> snapshot;
        private @Nullable Input<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey;
        private @Nullable Input<String> sourceSnapshotId;
        private @Nullable Input<String> type;
        private @Nullable Input<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.$interface = defaults.$interface;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.lastAttachTimestamp = defaults.lastAttachTimestamp;
    	      this.lastDetachTimestamp = defaults.lastDetachTimestamp;
    	      this.name = defaults.name;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.snapshot = defaults.snapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.type = defaults.type;
    	      this.users = defaults.users;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable Input<RegionDiskDiskEncryptionKeyGetArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder setDiskEncryptionKey(@Nullable RegionDiskDiskEncryptionKeyGetArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder set$interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder set$interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder setLabelFingerprint(@Nullable Input<String> labelFingerprint) {
            this.labelFingerprint = labelFingerprint;
            return this;
        }

        public Builder setLabelFingerprint(@Nullable String labelFingerprint) {
            this.labelFingerprint = Input.ofNullable(labelFingerprint);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLastAttachTimestamp(@Nullable Input<String> lastAttachTimestamp) {
            this.lastAttachTimestamp = lastAttachTimestamp;
            return this;
        }

        public Builder setLastAttachTimestamp(@Nullable String lastAttachTimestamp) {
            this.lastAttachTimestamp = Input.ofNullable(lastAttachTimestamp);
            return this;
        }

        public Builder setLastDetachTimestamp(@Nullable Input<String> lastDetachTimestamp) {
            this.lastDetachTimestamp = lastDetachTimestamp;
            return this;
        }

        public Builder setLastDetachTimestamp(@Nullable String lastDetachTimestamp) {
            this.lastDetachTimestamp = Input.ofNullable(lastDetachTimestamp);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable Input<Integer> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        public Builder setPhysicalBlockSizeBytes(@Nullable Integer physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Input.ofNullable(physicalBlockSizeBytes);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setReplicaZones(@Nullable Input<List<String>> replicaZones) {
            this.replicaZones = replicaZones;
            return this;
        }

        public Builder setReplicaZones(@Nullable List<String> replicaZones) {
            this.replicaZones = Input.ofNullable(replicaZones);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSize(@Nullable Input<Integer> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable Integer size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setSnapshot(@Nullable Input<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder setSnapshot(@Nullable String snapshot) {
            this.snapshot = Input.ofNullable(snapshot);
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable Input<RegionDiskSourceSnapshotEncryptionKeyGetArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder setSourceSnapshotEncryptionKey(@Nullable RegionDiskSourceSnapshotEncryptionKeyGetArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Input.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder setSourceSnapshotId(@Nullable Input<String> sourceSnapshotId) {
            this.sourceSnapshotId = sourceSnapshotId;
            return this;
        }

        public Builder setSourceSnapshotId(@Nullable String sourceSnapshotId) {
            this.sourceSnapshotId = Input.ofNullable(sourceSnapshotId);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUsers(@Nullable Input<List<String>> users) {
            this.users = users;
            return this;
        }

        public Builder setUsers(@Nullable List<String> users) {
            this.users = Input.ofNullable(users);
            return this;
        }

        public RegionDiskState build() {
            return new RegionDiskState(creationTimestamp, description, diskEncryptionKey, $interface, labelFingerprint, labels, lastAttachTimestamp, lastDetachTimestamp, name, physicalBlockSizeBytes, project, region, replicaZones, selfLink, size, snapshot, sourceSnapshotEncryptionKey, sourceSnapshotId, type, users);
        }
    }
}
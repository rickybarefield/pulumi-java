// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CinderVolumeSource {
    private final @Nullable String fsType;
    private final @Nullable Boolean readOnly;
    private final @Nullable LocalObjectReference secretRef;
    private final String volumeID;

    @OutputCustomType.Constructor({"fsType","readOnly","secretRef","volumeID"})
    private CinderVolumeSource(
        @Nullable String fsType,
        @Nullable Boolean readOnly,
        @Nullable LocalObjectReference secretRef,
        String volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeID = Objects.requireNonNull(volumeID);
    }

    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<LocalObjectReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }
    public String getVolumeID() {
        return this.volumeID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CinderVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Boolean readOnly;
        private @Nullable LocalObjectReference secretRef;
        private String volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(CinderVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeID = defaults.volumeID;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(@Nullable LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setVolumeID(String volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }

        public CinderVolumeSource build() {
            return new CinderVolumeSource(fsType, readOnly, secretRef, volumeID);
        }
    }
}
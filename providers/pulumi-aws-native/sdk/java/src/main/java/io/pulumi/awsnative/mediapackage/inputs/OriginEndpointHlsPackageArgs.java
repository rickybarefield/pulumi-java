// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackagePlaylistType;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginEndpointHlsPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointHlsPackageArgs Empty = new OriginEndpointHlsPackageArgs();

    @InputImport(name="adMarkers")
    private final @Nullable Input<OriginEndpointHlsPackageAdMarkers> adMarkers;

    public Input<OriginEndpointHlsPackageAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Input.empty() : this.adMarkers;
    }

    @InputImport(name="adTriggers")
    private final @Nullable Input<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers;

    public Input<List<OriginEndpointHlsPackageAdTriggersItem>> getAdTriggers() {
        return this.adTriggers == null ? Input.empty() : this.adTriggers;
    }

    @InputImport(name="adsOnDeliveryRestrictions")
    private final @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Input<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Input.empty() : this.adsOnDeliveryRestrictions;
    }

    @InputImport(name="encryption")
    private final @Nullable Input<OriginEndpointHlsEncryptionArgs> encryption;

    public Input<OriginEndpointHlsEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    @InputImport(name="includeIframeOnlyStream")
    private final @Nullable Input<Boolean> includeIframeOnlyStream;

    public Input<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Input.empty() : this.includeIframeOnlyStream;
    }

    @InputImport(name="playlistType")
    private final @Nullable Input<OriginEndpointHlsPackagePlaylistType> playlistType;

    public Input<OriginEndpointHlsPackagePlaylistType> getPlaylistType() {
        return this.playlistType == null ? Input.empty() : this.playlistType;
    }

    @InputImport(name="playlistWindowSeconds")
    private final @Nullable Input<Integer> playlistWindowSeconds;

    public Input<Integer> getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds == null ? Input.empty() : this.playlistWindowSeconds;
    }

    @InputImport(name="programDateTimeIntervalSeconds")
    private final @Nullable Input<Integer> programDateTimeIntervalSeconds;

    public Input<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Input.empty() : this.programDateTimeIntervalSeconds;
    }

    @InputImport(name="segmentDurationSeconds")
    private final @Nullable Input<Integer> segmentDurationSeconds;

    public Input<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Input.empty() : this.segmentDurationSeconds;
    }

    @InputImport(name="streamSelection")
    private final @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;

    public Input<OriginEndpointStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Input.empty() : this.streamSelection;
    }

    @InputImport(name="useAudioRenditionGroup")
    private final @Nullable Input<Boolean> useAudioRenditionGroup;

    public Input<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Input.empty() : this.useAudioRenditionGroup;
    }

    public OriginEndpointHlsPackageArgs(
        @Nullable Input<OriginEndpointHlsPackageAdMarkers> adMarkers,
        @Nullable Input<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers,
        @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions,
        @Nullable Input<OriginEndpointHlsEncryptionArgs> encryption,
        @Nullable Input<Boolean> includeIframeOnlyStream,
        @Nullable Input<OriginEndpointHlsPackagePlaylistType> playlistType,
        @Nullable Input<Integer> playlistWindowSeconds,
        @Nullable Input<Integer> programDateTimeIntervalSeconds,
        @Nullable Input<Integer> segmentDurationSeconds,
        @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection,
        @Nullable Input<Boolean> useAudioRenditionGroup) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.encryption = encryption;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private OriginEndpointHlsPackageArgs() {
        this.adMarkers = Input.empty();
        this.adTriggers = Input.empty();
        this.adsOnDeliveryRestrictions = Input.empty();
        this.encryption = Input.empty();
        this.includeIframeOnlyStream = Input.empty();
        this.playlistType = Input.empty();
        this.playlistWindowSeconds = Input.empty();
        this.programDateTimeIntervalSeconds = Input.empty();
        this.segmentDurationSeconds = Input.empty();
        this.streamSelection = Input.empty();
        this.useAudioRenditionGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OriginEndpointHlsPackageAdMarkers> adMarkers;
        private @Nullable Input<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers;
        private @Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;
        private @Nullable Input<OriginEndpointHlsEncryptionArgs> encryption;
        private @Nullable Input<Boolean> includeIframeOnlyStream;
        private @Nullable Input<OriginEndpointHlsPackagePlaylistType> playlistType;
        private @Nullable Input<Integer> playlistWindowSeconds;
        private @Nullable Input<Integer> programDateTimeIntervalSeconds;
        private @Nullable Input<Integer> segmentDurationSeconds;
        private @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;
        private @Nullable Input<Boolean> useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.encryption = defaults.encryption;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder setAdMarkers(@Nullable Input<OriginEndpointHlsPackageAdMarkers> adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdMarkers(@Nullable OriginEndpointHlsPackageAdMarkers adMarkers) {
            this.adMarkers = Input.ofNullable(adMarkers);
            return this;
        }

        public Builder setAdTriggers(@Nullable Input<List<OriginEndpointHlsPackageAdTriggersItem>> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdTriggers(@Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers) {
            this.adTriggers = Input.ofNullable(adTriggers);
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable Input<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = Input.ofNullable(adsOnDeliveryRestrictions);
            return this;
        }

        public Builder setEncryption(@Nullable Input<OriginEndpointHlsEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable OriginEndpointHlsEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Input<Boolean> includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = Input.ofNullable(includeIframeOnlyStream);
            return this;
        }

        public Builder setPlaylistType(@Nullable Input<OriginEndpointHlsPackagePlaylistType> playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder setPlaylistType(@Nullable OriginEndpointHlsPackagePlaylistType playlistType) {
            this.playlistType = Input.ofNullable(playlistType);
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Input<Integer> playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = Input.ofNullable(playlistWindowSeconds);
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Input<Integer> programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = Input.ofNullable(programDateTimeIntervalSeconds);
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Input<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Input.ofNullable(segmentDurationSeconds);
            return this;
        }

        public Builder setStreamSelection(@Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setStreamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Input.ofNullable(streamSelection);
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Input<Boolean> useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = Input.ofNullable(useAudioRenditionGroup);
            return this;
        }

        public OriginEndpointHlsPackageArgs build() {
            return new OriginEndpointHlsPackageArgs(adMarkers, adTriggers, adsOnDeliveryRestrictions, encryption, includeIframeOnlyStream, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, segmentDurationSeconds, streamSelection, useAudioRenditionGroup);
        }
    }
}
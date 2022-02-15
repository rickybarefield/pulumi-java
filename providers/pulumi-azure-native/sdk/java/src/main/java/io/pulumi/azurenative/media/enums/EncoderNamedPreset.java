// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EncoderNamedPreset {
        H264SingleBitrateSD("H264SingleBitrateSD"),
        H264SingleBitrate720p("H264SingleBitrate720p"),
        H264SingleBitrate1080p("H264SingleBitrate1080p"),
        AdaptiveStreaming("AdaptiveStreaming"),
        AACGoodQualityAudio("AACGoodQualityAudio"),
        ContentAwareEncodingExperimental("ContentAwareEncodingExperimental"),
        ContentAwareEncoding("ContentAwareEncoding"),
        CopyAllBitrateNonInterleaved("CopyAllBitrateNonInterleaved"),
        H264MultipleBitrate1080p("H264MultipleBitrate1080p"),
        H264MultipleBitrate720p("H264MultipleBitrate720p"),
        H264MultipleBitrateSD("H264MultipleBitrateSD"),
        H265ContentAwareEncoding("H265ContentAwareEncoding"),
        H265AdaptiveStreaming("H265AdaptiveStreaming"),
        H265SingleBitrate720p("H265SingleBitrate720p"),
        H265SingleBitrate1080p("H265SingleBitrate1080p"),
        H265SingleBitrate4K("H265SingleBitrate4K");

        private final String value;

        EncoderNamedPreset(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EncoderNamedPreset[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
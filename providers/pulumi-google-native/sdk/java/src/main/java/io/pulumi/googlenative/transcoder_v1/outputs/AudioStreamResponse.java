// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.AudioMappingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AudioStreamResponse {
    private final Integer bitrateBps;
    private final Integer channelCount;
    private final List<String> channelLayout;
    private final String codec;
    private final List<AudioMappingResponse> mapping;
    private final Integer sampleRateHertz;

    @OutputCustomType.Constructor({"bitrateBps","channelCount","channelLayout","codec","mapping","sampleRateHertz"})
    private AudioStreamResponse(
        Integer bitrateBps,
        Integer channelCount,
        List<String> channelLayout,
        String codec,
        List<AudioMappingResponse> mapping,
        Integer sampleRateHertz) {
        this.bitrateBps = Objects.requireNonNull(bitrateBps);
        this.channelCount = Objects.requireNonNull(channelCount);
        this.channelLayout = Objects.requireNonNull(channelLayout);
        this.codec = Objects.requireNonNull(codec);
        this.mapping = Objects.requireNonNull(mapping);
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
    }

    public Integer getBitrateBps() {
        return this.bitrateBps;
    }
    public Integer getChannelCount() {
        return this.channelCount;
    }
    public List<String> getChannelLayout() {
        return this.channelLayout;
    }
    public String getCodec() {
        return this.codec;
    }
    public List<AudioMappingResponse> getMapping() {
        return this.mapping;
    }
    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bitrateBps;
        private Integer channelCount;
        private List<String> channelLayout;
        private String codec;
        private List<AudioMappingResponse> mapping;
        private Integer sampleRateHertz;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.channelCount = defaults.channelCount;
    	      this.channelLayout = defaults.channelLayout;
    	      this.codec = defaults.codec;
    	      this.mapping = defaults.mapping;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
        }

        public Builder setBitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder setChannelCount(Integer channelCount) {
            this.channelCount = Objects.requireNonNull(channelCount);
            return this;
        }

        public Builder setChannelLayout(List<String> channelLayout) {
            this.channelLayout = Objects.requireNonNull(channelLayout);
            return this;
        }

        public Builder setCodec(String codec) {
            this.codec = Objects.requireNonNull(codec);
            return this;
        }

        public Builder setMapping(List<AudioMappingResponse> mapping) {
            this.mapping = Objects.requireNonNull(mapping);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public AudioStreamResponse build() {
            return new AudioStreamResponse(bitrateBps, channelCount, channelLayout, codec, mapping, sampleRateHertz);
        }
    }
}
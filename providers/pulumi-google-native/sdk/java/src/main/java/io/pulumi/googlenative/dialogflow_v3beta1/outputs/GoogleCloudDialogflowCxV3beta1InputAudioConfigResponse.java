// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse {
    private final String audioEncoding;
    private final Boolean enableWordInfo;
    private final String model;
    private final String modelVariant;
    private final List<String> phraseHints;
    private final Integer sampleRateHertz;
    private final Boolean singleUtterance;

    @OutputCustomType.Constructor({"audioEncoding","enableWordInfo","model","modelVariant","phraseHints","sampleRateHertz","singleUtterance"})
    private GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse(
        String audioEncoding,
        Boolean enableWordInfo,
        String model,
        String modelVariant,
        List<String> phraseHints,
        Integer sampleRateHertz,
        Boolean singleUtterance) {
        this.audioEncoding = Objects.requireNonNull(audioEncoding);
        this.enableWordInfo = Objects.requireNonNull(enableWordInfo);
        this.model = Objects.requireNonNull(model);
        this.modelVariant = Objects.requireNonNull(modelVariant);
        this.phraseHints = Objects.requireNonNull(phraseHints);
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
        this.singleUtterance = Objects.requireNonNull(singleUtterance);
    }

    public String getAudioEncoding() {
        return this.audioEncoding;
    }
    public Boolean getEnableWordInfo() {
        return this.enableWordInfo;
    }
    public String getModel() {
        return this.model;
    }
    public String getModelVariant() {
        return this.modelVariant;
    }
    public List<String> getPhraseHints() {
        return this.phraseHints;
    }
    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }
    public Boolean getSingleUtterance() {
        return this.singleUtterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audioEncoding;
        private Boolean enableWordInfo;
        private String model;
        private String modelVariant;
        private List<String> phraseHints;
        private Integer sampleRateHertz;
        private Boolean singleUtterance;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoding = defaults.audioEncoding;
    	      this.enableWordInfo = defaults.enableWordInfo;
    	      this.model = defaults.model;
    	      this.modelVariant = defaults.modelVariant;
    	      this.phraseHints = defaults.phraseHints;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.singleUtterance = defaults.singleUtterance;
        }

        public Builder setAudioEncoding(String audioEncoding) {
            this.audioEncoding = Objects.requireNonNull(audioEncoding);
            return this;
        }

        public Builder setEnableWordInfo(Boolean enableWordInfo) {
            this.enableWordInfo = Objects.requireNonNull(enableWordInfo);
            return this;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder setModelVariant(String modelVariant) {
            this.modelVariant = Objects.requireNonNull(modelVariant);
            return this;
        }

        public Builder setPhraseHints(List<String> phraseHints) {
            this.phraseHints = Objects.requireNonNull(phraseHints);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public Builder setSingleUtterance(Boolean singleUtterance) {
            this.singleUtterance = Objects.requireNonNull(singleUtterance);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1InputAudioConfigResponse(audioEncoding, enableWordInfo, model, modelVariant, phraseHints, sampleRateHertz, singleUtterance);
        }
    }
}
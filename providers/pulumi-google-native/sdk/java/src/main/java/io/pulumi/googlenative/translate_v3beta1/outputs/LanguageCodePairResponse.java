// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LanguageCodePairResponse {
    private final String sourceLanguageCode;
    private final String targetLanguageCode;

    @OutputCustomType.Constructor({"sourceLanguageCode","targetLanguageCode"})
    private LanguageCodePairResponse(
        String sourceLanguageCode,
        String targetLanguageCode) {
        this.sourceLanguageCode = Objects.requireNonNull(sourceLanguageCode);
        this.targetLanguageCode = Objects.requireNonNull(targetLanguageCode);
    }

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }
    public String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodePairResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sourceLanguageCode;
        private String targetLanguageCode;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodePairResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceLanguageCode = defaults.sourceLanguageCode;
    	      this.targetLanguageCode = defaults.targetLanguageCode;
        }

        public Builder setSourceLanguageCode(String sourceLanguageCode) {
            this.sourceLanguageCode = Objects.requireNonNull(sourceLanguageCode);
            return this;
        }

        public Builder setTargetLanguageCode(String targetLanguageCode) {
            this.targetLanguageCode = Objects.requireNonNull(targetLanguageCode);
            return this;
        }

        public LanguageCodePairResponse build() {
            return new LanguageCodePairResponse(sourceLanguageCode, targetLanguageCode);
        }
    }
}
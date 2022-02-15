// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs Empty = new PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs();

    @InputImport(name="dictionary")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs> dictionary;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs> getDictionary() {
        return this.dictionary == null ? Input.empty() : this.dictionary;
    }

    @InputImport(name="exclusionType")
    private final @Nullable Input<String> exclusionType;

    public Input<String> getExclusionType() {
        return this.exclusionType == null ? Input.empty() : this.exclusionType;
    }

    @InputImport(name="infoType", required=true)
    private final Input<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs> infoType;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs> getInfoType() {
        return this.infoType;
    }

    @InputImport(name="likelihood")
    private final @Nullable Input<String> likelihood;

    public Input<String> getLikelihood() {
        return this.likelihood == null ? Input.empty() : this.likelihood;
    }

    @InputImport(name="regex")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs> regex;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    @InputImport(name="storedType")
    private final @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs> storedType;

    public Input<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs> getStoredType() {
        return this.storedType == null ? Input.empty() : this.storedType;
    }

    public PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs(
        @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs> dictionary,
        @Nullable Input<String> exclusionType,
        Input<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs> infoType,
        @Nullable Input<String> likelihood,
        @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs> regex,
        @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs> storedType) {
        this.dictionary = dictionary;
        this.exclusionType = exclusionType;
        this.infoType = Objects.requireNonNull(infoType, "expected parameter 'infoType' to be non-null");
        this.likelihood = likelihood;
        this.regex = regex;
        this.storedType = storedType;
    }

    private PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs() {
        this.dictionary = Input.empty();
        this.exclusionType = Input.empty();
        this.infoType = Input.empty();
        this.likelihood = Input.empty();
        this.regex = Input.empty();
        this.storedType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs> dictionary;
        private @Nullable Input<String> exclusionType;
        private Input<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs> infoType;
        private @Nullable Input<String> likelihood;
        private @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs> regex;
        private @Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs> storedType;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.exclusionType = defaults.exclusionType;
    	      this.infoType = defaults.infoType;
    	      this.likelihood = defaults.likelihood;
    	      this.regex = defaults.regex;
    	      this.storedType = defaults.storedType;
        }

        public Builder setDictionary(@Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs> dictionary) {
            this.dictionary = dictionary;
            return this;
        }

        public Builder setDictionary(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeDictionaryGetArgs dictionary) {
            this.dictionary = Input.ofNullable(dictionary);
            return this;
        }

        public Builder setExclusionType(@Nullable Input<String> exclusionType) {
            this.exclusionType = exclusionType;
            return this;
        }

        public Builder setExclusionType(@Nullable String exclusionType) {
            this.exclusionType = Input.ofNullable(exclusionType);
            return this;
        }

        public Builder setInfoType(Input<PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs> infoType) {
            this.infoType = Objects.requireNonNull(infoType);
            return this;
        }

        public Builder setInfoType(PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeGetArgs infoType) {
            this.infoType = Input.of(Objects.requireNonNull(infoType));
            return this;
        }

        public Builder setLikelihood(@Nullable Input<String> likelihood) {
            this.likelihood = likelihood;
            return this;
        }

        public Builder setLikelihood(@Nullable String likelihood) {
            this.likelihood = Input.ofNullable(likelihood);
            return this;
        }

        public Builder setRegex(@Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeRegexGetArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setStoredType(@Nullable Input<PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs> storedType) {
            this.storedType = storedType;
            return this;
        }

        public Builder setStoredType(@Nullable PreventionInspectTemplateInspectConfigCustomInfoTypeStoredTypeGetArgs storedType) {
            this.storedType = Input.ofNullable(storedType);
            return this;
        }

        public PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs build() {
            return new PreventionInspectTemplateInspectConfigCustomInfoTypeGetArgs(dictionary, exclusionType, infoType, likelihood, regex, storedType);
        }
    }
}
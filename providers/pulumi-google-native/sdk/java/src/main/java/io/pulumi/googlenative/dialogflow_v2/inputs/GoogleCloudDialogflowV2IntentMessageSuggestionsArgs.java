// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSuggestionArgs;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudDialogflowV2IntentMessageSuggestionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSuggestionsArgs Empty = new GoogleCloudDialogflowV2IntentMessageSuggestionsArgs();

    @InputImport(name="suggestions", required=true)
    private final Input<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions;

    public Input<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> getSuggestions() {
        return this.suggestions;
    }

    public GoogleCloudDialogflowV2IntentMessageSuggestionsArgs(Input<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions) {
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageSuggestionsArgs() {
        this.suggestions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder setSuggestions(Input<List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs>> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder setSuggestions(List<GoogleCloudDialogflowV2IntentMessageSuggestionArgs> suggestions) {
            this.suggestions = Input.of(Objects.requireNonNull(suggestions));
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageSuggestionsArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionsArgs(suggestions);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.LabelClassResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabelCategoryResponse {
    private final @Nullable Boolean allowMultiSelect;
    private final Map<String,LabelClassResponse> classes;
    private final @Nullable String displayName;

    @OutputCustomType.Constructor({"allowMultiSelect","classes","displayName"})
    private LabelCategoryResponse(
        @Nullable Boolean allowMultiSelect,
        Map<String,LabelClassResponse> classes,
        @Nullable String displayName) {
        this.allowMultiSelect = allowMultiSelect;
        this.classes = Objects.requireNonNull(classes);
        this.displayName = displayName;
    }

    public Optional<Boolean> getAllowMultiSelect() {
        return Optional.ofNullable(this.allowMultiSelect);
    }
    public Map<String,LabelClassResponse> getClasses() {
        return this.classes;
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelCategoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowMultiSelect;
        private Map<String,LabelClassResponse> classes;
        private @Nullable String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelCategoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowMultiSelect = defaults.allowMultiSelect;
    	      this.classes = defaults.classes;
    	      this.displayName = defaults.displayName;
        }

        public Builder setAllowMultiSelect(@Nullable Boolean allowMultiSelect) {
            this.allowMultiSelect = allowMultiSelect;
            return this;
        }

        public Builder setClasses(Map<String,LabelClassResponse> classes) {
            this.classes = Objects.requireNonNull(classes);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public LabelCategoryResponse build() {
            return new LabelCategoryResponse(allowMultiSelect, classes, displayName);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WindowsUpdateSettingsResponse {
    private final List<String> classifications;
    private final List<String> excludes;
    private final List<String> exclusivePatches;

    @OutputCustomType.Constructor({"classifications","excludes","exclusivePatches"})
    private WindowsUpdateSettingsResponse(
        List<String> classifications,
        List<String> excludes,
        List<String> exclusivePatches) {
        this.classifications = Objects.requireNonNull(classifications);
        this.excludes = Objects.requireNonNull(excludes);
        this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
    }

    public List<String> getClassifications() {
        return this.classifications;
    }
    public List<String> getExcludes() {
        return this.excludes;
    }
    public List<String> getExclusivePatches() {
        return this.exclusivePatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> classifications;
        private List<String> excludes;
        private List<String> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder setClassifications(List<String> classifications) {
            this.classifications = Objects.requireNonNull(classifications);
            return this;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePatches(List<String> exclusivePatches) {
            this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
            return this;
        }

        public WindowsUpdateSettingsResponse build() {
            return new WindowsUpdateSettingsResponse(classifications, excludes, exclusivePatches);
        }
    }
}
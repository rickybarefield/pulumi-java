// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentGroupLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentGroupLabelArgs Empty = new AssignmentGroupLabelArgs();

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public AssignmentGroupLabelArgs(@Nullable Input<Map<String,String>> labels) {
        this.labels = labels;
    }

    private AssignmentGroupLabelArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentGroupLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public AssignmentGroupLabelArgs build() {
            return new AssignmentGroupLabelArgs(labels);
        }
    }
}
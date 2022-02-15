// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GuestPoliciesAssignmentGroupLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesAssignmentGroupLabelGetArgs Empty = new GuestPoliciesAssignmentGroupLabelGetArgs();

    @InputImport(name="labels", required=true)
    private final Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels;
    }

    public GuestPoliciesAssignmentGroupLabelGetArgs(Input<Map<String,String>> labels) {
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private GuestPoliciesAssignmentGroupLabelGetArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesAssignmentGroupLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesAssignmentGroupLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(Input<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
            return this;
        }

        public GuestPoliciesAssignmentGroupLabelGetArgs build() {
            return new GuestPoliciesAssignmentGroupLabelGetArgs(labels);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DashboardDataSetReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DashboardSourceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DashboardSourceTemplateArgs Empty = new DashboardSourceTemplateArgs();

    @InputImport(name="arn", required=true)
    private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    @InputImport(name="dataSetReferences", required=true)
    private final Input<List<DashboardDataSetReferenceArgs>> dataSetReferences;

    public Input<List<DashboardDataSetReferenceArgs>> getDataSetReferences() {
        return this.dataSetReferences;
    }

    public DashboardSourceTemplateArgs(
        Input<String> arn,
        Input<List<DashboardDataSetReferenceArgs>> dataSetReferences) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.dataSetReferences = Objects.requireNonNull(dataSetReferences, "expected parameter 'dataSetReferences' to be non-null");
    }

    private DashboardSourceTemplateArgs() {
        this.arn = Input.empty();
        this.dataSetReferences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardSourceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private Input<List<DashboardDataSetReferenceArgs>> dataSetReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardSourceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSetReferences = defaults.dataSetReferences;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setDataSetReferences(Input<List<DashboardDataSetReferenceArgs>> dataSetReferences) {
            this.dataSetReferences = Objects.requireNonNull(dataSetReferences);
            return this;
        }

        public Builder setDataSetReferences(List<DashboardDataSetReferenceArgs> dataSetReferences) {
            this.dataSetReferences = Input.of(Objects.requireNonNull(dataSetReferences));
            return this;
        }

        public DashboardSourceTemplateArgs build() {
            return new DashboardSourceTemplateArgs(arn, dataSetReferences);
        }
    }
}
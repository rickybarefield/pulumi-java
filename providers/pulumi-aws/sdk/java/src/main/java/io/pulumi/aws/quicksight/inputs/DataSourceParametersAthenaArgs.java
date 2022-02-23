// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceParametersAthenaArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAthenaArgs Empty = new DataSourceParametersAthenaArgs();

    /**
     * The work-group to which to connect.
     * 
     */
    @InputImport(name="workGroup")
    private final @Nullable Input<String> workGroup;

    public Input<String> getWorkGroup() {
        return this.workGroup == null ? Input.empty() : this.workGroup;
    }

    public DataSourceParametersAthenaArgs(@Nullable Input<String> workGroup) {
        this.workGroup = workGroup;
    }

    private DataSourceParametersAthenaArgs() {
        this.workGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAthenaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAthenaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workGroup = defaults.workGroup;
        }

        public Builder setWorkGroup(@Nullable Input<String> workGroup) {
            this.workGroup = workGroup;
            return this;
        }

        public Builder setWorkGroup(@Nullable String workGroup) {
            this.workGroup = Input.ofNullable(workGroup);
            return this;
        }
        public DataSourceParametersAthenaArgs build() {
            return new DataSourceParametersAthenaArgs(workGroup);
        }
    }
}
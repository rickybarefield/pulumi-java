// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import java.util.Objects;


public final class DataSetFieldFolderMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetFieldFolderMapArgs Empty = new DataSetFieldFolderMapArgs();

    public DataSetFieldFolderMapArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetFieldFolderMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetFieldFolderMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public DataSetFieldFolderMapArgs build() {
            return new DataSetFieldFolderMapArgs();
        }
    }
}
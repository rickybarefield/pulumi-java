// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.resiliencehub.inputs;

import java.util.Objects;


public final class AppTagMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppTagMapArgs Empty = new AppTagMapArgs();

    public AppTagMapArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppTagMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(AppTagMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public AppTagMapArgs build() {
            return new AppTagMapArgs();
        }
    }
}
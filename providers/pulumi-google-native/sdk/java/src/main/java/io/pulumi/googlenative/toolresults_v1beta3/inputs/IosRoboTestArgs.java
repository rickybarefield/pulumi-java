// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import java.util.Objects;


public final class IosRoboTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosRoboTestArgs Empty = new IosRoboTestArgs();

    public IosRoboTestArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosRoboTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(IosRoboTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public IosRoboTestArgs build() {
            return new IosRoboTestArgs();
        }
    }
}
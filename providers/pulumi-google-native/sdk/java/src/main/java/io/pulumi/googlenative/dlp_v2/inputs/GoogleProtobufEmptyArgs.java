// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import java.util.Objects;


public final class GoogleProtobufEmptyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleProtobufEmptyArgs Empty = new GoogleProtobufEmptyArgs();

    public GoogleProtobufEmptyArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleProtobufEmptyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleProtobufEmptyArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleProtobufEmptyArgs build() {
            return new GoogleProtobufEmptyArgs();
        }
    }
}
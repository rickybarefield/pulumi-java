// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import java.util.Objects;


public final class GoogleAutoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleAutoResponse Empty = new GoogleAutoResponse();

    public GoogleAutoResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleAutoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleAutoResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GoogleAutoResponse build() {
            return new GoogleAutoResponse();
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ImmediateCopyOptionResponse {
    private final String objectType;

    @OutputCustomType.Constructor({"objectType"})
    private ImmediateCopyOptionResponse(String objectType) {
        this.objectType = Objects.requireNonNull(objectType);
    }

    public String getObjectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImmediateCopyOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImmediateCopyOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectType = defaults.objectType;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public ImmediateCopyOptionResponse build() {
            return new ImmediateCopyOptionResponse(objectType);
        }
    }
}
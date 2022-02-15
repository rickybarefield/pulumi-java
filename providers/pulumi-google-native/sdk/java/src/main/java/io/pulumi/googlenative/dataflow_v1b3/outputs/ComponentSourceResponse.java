// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ComponentSourceResponse {
    private final String name;
    private final String originalTransformOrCollection;
    private final String userName;

    @OutputCustomType.Constructor({"name","originalTransformOrCollection","userName"})
    private ComponentSourceResponse(
        String name,
        String originalTransformOrCollection,
        String userName) {
        this.name = Objects.requireNonNull(name);
        this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
        this.userName = Objects.requireNonNull(userName);
    }

    public String getName() {
        return this.name;
    }
    public String getOriginalTransformOrCollection() {
        return this.originalTransformOrCollection;
    }
    public String getUserName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String originalTransformOrCollection;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.originalTransformOrCollection = defaults.originalTransformOrCollection;
    	      this.userName = defaults.userName;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginalTransformOrCollection(String originalTransformOrCollection) {
            this.originalTransformOrCollection = Objects.requireNonNull(originalTransformOrCollection);
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public ComponentSourceResponse build() {
            return new ComponentSourceResponse(name, originalTransformOrCollection, userName);
        }
    }
}
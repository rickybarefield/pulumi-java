// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualDiskControllerResponse {
    private final String id;
    private final String name;
    private final String subType;
    private final String type;

    @OutputCustomType.Constructor({"id","name","subType","type"})
    private VirtualDiskControllerResponse(
        String id,
        String name,
        String subType,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.subType = Objects.requireNonNull(subType);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getSubType() {
        return this.subType;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDiskControllerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDiskControllerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subType = defaults.subType;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubType(String subType) {
            this.subType = Objects.requireNonNull(subType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VirtualDiskControllerResponse build() {
            return new VirtualDiskControllerResponse(id, name, subType, type);
        }
    }
}
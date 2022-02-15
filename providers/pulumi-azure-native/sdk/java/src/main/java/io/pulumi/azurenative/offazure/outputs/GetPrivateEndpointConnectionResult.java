// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.outputs;

import io.pulumi.azurenative.offazure.outputs.PrivateEndpointConnectionPropertiesResponse;
import io.pulumi.azurenative.offazure.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    private final String eTag;
    private final String id;
    private final String name;
    private final PrivateEndpointConnectionPropertiesResponse properties;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","name","properties","systemData","type"})
    private GetPrivateEndpointConnectionResult(
        String eTag,
        String id,
        String name,
        PrivateEndpointConnectionPropertiesResponse properties,
        SystemDataResponse systemData,
        String type) {
        this.eTag = Objects.requireNonNull(eTag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getETag() {
        return this.eTag;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public PrivateEndpointConnectionPropertiesResponse getProperties() {
        return this.properties;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eTag;
        private String id;
        private String name;
        private PrivateEndpointConnectionPropertiesResponse properties;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setETag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(PrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(eTag, id, name, properties, systemData, type);
        }
    }
}
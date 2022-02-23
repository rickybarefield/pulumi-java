// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.aws.iot.inputs.ThingGroupPropertiesAttributePayloadGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThingGroupPropertiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThingGroupPropertiesGetArgs Empty = new ThingGroupPropertiesGetArgs();

    /**
     * The Thing Group attributes. Defined below.
     * 
     */
    @InputImport(name="attributePayload")
    private final @Nullable Input<ThingGroupPropertiesAttributePayloadGetArgs> attributePayload;

    public Input<ThingGroupPropertiesAttributePayloadGetArgs> getAttributePayload() {
        return this.attributePayload == null ? Input.empty() : this.attributePayload;
    }

    /**
     * A description of the Thing Group.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public ThingGroupPropertiesGetArgs(
        @Nullable Input<ThingGroupPropertiesAttributePayloadGetArgs> attributePayload,
        @Nullable Input<String> description) {
        this.attributePayload = attributePayload;
        this.description = description;
    }

    private ThingGroupPropertiesGetArgs() {
        this.attributePayload = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupPropertiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ThingGroupPropertiesAttributePayloadGetArgs> attributePayload;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupPropertiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePayload = defaults.attributePayload;
    	      this.description = defaults.description;
        }

        public Builder setAttributePayload(@Nullable Input<ThingGroupPropertiesAttributePayloadGetArgs> attributePayload) {
            this.attributePayload = attributePayload;
            return this;
        }

        public Builder setAttributePayload(@Nullable ThingGroupPropertiesAttributePayloadGetArgs attributePayload) {
            this.attributePayload = Input.ofNullable(attributePayload);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }
        public ThingGroupPropertiesGetArgs build() {
            return new ThingGroupPropertiesGetArgs(attributePayload, description);
        }
    }
}
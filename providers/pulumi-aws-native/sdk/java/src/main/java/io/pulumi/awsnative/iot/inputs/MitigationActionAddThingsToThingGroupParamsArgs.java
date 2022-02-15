// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MitigationActionAddThingsToThingGroupParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionAddThingsToThingGroupParamsArgs Empty = new MitigationActionAddThingsToThingGroupParamsArgs();

    @InputImport(name="overrideDynamicGroups")
    private final @Nullable Input<Boolean> overrideDynamicGroups;

    public Input<Boolean> getOverrideDynamicGroups() {
        return this.overrideDynamicGroups == null ? Input.empty() : this.overrideDynamicGroups;
    }

    @InputImport(name="thingGroupNames", required=true)
    private final Input<List<String>> thingGroupNames;

    public Input<List<String>> getThingGroupNames() {
        return this.thingGroupNames;
    }

    public MitigationActionAddThingsToThingGroupParamsArgs(
        @Nullable Input<Boolean> overrideDynamicGroups,
        Input<List<String>> thingGroupNames) {
        this.overrideDynamicGroups = overrideDynamicGroups;
        this.thingGroupNames = Objects.requireNonNull(thingGroupNames, "expected parameter 'thingGroupNames' to be non-null");
    }

    private MitigationActionAddThingsToThingGroupParamsArgs() {
        this.overrideDynamicGroups = Input.empty();
        this.thingGroupNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionAddThingsToThingGroupParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> overrideDynamicGroups;
        private Input<List<String>> thingGroupNames;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionAddThingsToThingGroupParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.overrideDynamicGroups = defaults.overrideDynamicGroups;
    	      this.thingGroupNames = defaults.thingGroupNames;
        }

        public Builder setOverrideDynamicGroups(@Nullable Input<Boolean> overrideDynamicGroups) {
            this.overrideDynamicGroups = overrideDynamicGroups;
            return this;
        }

        public Builder setOverrideDynamicGroups(@Nullable Boolean overrideDynamicGroups) {
            this.overrideDynamicGroups = Input.ofNullable(overrideDynamicGroups);
            return this;
        }

        public Builder setThingGroupNames(Input<List<String>> thingGroupNames) {
            this.thingGroupNames = Objects.requireNonNull(thingGroupNames);
            return this;
        }

        public Builder setThingGroupNames(List<String> thingGroupNames) {
            this.thingGroupNames = Input.of(Objects.requireNonNull(thingGroupNames));
            return this;
        }

        public MitigationActionAddThingsToThingGroupParamsArgs build() {
            return new MitigationActionAddThingsToThingGroupParamsArgs(overrideDynamicGroups, thingGroupNames);
        }
    }
}
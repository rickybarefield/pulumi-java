// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionDevicePolicyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelConditionState extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelConditionState Empty = new AccessLevelConditionState();

    @InputImport(name="accessLevel")
    private final @Nullable Input<String> accessLevel;

    public Input<String> getAccessLevel() {
        return this.accessLevel == null ? Input.empty() : this.accessLevel;
    }

    @InputImport(name="devicePolicy")
    private final @Nullable Input<AccessLevelConditionDevicePolicyGetArgs> devicePolicy;

    public Input<AccessLevelConditionDevicePolicyGetArgs> getDevicePolicy() {
        return this.devicePolicy == null ? Input.empty() : this.devicePolicy;
    }

    @InputImport(name="ipSubnetworks")
    private final @Nullable Input<List<String>> ipSubnetworks;

    public Input<List<String>> getIpSubnetworks() {
        return this.ipSubnetworks == null ? Input.empty() : this.ipSubnetworks;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    @InputImport(name="negate")
    private final @Nullable Input<Boolean> negate;

    public Input<Boolean> getNegate() {
        return this.negate == null ? Input.empty() : this.negate;
    }

    @InputImport(name="regions")
    private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    @InputImport(name="requiredAccessLevels")
    private final @Nullable Input<List<String>> requiredAccessLevels;

    public Input<List<String>> getRequiredAccessLevels() {
        return this.requiredAccessLevels == null ? Input.empty() : this.requiredAccessLevels;
    }

    public AccessLevelConditionState(
        @Nullable Input<String> accessLevel,
        @Nullable Input<AccessLevelConditionDevicePolicyGetArgs> devicePolicy,
        @Nullable Input<List<String>> ipSubnetworks,
        @Nullable Input<List<String>> members,
        @Nullable Input<Boolean> negate,
        @Nullable Input<List<String>> regions,
        @Nullable Input<List<String>> requiredAccessLevels) {
        this.accessLevel = accessLevel;
        this.devicePolicy = devicePolicy;
        this.ipSubnetworks = ipSubnetworks;
        this.members = members;
        this.negate = negate;
        this.regions = regions;
        this.requiredAccessLevels = requiredAccessLevels;
    }

    private AccessLevelConditionState() {
        this.accessLevel = Input.empty();
        this.devicePolicy = Input.empty();
        this.ipSubnetworks = Input.empty();
        this.members = Input.empty();
        this.negate = Input.empty();
        this.regions = Input.empty();
        this.requiredAccessLevels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessLevel;
        private @Nullable Input<AccessLevelConditionDevicePolicyGetArgs> devicePolicy;
        private @Nullable Input<List<String>> ipSubnetworks;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<Boolean> negate;
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<List<String>> requiredAccessLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelConditionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
        }

        public Builder setAccessLevel(@Nullable Input<String> accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        public Builder setAccessLevel(@Nullable String accessLevel) {
            this.accessLevel = Input.ofNullable(accessLevel);
            return this;
        }

        public Builder setDevicePolicy(@Nullable Input<AccessLevelConditionDevicePolicyGetArgs> devicePolicy) {
            this.devicePolicy = devicePolicy;
            return this;
        }

        public Builder setDevicePolicy(@Nullable AccessLevelConditionDevicePolicyGetArgs devicePolicy) {
            this.devicePolicy = Input.ofNullable(devicePolicy);
            return this;
        }

        public Builder setIpSubnetworks(@Nullable Input<List<String>> ipSubnetworks) {
            this.ipSubnetworks = ipSubnetworks;
            return this;
        }

        public Builder setIpSubnetworks(@Nullable List<String> ipSubnetworks) {
            this.ipSubnetworks = Input.ofNullable(ipSubnetworks);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setNegate(@Nullable Input<Boolean> negate) {
            this.negate = negate;
            return this;
        }

        public Builder setNegate(@Nullable Boolean negate) {
            this.negate = Input.ofNullable(negate);
            return this;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder setRequiredAccessLevels(@Nullable Input<List<String>> requiredAccessLevels) {
            this.requiredAccessLevels = requiredAccessLevels;
            return this;
        }

        public Builder setRequiredAccessLevels(@Nullable List<String> requiredAccessLevels) {
            this.requiredAccessLevels = Input.ofNullable(requiredAccessLevels);
            return this;
        }

        public AccessLevelConditionState build() {
            return new AccessLevelConditionState(accessLevel, devicePolicy, ipSubnetworks, members, negate, regions, requiredAccessLevels);
        }
    }
}
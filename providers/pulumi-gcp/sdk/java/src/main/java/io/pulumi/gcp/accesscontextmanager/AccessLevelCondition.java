// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.accesscontextmanager.AccessLevelConditionArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelConditionState;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelConditionDevicePolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition")
public class AccessLevelCondition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessLevel", type=String.class, parameters={})
    private Output<String> accessLevel;

    public Output<String> getAccessLevel() {
        return this.accessLevel;
    }
    @OutputExport(name="devicePolicy", type=AccessLevelConditionDevicePolicy.class, parameters={})
    private Output</* @Nullable */ AccessLevelConditionDevicePolicy> devicePolicy;

    public Output</* @Nullable */ AccessLevelConditionDevicePolicy> getDevicePolicy() {
        return this.devicePolicy;
    }
    @OutputExport(name="ipSubnetworks", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ipSubnetworks;

    public Output</* @Nullable */ List<String>> getIpSubnetworks() {
        return this.ipSubnetworks;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> members;

    public Output</* @Nullable */ List<String>> getMembers() {
        return this.members;
    }
    @OutputExport(name="negate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> negate;

    public Output</* @Nullable */ Boolean> getNegate() {
        return this.negate;
    }
    @OutputExport(name="regions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> regions;

    public Output</* @Nullable */ List<String>> getRegions() {
        return this.regions;
    }
    @OutputExport(name="requiredAccessLevels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> requiredAccessLevels;

    public Output</* @Nullable */ List<String>> getRequiredAccessLevels() {
        return this.requiredAccessLevels;
    }

    public AccessLevelCondition(String name, AccessLevelConditionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, args == null ? AccessLevelConditionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AccessLevelCondition(String name, Input<String> id, @Nullable AccessLevelConditionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevelCondition:AccessLevelCondition", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static AccessLevelCondition get(String name, Input<String> id, @Nullable AccessLevelConditionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevelCondition(name, id, state, options);
    }
}
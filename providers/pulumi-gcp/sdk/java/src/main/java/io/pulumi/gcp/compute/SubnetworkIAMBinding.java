// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.SubnetworkIAMBindingArgs;
import io.pulumi.gcp.compute.inputs.SubnetworkIAMBindingState;
import io.pulumi.gcp.compute.outputs.SubnetworkIAMBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/subnetworkIAMBinding:SubnetworkIAMBinding")
public class SubnetworkIAMBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=SubnetworkIAMBindingCondition.class, parameters={})
    private Output</* @Nullable */ SubnetworkIAMBindingCondition> condition;

    public Output</* @Nullable */ SubnetworkIAMBindingCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @OutputExport(name="subnetwork", type=String.class, parameters={})
    private Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork;
    }

    public SubnetworkIAMBinding(String name, SubnetworkIAMBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetworkIAMBinding:SubnetworkIAMBinding", name, args == null ? SubnetworkIAMBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubnetworkIAMBinding(String name, Input<String> id, @Nullable SubnetworkIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/subnetworkIAMBinding:SubnetworkIAMBinding", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SubnetworkIAMBinding get(String name, Input<String> id, @Nullable SubnetworkIAMBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubnetworkIAMBinding(name, id, state, options);
    }
}
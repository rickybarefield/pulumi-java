// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.FirewallPolicyAssociationArgs;
import io.pulumi.gcp.compute.inputs.FirewallPolicyAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation")
public class FirewallPolicyAssociation extends io.pulumi.resources.CustomResource {
    @OutputExport(name="attachmentTarget", type=String.class, parameters={})
    private Output<String> attachmentTarget;

    public Output<String> getAttachmentTarget() {
        return this.attachmentTarget;
    }
    @OutputExport(name="firewallPolicy", type=String.class, parameters={})
    private Output<String> firewallPolicy;

    public Output<String> getFirewallPolicy() {
        return this.firewallPolicy;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="shortName", type=String.class, parameters={})
    private Output<String> shortName;

    public Output<String> getShortName() {
        return this.shortName;
    }

    public FirewallPolicyAssociation(String name, FirewallPolicyAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation", name, args == null ? FirewallPolicyAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallPolicyAssociation(String name, Input<String> id, @Nullable FirewallPolicyAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/firewallPolicyAssociation:FirewallPolicyAssociation", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FirewallPolicyAssociation get(String name, Input<String> id, @Nullable FirewallPolicyAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicyAssociation(name, id, state, options);
    }
}
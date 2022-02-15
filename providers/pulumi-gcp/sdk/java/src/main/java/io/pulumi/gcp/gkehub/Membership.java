// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.gkehub.MembershipArgs;
import io.pulumi.gcp.gkehub.inputs.MembershipState;
import io.pulumi.gcp.gkehub.outputs.MembershipAuthority;
import io.pulumi.gcp.gkehub.outputs.MembershipEndpoint;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:gkehub/membership:Membership")
public class Membership extends io.pulumi.resources.CustomResource {
    @OutputExport(name="authority", type=MembershipAuthority.class, parameters={})
    private Output</* @Nullable */ MembershipAuthority> authority;

    public Output</* @Nullable */ MembershipAuthority> getAuthority() {
        return this.authority;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="endpoint", type=MembershipEndpoint.class, parameters={})
    private Output</* @Nullable */ MembershipEndpoint> endpoint;

    public Output</* @Nullable */ MembershipEndpoint> getEndpoint() {
        return this.endpoint;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    public Output</* @Nullable */ Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="membershipId", type=String.class, parameters={})
    private Output<String> membershipId;

    public Output<String> getMembershipId() {
        return this.membershipId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public Membership(String name, MembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Membership(String name, Input<String> id, @Nullable MembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membership:Membership", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Membership get(String name, Input<String> id, @Nullable MembershipState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, state, options);
    }
}
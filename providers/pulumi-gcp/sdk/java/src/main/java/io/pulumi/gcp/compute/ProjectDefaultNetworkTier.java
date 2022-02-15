// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ProjectDefaultNetworkTierArgs;
import io.pulumi.gcp.compute.inputs.ProjectDefaultNetworkTierState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/projectDefaultNetworkTier:ProjectDefaultNetworkTier")
public class ProjectDefaultNetworkTier extends io.pulumi.resources.CustomResource {
    @OutputExport(name="networkTier", type=String.class, parameters={})
    private Output<String> networkTier;

    public Output<String> getNetworkTier() {
        return this.networkTier;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public ProjectDefaultNetworkTier(String name, ProjectDefaultNetworkTierArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectDefaultNetworkTier:ProjectDefaultNetworkTier", name, args == null ? ProjectDefaultNetworkTierArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProjectDefaultNetworkTier(String name, Input<String> id, @Nullable ProjectDefaultNetworkTierState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/projectDefaultNetworkTier:ProjectDefaultNetworkTier", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ProjectDefaultNetworkTier get(String name, Input<String> id, @Nullable ProjectDefaultNetworkTierState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProjectDefaultNetworkTier(name, id, state, options);
    }
}
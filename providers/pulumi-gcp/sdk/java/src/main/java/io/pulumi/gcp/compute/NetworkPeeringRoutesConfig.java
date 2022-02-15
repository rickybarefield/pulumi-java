// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.NetworkPeeringRoutesConfigArgs;
import io.pulumi.gcp.compute.inputs.NetworkPeeringRoutesConfigState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/networkPeeringRoutesConfig:NetworkPeeringRoutesConfig")
public class NetworkPeeringRoutesConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="exportCustomRoutes", type=Boolean.class, parameters={})
    private Output<Boolean> exportCustomRoutes;

    public Output<Boolean> getExportCustomRoutes() {
        return this.exportCustomRoutes;
    }
    @OutputExport(name="importCustomRoutes", type=Boolean.class, parameters={})
    private Output<Boolean> importCustomRoutes;

    public Output<Boolean> getImportCustomRoutes() {
        return this.importCustomRoutes;
    }
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    public Output<String> getNetwork() {
        return this.network;
    }
    @OutputExport(name="peering", type=String.class, parameters={})
    private Output<String> peering;

    public Output<String> getPeering() {
        return this.peering;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public NetworkPeeringRoutesConfig(String name, NetworkPeeringRoutesConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkPeeringRoutesConfig:NetworkPeeringRoutesConfig", name, args == null ? NetworkPeeringRoutesConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NetworkPeeringRoutesConfig(String name, Input<String> id, @Nullable NetworkPeeringRoutesConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkPeeringRoutesConfig:NetworkPeeringRoutesConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NetworkPeeringRoutesConfig get(String name, Input<String> id, @Nullable NetworkPeeringRoutesConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkPeeringRoutesConfig(name, id, state, options);
    }
}
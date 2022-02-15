// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.ExternalVpnGatewayArgs;
import io.pulumi.gcp.compute.inputs.ExternalVpnGatewayState;
import io.pulumi.gcp.compute.outputs.ExternalVpnGatewayInterface;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/externalVpnGateway:ExternalVpnGateway")
public class ExternalVpnGateway extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="interfaces", type=List.class, parameters={ExternalVpnGatewayInterface.class})
    private Output</* @Nullable */ List<ExternalVpnGatewayInterface>> interfaces;

    public Output</* @Nullable */ List<ExternalVpnGatewayInterface>> getInterfaces() {
        return this.interfaces;
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
    @OutputExport(name="redundancyType", type=String.class, parameters={})
    private Output</* @Nullable */ String> redundancyType;

    public Output</* @Nullable */ String> getRedundancyType() {
        return this.redundancyType;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    public ExternalVpnGateway(String name, @Nullable ExternalVpnGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/externalVpnGateway:ExternalVpnGateway", name, args == null ? ExternalVpnGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ExternalVpnGateway(String name, Input<String> id, @Nullable ExternalVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/externalVpnGateway:ExternalVpnGateway", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ExternalVpnGateway get(String name, Input<String> id, @Nullable ExternalVpnGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExternalVpnGateway(name, id, state, options);
    }
}
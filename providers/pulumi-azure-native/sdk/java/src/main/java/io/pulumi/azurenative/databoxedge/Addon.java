// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.AddonArgs;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: ArcAddon, IoTAddon. */
@ResourceType(type="azure-native:databoxedge:Addon")
public class Addon extends io.pulumi.resources.CustomResource {
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Addon(String name, AddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Addon(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Addon", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:Addon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:Addon").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Addon get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, options);
    }
}
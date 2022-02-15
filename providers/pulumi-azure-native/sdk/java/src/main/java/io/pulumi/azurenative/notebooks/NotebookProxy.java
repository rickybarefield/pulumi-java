// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notebooks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.notebooks.NotebookProxyArgs;
import io.pulumi.azurenative.notebooks.outputs.NotebookResourceSystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:notebooks:NotebookProxy")
public class NotebookProxy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="hostname", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostname;

    public Output</* @Nullable */ String> getHostname() {
        return this.hostname;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="publicDns", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicDns;

    public Output</* @Nullable */ String> getPublicDns() {
        return this.publicDns;
    }
    @OutputExport(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    public Output</* @Nullable */ String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    @OutputExport(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }
    @OutputExport(name="secondaryAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> secondaryAppId;

    public Output</* @Nullable */ String> getSecondaryAppId() {
        return this.secondaryAppId;
    }
    @OutputExport(name="systemData", type=NotebookResourceSystemDataResponse.class, parameters={})
    private Output</* @Nullable */ NotebookResourceSystemDataResponse> systemData;

    public Output</* @Nullable */ NotebookResourceSystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public NotebookProxy(String name, NotebookProxyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notebooks:NotebookProxy", name, args == null ? NotebookProxyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NotebookProxy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:notebooks:NotebookProxy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:notebooks/v20191011preview:NotebookProxy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NotebookProxy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NotebookProxy(name, id, options);
    }
}
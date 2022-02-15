// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apps_v1.DaemonSetListArgs;
import io.pulumi.kubernetes.apps_v1.outputs.DaemonSet;
import io.pulumi.kubernetes.meta_v1.outputs.ListMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:apps/v1:DaemonSetList")
public class DaemonSetList extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="items", type=List.class, parameters={DaemonSet.class})
    private Output<List<DaemonSet>> items;

    public Output<List<DaemonSet>> getItems() {
        return this.items;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ListMeta.class, parameters={})
    private Output</* @Nullable */ ListMeta> metadata;

    public Output</* @Nullable */ ListMeta> getMetadata() {
        return this.metadata;
    }

    public DaemonSetList(String name, DaemonSetListArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1:DaemonSetList", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private DaemonSetList(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apps/v1:DaemonSetList", name, null, makeResourceOptions(options, id));
    }

    private static DaemonSetListArgs makeArgs(DaemonSetListArgs args) {
        var builder = args == null ? DaemonSetListArgs.builder() : DaemonSetListArgs.builder(args);
        return builder
            .setApiVersion("apps/v1")
            .setKind("DaemonSetList")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DaemonSetList get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DaemonSetList(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.core_v1.NodeArgs;
import io.pulumi.kubernetes.core_v1.outputs.NodeSpec;
import io.pulumi.kubernetes.core_v1.outputs.NodeStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="kubernetes:core/v1:Node")
public class Node extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    @OutputExport(name="spec", type=NodeSpec.class, parameters={})
    private Output</* @Nullable */ NodeSpec> spec;

    public Output</* @Nullable */ NodeSpec> getSpec() {
        return this.spec;
    }
    @OutputExport(name="status", type=NodeStatus.class, parameters={})
    private Output</* @Nullable */ NodeStatus> status;

    public Output</* @Nullable */ NodeStatus> getStatus() {
        return this.status;
    }

    public Node(String name, @Nullable NodeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:Node", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private Node(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:Node", name, null, makeResourceOptions(options, id));
    }

    private static NodeArgs makeArgs(@Nullable NodeArgs args) {
        var builder = args == null ? NodeArgs.builder() : NodeArgs.builder(args);
        return builder
            .setApiVersion("v1")
            .setKind("Node")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Node get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Node(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.NodeGroupArgs;
import io.pulumi.gcp.compute.inputs.NodeGroupState;
import io.pulumi.gcp.compute.outputs.NodeGroupAutoscalingPolicy;
import io.pulumi.gcp.compute.outputs.NodeGroupMaintenanceWindow;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/nodeGroup:NodeGroup")
public class NodeGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoscalingPolicy", type=NodeGroupAutoscalingPolicy.class, parameters={})
    private Output<NodeGroupAutoscalingPolicy> autoscalingPolicy;

    public Output<NodeGroupAutoscalingPolicy> getAutoscalingPolicy() {
        return this.autoscalingPolicy;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="initialSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> initialSize;

    public Output</* @Nullable */ Integer> getInitialSize() {
        return this.initialSize;
    }
    @OutputExport(name="maintenancePolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenancePolicy;

    public Output</* @Nullable */ String> getMaintenancePolicy() {
        return this.maintenancePolicy;
    }
    @OutputExport(name="maintenanceWindow", type=NodeGroupMaintenanceWindow.class, parameters={})
    private Output</* @Nullable */ NodeGroupMaintenanceWindow> maintenanceWindow;

    public Output</* @Nullable */ NodeGroupMaintenanceWindow> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nodeTemplate", type=String.class, parameters={})
    private Output<String> nodeTemplate;

    public Output<String> getNodeTemplate() {
        return this.nodeTemplate;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="size", type=Integer.class, parameters={})
    private Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output<String> zone;

    public Output<String> getZone() {
        return this.zone;
    }

    public NodeGroup(String name, NodeGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeGroup:NodeGroup", name, args == null ? NodeGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private NodeGroup(String name, Input<String> id, @Nullable NodeGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/nodeGroup:NodeGroup", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static NodeGroup get(String name, Input<String> id, @Nullable NodeGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NodeGroup(name, id, state, options);
    }
}
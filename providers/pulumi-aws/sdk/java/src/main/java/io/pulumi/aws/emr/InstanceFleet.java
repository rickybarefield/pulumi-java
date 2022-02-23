// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.emr.InstanceFleetArgs;
import io.pulumi.aws.emr.inputs.InstanceFleetState;
import io.pulumi.aws.emr.outputs.InstanceFleetInstanceTypeConfig;
import io.pulumi.aws.emr.outputs.InstanceFleetLaunchSpecifications;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an Elastic MapReduce Cluster Instance Fleet configuration.
 * See [Amazon Elastic MapReduce Documentation](https://aws.amazon.com/documentation/emr/) for more information.
 * 
 * > **NOTE:** At this time, Instance Fleets cannot be destroyed through the API nor
 * web interface. Instance Fleets are destroyed when the EMR Cluster is destroyed.
 * the provider will resize any Instance Fleet to zero when destroying the resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EMR Instance Fleet can be imported with the EMR Cluster identifier and Instance Fleet identifier separated by a forward slash (`/`), e.g., console
 * 
 * ```sh
 *  $ pulumi import aws:emr/instanceFleet:InstanceFleet example j-123456ABCDEF/if-15EK4O09RZLNR
 * ```
 * 
 */
@ResourceType(type="aws:emr/instanceFleet:InstanceFleet")
public class InstanceFleet extends io.pulumi.resources.CustomResource {
    /**
     * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * Configuration block for instance fleet
     * 
     */
    @OutputExport(name="instanceTypeConfigs", type=List.class, parameters={InstanceFleetInstanceTypeConfig.class})
    private Output</* @Nullable */ List<InstanceFleetInstanceTypeConfig>> instanceTypeConfigs;

    /**
     * @return Configuration block for instance fleet
     * 
     */
    public Output</* @Nullable */ List<InstanceFleetInstanceTypeConfig>> getInstanceTypeConfigs() {
        return this.instanceTypeConfigs;
    }
    /**
     * Configuration block for launch specification
     * 
     */
    @OutputExport(name="launchSpecifications", type=InstanceFleetLaunchSpecifications.class, parameters={})
    private Output</* @Nullable */ InstanceFleetLaunchSpecifications> launchSpecifications;

    /**
     * @return Configuration block for launch specification
     * 
     */
    public Output</* @Nullable */ InstanceFleetLaunchSpecifications> getLaunchSpecifications() {
        return this.launchSpecifications;
    }
    /**
     * Friendly name given to the instance fleet.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Friendly name given to the instance fleet.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisionedOnDemandCapacity", type=Integer.class, parameters={})
    private Output<Integer> provisionedOnDemandCapacity;

    public Output<Integer> getProvisionedOnDemandCapacity() {
        return this.provisionedOnDemandCapacity;
    }
    @OutputExport(name="provisionedSpotCapacity", type=Integer.class, parameters={})
    private Output<Integer> provisionedSpotCapacity;

    public Output<Integer> getProvisionedSpotCapacity() {
        return this.provisionedSpotCapacity;
    }
    /**
     * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    @OutputExport(name="targetOnDemandCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> targetOnDemandCapacity;

    /**
     * @return The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision.
     * 
     */
    public Output</* @Nullable */ Integer> getTargetOnDemandCapacity() {
        return this.targetOnDemandCapacity;
    }
    /**
     * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    @OutputExport(name="targetSpotCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> targetSpotCapacity;

    /**
     * @return The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision.
     * 
     */
    public Output</* @Nullable */ Integer> getTargetSpotCapacity() {
        return this.targetSpotCapacity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceFleet(String name, InstanceFleetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/instanceFleet:InstanceFleet", name, args == null ? InstanceFleetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private InstanceFleet(String name, Input<String> id, @Nullable InstanceFleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/instanceFleet:InstanceFleet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceFleet get(String name, Input<String> id, @Nullable InstanceFleetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceFleet(name, id, state, options);
    }
}
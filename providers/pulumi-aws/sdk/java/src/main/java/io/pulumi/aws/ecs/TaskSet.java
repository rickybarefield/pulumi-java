// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.TaskSetArgs;
import io.pulumi.aws.ecs.inputs.TaskSetState;
import io.pulumi.aws.ecs.outputs.TaskSetCapacityProviderStrategy;
import io.pulumi.aws.ecs.outputs.TaskSetLoadBalancer;
import io.pulumi.aws.ecs.outputs.TaskSetNetworkConfiguration;
import io.pulumi.aws.ecs.outputs.TaskSetScale;
import io.pulumi.aws.ecs.outputs.TaskSetServiceRegistries;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * ECS Task Sets can be imported via the `task_set_id`, `service`, and `cluster` separated by commas (`,`) e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ecs/taskSet:TaskSet example ecs-svc/7177320696926227436,arn:aws:ecs:us-west-2:123456789101:service/example/example-1234567890,arn:aws:ecs:us-west-2:123456789101:cluster/example
 * ```
 * 
 */
@ResourceType(type="aws:ecs/taskSet:TaskSet")
public class TaskSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) that identifies the task set.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    @OutputExport(name="capacityProviderStrategies", type=List.class, parameters={TaskSetCapacityProviderStrategy.class})
    private Output</* @Nullable */ List<TaskSetCapacityProviderStrategy>> capacityProviderStrategies;

    /**
     * @return The capacity provider strategy to use for the service. Can be one or more.  Defined below.
     * 
     */
    public Output</* @Nullable */ List<TaskSetCapacityProviderStrategy>> getCapacityProviderStrategies() {
        return this.capacityProviderStrategies;
    }
    /**
     * The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    @OutputExport(name="cluster", type=String.class, parameters={})
    private Output<String> cluster;

    /**
     * @return The short name or ARN of the cluster that hosts the service to create the task set in.
     * 
     */
    public Output<String> getCluster() {
        return this.cluster;
    }
    /**
     * The external ID associated with the task set.
     * 
     */
    @OutputExport(name="externalId", type=String.class, parameters={})
    private Output<String> externalId;

    /**
     * @return The external ID associated with the task set.
     * 
     */
    public Output<String> getExternalId() {
        return this.externalId;
    }
    @OutputExport(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    public Output</* @Nullable */ Boolean> getForceDelete() {
        return this.forceDelete;
    }
    /**
     * The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    @OutputExport(name="launchType", type=String.class, parameters={})
    private Output<String> launchType;

    /**
     * @return The launch type on which to run your service. The valid values are `EC2`, `FARGATE`, and `EXTERNAL`. Defaults to `EC2`.
     * 
     */
    public Output<String> getLaunchType() {
        return this.launchType;
    }
    /**
     * Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    @OutputExport(name="loadBalancers", type=List.class, parameters={TaskSetLoadBalancer.class})
    private Output</* @Nullable */ List<TaskSetLoadBalancer>> loadBalancers;

    /**
     * @return Details on load balancers that are used with a task set. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<TaskSetLoadBalancer>> getLoadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    @OutputExport(name="networkConfiguration", type=TaskSetNetworkConfiguration.class, parameters={})
    private Output</* @Nullable */ TaskSetNetworkConfiguration> networkConfiguration;

    /**
     * @return The network configuration for the service. This parameter is required for task definitions that use the `awsvpc` network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. Detailed below.
     * 
     */
    public Output</* @Nullable */ TaskSetNetworkConfiguration> getNetworkConfiguration() {
        return this.networkConfiguration;
    }
    /**
     * The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    @OutputExport(name="platformVersion", type=String.class, parameters={})
    private Output<String> platformVersion;

    /**
     * @return The platform version on which to run your service. Only applicable for `launch_type` set to `FARGATE`. Defaults to `LATEST`. More information about Fargate platform versions can be found in the [AWS ECS User Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html).
     * 
     */
    public Output<String> getPlatformVersion() {
        return this.platformVersion;
    }
    /**
     * A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    @OutputExport(name="scale", type=TaskSetScale.class, parameters={})
    private Output<TaskSetScale> scale;

    /**
     * @return A floating-point percentage of the desired number of tasks to place and keep running in the task set. Detailed below.
     * 
     */
    public Output<TaskSetScale> getScale() {
        return this.scale;
    }
    /**
     * The short name or ARN of the ECS service.
     * 
     */
    @OutputExport(name="service", type=String.class, parameters={})
    private Output<String> service;

    /**
     * @return The short name or ARN of the ECS service.
     * 
     */
    public Output<String> getService() {
        return this.service;
    }
    /**
     * The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    @OutputExport(name="serviceRegistries", type=TaskSetServiceRegistries.class, parameters={})
    private Output</* @Nullable */ TaskSetServiceRegistries> serviceRegistries;

    /**
     * @return The service discovery registries for the service. The maximum number of `service_registries` blocks is `1`. Detailed below.
     * 
     */
    public Output</* @Nullable */ TaskSetServiceRegistries> getServiceRegistries() {
        return this.serviceRegistries;
    }
    /**
     * The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    @OutputExport(name="stabilityStatus", type=String.class, parameters={})
    private Output<String> stabilityStatus;

    /**
     * @return The stability status. This indicates whether the task set has reached a steady state.
     * 
     */
    public Output<String> getStabilityStatus() {
        return this.stabilityStatus;
    }
    /**
     * The status of the task set.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the task set.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     */
    @OutputExport(name="taskDefinition", type=String.class, parameters={})
    private Output<String> taskDefinition;

    /**
     * @return The family and revision (`family:revision`) or full ARN of the task definition that you want to run in your service.
     * 
     */
    public Output<String> getTaskDefinition() {
        return this.taskDefinition;
    }
    /**
     * The ID of the task set.
     * 
     */
    @OutputExport(name="taskSetId", type=String.class, parameters={})
    private Output<String> taskSetId;

    /**
     * @return The ID of the task set.
     * 
     */
    public Output<String> getTaskSetId() {
        return this.taskSetId;
    }
    @OutputExport(name="waitUntilStable", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitUntilStable;

    public Output</* @Nullable */ Boolean> getWaitUntilStable() {
        return this.waitUntilStable;
    }
    /**
     * Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    @OutputExport(name="waitUntilStableTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitUntilStableTimeout;

    /**
     * @return Wait timeout for task set to reach `STEADY_STATE`. Valid time units include `ns`, `us` (or `µs`), `ms`, `s`, `m`, and `h`. Default `10m`.
     * 
     */
    public Output</* @Nullable */ String> getWaitUntilStableTimeout() {
        return this.waitUntilStableTimeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TaskSet(String name, TaskSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, args == null ? TaskSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TaskSet(String name, Input<String> id, @Nullable TaskSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/taskSet:TaskSet", name, state, makeResourceOptions(options, id));
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
    public static TaskSet get(String name, Input<String> id, @Nullable TaskSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TaskSet(name, id, state, options);
    }
}
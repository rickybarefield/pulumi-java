// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dax.ClusterArgs;
import io.pulumi.aws.dax.inputs.ClusterState;
import io.pulumi.aws.dax.outputs.ClusterNode;
import io.pulumi.aws.dax.outputs.ClusterServerSideEncryption;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a DAX Cluster resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DAX Clusters can be imported using the `cluster_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dax/cluster:Cluster my_cluster my_cluster
 * ```
 * 
 *  [1]http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes
 * 
 */
@ResourceType(type="aws:dax/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the DAX cluster
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the DAX cluster
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * List of Availability Zones in which the
     * nodes will be created
     * 
     */
    @OutputExport(name="availabilityZones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> availabilityZones;

    /**
     * @return List of Availability Zones in which the
     * nodes will be created
     * 
     */
    public Output</* @Nullable */ List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The DNS name of the DAX cluster without the port appended
     * 
     */
    @OutputExport(name="clusterAddress", type=String.class, parameters={})
    private Output<String> clusterAddress;

    /**
     * @return The DNS name of the DAX cluster without the port appended
     * 
     */
    public Output<String> getClusterAddress() {
        return this.clusterAddress;
    }
    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    @OutputExport(name="clusterEndpointEncryptionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterEndpointEncryptionType;

    /**
     * @return The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    public Output</* @Nullable */ String> getClusterEndpointEncryptionType() {
        return this.clusterEndpointEncryptionType;
    }
    /**
     * Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    @OutputExport(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    public Output<String> getClusterName() {
        return this.clusterName;
    }
    /**
     * The configuration endpoint for this DAX cluster,
     * consisting of a DNS name and a port number
     * 
     */
    @OutputExport(name="configurationEndpoint", type=String.class, parameters={})
    private Output<String> configurationEndpoint;

    /**
     * @return The configuration endpoint for this DAX cluster,
     * consisting of a DNS name and a port number
     * 
     */
    public Output<String> getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }
    /**
     * Description for the cluster
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the cluster
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     * 
     */
    @OutputExport(name="iamRoleArn", type=String.class, parameters={})
    private Output<String> iamRoleArn;

    /**
     * @return A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     * 
     */
    public Output<String> getIamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    @OutputExport(name="maintenanceWindow", type=String.class, parameters={})
    private Output<String> maintenanceWindow;

    /**
     * @return Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    @OutputExport(name="nodeType", type=String.class, parameters={})
    private Output<String> nodeType;

    /**
     * @return The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    public Output<String> getNodeType() {
        return this.nodeType;
    }
    /**
     * List of node objects including `id`, `address`, `port` and
     * `availability_zone`. Referenceable e.g., as
     * `${aws_dax_cluster.test.nodes.0.address}`
     * 
     */
    @OutputExport(name="nodes", type=List.class, parameters={ClusterNode.class})
    private Output<List<ClusterNode>> nodes;

    /**
     * @return List of node objects including `id`, `address`, `port` and
     * `availability_zone`. Referenceable e.g., as
     * `${aws_dax_cluster.test.nodes.0.address}`
     * 
     */
    public Output<List<ClusterNode>> getNodes() {
        return this.nodes;
    }
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    @OutputExport(name="notificationTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationTopicArn;

    /**
     * @return An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    public Output</* @Nullable */ String> getNotificationTopicArn() {
        return this.notificationTopicArn;
    }
    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    @OutputExport(name="parameterGroupName", type=String.class, parameters={})
    private Output<String> parameterGroupName;

    /**
     * @return Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    public Output<String> getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * The port used by the configuration endpoint
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port used by the configuration endpoint
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    @OutputExport(name="replicationFactor", type=Integer.class, parameters={})
    private Output<Integer> replicationFactor;

    /**
     * @return The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    public Output<Integer> getReplicationFactor() {
        return this.replicationFactor;
    }
    /**
     * One or more VPC security groups associated
     * with the cluster
     * 
     */
    @OutputExport(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> securityGroupIds;

    /**
     * @return One or more VPC security groups associated
     * with the cluster
     * 
     */
    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * Encrypt at rest options
     * 
     */
    @OutputExport(name="serverSideEncryption", type=ClusterServerSideEncryption.class, parameters={})
    private Output</* @Nullable */ ClusterServerSideEncryption> serverSideEncryption;

    /**
     * @return Encrypt at rest options
     * 
     */
    public Output</* @Nullable */ ClusterServerSideEncryption> getServerSideEncryption() {
        return this.serverSideEncryption;
    }
    /**
     * Name of the subnet group to be used for the
     * cluster
     * 
     */
    @OutputExport(name="subnetGroupName", type=String.class, parameters={})
    private Output<String> subnetGroupName;

    /**
     * @return Name of the subnet group to be used for the
     * cluster
     * 
     */
    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dax/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dax/cluster:Cluster", name, state, makeResourceOptions(options, id));
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
    public static Cluster get(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
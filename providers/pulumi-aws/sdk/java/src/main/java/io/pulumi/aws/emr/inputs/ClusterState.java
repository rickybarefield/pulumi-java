// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterAutoTerminationPolicyGetArgs;
import io.pulumi.aws.emr.inputs.ClusterBootstrapActionGetArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceFleetGetArgs;
import io.pulumi.aws.emr.inputs.ClusterCoreInstanceGroupGetArgs;
import io.pulumi.aws.emr.inputs.ClusterEc2AttributesGetArgs;
import io.pulumi.aws.emr.inputs.ClusterKerberosAttributesGetArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceFleetGetArgs;
import io.pulumi.aws.emr.inputs.ClusterMasterInstanceGroupGetArgs;
import io.pulumi.aws.emr.inputs.ClusterStepGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * JSON string for selecting additional features such as adding proxy information. Note: Currently there is no API to retrieve the value of this argument after EMR cluster creation from provider, therefore this provider cannot detect drift from the actual EMR cluster if its value is changed outside this provider.
     * 
     */
    @InputImport(name="additionalInfo")
    private final @Nullable Input<String> additionalInfo;

    public Input<String> getAdditionalInfo() {
        return this.additionalInfo == null ? Input.empty() : this.additionalInfo;
    }

    /**
     * List of applications for the cluster. Valid values are: `Flink`, `Hadoop`, `Hive`, `Mahout`, `Pig`, `Spark`, and `JupyterHub` (as of EMR 5.14.0). Case insensitive.
     * 
     */
    @InputImport(name="applications")
    private final @Nullable Input<List<String>> applications;

    public Input<List<String>> getApplications() {
        return this.applications == null ? Input.empty() : this.applications;
    }

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * An auto-termination policy for an Amazon EMR cluster. An auto-termination policy defines the amount of idle time in seconds after which a cluster automatically terminates. See Auto Termination Policy Below.
     * 
     */
    @InputImport(name="autoTerminationPolicy")
    private final @Nullable Input<ClusterAutoTerminationPolicyGetArgs> autoTerminationPolicy;

    public Input<ClusterAutoTerminationPolicyGetArgs> getAutoTerminationPolicy() {
        return this.autoTerminationPolicy == null ? Input.empty() : this.autoTerminationPolicy;
    }

    /**
     * IAM role for automatic scaling policies. The IAM role provides permissions that the automatic scaling feature requires to launch and terminate EC2 instances in an instance group.
     * 
     */
    @InputImport(name="autoscalingRole")
    private final @Nullable Input<String> autoscalingRole;

    public Input<String> getAutoscalingRole() {
        return this.autoscalingRole == null ? Input.empty() : this.autoscalingRole;
    }

    /**
     * Ordered list of bootstrap actions that will be run before Hadoop is started on the cluster nodes. See below.
     * 
     */
    @InputImport(name="bootstrapActions")
    private final @Nullable Input<List<ClusterBootstrapActionGetArgs>> bootstrapActions;

    public Input<List<ClusterBootstrapActionGetArgs>> getBootstrapActions() {
        return this.bootstrapActions == null ? Input.empty() : this.bootstrapActions;
    }

    @InputImport(name="clusterState")
    private final @Nullable Input<String> clusterState;

    public Input<String> getClusterState() {
        return this.clusterState == null ? Input.empty() : this.clusterState;
    }

    /**
     * Configuration classification that applies when provisioning cluster instances, which can include configurations for applications and software that run on the cluster. List of `configuration` blocks.
     * 
     */
    @InputImport(name="configurations")
    private final @Nullable Input<String> configurations;

    public Input<String> getConfigurations() {
        return this.configurations == null ? Input.empty() : this.configurations;
    }

    /**
     * JSON string for supplying list of configurations for the EMR cluster.
     * 
     */
    @InputImport(name="configurationsJson")
    private final @Nullable Input<String> configurationsJson;

    public Input<String> getConfigurationsJson() {
        return this.configurationsJson == null ? Input.empty() : this.configurationsJson;
    }

    /**
     * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the core node type. Cannot be specified if any `core_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    @InputImport(name="coreInstanceFleet")
    private final @Nullable Input<ClusterCoreInstanceFleetGetArgs> coreInstanceFleet;

    public Input<ClusterCoreInstanceFleetGetArgs> getCoreInstanceFleet() {
        return this.coreInstanceFleet == null ? Input.empty() : this.coreInstanceFleet;
    }

    /**
     * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [core node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-core).
     * 
     */
    @InputImport(name="coreInstanceGroup")
    private final @Nullable Input<ClusterCoreInstanceGroupGetArgs> coreInstanceGroup;

    public Input<ClusterCoreInstanceGroupGetArgs> getCoreInstanceGroup() {
        return this.coreInstanceGroup == null ? Input.empty() : this.coreInstanceGroup;
    }

    /**
     * Custom Amazon Linux AMI for the cluster (instead of an EMR-owned AMI). Available in Amazon EMR version 5.7.0 and later.
     * 
     */
    @InputImport(name="customAmiId")
    private final @Nullable Input<String> customAmiId;

    public Input<String> getCustomAmiId() {
        return this.customAmiId == null ? Input.empty() : this.customAmiId;
    }

    /**
     * Size in GiB of the EBS root device volume of the Linux AMI that is used for each EC2 instance. Available in Amazon EMR version 4.x and later.
     * 
     */
    @InputImport(name="ebsRootVolumeSize")
    private final @Nullable Input<Integer> ebsRootVolumeSize;

    public Input<Integer> getEbsRootVolumeSize() {
        return this.ebsRootVolumeSize == null ? Input.empty() : this.ebsRootVolumeSize;
    }

    /**
     * Attributes for the EC2 instances running the job flow. See below.
     * 
     */
    @InputImport(name="ec2Attributes")
    private final @Nullable Input<ClusterEc2AttributesGetArgs> ec2Attributes;

    public Input<ClusterEc2AttributesGetArgs> getEc2Attributes() {
        return this.ec2Attributes == null ? Input.empty() : this.ec2Attributes;
    }

    /**
     * Switch on/off run cluster with no steps or when all steps are complete (default is on)
     * 
     */
    @InputImport(name="keepJobFlowAliveWhenNoSteps")
    private final @Nullable Input<Boolean> keepJobFlowAliveWhenNoSteps;

    public Input<Boolean> getKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps == null ? Input.empty() : this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * Kerberos configuration for the cluster. See below.
     * 
     */
    @InputImport(name="kerberosAttributes")
    private final @Nullable Input<ClusterKerberosAttributesGetArgs> kerberosAttributes;

    public Input<ClusterKerberosAttributesGetArgs> getKerberosAttributes() {
        return this.kerberosAttributes == null ? Input.empty() : this.kerberosAttributes;
    }

    /**
     * AWS KMS customer master key (CMK) key ID or arn used for encrypting log files. This attribute is only available with EMR version 5.30.0 and later, excluding EMR 6.0.0.
     * 
     */
    @InputImport(name="logEncryptionKmsKeyId")
    private final @Nullable Input<String> logEncryptionKmsKeyId;

    public Input<String> getLogEncryptionKmsKeyId() {
        return this.logEncryptionKmsKeyId == null ? Input.empty() : this.logEncryptionKmsKeyId;
    }

    /**
     * S3 bucket to write the log files of the job flow. If a value is not provided, logs are not created.
     * 
     */
    @InputImport(name="logUri")
    private final @Nullable Input<String> logUri;

    public Input<String> getLogUri() {
        return this.logUri == null ? Input.empty() : this.logUri;
    }

    /**
     * Configuration block to use an [Instance Fleet](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-fleet.html) for the master node type. Cannot be specified if any `master_instance_group` configuration blocks are set. Detailed below.
     * 
     */
    @InputImport(name="masterInstanceFleet")
    private final @Nullable Input<ClusterMasterInstanceFleetGetArgs> masterInstanceFleet;

    public Input<ClusterMasterInstanceFleetGetArgs> getMasterInstanceFleet() {
        return this.masterInstanceFleet == null ? Input.empty() : this.masterInstanceFleet;
    }

    /**
     * Configuration block to use an [Instance Group](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-instance-group-configuration.html#emr-plan-instance-groups) for the [master node type](https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-master-core-task-nodes.html#emr-plan-master).
     * 
     */
    @InputImport(name="masterInstanceGroup")
    private final @Nullable Input<ClusterMasterInstanceGroupGetArgs> masterInstanceGroup;

    public Input<ClusterMasterInstanceGroupGetArgs> getMasterInstanceGroup() {
        return this.masterInstanceGroup == null ? Input.empty() : this.masterInstanceGroup;
    }

    /**
     * The DNS name of the master node. If the cluster is on a private subnet, this is the private DNS name. On a public subnet, this is the public DNS name.
     * 
     */
    @InputImport(name="masterPublicDns")
    private final @Nullable Input<String> masterPublicDns;

    public Input<String> getMasterPublicDns() {
        return this.masterPublicDns == null ? Input.empty() : this.masterPublicDns;
    }

    /**
     * Name of the step.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Release label for the Amazon EMR release.
     * 
     */
    @InputImport(name="releaseLabel")
    private final @Nullable Input<String> releaseLabel;

    public Input<String> getReleaseLabel() {
        return this.releaseLabel == null ? Input.empty() : this.releaseLabel;
    }

    /**
     * Way that individual Amazon EC2 instances terminate when an automatic scale-in activity occurs or an `instance group` is resized.
     * 
     */
    @InputImport(name="scaleDownBehavior")
    private final @Nullable Input<String> scaleDownBehavior;

    public Input<String> getScaleDownBehavior() {
        return this.scaleDownBehavior == null ? Input.empty() : this.scaleDownBehavior;
    }

    /**
     * Security configuration name to attach to the EMR cluster. Only valid for EMR clusters with `release_label` 4.8.0 or greater.
     * 
     */
    @InputImport(name="securityConfiguration")
    private final @Nullable Input<String> securityConfiguration;

    public Input<String> getSecurityConfiguration() {
        return this.securityConfiguration == null ? Input.empty() : this.securityConfiguration;
    }

    /**
     * IAM role that will be assumed by the Amazon EMR service to access AWS resources.
     * 
     */
    @InputImport(name="serviceRole")
    private final @Nullable Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole == null ? Input.empty() : this.serviceRole;
    }

    /**
     * Number of steps that can be executed concurrently. You can specify a maximum of 256 steps. Only valid for EMR clusters with `release_label` 5.28.0 or greater (default is 1).
     * 
     */
    @InputImport(name="stepConcurrencyLevel")
    private final @Nullable Input<Integer> stepConcurrencyLevel;

    public Input<Integer> getStepConcurrencyLevel() {
        return this.stepConcurrencyLevel == null ? Input.empty() : this.stepConcurrencyLevel;
    }

    /**
     * List of steps to run when creating the cluster. See below. It is highly recommended to utilize the lifecycle resource options block with `ignoreChanges` if other steps are being managed outside of this provider.
     * 
     */
    @InputImport(name="steps")
    private final @Nullable Input<List<ClusterStepGetArgs>> steps;

    public Input<List<ClusterStepGetArgs>> getSteps() {
        return this.steps == null ? Input.empty() : this.steps;
    }

    /**
     * list of tags to apply to the EMR Cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Switch on/off termination protection (default is `false`, except when using multiple master nodes). Before attempting to destroy the resource when termination protection is enabled, this configuration must be applied with its value set to `false`.
     * 
     */
    @InputImport(name="terminationProtection")
    private final @Nullable Input<Boolean> terminationProtection;

    public Input<Boolean> getTerminationProtection() {
        return this.terminationProtection == null ? Input.empty() : this.terminationProtection;
    }

    /**
     * Whether the job flow is visible to all IAM users of the AWS account associated with the job flow. Default value is `true`.
     * 
     */
    @InputImport(name="visibleToAllUsers")
    private final @Nullable Input<Boolean> visibleToAllUsers;

    public Input<Boolean> getVisibleToAllUsers() {
        return this.visibleToAllUsers == null ? Input.empty() : this.visibleToAllUsers;
    }

    public ClusterState(
        @Nullable Input<String> additionalInfo,
        @Nullable Input<List<String>> applications,
        @Nullable Input<String> arn,
        @Nullable Input<ClusterAutoTerminationPolicyGetArgs> autoTerminationPolicy,
        @Nullable Input<String> autoscalingRole,
        @Nullable Input<List<ClusterBootstrapActionGetArgs>> bootstrapActions,
        @Nullable Input<String> clusterState,
        @Nullable Input<String> configurations,
        @Nullable Input<String> configurationsJson,
        @Nullable Input<ClusterCoreInstanceFleetGetArgs> coreInstanceFleet,
        @Nullable Input<ClusterCoreInstanceGroupGetArgs> coreInstanceGroup,
        @Nullable Input<String> customAmiId,
        @Nullable Input<Integer> ebsRootVolumeSize,
        @Nullable Input<ClusterEc2AttributesGetArgs> ec2Attributes,
        @Nullable Input<Boolean> keepJobFlowAliveWhenNoSteps,
        @Nullable Input<ClusterKerberosAttributesGetArgs> kerberosAttributes,
        @Nullable Input<String> logEncryptionKmsKeyId,
        @Nullable Input<String> logUri,
        @Nullable Input<ClusterMasterInstanceFleetGetArgs> masterInstanceFleet,
        @Nullable Input<ClusterMasterInstanceGroupGetArgs> masterInstanceGroup,
        @Nullable Input<String> masterPublicDns,
        @Nullable Input<String> name,
        @Nullable Input<String> releaseLabel,
        @Nullable Input<String> scaleDownBehavior,
        @Nullable Input<String> securityConfiguration,
        @Nullable Input<String> serviceRole,
        @Nullable Input<Integer> stepConcurrencyLevel,
        @Nullable Input<List<ClusterStepGetArgs>> steps,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> terminationProtection,
        @Nullable Input<Boolean> visibleToAllUsers) {
        this.additionalInfo = additionalInfo;
        this.applications = applications;
        this.arn = arn;
        this.autoTerminationPolicy = autoTerminationPolicy;
        this.autoscalingRole = autoscalingRole;
        this.bootstrapActions = bootstrapActions;
        this.clusterState = clusterState;
        this.configurations = configurations;
        this.configurationsJson = configurationsJson;
        this.coreInstanceFleet = coreInstanceFleet;
        this.coreInstanceGroup = coreInstanceGroup;
        this.customAmiId = customAmiId;
        this.ebsRootVolumeSize = ebsRootVolumeSize;
        this.ec2Attributes = ec2Attributes;
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
        this.kerberosAttributes = kerberosAttributes;
        this.logEncryptionKmsKeyId = logEncryptionKmsKeyId;
        this.logUri = logUri;
        this.masterInstanceFleet = masterInstanceFleet;
        this.masterInstanceGroup = masterInstanceGroup;
        this.masterPublicDns = masterPublicDns;
        this.name = name;
        this.releaseLabel = releaseLabel;
        this.scaleDownBehavior = scaleDownBehavior;
        this.securityConfiguration = securityConfiguration;
        this.serviceRole = serviceRole;
        this.stepConcurrencyLevel = stepConcurrencyLevel;
        this.steps = steps;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.terminationProtection = terminationProtection;
        this.visibleToAllUsers = visibleToAllUsers;
    }

    private ClusterState() {
        this.additionalInfo = Input.empty();
        this.applications = Input.empty();
        this.arn = Input.empty();
        this.autoTerminationPolicy = Input.empty();
        this.autoscalingRole = Input.empty();
        this.bootstrapActions = Input.empty();
        this.clusterState = Input.empty();
        this.configurations = Input.empty();
        this.configurationsJson = Input.empty();
        this.coreInstanceFleet = Input.empty();
        this.coreInstanceGroup = Input.empty();
        this.customAmiId = Input.empty();
        this.ebsRootVolumeSize = Input.empty();
        this.ec2Attributes = Input.empty();
        this.keepJobFlowAliveWhenNoSteps = Input.empty();
        this.kerberosAttributes = Input.empty();
        this.logEncryptionKmsKeyId = Input.empty();
        this.logUri = Input.empty();
        this.masterInstanceFleet = Input.empty();
        this.masterInstanceGroup = Input.empty();
        this.masterPublicDns = Input.empty();
        this.name = Input.empty();
        this.releaseLabel = Input.empty();
        this.scaleDownBehavior = Input.empty();
        this.securityConfiguration = Input.empty();
        this.serviceRole = Input.empty();
        this.stepConcurrencyLevel = Input.empty();
        this.steps = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.terminationProtection = Input.empty();
        this.visibleToAllUsers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> additionalInfo;
        private @Nullable Input<List<String>> applications;
        private @Nullable Input<String> arn;
        private @Nullable Input<ClusterAutoTerminationPolicyGetArgs> autoTerminationPolicy;
        private @Nullable Input<String> autoscalingRole;
        private @Nullable Input<List<ClusterBootstrapActionGetArgs>> bootstrapActions;
        private @Nullable Input<String> clusterState;
        private @Nullable Input<String> configurations;
        private @Nullable Input<String> configurationsJson;
        private @Nullable Input<ClusterCoreInstanceFleetGetArgs> coreInstanceFleet;
        private @Nullable Input<ClusterCoreInstanceGroupGetArgs> coreInstanceGroup;
        private @Nullable Input<String> customAmiId;
        private @Nullable Input<Integer> ebsRootVolumeSize;
        private @Nullable Input<ClusterEc2AttributesGetArgs> ec2Attributes;
        private @Nullable Input<Boolean> keepJobFlowAliveWhenNoSteps;
        private @Nullable Input<ClusterKerberosAttributesGetArgs> kerberosAttributes;
        private @Nullable Input<String> logEncryptionKmsKeyId;
        private @Nullable Input<String> logUri;
        private @Nullable Input<ClusterMasterInstanceFleetGetArgs> masterInstanceFleet;
        private @Nullable Input<ClusterMasterInstanceGroupGetArgs> masterInstanceGroup;
        private @Nullable Input<String> masterPublicDns;
        private @Nullable Input<String> name;
        private @Nullable Input<String> releaseLabel;
        private @Nullable Input<String> scaleDownBehavior;
        private @Nullable Input<String> securityConfiguration;
        private @Nullable Input<String> serviceRole;
        private @Nullable Input<Integer> stepConcurrencyLevel;
        private @Nullable Input<List<ClusterStepGetArgs>> steps;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> terminationProtection;
        private @Nullable Input<Boolean> visibleToAllUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.applications = defaults.applications;
    	      this.arn = defaults.arn;
    	      this.autoTerminationPolicy = defaults.autoTerminationPolicy;
    	      this.autoscalingRole = defaults.autoscalingRole;
    	      this.bootstrapActions = defaults.bootstrapActions;
    	      this.clusterState = defaults.clusterState;
    	      this.configurations = defaults.configurations;
    	      this.configurationsJson = defaults.configurationsJson;
    	      this.coreInstanceFleet = defaults.coreInstanceFleet;
    	      this.coreInstanceGroup = defaults.coreInstanceGroup;
    	      this.customAmiId = defaults.customAmiId;
    	      this.ebsRootVolumeSize = defaults.ebsRootVolumeSize;
    	      this.ec2Attributes = defaults.ec2Attributes;
    	      this.keepJobFlowAliveWhenNoSteps = defaults.keepJobFlowAliveWhenNoSteps;
    	      this.kerberosAttributes = defaults.kerberosAttributes;
    	      this.logEncryptionKmsKeyId = defaults.logEncryptionKmsKeyId;
    	      this.logUri = defaults.logUri;
    	      this.masterInstanceFleet = defaults.masterInstanceFleet;
    	      this.masterInstanceGroup = defaults.masterInstanceGroup;
    	      this.masterPublicDns = defaults.masterPublicDns;
    	      this.name = defaults.name;
    	      this.releaseLabel = defaults.releaseLabel;
    	      this.scaleDownBehavior = defaults.scaleDownBehavior;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.serviceRole = defaults.serviceRole;
    	      this.stepConcurrencyLevel = defaults.stepConcurrencyLevel;
    	      this.steps = defaults.steps;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.terminationProtection = defaults.terminationProtection;
    	      this.visibleToAllUsers = defaults.visibleToAllUsers;
        }

        public Builder setAdditionalInfo(@Nullable Input<String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setAdditionalInfo(@Nullable String additionalInfo) {
            this.additionalInfo = Input.ofNullable(additionalInfo);
            return this;
        }

        public Builder setApplications(@Nullable Input<List<String>> applications) {
            this.applications = applications;
            return this;
        }

        public Builder setApplications(@Nullable List<String> applications) {
            this.applications = Input.ofNullable(applications);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAutoTerminationPolicy(@Nullable Input<ClusterAutoTerminationPolicyGetArgs> autoTerminationPolicy) {
            this.autoTerminationPolicy = autoTerminationPolicy;
            return this;
        }

        public Builder setAutoTerminationPolicy(@Nullable ClusterAutoTerminationPolicyGetArgs autoTerminationPolicy) {
            this.autoTerminationPolicy = Input.ofNullable(autoTerminationPolicy);
            return this;
        }

        public Builder setAutoscalingRole(@Nullable Input<String> autoscalingRole) {
            this.autoscalingRole = autoscalingRole;
            return this;
        }

        public Builder setAutoscalingRole(@Nullable String autoscalingRole) {
            this.autoscalingRole = Input.ofNullable(autoscalingRole);
            return this;
        }

        public Builder setBootstrapActions(@Nullable Input<List<ClusterBootstrapActionGetArgs>> bootstrapActions) {
            this.bootstrapActions = bootstrapActions;
            return this;
        }

        public Builder setBootstrapActions(@Nullable List<ClusterBootstrapActionGetArgs> bootstrapActions) {
            this.bootstrapActions = Input.ofNullable(bootstrapActions);
            return this;
        }

        public Builder setClusterState(@Nullable Input<String> clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        public Builder setClusterState(@Nullable String clusterState) {
            this.clusterState = Input.ofNullable(clusterState);
            return this;
        }

        public Builder setConfigurations(@Nullable Input<String> configurations) {
            this.configurations = configurations;
            return this;
        }

        public Builder setConfigurations(@Nullable String configurations) {
            this.configurations = Input.ofNullable(configurations);
            return this;
        }

        public Builder setConfigurationsJson(@Nullable Input<String> configurationsJson) {
            this.configurationsJson = configurationsJson;
            return this;
        }

        public Builder setConfigurationsJson(@Nullable String configurationsJson) {
            this.configurationsJson = Input.ofNullable(configurationsJson);
            return this;
        }

        public Builder setCoreInstanceFleet(@Nullable Input<ClusterCoreInstanceFleetGetArgs> coreInstanceFleet) {
            this.coreInstanceFleet = coreInstanceFleet;
            return this;
        }

        public Builder setCoreInstanceFleet(@Nullable ClusterCoreInstanceFleetGetArgs coreInstanceFleet) {
            this.coreInstanceFleet = Input.ofNullable(coreInstanceFleet);
            return this;
        }

        public Builder setCoreInstanceGroup(@Nullable Input<ClusterCoreInstanceGroupGetArgs> coreInstanceGroup) {
            this.coreInstanceGroup = coreInstanceGroup;
            return this;
        }

        public Builder setCoreInstanceGroup(@Nullable ClusterCoreInstanceGroupGetArgs coreInstanceGroup) {
            this.coreInstanceGroup = Input.ofNullable(coreInstanceGroup);
            return this;
        }

        public Builder setCustomAmiId(@Nullable Input<String> customAmiId) {
            this.customAmiId = customAmiId;
            return this;
        }

        public Builder setCustomAmiId(@Nullable String customAmiId) {
            this.customAmiId = Input.ofNullable(customAmiId);
            return this;
        }

        public Builder setEbsRootVolumeSize(@Nullable Input<Integer> ebsRootVolumeSize) {
            this.ebsRootVolumeSize = ebsRootVolumeSize;
            return this;
        }

        public Builder setEbsRootVolumeSize(@Nullable Integer ebsRootVolumeSize) {
            this.ebsRootVolumeSize = Input.ofNullable(ebsRootVolumeSize);
            return this;
        }

        public Builder setEc2Attributes(@Nullable Input<ClusterEc2AttributesGetArgs> ec2Attributes) {
            this.ec2Attributes = ec2Attributes;
            return this;
        }

        public Builder setEc2Attributes(@Nullable ClusterEc2AttributesGetArgs ec2Attributes) {
            this.ec2Attributes = Input.ofNullable(ec2Attributes);
            return this;
        }

        public Builder setKeepJobFlowAliveWhenNoSteps(@Nullable Input<Boolean> keepJobFlowAliveWhenNoSteps) {
            this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
            return this;
        }

        public Builder setKeepJobFlowAliveWhenNoSteps(@Nullable Boolean keepJobFlowAliveWhenNoSteps) {
            this.keepJobFlowAliveWhenNoSteps = Input.ofNullable(keepJobFlowAliveWhenNoSteps);
            return this;
        }

        public Builder setKerberosAttributes(@Nullable Input<ClusterKerberosAttributesGetArgs> kerberosAttributes) {
            this.kerberosAttributes = kerberosAttributes;
            return this;
        }

        public Builder setKerberosAttributes(@Nullable ClusterKerberosAttributesGetArgs kerberosAttributes) {
            this.kerberosAttributes = Input.ofNullable(kerberosAttributes);
            return this;
        }

        public Builder setLogEncryptionKmsKeyId(@Nullable Input<String> logEncryptionKmsKeyId) {
            this.logEncryptionKmsKeyId = logEncryptionKmsKeyId;
            return this;
        }

        public Builder setLogEncryptionKmsKeyId(@Nullable String logEncryptionKmsKeyId) {
            this.logEncryptionKmsKeyId = Input.ofNullable(logEncryptionKmsKeyId);
            return this;
        }

        public Builder setLogUri(@Nullable Input<String> logUri) {
            this.logUri = logUri;
            return this;
        }

        public Builder setLogUri(@Nullable String logUri) {
            this.logUri = Input.ofNullable(logUri);
            return this;
        }

        public Builder setMasterInstanceFleet(@Nullable Input<ClusterMasterInstanceFleetGetArgs> masterInstanceFleet) {
            this.masterInstanceFleet = masterInstanceFleet;
            return this;
        }

        public Builder setMasterInstanceFleet(@Nullable ClusterMasterInstanceFleetGetArgs masterInstanceFleet) {
            this.masterInstanceFleet = Input.ofNullable(masterInstanceFleet);
            return this;
        }

        public Builder setMasterInstanceGroup(@Nullable Input<ClusterMasterInstanceGroupGetArgs> masterInstanceGroup) {
            this.masterInstanceGroup = masterInstanceGroup;
            return this;
        }

        public Builder setMasterInstanceGroup(@Nullable ClusterMasterInstanceGroupGetArgs masterInstanceGroup) {
            this.masterInstanceGroup = Input.ofNullable(masterInstanceGroup);
            return this;
        }

        public Builder setMasterPublicDns(@Nullable Input<String> masterPublicDns) {
            this.masterPublicDns = masterPublicDns;
            return this;
        }

        public Builder setMasterPublicDns(@Nullable String masterPublicDns) {
            this.masterPublicDns = Input.ofNullable(masterPublicDns);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setReleaseLabel(@Nullable Input<String> releaseLabel) {
            this.releaseLabel = releaseLabel;
            return this;
        }

        public Builder setReleaseLabel(@Nullable String releaseLabel) {
            this.releaseLabel = Input.ofNullable(releaseLabel);
            return this;
        }

        public Builder setScaleDownBehavior(@Nullable Input<String> scaleDownBehavior) {
            this.scaleDownBehavior = scaleDownBehavior;
            return this;
        }

        public Builder setScaleDownBehavior(@Nullable String scaleDownBehavior) {
            this.scaleDownBehavior = Input.ofNullable(scaleDownBehavior);
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable Input<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder setSecurityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Input.ofNullable(securityConfiguration);
            return this;
        }

        public Builder setServiceRole(@Nullable Input<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder setServiceRole(@Nullable String serviceRole) {
            this.serviceRole = Input.ofNullable(serviceRole);
            return this;
        }

        public Builder setStepConcurrencyLevel(@Nullable Input<Integer> stepConcurrencyLevel) {
            this.stepConcurrencyLevel = stepConcurrencyLevel;
            return this;
        }

        public Builder setStepConcurrencyLevel(@Nullable Integer stepConcurrencyLevel) {
            this.stepConcurrencyLevel = Input.ofNullable(stepConcurrencyLevel);
            return this;
        }

        public Builder setSteps(@Nullable Input<List<ClusterStepGetArgs>> steps) {
            this.steps = steps;
            return this;
        }

        public Builder setSteps(@Nullable List<ClusterStepGetArgs> steps) {
            this.steps = Input.ofNullable(steps);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setTerminationProtection(@Nullable Input<Boolean> terminationProtection) {
            this.terminationProtection = terminationProtection;
            return this;
        }

        public Builder setTerminationProtection(@Nullable Boolean terminationProtection) {
            this.terminationProtection = Input.ofNullable(terminationProtection);
            return this;
        }

        public Builder setVisibleToAllUsers(@Nullable Input<Boolean> visibleToAllUsers) {
            this.visibleToAllUsers = visibleToAllUsers;
            return this;
        }

        public Builder setVisibleToAllUsers(@Nullable Boolean visibleToAllUsers) {
            this.visibleToAllUsers = Input.ofNullable(visibleToAllUsers);
            return this;
        }
        public ClusterState build() {
            return new ClusterState(additionalInfo, applications, arn, autoTerminationPolicy, autoscalingRole, bootstrapActions, clusterState, configurations, configurationsJson, coreInstanceFleet, coreInstanceGroup, customAmiId, ebsRootVolumeSize, ec2Attributes, keepJobFlowAliveWhenNoSteps, kerberosAttributes, logEncryptionKmsKeyId, logUri, masterInstanceFleet, masterInstanceGroup, masterPublicDns, name, releaseLabel, scaleDownBehavior, securityConfiguration, serviceRole, stepConcurrencyLevel, steps, tags, tagsAll, terminationProtection, visibleToAllUsers);
        }
    }
}
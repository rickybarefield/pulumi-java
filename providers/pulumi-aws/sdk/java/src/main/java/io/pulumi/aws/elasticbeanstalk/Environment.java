// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticbeanstalk.EnvironmentArgs;
import io.pulumi.aws.elasticbeanstalk.inputs.EnvironmentState;
import io.pulumi.aws.elasticbeanstalk.outputs.EnvironmentAllSetting;
import io.pulumi.aws.elasticbeanstalk.outputs.EnvironmentSetting;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Beanstalk Environment Resource. Elastic Beanstalk allows
 * you to deploy and manage applications in the AWS cloud without worrying about
 * the infrastructure that runs those applications.
 * 
 * Environments are often things such as `development`, `integration`, or
 * `production`.
 * 
 * ## Example Usage
 * ## Option Settings
 * 
 * Some options can be stack-specific, check [AWS Docs](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options-general.html)
 * for supported options and examples.
 * 
 * The `setting` and `all_settings` mappings support the following format:
 * 
 * * `namespace` - unique namespace identifying the option's associated AWS resource
 * * `name` - name of the configuration option
 * * `value` - value for the configuration option
 * * `resource` - (Optional) resource name for [scheduled action](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options-general.html#command-options-general-autoscalingscheduledaction)
 * 
 * ### Example With Options
 * 
 * ## Import
 * 
 * Elastic Beanstalk Environments can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:elasticbeanstalk/environment:Environment prodenv e-rpqsewtp2j
 * ```
 * 
 */
@ResourceType(type="aws:elasticbeanstalk/environment:Environment")
public class Environment extends io.pulumi.resources.CustomResource {
    /**
     * List of all option settings configured in this Environment. These
     * are a combination of default settings and their overrides from `setting` in
     * the configuration.
     * 
     */
    @OutputExport(name="allSettings", type=List.class, parameters={EnvironmentAllSetting.class})
    private Output<List<EnvironmentAllSetting>> allSettings;

    /**
     * @return List of all option settings configured in this Environment. These
     * are a combination of default settings and their overrides from `setting` in
     * the configuration.
     * 
     */
    public Output<List<EnvironmentAllSetting>> getAllSettings() {
        return this.allSettings;
    }
    /**
     * Name of the application that contains the version
     * to be deployed
     * 
     */
    @OutputExport(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return Name of the application that contains the version
     * to be deployed
     * 
     */
    public Output<String> getApplication() {
        return this.application;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The autoscaling groups used by this Environment.
     * 
     */
    @OutputExport(name="autoscalingGroups", type=List.class, parameters={String.class})
    private Output<List<String>> autoscalingGroups;

    /**
     * @return The autoscaling groups used by this Environment.
     * 
     */
    public Output<List<String>> getAutoscalingGroups() {
        return this.autoscalingGroups;
    }
    /**
     * Fully qualified DNS name for this Environment.
     * 
     */
    @OutputExport(name="cname", type=String.class, parameters={})
    private Output<String> cname;

    /**
     * @return Fully qualified DNS name for this Environment.
     * 
     */
    public Output<String> getCname() {
        return this.cname;
    }
    /**
     * Prefix to use for the fully qualified DNS name of
     * the Environment.
     * 
     */
    @OutputExport(name="cnamePrefix", type=String.class, parameters={})
    private Output<String> cnamePrefix;

    /**
     * @return Prefix to use for the fully qualified DNS name of
     * the Environment.
     * 
     */
    public Output<String> getCnamePrefix() {
        return this.cnamePrefix;
    }
    /**
     * Short description of the Environment
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Short description of the Environment
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The URL to the Load Balancer for this Environment
     * 
     */
    @OutputExport(name="endpointUrl", type=String.class, parameters={})
    private Output<String> endpointUrl;

    /**
     * @return The URL to the Load Balancer for this Environment
     * 
     */
    public Output<String> getEndpointUrl() {
        return this.endpointUrl;
    }
    /**
     * Instances used by this Environment.
     * 
     */
    @OutputExport(name="instances", type=List.class, parameters={String.class})
    private Output<List<String>> instances;

    /**
     * @return Instances used by this Environment.
     * 
     */
    public Output<List<String>> getInstances() {
        return this.instances;
    }
    /**
     * Launch configurations in use by this Environment.
     * 
     */
    @OutputExport(name="launchConfigurations", type=List.class, parameters={String.class})
    private Output<List<String>> launchConfigurations;

    /**
     * @return Launch configurations in use by this Environment.
     * 
     */
    public Output<List<String>> getLaunchConfigurations() {
        return this.launchConfigurations;
    }
    /**
     * Elastic load balancers in use by this Environment.
     * 
     */
    @OutputExport(name="loadBalancers", type=List.class, parameters={String.class})
    private Output<List<String>> loadBalancers;

    /**
     * @return Elastic load balancers in use by this Environment.
     * 
     */
    public Output<List<String>> getLoadBalancers() {
        return this.loadBalancers;
    }
    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
     * to use in deployment
     * 
     */
    @OutputExport(name="platformArn", type=String.class, parameters={})
    private Output<String> platformArn;

    /**
     * @return The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
     * to use in deployment
     * 
     */
    public Output<String> getPlatformArn() {
        return this.platformArn;
    }
    /**
     * The time between polling the AWS API to
     * check if changes have been applied. Use this to adjust the rate of API calls
     * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
     * use the default behavior, which is an exponential backoff
     * 
     */
    @OutputExport(name="pollInterval", type=String.class, parameters={})
    private Output</* @Nullable */ String> pollInterval;

    /**
     * @return The time between polling the AWS API to
     * check if changes have been applied. Use this to adjust the rate of API calls
     * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
     * use the default behavior, which is an exponential backoff
     * 
     */
    public Output</* @Nullable */ String> getPollInterval() {
        return this.pollInterval;
    }
    /**
     * SQS queues in use by this Environment.
     * 
     */
    @OutputExport(name="queues", type=List.class, parameters={String.class})
    private Output<List<String>> queues;

    /**
     * @return SQS queues in use by this Environment.
     * 
     */
    public Output<List<String>> getQueues() {
        return this.queues;
    }
    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @OutputExport(name="settings", type=List.class, parameters={EnvironmentSetting.class})
    private Output</* @Nullable */ List<EnvironmentSetting>> settings;

    /**
     * @return Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    public Output</* @Nullable */ List<EnvironmentSetting>> getSettings() {
        return this.settings;
    }
    /**
     * A solution stack to base your environment
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @OutputExport(name="solutionStackName", type=String.class, parameters={})
    private Output<String> solutionStackName;

    /**
     * @return A solution stack to base your environment
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    public Output<String> getSolutionStackName() {
        return this.solutionStackName;
    }
    /**
     * A set of tags to apply to the Environment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A set of tags to apply to the Environment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The name of the Elastic Beanstalk Configuration
     * template to use in deployment
     * 
     */
    @OutputExport(name="templateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateName;

    /**
     * @return The name of the Elastic Beanstalk Configuration
     * template to use in deployment
     * 
     */
    public Output</* @Nullable */ String> getTemplateName() {
        return this.templateName;
    }
    /**
     * Elastic Beanstalk Environment tier. Valid values are `Worker`
     * or `WebServer`. If tier is left blank `WebServer` will be used.
     * 
     */
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    /**
     * @return Elastic Beanstalk Environment tier. Valid values are `Worker`
     * or `WebServer`. If tier is left blank `WebServer` will be used.
     * 
     */
    public Output</* @Nullable */ String> getTier() {
        return this.tier;
    }
    /**
     * Autoscaling triggers in use by this Environment.
     * 
     */
    @OutputExport(name="triggers", type=List.class, parameters={String.class})
    private Output<List<String>> triggers;

    /**
     * @return Autoscaling triggers in use by this Environment.
     * 
     */
    public Output<List<String>> getTriggers() {
        return this.triggers;
    }
    /**
     * The name of the Elastic Beanstalk Application Version
     * to use in deployment.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The name of the Elastic Beanstalk Application Version
     * to use in deployment.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }
    /**
     * The maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for an Elastic Beanstalk Environment to be in a ready state before timing
     * out.
     * 
     */
    @OutputExport(name="waitForReadyTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitForReadyTimeout;

    /**
     * @return The maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for an Elastic Beanstalk Environment to be in a ready state before timing
     * out.
     * 
     */
    public Output</* @Nullable */ String> getWaitForReadyTimeout() {
        return this.waitForReadyTimeout;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Environment(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/environment:Environment", name, state, makeResourceOptions(options, id));
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
    public static Environment get(String name, Input<String> id, @Nullable EnvironmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
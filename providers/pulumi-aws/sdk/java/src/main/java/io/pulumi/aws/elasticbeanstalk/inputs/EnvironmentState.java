// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.aws.elasticbeanstalk.inputs.EnvironmentAllSettingGetArgs;
import io.pulumi.aws.elasticbeanstalk.inputs.EnvironmentSettingGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentState Empty = new EnvironmentState();

    /**
     * List of all option settings configured in this Environment. These
     * are a combination of default settings and their overrides from `setting` in
     * the configuration.
     * 
     */
    @InputImport(name="allSettings")
    private final @Nullable Input<List<EnvironmentAllSettingGetArgs>> allSettings;

    public Input<List<EnvironmentAllSettingGetArgs>> getAllSettings() {
        return this.allSettings == null ? Input.empty() : this.allSettings;
    }

    /**
     * Name of the application that contains the version
     * to be deployed
     * 
     */
    @InputImport(name="application")
    private final @Nullable Input<String> application;

    public Input<String> getApplication() {
        return this.application == null ? Input.empty() : this.application;
    }

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The autoscaling groups used by this Environment.
     * 
     */
    @InputImport(name="autoscalingGroups")
    private final @Nullable Input<List<String>> autoscalingGroups;

    public Input<List<String>> getAutoscalingGroups() {
        return this.autoscalingGroups == null ? Input.empty() : this.autoscalingGroups;
    }

    /**
     * Fully qualified DNS name for this Environment.
     * 
     */
    @InputImport(name="cname")
    private final @Nullable Input<String> cname;

    public Input<String> getCname() {
        return this.cname == null ? Input.empty() : this.cname;
    }

    /**
     * Prefix to use for the fully qualified DNS name of
     * the Environment.
     * 
     */
    @InputImport(name="cnamePrefix")
    private final @Nullable Input<String> cnamePrefix;

    public Input<String> getCnamePrefix() {
        return this.cnamePrefix == null ? Input.empty() : this.cnamePrefix;
    }

    /**
     * Short description of the Environment
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The URL to the Load Balancer for this Environment
     * 
     */
    @InputImport(name="endpointUrl")
    private final @Nullable Input<String> endpointUrl;

    public Input<String> getEndpointUrl() {
        return this.endpointUrl == null ? Input.empty() : this.endpointUrl;
    }

    /**
     * Instances used by this Environment.
     * 
     */
    @InputImport(name="instances")
    private final @Nullable Input<List<String>> instances;

    public Input<List<String>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * Launch configurations in use by this Environment.
     * 
     */
    @InputImport(name="launchConfigurations")
    private final @Nullable Input<List<String>> launchConfigurations;

    public Input<List<String>> getLaunchConfigurations() {
        return this.launchConfigurations == null ? Input.empty() : this.launchConfigurations;
    }

    /**
     * Elastic load balancers in use by this Environment.
     * 
     */
    @InputImport(name="loadBalancers")
    private final @Nullable Input<List<String>> loadBalancers;

    public Input<List<String>> getLoadBalancers() {
        return this.loadBalancers == null ? Input.empty() : this.loadBalancers;
    }

    /**
     * A unique name for this Environment. This name is used
     * in the application URL
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The [ARN](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) of the Elastic Beanstalk [Platform](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-beanstalk-environment.html#cfn-beanstalk-environment-platformarn)
     * to use in deployment
     * 
     */
    @InputImport(name="platformArn")
    private final @Nullable Input<String> platformArn;

    public Input<String> getPlatformArn() {
        return this.platformArn == null ? Input.empty() : this.platformArn;
    }

    /**
     * The time between polling the AWS API to
     * check if changes have been applied. Use this to adjust the rate of API calls
     * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
     * use the default behavior, which is an exponential backoff
     * 
     */
    @InputImport(name="pollInterval")
    private final @Nullable Input<String> pollInterval;

    public Input<String> getPollInterval() {
        return this.pollInterval == null ? Input.empty() : this.pollInterval;
    }

    /**
     * SQS queues in use by this Environment.
     * 
     */
    @InputImport(name="queues")
    private final @Nullable Input<List<String>> queues;

    public Input<List<String>> getQueues() {
        return this.queues == null ? Input.empty() : this.queues;
    }

    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @InputImport(name="settings")
    private final @Nullable Input<List<EnvironmentSettingGetArgs>> settings;

    public Input<List<EnvironmentSettingGetArgs>> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * A solution stack to base your environment
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @InputImport(name="solutionStackName")
    private final @Nullable Input<String> solutionStackName;

    public Input<String> getSolutionStackName() {
        return this.solutionStackName == null ? Input.empty() : this.solutionStackName;
    }

    /**
     * A set of tags to apply to the Environment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The name of the Elastic Beanstalk Configuration
     * template to use in deployment
     * 
     */
    @InputImport(name="templateName")
    private final @Nullable Input<String> templateName;

    public Input<String> getTemplateName() {
        return this.templateName == null ? Input.empty() : this.templateName;
    }

    /**
     * Elastic Beanstalk Environment tier. Valid values are `Worker`
     * or `WebServer`. If tier is left blank `WebServer` will be used.
     * 
     */
    @InputImport(name="tier")
    private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    /**
     * Autoscaling triggers in use by this Environment.
     * 
     */
    @InputImport(name="triggers")
    private final @Nullable Input<List<String>> triggers;

    public Input<List<String>> getTriggers() {
        return this.triggers == null ? Input.empty() : this.triggers;
    }

    /**
     * The name of the Elastic Beanstalk Application Version
     * to use in deployment.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * The maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for an Elastic Beanstalk Environment to be in a ready state before timing
     * out.
     * 
     */
    @InputImport(name="waitForReadyTimeout")
    private final @Nullable Input<String> waitForReadyTimeout;

    public Input<String> getWaitForReadyTimeout() {
        return this.waitForReadyTimeout == null ? Input.empty() : this.waitForReadyTimeout;
    }

    public EnvironmentState(
        @Nullable Input<List<EnvironmentAllSettingGetArgs>> allSettings,
        @Nullable Input<String> application,
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> autoscalingGroups,
        @Nullable Input<String> cname,
        @Nullable Input<String> cnamePrefix,
        @Nullable Input<String> description,
        @Nullable Input<String> endpointUrl,
        @Nullable Input<List<String>> instances,
        @Nullable Input<List<String>> launchConfigurations,
        @Nullable Input<List<String>> loadBalancers,
        @Nullable Input<String> name,
        @Nullable Input<String> platformArn,
        @Nullable Input<String> pollInterval,
        @Nullable Input<List<String>> queues,
        @Nullable Input<List<EnvironmentSettingGetArgs>> settings,
        @Nullable Input<String> solutionStackName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> templateName,
        @Nullable Input<String> tier,
        @Nullable Input<List<String>> triggers,
        @Nullable Input<String> version,
        @Nullable Input<String> waitForReadyTimeout) {
        this.allSettings = allSettings;
        this.application = application;
        this.arn = arn;
        this.autoscalingGroups = autoscalingGroups;
        this.cname = cname;
        this.cnamePrefix = cnamePrefix;
        this.description = description;
        this.endpointUrl = endpointUrl;
        this.instances = instances;
        this.launchConfigurations = launchConfigurations;
        this.loadBalancers = loadBalancers;
        this.name = name;
        this.platformArn = platformArn;
        this.pollInterval = pollInterval;
        this.queues = queues;
        this.settings = settings;
        this.solutionStackName = solutionStackName;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.templateName = templateName;
        this.tier = tier;
        this.triggers = triggers;
        this.version = version;
        this.waitForReadyTimeout = waitForReadyTimeout;
    }

    private EnvironmentState() {
        this.allSettings = Input.empty();
        this.application = Input.empty();
        this.arn = Input.empty();
        this.autoscalingGroups = Input.empty();
        this.cname = Input.empty();
        this.cnamePrefix = Input.empty();
        this.description = Input.empty();
        this.endpointUrl = Input.empty();
        this.instances = Input.empty();
        this.launchConfigurations = Input.empty();
        this.loadBalancers = Input.empty();
        this.name = Input.empty();
        this.platformArn = Input.empty();
        this.pollInterval = Input.empty();
        this.queues = Input.empty();
        this.settings = Input.empty();
        this.solutionStackName = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.templateName = Input.empty();
        this.tier = Input.empty();
        this.triggers = Input.empty();
        this.version = Input.empty();
        this.waitForReadyTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EnvironmentAllSettingGetArgs>> allSettings;
        private @Nullable Input<String> application;
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> autoscalingGroups;
        private @Nullable Input<String> cname;
        private @Nullable Input<String> cnamePrefix;
        private @Nullable Input<String> description;
        private @Nullable Input<String> endpointUrl;
        private @Nullable Input<List<String>> instances;
        private @Nullable Input<List<String>> launchConfigurations;
        private @Nullable Input<List<String>> loadBalancers;
        private @Nullable Input<String> name;
        private @Nullable Input<String> platformArn;
        private @Nullable Input<String> pollInterval;
        private @Nullable Input<List<String>> queues;
        private @Nullable Input<List<EnvironmentSettingGetArgs>> settings;
        private @Nullable Input<String> solutionStackName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> templateName;
        private @Nullable Input<String> tier;
        private @Nullable Input<List<String>> triggers;
        private @Nullable Input<String> version;
        private @Nullable Input<String> waitForReadyTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSettings = defaults.allSettings;
    	      this.application = defaults.application;
    	      this.arn = defaults.arn;
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.cname = defaults.cname;
    	      this.cnamePrefix = defaults.cnamePrefix;
    	      this.description = defaults.description;
    	      this.endpointUrl = defaults.endpointUrl;
    	      this.instances = defaults.instances;
    	      this.launchConfigurations = defaults.launchConfigurations;
    	      this.loadBalancers = defaults.loadBalancers;
    	      this.name = defaults.name;
    	      this.platformArn = defaults.platformArn;
    	      this.pollInterval = defaults.pollInterval;
    	      this.queues = defaults.queues;
    	      this.settings = defaults.settings;
    	      this.solutionStackName = defaults.solutionStackName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.templateName = defaults.templateName;
    	      this.tier = defaults.tier;
    	      this.triggers = defaults.triggers;
    	      this.version = defaults.version;
    	      this.waitForReadyTimeout = defaults.waitForReadyTimeout;
        }

        public Builder setAllSettings(@Nullable Input<List<EnvironmentAllSettingGetArgs>> allSettings) {
            this.allSettings = allSettings;
            return this;
        }

        public Builder setAllSettings(@Nullable List<EnvironmentAllSettingGetArgs> allSettings) {
            this.allSettings = Input.ofNullable(allSettings);
            return this;
        }

        public Builder setApplication(@Nullable Input<String> application) {
            this.application = application;
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

        public Builder setAutoscalingGroups(@Nullable Input<List<String>> autoscalingGroups) {
            this.autoscalingGroups = autoscalingGroups;
            return this;
        }

        public Builder setAutoscalingGroups(@Nullable List<String> autoscalingGroups) {
            this.autoscalingGroups = Input.ofNullable(autoscalingGroups);
            return this;
        }

        public Builder setCname(@Nullable Input<String> cname) {
            this.cname = cname;
            return this;
        }

        public Builder setCname(@Nullable String cname) {
            this.cname = Input.ofNullable(cname);
            return this;
        }

        public Builder setCnamePrefix(@Nullable Input<String> cnamePrefix) {
            this.cnamePrefix = cnamePrefix;
            return this;
        }

        public Builder setCnamePrefix(@Nullable String cnamePrefix) {
            this.cnamePrefix = Input.ofNullable(cnamePrefix);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEndpointUrl(@Nullable Input<String> endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }

        public Builder setEndpointUrl(@Nullable String endpointUrl) {
            this.endpointUrl = Input.ofNullable(endpointUrl);
            return this;
        }

        public Builder setInstances(@Nullable Input<List<String>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<String> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setLaunchConfigurations(@Nullable Input<List<String>> launchConfigurations) {
            this.launchConfigurations = launchConfigurations;
            return this;
        }

        public Builder setLaunchConfigurations(@Nullable List<String> launchConfigurations) {
            this.launchConfigurations = Input.ofNullable(launchConfigurations);
            return this;
        }

        public Builder setLoadBalancers(@Nullable Input<List<String>> loadBalancers) {
            this.loadBalancers = loadBalancers;
            return this;
        }

        public Builder setLoadBalancers(@Nullable List<String> loadBalancers) {
            this.loadBalancers = Input.ofNullable(loadBalancers);
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

        public Builder setPlatformArn(@Nullable Input<String> platformArn) {
            this.platformArn = platformArn;
            return this;
        }

        public Builder setPlatformArn(@Nullable String platformArn) {
            this.platformArn = Input.ofNullable(platformArn);
            return this;
        }

        public Builder setPollInterval(@Nullable Input<String> pollInterval) {
            this.pollInterval = pollInterval;
            return this;
        }

        public Builder setPollInterval(@Nullable String pollInterval) {
            this.pollInterval = Input.ofNullable(pollInterval);
            return this;
        }

        public Builder setQueues(@Nullable Input<List<String>> queues) {
            this.queues = queues;
            return this;
        }

        public Builder setQueues(@Nullable List<String> queues) {
            this.queues = Input.ofNullable(queues);
            return this;
        }

        public Builder setSettings(@Nullable Input<List<EnvironmentSettingGetArgs>> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable List<EnvironmentSettingGetArgs> settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setSolutionStackName(@Nullable Input<String> solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }

        public Builder setSolutionStackName(@Nullable String solutionStackName) {
            this.solutionStackName = Input.ofNullable(solutionStackName);
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

        public Builder setTemplateName(@Nullable Input<String> templateName) {
            this.templateName = templateName;
            return this;
        }

        public Builder setTemplateName(@Nullable String templateName) {
            this.templateName = Input.ofNullable(templateName);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder setTriggers(@Nullable Input<List<String>> triggers) {
            this.triggers = triggers;
            return this;
        }

        public Builder setTriggers(@Nullable List<String> triggers) {
            this.triggers = Input.ofNullable(triggers);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setWaitForReadyTimeout(@Nullable Input<String> waitForReadyTimeout) {
            this.waitForReadyTimeout = waitForReadyTimeout;
            return this;
        }

        public Builder setWaitForReadyTimeout(@Nullable String waitForReadyTimeout) {
            this.waitForReadyTimeout = Input.ofNullable(waitForReadyTimeout);
            return this;
        }
        public EnvironmentState build() {
            return new EnvironmentState(allSettings, application, arn, autoscalingGroups, cname, cnamePrefix, description, endpointUrl, instances, launchConfigurations, loadBalancers, name, platformArn, pollInterval, queues, settings, solutionStackName, tags, tagsAll, templateName, tier, triggers, version, waitForReadyTimeout);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dms.EventSubscriptionArgs;
import io.pulumi.aws.dms.inputs.EventSubscriptionState;
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
 * Provides a DMS (Data Migration Service) event subscription resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Event subscriptions can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:dms/eventSubscription:EventSubscription test my-awesome-event-subscription
 * ```
 * 
 */
@ResourceType(type="aws:dms/eventSubscription:EventSubscription")
public class EventSubscription extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DMS Event Subscription.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DMS Event Subscription.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether the event subscription should be enabled.
     * 
     */
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the event subscription should be enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
     * 
     */
    @OutputExport(name="eventCategories", type=List.class, parameters={String.class})
    private Output<List<String>> eventCategories;

    /**
     * @return List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
     * 
     */
    public Output<List<String>> getEventCategories() {
        return this.eventCategories;
    }
    /**
     * Name of event subscription.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of event subscription.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * SNS topic arn to send events on.
     * 
     */
    @OutputExport(name="snsTopicArn", type=String.class, parameters={})
    private Output<String> snsTopicArn;

    /**
     * @return SNS topic arn to send events on.
     * 
     */
    public Output<String> getSnsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * Ids of sources to listen to.
     * 
     */
    @OutputExport(name="sourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourceIds;

    /**
     * @return Ids of sources to listen to.
     * 
     */
    public Output</* @Nullable */ List<String>> getSourceIds() {
        return this.sourceIds;
    }
    /**
     * Type of source for events. Valid values: `replication-instance` or `replication-task`
     * 
     */
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return Type of source for events. Valid values: `replication-instance` or `replication-task`
     * 
     */
    public Output</* @Nullable */ String> getSourceType() {
        return this.sourceType;
    }
    /**
     * Map of resource tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/eventSubscription:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EventSubscription(String name, Input<String> id, @Nullable EventSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/eventSubscription:EventSubscription", name, state, makeResourceOptions(options, id));
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
    public static EventSubscription get(String name, Input<String> id, @Nullable EventSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, state, options);
    }
}
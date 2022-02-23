// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ActiveReceiptRuleSetArgs;
import io.pulumi.aws.ses.inputs.ActiveReceiptRuleSetState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to designate the active SES receipt rule set
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet")
public class ActiveReceiptRuleSet extends io.pulumi.resources.CustomResource {
    /**
     * The SES receipt rule set ARN.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The SES receipt rule set ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the rule set
     * 
     */
    @OutputExport(name="ruleSetName", type=String.class, parameters={})
    private Output<String> ruleSetName;

    /**
     * @return The name of the rule set
     * 
     */
    public Output<String> getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActiveReceiptRuleSet(String name, ActiveReceiptRuleSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, args == null ? ActiveReceiptRuleSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ActiveReceiptRuleSet(String name, Input<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/activeReceiptRuleSet:ActiveReceiptRuleSet", name, state, makeResourceOptions(options, id));
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
    public static ActiveReceiptRuleSet get(String name, Input<String> id, @Nullable ActiveReceiptRuleSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActiveReceiptRuleSet(name, id, state, options);
    }
}
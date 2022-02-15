// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ActivityLogAlertArgs;
import io.pulumi.azurenative.insights.outputs.ActionListResponse;
import io.pulumi.azurenative.insights.outputs.AlertRuleAllOfConditionResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:ActivityLogAlert")
public class ActivityLogAlert extends io.pulumi.resources.CustomResource {
    @OutputExport(name="actions", type=ActionListResponse.class, parameters={})
    private Output<ActionListResponse> actions;

    public Output<ActionListResponse> getActions() {
        return this.actions;
    }
    @OutputExport(name="condition", type=AlertRuleAllOfConditionResponse.class, parameters={})
    private Output<AlertRuleAllOfConditionResponse> condition;

    public Output<AlertRuleAllOfConditionResponse> getCondition() {
        return this.condition;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ActivityLogAlert(String name, ActivityLogAlertArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActivityLogAlert", name, args == null ? ActivityLogAlertArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ActivityLogAlert(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ActivityLogAlert", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20170401:ActivityLogAlert").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20201001:ActivityLogAlert").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ActivityLogAlert get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActivityLogAlert(name, id, options);
    }
}
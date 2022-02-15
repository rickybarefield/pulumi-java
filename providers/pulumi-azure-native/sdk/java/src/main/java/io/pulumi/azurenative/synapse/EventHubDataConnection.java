// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.EventHubDataConnectionArgs;
import io.pulumi.azurenative.synapse.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:synapse:EventHubDataConnection")
public class EventHubDataConnection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="compression", type=String.class, parameters={})
    private Output</* @Nullable */ String> compression;

    public Output</* @Nullable */ String> getCompression() {
        return this.compression;
    }
    @OutputExport(name="consumerGroup", type=String.class, parameters={})
    private Output<String> consumerGroup;

    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }
    @OutputExport(name="dataFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataFormat;

    public Output</* @Nullable */ String> getDataFormat() {
        return this.dataFormat;
    }
    @OutputExport(name="eventHubResourceId", type=String.class, parameters={})
    private Output<String> eventHubResourceId;

    public Output<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }
    @OutputExport(name="eventSystemProperties", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventSystemProperties;

    public Output</* @Nullable */ List<String>> getEventSystemProperties() {
        return this.eventSystemProperties;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="mappingRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> mappingRuleName;

    public Output</* @Nullable */ String> getMappingRuleName() {
        return this.mappingRuleName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tableName", type=String.class, parameters={})
    private Output</* @Nullable */ String> tableName;

    public Output</* @Nullable */ String> getTableName() {
        return this.tableName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EventHubDataConnection(String name, EventHubDataConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EventHubDataConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:synapse:EventHubDataConnection", name, null, makeResourceOptions(options, id));
    }

    private static EventHubDataConnectionArgs makeArgs(EventHubDataConnectionArgs args) {
        var builder = args == null ? EventHubDataConnectionArgs.builder() : EventHubDataConnectionArgs.builder(args);
        return builder
            .setKind("EventHub")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:synapse/v20210401preview:EventHubDataConnection").build()),
                Input.of(Alias.builder().setType("azure-native:synapse/v20210601preview:EventHubDataConnection").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EventHubDataConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EventHubDataConnection(name, id, options);
    }
}
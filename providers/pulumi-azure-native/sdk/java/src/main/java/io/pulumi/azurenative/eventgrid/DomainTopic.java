// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.DomainTopicArgs;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:eventgrid:DomainTopic")
public class DomainTopic extends io.pulumi.resources.CustomResource {
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DomainTopic(String name, DomainTopicArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopic", name, args == null ? DomainTopicArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainTopic(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopic", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20190201preview:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20190601:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200101preview:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200401preview:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20200601:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20201015preview:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20210601preview:DomainTopic").build()),
                Input.of(Alias.builder().setType("azure-native:eventgrid/v20211201:DomainTopic").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DomainTopic get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainTopic(name, id, options);
    }
}
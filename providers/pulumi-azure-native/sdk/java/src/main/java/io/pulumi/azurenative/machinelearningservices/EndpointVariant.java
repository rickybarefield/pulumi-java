// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.EndpointVariantArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ACIServiceResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSServiceResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.AKSVariantResponseResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:machinelearningservices:EndpointVariant")
public class EndpointVariant extends io.pulumi.resources.CustomResource {
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
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
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    public Output<Object> getProperties() {
        return this.properties;
    }
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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

    public EndpointVariant(String name, EndpointVariantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:EndpointVariant", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private EndpointVariant(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:EndpointVariant", name, null, makeResourceOptions(options, id));
    }

    private static EndpointVariantArgs makeArgs(EndpointVariantArgs args) {
        var builder = args == null ? EndpointVariantArgs.builder() : EndpointVariantArgs.builder(args);
        return builder
            .setComputeType("Custom")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200501preview:EndpointVariant").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200515preview:EndpointVariant").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20200901preview:EndpointVariant").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210101:EndpointVariant").build()),
                Input.of(Alias.builder().setType("azure-native:machinelearningservices/v20210401:EndpointVariant").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static EndpointVariant get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EndpointVariant(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.GatewayApiEntityTagArgs;
import io.pulumi.azurenative.apimanagement.outputs.ApiVersionSetContractDetailsResponse;
import io.pulumi.azurenative.apimanagement.outputs.AuthenticationSettingsContractResponse;
import io.pulumi.azurenative.apimanagement.outputs.SubscriptionKeyParameterNamesContractResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:GatewayApiEntityTag")
public class GatewayApiEntityTag extends io.pulumi.resources.CustomResource {
    @OutputExport(name="apiRevision", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevision;

    public Output</* @Nullable */ String> getApiRevision() {
        return this.apiRevision;
    }
    @OutputExport(name="apiRevisionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiRevisionDescription;

    public Output</* @Nullable */ String> getApiRevisionDescription() {
        return this.apiRevisionDescription;
    }
    @OutputExport(name="apiType", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiType;

    public Output</* @Nullable */ String> getApiType() {
        return this.apiType;
    }
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    @OutputExport(name="apiVersionDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionDescription;

    public Output</* @Nullable */ String> getApiVersionDescription() {
        return this.apiVersionDescription;
    }
    @OutputExport(name="apiVersionSet", type=ApiVersionSetContractDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ApiVersionSetContractDetailsResponse> apiVersionSet;

    public Output</* @Nullable */ ApiVersionSetContractDetailsResponse> getApiVersionSet() {
        return this.apiVersionSet;
    }
    @OutputExport(name="apiVersionSetId", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersionSetId;

    public Output</* @Nullable */ String> getApiVersionSetId() {
        return this.apiVersionSetId;
    }
    @OutputExport(name="authenticationSettings", type=AuthenticationSettingsContractResponse.class, parameters={})
    private Output</* @Nullable */ AuthenticationSettingsContractResponse> authenticationSettings;

    public Output</* @Nullable */ AuthenticationSettingsContractResponse> getAuthenticationSettings() {
        return this.authenticationSettings;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="isCurrent", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isCurrent;

    public Output</* @Nullable */ Boolean> getIsCurrent() {
        return this.isCurrent;
    }
    @OutputExport(name="isOnline", type=Boolean.class, parameters={})
    private Output<Boolean> isOnline;

    public Output<Boolean> getIsOnline() {
        return this.isOnline;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="path", type=String.class, parameters={})
    private Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }
    @OutputExport(name="protocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> protocols;

    public Output</* @Nullable */ List<String>> getProtocols() {
        return this.protocols;
    }
    @OutputExport(name="serviceUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceUrl;

    public Output</* @Nullable */ String> getServiceUrl() {
        return this.serviceUrl;
    }
    @OutputExport(name="sourceApiId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceApiId;

    public Output</* @Nullable */ String> getSourceApiId() {
        return this.sourceApiId;
    }
    @OutputExport(name="subscriptionKeyParameterNames", type=SubscriptionKeyParameterNamesContractResponse.class, parameters={})
    private Output</* @Nullable */ SubscriptionKeyParameterNamesContractResponse> subscriptionKeyParameterNames;

    public Output</* @Nullable */ SubscriptionKeyParameterNamesContractResponse> getSubscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames;
    }
    @OutputExport(name="subscriptionRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subscriptionRequired;

    public Output</* @Nullable */ Boolean> getSubscriptionRequired() {
        return this.subscriptionRequired;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public GatewayApiEntityTag(String name, GatewayApiEntityTagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayApiEntityTag", name, args == null ? GatewayApiEntityTagArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GatewayApiEntityTag(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:GatewayApiEntityTag", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:GatewayApiEntityTag").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:GatewayApiEntityTag").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static GatewayApiEntityTag get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GatewayApiEntityTag(name, id, options);
    }
}
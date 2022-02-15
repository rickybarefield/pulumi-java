// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.WatchlistArgs;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.azurenative.securityinsights.outputs.WatchlistUserInfoResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:Watchlist")
public class Watchlist extends io.pulumi.resources.CustomResource {
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    @OutputExport(name="created", type=String.class, parameters={})
    private Output</* @Nullable */ String> created;

    public Output</* @Nullable */ String> getCreated() {
        return this.created;
    }
    @OutputExport(name="createdBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> createdBy;

    public Output</* @Nullable */ WatchlistUserInfoResponse> getCreatedBy() {
        return this.createdBy;
    }
    @OutputExport(name="defaultDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultDuration;

    public Output</* @Nullable */ String> getDefaultDuration() {
        return this.defaultDuration;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="isDeleted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isDeleted;

    public Output</* @Nullable */ Boolean> getIsDeleted() {
        return this.isDeleted;
    }
    @OutputExport(name="itemsSearchKey", type=String.class, parameters={})
    private Output<String> itemsSearchKey;

    public Output<String> getItemsSearchKey() {
        return this.itemsSearchKey;
    }
    @OutputExport(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    public Output</* @Nullable */ List<String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="numberOfLinesToSkip", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numberOfLinesToSkip;

    public Output</* @Nullable */ Integer> getNumberOfLinesToSkip() {
        return this.numberOfLinesToSkip;
    }
    @OutputExport(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    public Output<String> getProvider() {
        return this.provider;
    }
    @OutputExport(name="rawContent", type=String.class, parameters={})
    private Output</* @Nullable */ String> rawContent;

    public Output</* @Nullable */ String> getRawContent() {
        return this.rawContent;
    }
    @OutputExport(name="source", type=String.class, parameters={})
    private Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    public Output</* @Nullable */ String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="updated", type=String.class, parameters={})
    private Output</* @Nullable */ String> updated;

    public Output</* @Nullable */ String> getUpdated() {
        return this.updated;
    }
    @OutputExport(name="updatedBy", type=WatchlistUserInfoResponse.class, parameters={})
    private Output</* @Nullable */ WatchlistUserInfoResponse> updatedBy;

    public Output</* @Nullable */ WatchlistUserInfoResponse> getUpdatedBy() {
        return this.updatedBy;
    }
    @OutputExport(name="uploadStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> uploadStatus;

    public Output</* @Nullable */ String> getUploadStatus() {
        return this.uploadStatus;
    }
    @OutputExport(name="watchlistAlias", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistAlias;

    public Output</* @Nullable */ String> getWatchlistAlias() {
        return this.watchlistAlias;
    }
    @OutputExport(name="watchlistId", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistId;

    public Output</* @Nullable */ String> getWatchlistId() {
        return this.watchlistId;
    }
    @OutputExport(name="watchlistItemsCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> watchlistItemsCount;

    public Output</* @Nullable */ Integer> getWatchlistItemsCount() {
        return this.watchlistItemsCount;
    }
    @OutputExport(name="watchlistType", type=String.class, parameters={})
    private Output</* @Nullable */ String> watchlistType;

    public Output</* @Nullable */ String> getWatchlistType() {
        return this.watchlistType;
    }

    public Watchlist(String name, WatchlistArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Watchlist", name, args == null ? WatchlistArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Watchlist(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:Watchlist", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20190101preview:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210401:Watchlist").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:Watchlist").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Watchlist get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Watchlist(name, id, options);
    }
}
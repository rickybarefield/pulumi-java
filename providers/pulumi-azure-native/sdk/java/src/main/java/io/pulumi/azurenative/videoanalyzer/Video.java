// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.videoanalyzer.VideoArgs;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoFlagsResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoMediaInfoResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoStreamingResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:videoanalyzer:Video")
public class Video extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="flags", type=VideoFlagsResponse.class, parameters={})
    private Output<VideoFlagsResponse> flags;

    public Output<VideoFlagsResponse> getFlags() {
        return this.flags;
    }
    @OutputExport(name="mediaInfo", type=VideoMediaInfoResponse.class, parameters={})
    private Output<VideoMediaInfoResponse> mediaInfo;

    public Output<VideoMediaInfoResponse> getMediaInfo() {
        return this.mediaInfo;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="streaming", type=VideoStreamingResponse.class, parameters={})
    private Output<VideoStreamingResponse> streaming;

    public Output<VideoStreamingResponse> getStreaming() {
        return this.streaming;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    public Output</* @Nullable */ String> getTitle() {
        return this.title;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Video(String name, VideoArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:Video", name, args == null ? VideoArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Video(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:Video", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20210501preview:Video").build()),
                Input.of(Alias.builder().setType("azure-native:videoanalyzer/v20211101preview:Video").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Video get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Video(name, id, options);
    }
}
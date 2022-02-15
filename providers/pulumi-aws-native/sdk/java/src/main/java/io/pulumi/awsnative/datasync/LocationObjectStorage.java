// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.datasync.LocationObjectStorageArgs;
import io.pulumi.awsnative.datasync.enums.LocationObjectStorageServerProtocol;
import io.pulumi.awsnative.datasync.outputs.LocationObjectStorageTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:datasync:LocationObjectStorage")
public class LocationObjectStorage extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessKey;

    public Output</* @Nullable */ String> getAccessKey() {
        return this.accessKey;
    }
    @OutputExport(name="agentArns", type=List.class, parameters={String.class})
    private Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }
    @OutputExport(name="bucketName", type=String.class, parameters={})
    private Output<String> bucketName;

    public Output<String> getBucketName() {
        return this.bucketName;
    }
    @OutputExport(name="locationArn", type=String.class, parameters={})
    private Output<String> locationArn;

    public Output<String> getLocationArn() {
        return this.locationArn;
    }
    @OutputExport(name="locationUri", type=String.class, parameters={})
    private Output<String> locationUri;

    public Output<String> getLocationUri() {
        return this.locationUri;
    }
    @OutputExport(name="secretKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretKey;

    public Output</* @Nullable */ String> getSecretKey() {
        return this.secretKey;
    }
    @OutputExport(name="serverHostname", type=String.class, parameters={})
    private Output<String> serverHostname;

    public Output<String> getServerHostname() {
        return this.serverHostname;
    }
    @OutputExport(name="serverPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> serverPort;

    public Output</* @Nullable */ Integer> getServerPort() {
        return this.serverPort;
    }
    @OutputExport(name="serverProtocol", type=LocationObjectStorageServerProtocol.class, parameters={})
    private Output</* @Nullable */ LocationObjectStorageServerProtocol> serverProtocol;

    public Output</* @Nullable */ LocationObjectStorageServerProtocol> getServerProtocol() {
        return this.serverProtocol;
    }
    @OutputExport(name="subdirectory", type=String.class, parameters={})
    private Output</* @Nullable */ String> subdirectory;

    public Output</* @Nullable */ String> getSubdirectory() {
        return this.subdirectory;
    }
    @OutputExport(name="tags", type=List.class, parameters={LocationObjectStorageTag.class})
    private Output</* @Nullable */ List<LocationObjectStorageTag>> tags;

    public Output</* @Nullable */ List<LocationObjectStorageTag>> getTags() {
        return this.tags;
    }

    public LocationObjectStorage(String name, LocationObjectStorageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationObjectStorage", name, args == null ? LocationObjectStorageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LocationObjectStorage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:datasync:LocationObjectStorage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static LocationObjectStorage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LocationObjectStorage(name, id, options);
    }
}
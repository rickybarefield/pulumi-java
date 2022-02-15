// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datastream_v1alpha1.RouteArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:datastream/v1alpha1:Route")
public class Route extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime;
    }
    @OutputExport(name="destinationAddress", type=String.class, parameters={})
    private Output<String> destinationAddress;

    public Output<String> getDestinationAddress() {
        return this.destinationAddress;
    }
    @OutputExport(name="destinationPort", type=Integer.class, parameters={})
    private Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public Route(String name, RouteArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Route(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datastream/v1alpha1:Route", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Route get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
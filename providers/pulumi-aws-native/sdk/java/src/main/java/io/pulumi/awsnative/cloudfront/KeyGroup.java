// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudfront.KeyGroupArgs;
import io.pulumi.awsnative.cloudfront.outputs.KeyGroupConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:cloudfront:KeyGroup")
public class KeyGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="keyGroupConfig", type=KeyGroupConfig.class, parameters={})
    private Output<KeyGroupConfig> keyGroupConfig;

    public Output<KeyGroupConfig> getKeyGroupConfig() {
        return this.keyGroupConfig;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public KeyGroup(String name, KeyGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:KeyGroup", name, args == null ? KeyGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private KeyGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudfront:KeyGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static KeyGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyGroup(name, id, options);
    }
}
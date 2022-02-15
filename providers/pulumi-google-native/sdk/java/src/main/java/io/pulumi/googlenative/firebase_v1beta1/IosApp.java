// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebase_v1beta1.IosAppArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:firebase/v1beta1:IosApp")
public class IosApp extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="appStoreId", type=String.class, parameters={})
    private Output<String> appStoreId;

    public Output<String> getAppStoreId() {
        return this.appStoreId;
    }
    @OutputExport(name="bundleId", type=String.class, parameters={})
    private Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="teamId", type=String.class, parameters={})
    private Output<String> teamId;

    public Output<String> getTeamId() {
        return this.teamId;
    }

    public IosApp(String name, @Nullable IosAppArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebase/v1beta1:IosApp", name, args == null ? IosAppArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IosApp(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebase/v1beta1:IosApp", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static IosApp get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IosApp(name, id, options);
    }
}
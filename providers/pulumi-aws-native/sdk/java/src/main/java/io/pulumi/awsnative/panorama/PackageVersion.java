// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.panorama.PackageVersionArgs;
import io.pulumi.awsnative.panorama.enums.PackageVersionStatus;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:panorama:PackageVersion")
public class PackageVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="isLatestPatch", type=Boolean.class, parameters={})
    private Output<Boolean> isLatestPatch;

    public Output<Boolean> getIsLatestPatch() {
        return this.isLatestPatch;
    }
    @OutputExport(name="markLatest", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> markLatest;

    public Output</* @Nullable */ Boolean> getMarkLatest() {
        return this.markLatest;
    }
    @OutputExport(name="ownerAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerAccount;

    public Output</* @Nullable */ String> getOwnerAccount() {
        return this.ownerAccount;
    }
    @OutputExport(name="packageArn", type=String.class, parameters={})
    private Output<String> packageArn;

    public Output<String> getPackageArn() {
        return this.packageArn;
    }
    @OutputExport(name="packageId", type=String.class, parameters={})
    private Output<String> packageId;

    public Output<String> getPackageId() {
        return this.packageId;
    }
    @OutputExport(name="packageName", type=String.class, parameters={})
    private Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName;
    }
    @OutputExport(name="packageVersion", type=String.class, parameters={})
    private Output<String> packageVersion;

    public Output<String> getPackageVersion() {
        return this.packageVersion;
    }
    @OutputExport(name="patchVersion", type=String.class, parameters={})
    private Output<String> patchVersion;

    public Output<String> getPatchVersion() {
        return this.patchVersion;
    }
    @OutputExport(name="registeredTime", type=Integer.class, parameters={})
    private Output<Integer> registeredTime;

    public Output<Integer> getRegisteredTime() {
        return this.registeredTime;
    }
    @OutputExport(name="status", type=PackageVersionStatus.class, parameters={})
    private Output<PackageVersionStatus> status;

    public Output<PackageVersionStatus> getStatus() {
        return this.status;
    }
    @OutputExport(name="statusDescription", type=String.class, parameters={})
    private Output<String> statusDescription;

    public Output<String> getStatusDescription() {
        return this.statusDescription;
    }
    @OutputExport(name="updatedLatestPatchVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> updatedLatestPatchVersion;

    public Output</* @Nullable */ String> getUpdatedLatestPatchVersion() {
        return this.updatedLatestPatchVersion;
    }

    public PackageVersion(String name, PackageVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:PackageVersion", name, args == null ? PackageVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PackageVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:panorama:PackageVersion", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static PackageVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PackageVersion(name, id, options);
    }
}
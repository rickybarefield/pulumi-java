// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudresourcemanager_v1.inputs.GetLienArgs;
import io.pulumi.googlenative.cloudresourcemanager_v1.outputs.GetLienResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLien {
    public static CompletableFuture<GetLienResult> invokeAsync(GetLienArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudresourcemanager/v1:getLien", TypeShape.of(GetLienResult.class), args == null ? GetLienArgs.Empty : args, Utilities.withVersion(options));
    }
}
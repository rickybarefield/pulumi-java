// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.inputs.GetDelegatedSubnetServiceDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.outputs.GetDelegatedSubnetServiceDetailsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDelegatedSubnetServiceDetails {
    public static CompletableFuture<GetDelegatedSubnetServiceDetailsResult> invokeAsync(GetDelegatedSubnetServiceDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getDelegatedSubnetServiceDetails", TypeShape.of(GetDelegatedSubnetServiceDetailsResult.class), args == null ? GetDelegatedSubnetServiceDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
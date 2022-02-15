// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.ListDomainSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.outputs.ListDomainSharedAccessKeysResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDomainSharedAccessKeys {
    public static CompletableFuture<ListDomainSharedAccessKeysResult> invokeAsync(ListDomainSharedAccessKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listDomainSharedAccessKeys", TypeShape.of(ListDomainSharedAccessKeysResult.class), args == null ? ListDomainSharedAccessKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
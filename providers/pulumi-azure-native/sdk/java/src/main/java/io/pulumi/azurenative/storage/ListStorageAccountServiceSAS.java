// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.inputs.ListStorageAccountServiceSASArgs;
import io.pulumi.azurenative.storage.outputs.ListStorageAccountServiceSASResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStorageAccountServiceSAS {
    public static CompletableFuture<ListStorageAccountServiceSASResult> invokeAsync(ListStorageAccountServiceSASArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storage:listStorageAccountServiceSAS", TypeShape.of(ListStorageAccountServiceSASResult.class), args == null ? ListStorageAccountServiceSASArgs.Empty : args, Utilities.withVersion(options));
    }
}
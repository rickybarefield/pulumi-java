// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetIntegrationRuntimeArgs;
import io.pulumi.azurenative.synapse.outputs.GetIntegrationRuntimeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationRuntime {
    public static CompletableFuture<GetIntegrationRuntimeResult> invokeAsync(GetIntegrationRuntimeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getIntegrationRuntime", TypeShape.of(GetIntegrationRuntimeResult.class), args == null ? GetIntegrationRuntimeArgs.Empty : args, Utilities.withVersion(options));
    }
}
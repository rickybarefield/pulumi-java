// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetEntityQueryArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetEntityQueryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: ActivityCustomEntityQuery. */
public class GetEntityQuery {
    public static CompletableFuture<GetEntityQueryResult> invokeAsync(GetEntityQueryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getEntityQuery", TypeShape.of(GetEntityQueryResult.class), args == null ? GetEntityQueryArgs.Empty : args, Utilities.withVersion(options));
    }
}
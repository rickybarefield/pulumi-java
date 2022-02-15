// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azureactivedirectory.inputs.GetB2CTenantArgs;
import io.pulumi.azurenative.azureactivedirectory.outputs.GetB2CTenantResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetB2CTenant {
    public static CompletableFuture<GetB2CTenantResult> invokeAsync(GetB2CTenantArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azureactivedirectory:getB2CTenant", TypeShape.of(GetB2CTenantResult.class), args == null ? GetB2CTenantArgs.Empty : args, Utilities.withVersion(options));
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetAdminRuleArgs;
import io.pulumi.azurenative.network.outputs.GetAdminRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: AdminRule, DefaultAdminRule. */
public class GetAdminRule {
    public static CompletableFuture<GetAdminRuleResult> invokeAsync(GetAdminRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getAdminRule", TypeShape.of(GetAdminRuleResult.class), args == null ? GetAdminRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
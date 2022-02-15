// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.inputs.GetResolverDNSSECConfigArgs;
import io.pulumi.awsnative.route53resolver.outputs.GetResolverDNSSECConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverDNSSECConfig {
    public static CompletableFuture<GetResolverDNSSECConfigResult> invokeAsync(GetResolverDNSSECConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53resolver:getResolverDNSSECConfig", TypeShape.of(GetResolverDNSSECConfigResult.class), args == null ? GetResolverDNSSECConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}
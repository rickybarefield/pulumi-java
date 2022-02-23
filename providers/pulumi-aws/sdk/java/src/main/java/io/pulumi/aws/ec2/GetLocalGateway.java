// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetLocalGatewayArgs;
import io.pulumi.aws.ec2.outputs.GetLocalGatewayResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocalGateway {
/**
 * Provides details about an EC2 Local Gateway.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLocalGateway.
 * 
 *
 * A collection of values returned by getLocalGateway.
 * 
 */
    public static CompletableFuture<GetLocalGatewayResult> invokeAsync(@Nullable GetLocalGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getLocalGateway:getLocalGateway", TypeShape.of(GetLocalGatewayResult.class), args == null ? GetLocalGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
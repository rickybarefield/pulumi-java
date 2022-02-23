// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.globalaccelerator.inputs.GetAcceleratorArgs;
import io.pulumi.aws.globalaccelerator.outputs.GetAcceleratorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAccelerator {
/**
 * Provides information about a Global Accelerator accelerator.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getAccelerator.
 * 
 *
 * A collection of values returned by getAccelerator.
 * 
 */
    public static CompletableFuture<GetAcceleratorResult> invokeAsync(@Nullable GetAcceleratorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:globalaccelerator/getAccelerator:getAccelerator", TypeShape.of(GetAcceleratorResult.class), args == null ? GetAcceleratorArgs.Empty : args, Utilities.withVersion(options));
    }
}
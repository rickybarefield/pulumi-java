// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.inputs.CidrArgs;
import io.pulumi.awsnative.outputs.CidrResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class Cidr {
    public static CompletableFuture<CidrResult> invokeAsync(CidrArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:index:cidr", TypeShape.of(CidrResult.class), args == null ? CidrArgs.Empty : args, Utilities.withVersion(options));
    }
}
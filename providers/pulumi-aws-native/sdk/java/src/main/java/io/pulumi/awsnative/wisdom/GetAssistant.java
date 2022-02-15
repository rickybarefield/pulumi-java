// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.wisdom.inputs.GetAssistantArgs;
import io.pulumi.awsnative.wisdom.outputs.GetAssistantResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAssistant {
    public static CompletableFuture<GetAssistantResult> invokeAsync(GetAssistantArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:wisdom:getAssistant", TypeShape.of(GetAssistantResult.class), args == null ? GetAssistantArgs.Empty : args, Utilities.withVersion(options));
    }
}
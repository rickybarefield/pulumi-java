// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.webpubsub.inputs.GetWebPubSubSharedPrivateLinkResourceArgs;
import io.pulumi.azurenative.webpubsub.outputs.GetWebPubSubSharedPrivateLinkResourceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebPubSubSharedPrivateLinkResource {
    public static CompletableFuture<GetWebPubSubSharedPrivateLinkResourceResult> invokeAsync(GetWebPubSubSharedPrivateLinkResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:webpubsub:getWebPubSubSharedPrivateLinkResource", TypeShape.of(GetWebPubSubSharedPrivateLinkResourceResult.class), args == null ? GetWebPubSubSharedPrivateLinkResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
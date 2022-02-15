// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.folder.inputs.GetOrganizationPolicyArgs;
import io.pulumi.gcp.folder.outputs.GetOrganizationPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganizationPolicy {
    public static CompletableFuture<GetOrganizationPolicyResult> invokeAsync(GetOrganizationPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:folder/getOrganizationPolicy:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args == null ? GetOrganizationPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
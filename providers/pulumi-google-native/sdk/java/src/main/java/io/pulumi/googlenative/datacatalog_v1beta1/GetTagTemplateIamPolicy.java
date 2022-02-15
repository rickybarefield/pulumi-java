// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.GetTagTemplateIamPolicyArgs;
import io.pulumi.googlenative.datacatalog_v1beta1.outputs.GetTagTemplateIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagTemplateIamPolicy {
    public static CompletableFuture<GetTagTemplateIamPolicyResult> invokeAsync(GetTagTemplateIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datacatalog/v1beta1:getTagTemplateIamPolicy", TypeShape.of(GetTagTemplateIamPolicyResult.class), args == null ? GetTagTemplateIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
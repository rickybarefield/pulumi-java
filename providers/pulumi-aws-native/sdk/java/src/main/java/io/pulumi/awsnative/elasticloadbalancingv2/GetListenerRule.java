// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.GetListenerRuleArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.GetListenerRuleResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetListenerRule {
    public static CompletableFuture<GetListenerRuleResult> invokeAsync(GetListenerRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticloadbalancingv2:getListenerRule", TypeShape.of(GetListenerRuleResult.class), args == null ? GetListenerRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
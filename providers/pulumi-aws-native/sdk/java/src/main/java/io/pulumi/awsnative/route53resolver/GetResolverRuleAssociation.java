// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.inputs.GetResolverRuleAssociationArgs;
import io.pulumi.awsnative.route53resolver.outputs.GetResolverRuleAssociationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverRuleAssociation {
    public static CompletableFuture<GetResolverRuleAssociationResult> invokeAsync(GetResolverRuleAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53resolver:getResolverRuleAssociation", TypeShape.of(GetResolverRuleAssociationResult.class), args == null ? GetResolverRuleAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
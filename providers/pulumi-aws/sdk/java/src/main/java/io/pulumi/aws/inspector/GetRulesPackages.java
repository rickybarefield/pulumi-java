// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.inspector.outputs.GetRulesPackagesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRulesPackages {
/**
 * The AWS Inspector Rules Packages data source allows access to the list of AWS
 * Inspector Rules Packages which can be used by AWS Inspector within the region
 * configured in the provider.
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getRulesPackages.
 * 
 */
    public static CompletableFuture<GetRulesPackagesResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:inspector/getRulesPackages:getRulesPackages", TypeShape.of(GetRulesPackagesResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
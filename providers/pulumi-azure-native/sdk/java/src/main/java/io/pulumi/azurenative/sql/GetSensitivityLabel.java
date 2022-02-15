// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetSensitivityLabelArgs;
import io.pulumi.azurenative.sql.outputs.GetSensitivityLabelResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSensitivityLabel {
    public static CompletableFuture<GetSensitivityLabelResult> invokeAsync(GetSensitivityLabelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getSensitivityLabel", TypeShape.of(GetSensitivityLabelResult.class), args == null ? GetSensitivityLabelArgs.Empty : args, Utilities.withVersion(options));
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.FunctionArgs;
import io.pulumi.azurenative.streamanalytics.outputs.ScalarFunctionPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:streamanalytics:Function")
public class Function extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=ScalarFunctionPropertiesResponse.class, parameters={})
    private Output<ScalarFunctionPropertiesResponse> properties;

    public Output<ScalarFunctionPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Function(String name, FunctionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Function", name, args == null ? FunctionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Function(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:streamanalytics:Function", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20160301:Function").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20170401preview:Function").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20200301:Function").build()),
                Input.of(Alias.builder().setType("azure-native:streamanalytics/v20211001preview:Function").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Function get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Function(name, id, options);
    }
}
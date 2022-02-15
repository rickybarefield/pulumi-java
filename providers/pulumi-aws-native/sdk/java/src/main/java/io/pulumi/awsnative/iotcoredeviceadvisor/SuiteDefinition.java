// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotcoredeviceadvisor.SuiteDefinitionArgs;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionConfigurationProperties;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iotcoredeviceadvisor:SuiteDefinition")
public class SuiteDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="suiteDefinitionArn", type=String.class, parameters={})
    private Output<String> suiteDefinitionArn;

    public Output<String> getSuiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }
    @OutputExport(name="suiteDefinitionConfiguration", type=SuiteDefinitionConfigurationProperties.class, parameters={})
    private Output<SuiteDefinitionConfigurationProperties> suiteDefinitionConfiguration;

    public Output<SuiteDefinitionConfigurationProperties> getSuiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }
    @OutputExport(name="suiteDefinitionId", type=String.class, parameters={})
    private Output<String> suiteDefinitionId;

    public Output<String> getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }
    @OutputExport(name="suiteDefinitionVersion", type=String.class, parameters={})
    private Output<String> suiteDefinitionVersion;

    public Output<String> getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }
    @OutputExport(name="tags", type=List.class, parameters={SuiteDefinitionTag.class})
    private Output</* @Nullable */ List<SuiteDefinitionTag>> tags;

    public Output</* @Nullable */ List<SuiteDefinitionTag>> getTags() {
        return this.tags;
    }

    public SuiteDefinition(String name, SuiteDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, args == null ? SuiteDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SuiteDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SuiteDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SuiteDefinition(name, id, options);
    }
}
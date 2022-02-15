// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1beta1.AttributeDefinitionArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:healthcare/v1beta1:AttributeDefinition")
public class AttributeDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allowedValues", type=List.class, parameters={String.class})
    private Output<List<String>> allowedValues;

    public Output<List<String>> getAllowedValues() {
        return this.allowedValues;
    }
    @OutputExport(name="category", type=String.class, parameters={})
    private Output<String> category;

    public Output<String> getCategory() {
        return this.category;
    }
    @OutputExport(name="consentDefaultValues", type=List.class, parameters={String.class})
    private Output<List<String>> consentDefaultValues;

    public Output<List<String>> getConsentDefaultValues() {
        return this.consentDefaultValues;
    }
    @OutputExport(name="dataMappingDefaultValue", type=String.class, parameters={})
    private Output<String> dataMappingDefaultValue;

    public Output<String> getDataMappingDefaultValue() {
        return this.dataMappingDefaultValue;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public AttributeDefinition(String name, AttributeDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:AttributeDefinition", name, args == null ? AttributeDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AttributeDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1beta1:AttributeDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static AttributeDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttributeDefinition(name, id, options);
    }
}
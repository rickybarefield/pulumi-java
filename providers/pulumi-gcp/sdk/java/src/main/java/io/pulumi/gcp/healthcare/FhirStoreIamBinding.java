// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingState;
import io.pulumi.gcp.healthcare.outputs.FhirStoreIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:healthcare/fhirStoreIamBinding:FhirStoreIamBinding")
public class FhirStoreIamBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=FhirStoreIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ FhirStoreIamBindingCondition> condition;

    public Output</* @Nullable */ FhirStoreIamBindingCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="fhirStoreId", type=String.class, parameters={})
    private Output<String> fhirStoreId;

    public Output<String> getFhirStoreId() {
        return this.fhirStoreId;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public FhirStoreIamBinding(String name, FhirStoreIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/fhirStoreIamBinding:FhirStoreIamBinding", name, args == null ? FhirStoreIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FhirStoreIamBinding(String name, Input<String> id, @Nullable FhirStoreIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/fhirStoreIamBinding:FhirStoreIamBinding", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FhirStoreIamBinding get(String name, Input<String> id, @Nullable FhirStoreIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FhirStoreIamBinding(name, id, state, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.servicedirectory.ServiceIamPolicyArgs;
import io.pulumi.gcp.servicedirectory.inputs.ServiceIamPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:servicedirectory/serviceIamPolicy:ServiceIamPolicy")
public class ServiceIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }

    public ServiceIamPolicy(String name, ServiceIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/serviceIamPolicy:ServiceIamPolicy", name, args == null ? ServiceIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceIamPolicy(String name, Input<String> id, @Nullable ServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:servicedirectory/serviceIamPolicy:ServiceIamPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServiceIamPolicy get(String name, Input<String> id, @Nullable ServiceIamPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIamPolicy(name, id, state, options);
    }
}
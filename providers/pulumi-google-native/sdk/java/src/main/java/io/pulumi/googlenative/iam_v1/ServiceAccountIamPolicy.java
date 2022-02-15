// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.iam_v1.ServiceAccountIamPolicyArgs;
import io.pulumi.googlenative.iam_v1.outputs.AuditConfigResponse;
import io.pulumi.googlenative.iam_v1.outputs.BindingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:iam/v1:ServiceAccountIamPolicy")
public class ServiceAccountIamPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="auditConfigs", type=List.class, parameters={AuditConfigResponse.class})
    private Output<List<AuditConfigResponse>> auditConfigs;

    public Output<List<AuditConfigResponse>> getAuditConfigs() {
        return this.auditConfigs;
    }
    @OutputExport(name="bindings", type=List.class, parameters={BindingResponse.class})
    private Output<List<BindingResponse>> bindings;

    public Output<List<BindingResponse>> getBindings() {
        return this.bindings;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version;
    }

    public ServiceAccountIamPolicy(String name, ServiceAccountIamPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:ServiceAccountIamPolicy", name, args == null ? ServiceAccountIamPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServiceAccountIamPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:iam/v1:ServiceAccountIamPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServiceAccountIamPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAccountIamPolicy(name, id, options);
    }
}
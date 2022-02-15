// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.JobIAMPolicyArgs;
import io.pulumi.gcp.dataproc.inputs.JobIAMPolicyState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:dataproc/jobIAMPolicy:JobIAMPolicy")
public class JobIAMPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> getJobId() {
        return this.jobId;
    }
    @OutputExport(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> getPolicyData() {
        return this.policyData;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    public JobIAMPolicy(String name, JobIAMPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMPolicy:JobIAMPolicy", name, args == null ? JobIAMPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobIAMPolicy(String name, Input<String> id, @Nullable JobIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/jobIAMPolicy:JobIAMPolicy", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static JobIAMPolicy get(String name, Input<String> id, @Nullable JobIAMPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobIAMPolicy(name, id, state, options);
    }
}
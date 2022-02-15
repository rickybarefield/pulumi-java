// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.secretmanager.SecretIamMemberArgs;
import io.pulumi.gcp.secretmanager.inputs.SecretIamMemberState;
import io.pulumi.gcp.secretmanager.outputs.SecretIamMemberCondition;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:secretmanager/secretIamMember:SecretIamMember")
public class SecretIamMember extends io.pulumi.resources.CustomResource {
    @OutputExport(name="condition", type=SecretIamMemberCondition.class, parameters={})
    private Output</* @Nullable */ SecretIamMemberCondition> condition;

    public Output</* @Nullable */ SecretIamMemberCondition> getCondition() {
        return this.condition;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="member", type=String.class, parameters={})
    private Output<String> member;

    public Output<String> getMember() {
        return this.member;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }
    @OutputExport(name="secretId", type=String.class, parameters={})
    private Output<String> secretId;

    public Output<String> getSecretId() {
        return this.secretId;
    }

    public SecretIamMember(String name, SecretIamMemberArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamMember:SecretIamMember", name, args == null ? SecretIamMemberArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SecretIamMember(String name, Input<String> id, @Nullable SecretIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:secretmanager/secretIamMember:SecretIamMember", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SecretIamMember get(String name, Input<String> id, @Nullable SecretIamMemberState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SecretIamMember(name, id, state, options);
    }
}
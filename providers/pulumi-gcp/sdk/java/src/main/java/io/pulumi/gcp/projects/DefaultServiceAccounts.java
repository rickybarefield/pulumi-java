// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.projects.DefaultServiceAccountsArgs;
import io.pulumi.gcp.projects.inputs.DefaultServiceAccountsState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="gcp:projects/defaultServiceAccounts:DefaultServiceAccounts")
public class DefaultServiceAccounts extends io.pulumi.resources.CustomResource {
    @OutputExport(name="action", type=String.class, parameters={})
    private Output<String> action;

    public Output<String> getAction() {
        return this.action;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="restorePolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> restorePolicy;

    public Output</* @Nullable */ String> getRestorePolicy() {
        return this.restorePolicy;
    }
    @OutputExport(name="serviceAccounts", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> serviceAccounts;

    public Output<Map<String,Object>> getServiceAccounts() {
        return this.serviceAccounts;
    }

    public DefaultServiceAccounts(String name, DefaultServiceAccountsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/defaultServiceAccounts:DefaultServiceAccounts", name, args == null ? DefaultServiceAccountsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefaultServiceAccounts(String name, Input<String> id, @Nullable DefaultServiceAccountsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/defaultServiceAccounts:DefaultServiceAccounts", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DefaultServiceAccounts get(String name, Input<String> id, @Nullable DefaultServiceAccountsState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultServiceAccounts(name, id, state, options);
    }
}
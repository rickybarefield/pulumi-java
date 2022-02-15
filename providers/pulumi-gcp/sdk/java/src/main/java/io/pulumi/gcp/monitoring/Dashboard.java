// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.monitoring.DashboardArgs;
import io.pulumi.gcp.monitoring.inputs.DashboardState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:monitoring/dashboard:Dashboard")
public class Dashboard extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dashboardJson", type=String.class, parameters={})
    private Output<String> dashboardJson;

    public Output<String> getDashboardJson() {
        return this.dashboardJson;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public Dashboard(String name, DashboardArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/dashboard:Dashboard", name, args == null ? DashboardArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dashboard(String name, Input<String> id, @Nullable DashboardState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/dashboard:Dashboard", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Dashboard get(String name, Input<String> id, @Nullable DashboardState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dashboard(name, id, state, options);
    }
}
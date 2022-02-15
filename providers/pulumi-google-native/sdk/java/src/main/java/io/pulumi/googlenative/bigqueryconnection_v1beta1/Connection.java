// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryconnection_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.ConnectionArgs;
import io.pulumi.googlenative.bigqueryconnection_v1beta1.outputs.CloudSqlPropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:bigqueryconnection/v1beta1:Connection")
public class Connection extends io.pulumi.resources.CustomResource {
    @OutputExport(name="cloudSql", type=CloudSqlPropertiesResponse.class, parameters={})
    private Output<CloudSqlPropertiesResponse> cloudSql;

    public Output<CloudSqlPropertiesResponse> getCloudSql() {
        return this.cloudSql;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    @OutputExport(name="hasCredential", type=Boolean.class, parameters={})
    private Output<Boolean> hasCredential;

    public Output<Boolean> getHasCredential() {
        return this.hasCredential;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public Connection(String name, @Nullable ConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryconnection/v1beta1:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Connection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:bigqueryconnection/v1beta1:Connection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Connection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.rds.DBProxyTargetGroupArgs;
import io.pulumi.awsnative.rds.enums.DBProxyTargetGroupTargetGroupName;
import io.pulumi.awsnative.rds.outputs.DBProxyTargetGroupConnectionPoolConfigurationInfoFormat;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:rds:DBProxyTargetGroup")
public class DBProxyTargetGroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="connectionPoolConfigurationInfo", type=DBProxyTargetGroupConnectionPoolConfigurationInfoFormat.class, parameters={})
    private Output</* @Nullable */ DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> connectionPoolConfigurationInfo;

    public Output</* @Nullable */ DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> getConnectionPoolConfigurationInfo() {
        return this.connectionPoolConfigurationInfo;
    }
    @OutputExport(name="dBClusterIdentifiers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dBClusterIdentifiers;

    public Output</* @Nullable */ List<String>> getDBClusterIdentifiers() {
        return this.dBClusterIdentifiers;
    }
    @OutputExport(name="dBInstanceIdentifiers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dBInstanceIdentifiers;

    public Output</* @Nullable */ List<String>> getDBInstanceIdentifiers() {
        return this.dBInstanceIdentifiers;
    }
    @OutputExport(name="dBProxyName", type=String.class, parameters={})
    private Output<String> dBProxyName;

    public Output<String> getDBProxyName() {
        return this.dBProxyName;
    }
    @OutputExport(name="targetGroupArn", type=String.class, parameters={})
    private Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn;
    }
    @OutputExport(name="targetGroupName", type=DBProxyTargetGroupTargetGroupName.class, parameters={})
    private Output<DBProxyTargetGroupTargetGroupName> targetGroupName;

    public Output<DBProxyTargetGroupTargetGroupName> getTargetGroupName() {
        return this.targetGroupName;
    }

    public DBProxyTargetGroup(String name, DBProxyTargetGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:DBProxyTargetGroup", name, args == null ? DBProxyTargetGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DBProxyTargetGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:rds:DBProxyTargetGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DBProxyTargetGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DBProxyTargetGroup(name, id, options);
    }
}
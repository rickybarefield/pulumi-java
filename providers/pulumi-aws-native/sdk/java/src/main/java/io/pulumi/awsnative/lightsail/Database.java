// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lightsail.DatabaseArgs;
import io.pulumi.awsnative.lightsail.outputs.DatabaseRelationalDatabaseParameter;
import io.pulumi.awsnative.lightsail.outputs.DatabaseTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:lightsail:Database")
public class Database extends io.pulumi.resources.CustomResource {
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> availabilityZone;

    public Output</* @Nullable */ String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    @OutputExport(name="backupRetention", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> backupRetention;

    public Output</* @Nullable */ Boolean> getBackupRetention() {
        return this.backupRetention;
    }
    @OutputExport(name="caCertificateIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> caCertificateIdentifier;

    public Output</* @Nullable */ String> getCaCertificateIdentifier() {
        return this.caCertificateIdentifier;
    }
    @OutputExport(name="databaseArn", type=String.class, parameters={})
    private Output<String> databaseArn;

    public Output<String> getDatabaseArn() {
        return this.databaseArn;
    }
    @OutputExport(name="masterDatabaseName", type=String.class, parameters={})
    private Output<String> masterDatabaseName;

    public Output<String> getMasterDatabaseName() {
        return this.masterDatabaseName;
    }
    @OutputExport(name="masterUserPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterUserPassword;

    public Output</* @Nullable */ String> getMasterUserPassword() {
        return this.masterUserPassword;
    }
    @OutputExport(name="masterUsername", type=String.class, parameters={})
    private Output<String> masterUsername;

    public Output<String> getMasterUsername() {
        return this.masterUsername;
    }
    @OutputExport(name="preferredBackupWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> preferredBackupWindow;

    public Output</* @Nullable */ String> getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    @OutputExport(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output</* @Nullable */ String> preferredMaintenanceWindow;

    public Output</* @Nullable */ String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    @OutputExport(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    public Output</* @Nullable */ Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    @OutputExport(name="relationalDatabaseBlueprintId", type=String.class, parameters={})
    private Output<String> relationalDatabaseBlueprintId;

    public Output<String> getRelationalDatabaseBlueprintId() {
        return this.relationalDatabaseBlueprintId;
    }
    @OutputExport(name="relationalDatabaseBundleId", type=String.class, parameters={})
    private Output<String> relationalDatabaseBundleId;

    public Output<String> getRelationalDatabaseBundleId() {
        return this.relationalDatabaseBundleId;
    }
    @OutputExport(name="relationalDatabaseName", type=String.class, parameters={})
    private Output<String> relationalDatabaseName;

    public Output<String> getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }
    @OutputExport(name="relationalDatabaseParameters", type=List.class, parameters={DatabaseRelationalDatabaseParameter.class})
    private Output</* @Nullable */ List<DatabaseRelationalDatabaseParameter>> relationalDatabaseParameters;

    public Output</* @Nullable */ List<DatabaseRelationalDatabaseParameter>> getRelationalDatabaseParameters() {
        return this.relationalDatabaseParameters;
    }
    @OutputExport(name="rotateMasterUserPassword", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rotateMasterUserPassword;

    public Output</* @Nullable */ Boolean> getRotateMasterUserPassword() {
        return this.rotateMasterUserPassword;
    }
    @OutputExport(name="tags", type=List.class, parameters={DatabaseTag.class})
    private Output</* @Nullable */ List<DatabaseTag>> tags;

    public Output</* @Nullable */ List<DatabaseTag>> getTags() {
        return this.tags;
    }

    public Database(String name, DatabaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Database", name, args == null ? DatabaseArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Database(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lightsail:Database", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Database get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Database(name, id, options);
    }
}
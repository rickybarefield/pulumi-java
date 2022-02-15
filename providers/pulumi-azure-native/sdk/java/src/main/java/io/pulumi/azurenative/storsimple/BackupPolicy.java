// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.BackupPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:storsimple:BackupPolicy")
public class BackupPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backupPolicyCreationType", type=String.class, parameters={})
    private Output<String> backupPolicyCreationType;

    public Output<String> getBackupPolicyCreationType() {
        return this.backupPolicyCreationType;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="lastBackupTime", type=String.class, parameters={})
    private Output<String> lastBackupTime;

    public Output<String> getLastBackupTime() {
        return this.lastBackupTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="nextBackupTime", type=String.class, parameters={})
    private Output<String> nextBackupTime;

    public Output<String> getNextBackupTime() {
        return this.nextBackupTime;
    }
    @OutputExport(name="scheduledBackupStatus", type=String.class, parameters={})
    private Output<String> scheduledBackupStatus;

    public Output<String> getScheduledBackupStatus() {
        return this.scheduledBackupStatus;
    }
    @OutputExport(name="schedulesCount", type=Double.class, parameters={})
    private Output<Double> schedulesCount;

    public Output<Double> getSchedulesCount() {
        return this.schedulesCount;
    }
    @OutputExport(name="ssmHostName", type=String.class, parameters={})
    private Output<String> ssmHostName;

    public Output<String> getSsmHostName() {
        return this.ssmHostName;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="volumeIds", type=List.class, parameters={String.class})
    private Output<List<String>> volumeIds;

    public Output<List<String>> getVolumeIds() {
        return this.volumeIds;
    }

    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:BackupPolicy").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static BackupPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, options);
    }
}
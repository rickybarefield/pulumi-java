// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultLockConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultLockConfigurationArgs Empty = new VaultLockConfigurationArgs();

    /**
     * Name of the backup vault to add a lock configuration for.
     * 
     */
    @InputImport(name="backupVaultName", required=true)
    private final Input<String> backupVaultName;

    public Input<String> getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * The number of days before the lock date.
     * 
     */
    @InputImport(name="changeableForDays")
    private final @Nullable Input<Integer> changeableForDays;

    public Input<Integer> getChangeableForDays() {
        return this.changeableForDays == null ? Input.empty() : this.changeableForDays;
    }

    /**
     * The maximum retention period that the vault retains its recovery points.
     * 
     */
    @InputImport(name="maxRetentionDays")
    private final @Nullable Input<Integer> maxRetentionDays;

    public Input<Integer> getMaxRetentionDays() {
        return this.maxRetentionDays == null ? Input.empty() : this.maxRetentionDays;
    }

    /**
     * The minimum retention period that the vault retains its recovery points.
     * 
     */
    @InputImport(name="minRetentionDays")
    private final @Nullable Input<Integer> minRetentionDays;

    public Input<Integer> getMinRetentionDays() {
        return this.minRetentionDays == null ? Input.empty() : this.minRetentionDays;
    }

    public VaultLockConfigurationArgs(
        Input<String> backupVaultName,
        @Nullable Input<Integer> changeableForDays,
        @Nullable Input<Integer> maxRetentionDays,
        @Nullable Input<Integer> minRetentionDays) {
        this.backupVaultName = Objects.requireNonNull(backupVaultName, "expected parameter 'backupVaultName' to be non-null");
        this.changeableForDays = changeableForDays;
        this.maxRetentionDays = maxRetentionDays;
        this.minRetentionDays = minRetentionDays;
    }

    private VaultLockConfigurationArgs() {
        this.backupVaultName = Input.empty();
        this.changeableForDays = Input.empty();
        this.maxRetentionDays = Input.empty();
        this.minRetentionDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultLockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupVaultName;
        private @Nullable Input<Integer> changeableForDays;
        private @Nullable Input<Integer> maxRetentionDays;
        private @Nullable Input<Integer> minRetentionDays;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultLockConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupVaultName = defaults.backupVaultName;
    	      this.changeableForDays = defaults.changeableForDays;
    	      this.maxRetentionDays = defaults.maxRetentionDays;
    	      this.minRetentionDays = defaults.minRetentionDays;
        }

        public Builder setBackupVaultName(Input<String> backupVaultName) {
            this.backupVaultName = Objects.requireNonNull(backupVaultName);
            return this;
        }

        public Builder setBackupVaultName(String backupVaultName) {
            this.backupVaultName = Input.of(Objects.requireNonNull(backupVaultName));
            return this;
        }

        public Builder setChangeableForDays(@Nullable Input<Integer> changeableForDays) {
            this.changeableForDays = changeableForDays;
            return this;
        }

        public Builder setChangeableForDays(@Nullable Integer changeableForDays) {
            this.changeableForDays = Input.ofNullable(changeableForDays);
            return this;
        }

        public Builder setMaxRetentionDays(@Nullable Input<Integer> maxRetentionDays) {
            this.maxRetentionDays = maxRetentionDays;
            return this;
        }

        public Builder setMaxRetentionDays(@Nullable Integer maxRetentionDays) {
            this.maxRetentionDays = Input.ofNullable(maxRetentionDays);
            return this;
        }

        public Builder setMinRetentionDays(@Nullable Input<Integer> minRetentionDays) {
            this.minRetentionDays = minRetentionDays;
            return this;
        }

        public Builder setMinRetentionDays(@Nullable Integer minRetentionDays) {
            this.minRetentionDays = Input.ofNullable(minRetentionDays);
            return this;
        }
        public VaultLockConfigurationArgs build() {
            return new VaultLockConfigurationArgs(backupVaultName, changeableForDays, maxRetentionDays, minRetentionDays);
        }
    }
}
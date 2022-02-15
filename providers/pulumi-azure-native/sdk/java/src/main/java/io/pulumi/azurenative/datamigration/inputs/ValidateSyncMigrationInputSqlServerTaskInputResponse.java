// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbSyncDatabaseInputResponse;
import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class ValidateSyncMigrationInputSqlServerTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ValidateSyncMigrationInputSqlServerTaskInputResponse Empty = new ValidateSyncMigrationInputSqlServerTaskInputResponse();

    @InputImport(name="selectedDatabases", required=true)
    private final List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;

    public List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> getSelectedDatabases() {
        return this.selectedDatabases;
    }

    @InputImport(name="sourceConnectionInfo", required=true)
    private final SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse getSourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    @InputImport(name="targetConnectionInfo", required=true)
    private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ValidateSyncMigrationInputSqlServerTaskInputResponse(
        List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases,
        SqlConnectionInfoResponse sourceConnectionInfo,
        SqlConnectionInfoResponse targetConnectionInfo) {
        this.selectedDatabases = Objects.requireNonNull(selectedDatabases, "expected parameter 'selectedDatabases' to be non-null");
        this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ValidateSyncMigrationInputSqlServerTaskInputResponse() {
        this.selectedDatabases = List.of();
        this.sourceConnectionInfo = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateSyncMigrationInputSqlServerTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases;
        private SqlConnectionInfoResponse sourceConnectionInfo;
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateSyncMigrationInputSqlServerTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selectedDatabases = defaults.selectedDatabases;
    	      this.sourceConnectionInfo = defaults.sourceConnectionInfo;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setSelectedDatabases(List<MigrateSqlServerSqlDbSyncDatabaseInputResponse> selectedDatabases) {
            this.selectedDatabases = Objects.requireNonNull(selectedDatabases);
            return this;
        }

        public Builder setSourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            this.sourceConnectionInfo = Objects.requireNonNull(sourceConnectionInfo);
            return this;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public ValidateSyncMigrationInputSqlServerTaskInputResponse build() {
            return new ValidateSyncMigrationInputSqlServerTaskInputResponse(selectedDatabases, sourceConnectionInfo, targetConnectionInfo);
        }
    }
}
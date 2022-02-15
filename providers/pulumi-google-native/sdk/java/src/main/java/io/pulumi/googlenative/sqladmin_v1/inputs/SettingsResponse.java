// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.inputs.BackupConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.DatabaseFlagsResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.DenyMaintenancePeriodResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.InsightsConfigResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.IpConfigurationResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.LocationPreferenceResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.MaintenanceWindowResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.PasswordValidationPolicyResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.SqlActiveDirectoryConfigResponse;
import io.pulumi.googlenative.sqladmin_v1.inputs.SqlServerAuditConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class SettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SettingsResponse Empty = new SettingsResponse();

    @InputImport(name="activationPolicy", required=true)
    private final String activationPolicy;

    public String getActivationPolicy() {
        return this.activationPolicy;
    }

    @InputImport(name="activeDirectoryConfig", required=true)
    private final SqlActiveDirectoryConfigResponse activeDirectoryConfig;

    public SqlActiveDirectoryConfigResponse getActiveDirectoryConfig() {
        return this.activeDirectoryConfig;
    }

    @InputImport(name="availabilityType", required=true)
    private final String availabilityType;

    public String getAvailabilityType() {
        return this.availabilityType;
    }

    @InputImport(name="backupConfiguration", required=true)
    private final BackupConfigurationResponse backupConfiguration;

    public BackupConfigurationResponse getBackupConfiguration() {
        return this.backupConfiguration;
    }

    @InputImport(name="collation", required=true)
    private final String collation;

    public String getCollation() {
        return this.collation;
    }

    @InputImport(name="crashSafeReplicationEnabled", required=true)
    private final Boolean crashSafeReplicationEnabled;

    public Boolean getCrashSafeReplicationEnabled() {
        return this.crashSafeReplicationEnabled;
    }

    @InputImport(name="dataDiskSizeGb", required=true)
    private final String dataDiskSizeGb;

    public String getDataDiskSizeGb() {
        return this.dataDiskSizeGb;
    }

    @InputImport(name="dataDiskType", required=true)
    private final String dataDiskType;

    public String getDataDiskType() {
        return this.dataDiskType;
    }

    @InputImport(name="databaseFlags", required=true)
    private final List<DatabaseFlagsResponse> databaseFlags;

    public List<DatabaseFlagsResponse> getDatabaseFlags() {
        return this.databaseFlags;
    }

    @InputImport(name="databaseReplicationEnabled", required=true)
    private final Boolean databaseReplicationEnabled;

    public Boolean getDatabaseReplicationEnabled() {
        return this.databaseReplicationEnabled;
    }

    @InputImport(name="denyMaintenancePeriods", required=true)
    private final List<DenyMaintenancePeriodResponse> denyMaintenancePeriods;

    public List<DenyMaintenancePeriodResponse> getDenyMaintenancePeriods() {
        return this.denyMaintenancePeriods;
    }

    @InputImport(name="insightsConfig", required=true)
    private final InsightsConfigResponse insightsConfig;

    public InsightsConfigResponse getInsightsConfig() {
        return this.insightsConfig;
    }

    @InputImport(name="ipConfiguration", required=true)
    private final IpConfigurationResponse ipConfiguration;

    public IpConfigurationResponse getIpConfiguration() {
        return this.ipConfiguration;
    }

    @InputImport(name="kind", required=true)
    private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="locationPreference", required=true)
    private final LocationPreferenceResponse locationPreference;

    public LocationPreferenceResponse getLocationPreference() {
        return this.locationPreference;
    }

    @InputImport(name="maintenanceWindow", required=true)
    private final MaintenanceWindowResponse maintenanceWindow;

    public MaintenanceWindowResponse getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    @InputImport(name="passwordValidationPolicy", required=true)
    private final PasswordValidationPolicyResponse passwordValidationPolicy;

    public PasswordValidationPolicyResponse getPasswordValidationPolicy() {
        return this.passwordValidationPolicy;
    }

    @InputImport(name="pricingPlan", required=true)
    private final String pricingPlan;

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    @InputImport(name="settingsVersion", required=true)
    private final String settingsVersion;

    public String getSettingsVersion() {
        return this.settingsVersion;
    }

    @InputImport(name="sqlServerAuditConfig", required=true)
    private final SqlServerAuditConfigResponse sqlServerAuditConfig;

    public SqlServerAuditConfigResponse getSqlServerAuditConfig() {
        return this.sqlServerAuditConfig;
    }

    @InputImport(name="storageAutoResize", required=true)
    private final Boolean storageAutoResize;

    public Boolean getStorageAutoResize() {
        return this.storageAutoResize;
    }

    @InputImport(name="storageAutoResizeLimit", required=true)
    private final String storageAutoResizeLimit;

    public String getStorageAutoResizeLimit() {
        return this.storageAutoResizeLimit;
    }

    @InputImport(name="tier", required=true)
    private final String tier;

    public String getTier() {
        return this.tier;
    }

    @InputImport(name="userLabels", required=true)
    private final Map<String,String> userLabels;

    public Map<String,String> getUserLabels() {
        return this.userLabels;
    }

    public SettingsResponse(
        String activationPolicy,
        SqlActiveDirectoryConfigResponse activeDirectoryConfig,
        String availabilityType,
        BackupConfigurationResponse backupConfiguration,
        String collation,
        Boolean crashSafeReplicationEnabled,
        String dataDiskSizeGb,
        String dataDiskType,
        List<DatabaseFlagsResponse> databaseFlags,
        Boolean databaseReplicationEnabled,
        List<DenyMaintenancePeriodResponse> denyMaintenancePeriods,
        InsightsConfigResponse insightsConfig,
        IpConfigurationResponse ipConfiguration,
        String kind,
        LocationPreferenceResponse locationPreference,
        MaintenanceWindowResponse maintenanceWindow,
        PasswordValidationPolicyResponse passwordValidationPolicy,
        String pricingPlan,
        String settingsVersion,
        SqlServerAuditConfigResponse sqlServerAuditConfig,
        Boolean storageAutoResize,
        String storageAutoResizeLimit,
        String tier,
        Map<String,String> userLabels) {
        this.activationPolicy = Objects.requireNonNull(activationPolicy, "expected parameter 'activationPolicy' to be non-null");
        this.activeDirectoryConfig = Objects.requireNonNull(activeDirectoryConfig, "expected parameter 'activeDirectoryConfig' to be non-null");
        this.availabilityType = Objects.requireNonNull(availabilityType, "expected parameter 'availabilityType' to be non-null");
        this.backupConfiguration = Objects.requireNonNull(backupConfiguration, "expected parameter 'backupConfiguration' to be non-null");
        this.collation = Objects.requireNonNull(collation, "expected parameter 'collation' to be non-null");
        this.crashSafeReplicationEnabled = Objects.requireNonNull(crashSafeReplicationEnabled, "expected parameter 'crashSafeReplicationEnabled' to be non-null");
        this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb, "expected parameter 'dataDiskSizeGb' to be non-null");
        this.dataDiskType = Objects.requireNonNull(dataDiskType, "expected parameter 'dataDiskType' to be non-null");
        this.databaseFlags = Objects.requireNonNull(databaseFlags, "expected parameter 'databaseFlags' to be non-null");
        this.databaseReplicationEnabled = Objects.requireNonNull(databaseReplicationEnabled, "expected parameter 'databaseReplicationEnabled' to be non-null");
        this.denyMaintenancePeriods = Objects.requireNonNull(denyMaintenancePeriods, "expected parameter 'denyMaintenancePeriods' to be non-null");
        this.insightsConfig = Objects.requireNonNull(insightsConfig, "expected parameter 'insightsConfig' to be non-null");
        this.ipConfiguration = Objects.requireNonNull(ipConfiguration, "expected parameter 'ipConfiguration' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.locationPreference = Objects.requireNonNull(locationPreference, "expected parameter 'locationPreference' to be non-null");
        this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
        this.passwordValidationPolicy = Objects.requireNonNull(passwordValidationPolicy, "expected parameter 'passwordValidationPolicy' to be non-null");
        this.pricingPlan = Objects.requireNonNull(pricingPlan, "expected parameter 'pricingPlan' to be non-null");
        this.settingsVersion = Objects.requireNonNull(settingsVersion, "expected parameter 'settingsVersion' to be non-null");
        this.sqlServerAuditConfig = Objects.requireNonNull(sqlServerAuditConfig, "expected parameter 'sqlServerAuditConfig' to be non-null");
        this.storageAutoResize = Objects.requireNonNull(storageAutoResize, "expected parameter 'storageAutoResize' to be non-null");
        this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit, "expected parameter 'storageAutoResizeLimit' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.userLabels = Objects.requireNonNull(userLabels, "expected parameter 'userLabels' to be non-null");
    }

    private SettingsResponse() {
        this.activationPolicy = null;
        this.activeDirectoryConfig = null;
        this.availabilityType = null;
        this.backupConfiguration = null;
        this.collation = null;
        this.crashSafeReplicationEnabled = null;
        this.dataDiskSizeGb = null;
        this.dataDiskType = null;
        this.databaseFlags = List.of();
        this.databaseReplicationEnabled = null;
        this.denyMaintenancePeriods = List.of();
        this.insightsConfig = null;
        this.ipConfiguration = null;
        this.kind = null;
        this.locationPreference = null;
        this.maintenanceWindow = null;
        this.passwordValidationPolicy = null;
        this.pricingPlan = null;
        this.settingsVersion = null;
        this.sqlServerAuditConfig = null;
        this.storageAutoResize = null;
        this.storageAutoResizeLimit = null;
        this.tier = null;
        this.userLabels = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activationPolicy;
        private SqlActiveDirectoryConfigResponse activeDirectoryConfig;
        private String availabilityType;
        private BackupConfigurationResponse backupConfiguration;
        private String collation;
        private Boolean crashSafeReplicationEnabled;
        private String dataDiskSizeGb;
        private String dataDiskType;
        private List<DatabaseFlagsResponse> databaseFlags;
        private Boolean databaseReplicationEnabled;
        private List<DenyMaintenancePeriodResponse> denyMaintenancePeriods;
        private InsightsConfigResponse insightsConfig;
        private IpConfigurationResponse ipConfiguration;
        private String kind;
        private LocationPreferenceResponse locationPreference;
        private MaintenanceWindowResponse maintenanceWindow;
        private PasswordValidationPolicyResponse passwordValidationPolicy;
        private String pricingPlan;
        private String settingsVersion;
        private SqlServerAuditConfigResponse sqlServerAuditConfig;
        private Boolean storageAutoResize;
        private String storageAutoResizeLimit;
        private String tier;
        private Map<String,String> userLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(SettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.activeDirectoryConfig = defaults.activeDirectoryConfig;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfiguration = defaults.backupConfiguration;
    	      this.collation = defaults.collation;
    	      this.crashSafeReplicationEnabled = defaults.crashSafeReplicationEnabled;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseReplicationEnabled = defaults.databaseReplicationEnabled;
    	      this.denyMaintenancePeriods = defaults.denyMaintenancePeriods;
    	      this.insightsConfig = defaults.insightsConfig;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kind = defaults.kind;
    	      this.locationPreference = defaults.locationPreference;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.passwordValidationPolicy = defaults.passwordValidationPolicy;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.settingsVersion = defaults.settingsVersion;
    	      this.sqlServerAuditConfig = defaults.sqlServerAuditConfig;
    	      this.storageAutoResize = defaults.storageAutoResize;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
        }

        public Builder setActivationPolicy(String activationPolicy) {
            this.activationPolicy = Objects.requireNonNull(activationPolicy);
            return this;
        }

        public Builder setActiveDirectoryConfig(SqlActiveDirectoryConfigResponse activeDirectoryConfig) {
            this.activeDirectoryConfig = Objects.requireNonNull(activeDirectoryConfig);
            return this;
        }

        public Builder setAvailabilityType(String availabilityType) {
            this.availabilityType = Objects.requireNonNull(availabilityType);
            return this;
        }

        public Builder setBackupConfiguration(BackupConfigurationResponse backupConfiguration) {
            this.backupConfiguration = Objects.requireNonNull(backupConfiguration);
            return this;
        }

        public Builder setCollation(String collation) {
            this.collation = Objects.requireNonNull(collation);
            return this;
        }

        public Builder setCrashSafeReplicationEnabled(Boolean crashSafeReplicationEnabled) {
            this.crashSafeReplicationEnabled = Objects.requireNonNull(crashSafeReplicationEnabled);
            return this;
        }

        public Builder setDataDiskSizeGb(String dataDiskSizeGb) {
            this.dataDiskSizeGb = Objects.requireNonNull(dataDiskSizeGb);
            return this;
        }

        public Builder setDataDiskType(String dataDiskType) {
            this.dataDiskType = Objects.requireNonNull(dataDiskType);
            return this;
        }

        public Builder setDatabaseFlags(List<DatabaseFlagsResponse> databaseFlags) {
            this.databaseFlags = Objects.requireNonNull(databaseFlags);
            return this;
        }

        public Builder setDatabaseReplicationEnabled(Boolean databaseReplicationEnabled) {
            this.databaseReplicationEnabled = Objects.requireNonNull(databaseReplicationEnabled);
            return this;
        }

        public Builder setDenyMaintenancePeriods(List<DenyMaintenancePeriodResponse> denyMaintenancePeriods) {
            this.denyMaintenancePeriods = Objects.requireNonNull(denyMaintenancePeriods);
            return this;
        }

        public Builder setInsightsConfig(InsightsConfigResponse insightsConfig) {
            this.insightsConfig = Objects.requireNonNull(insightsConfig);
            return this;
        }

        public Builder setIpConfiguration(IpConfigurationResponse ipConfiguration) {
            this.ipConfiguration = Objects.requireNonNull(ipConfiguration);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLocationPreference(LocationPreferenceResponse locationPreference) {
            this.locationPreference = Objects.requireNonNull(locationPreference);
            return this;
        }

        public Builder setMaintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }

        public Builder setPasswordValidationPolicy(PasswordValidationPolicyResponse passwordValidationPolicy) {
            this.passwordValidationPolicy = Objects.requireNonNull(passwordValidationPolicy);
            return this;
        }

        public Builder setPricingPlan(String pricingPlan) {
            this.pricingPlan = Objects.requireNonNull(pricingPlan);
            return this;
        }

        public Builder setSettingsVersion(String settingsVersion) {
            this.settingsVersion = Objects.requireNonNull(settingsVersion);
            return this;
        }

        public Builder setSqlServerAuditConfig(SqlServerAuditConfigResponse sqlServerAuditConfig) {
            this.sqlServerAuditConfig = Objects.requireNonNull(sqlServerAuditConfig);
            return this;
        }

        public Builder setStorageAutoResize(Boolean storageAutoResize) {
            this.storageAutoResize = Objects.requireNonNull(storageAutoResize);
            return this;
        }

        public Builder setStorageAutoResizeLimit(String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Objects.requireNonNull(storageAutoResizeLimit);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setUserLabels(Map<String,String> userLabels) {
            this.userLabels = Objects.requireNonNull(userLabels);
            return this;
        }

        public SettingsResponse build() {
            return new SettingsResponse(activationPolicy, activeDirectoryConfig, availabilityType, backupConfiguration, collation, crashSafeReplicationEnabled, dataDiskSizeGb, dataDiskType, databaseFlags, databaseReplicationEnabled, denyMaintenancePeriods, insightsConfig, ipConfiguration, kind, locationPreference, maintenanceWindow, passwordValidationPolicy, pricingPlan, settingsVersion, sqlServerAuditConfig, storageAutoResize, storageAutoResizeLimit, tier, userLabels);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.AdditionalFeaturesServerConfigurationsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlConnectivityUpdateSettingsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlStorageUpdateSettingsArgs;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlWorkloadTypeUpdateSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerConfigurationsManagementSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerConfigurationsManagementSettingsArgs Empty = new ServerConfigurationsManagementSettingsArgs();

    @InputImport(name="additionalFeaturesServerConfigurations")
    private final @Nullable Input<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations;

    public Input<AdditionalFeaturesServerConfigurationsArgs> getAdditionalFeaturesServerConfigurations() {
        return this.additionalFeaturesServerConfigurations == null ? Input.empty() : this.additionalFeaturesServerConfigurations;
    }

    @InputImport(name="sqlConnectivityUpdateSettings")
    private final @Nullable Input<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings;

    public Input<SqlConnectivityUpdateSettingsArgs> getSqlConnectivityUpdateSettings() {
        return this.sqlConnectivityUpdateSettings == null ? Input.empty() : this.sqlConnectivityUpdateSettings;
    }

    @InputImport(name="sqlStorageUpdateSettings")
    private final @Nullable Input<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings;

    public Input<SqlStorageUpdateSettingsArgs> getSqlStorageUpdateSettings() {
        return this.sqlStorageUpdateSettings == null ? Input.empty() : this.sqlStorageUpdateSettings;
    }

    @InputImport(name="sqlWorkloadTypeUpdateSettings")
    private final @Nullable Input<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings;

    public Input<SqlWorkloadTypeUpdateSettingsArgs> getSqlWorkloadTypeUpdateSettings() {
        return this.sqlWorkloadTypeUpdateSettings == null ? Input.empty() : this.sqlWorkloadTypeUpdateSettings;
    }

    public ServerConfigurationsManagementSettingsArgs(
        @Nullable Input<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations,
        @Nullable Input<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings,
        @Nullable Input<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings,
        @Nullable Input<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings) {
        this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
        this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
        this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
        this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
    }

    private ServerConfigurationsManagementSettingsArgs() {
        this.additionalFeaturesServerConfigurations = Input.empty();
        this.sqlConnectivityUpdateSettings = Input.empty();
        this.sqlStorageUpdateSettings = Input.empty();
        this.sqlWorkloadTypeUpdateSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerConfigurationsManagementSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations;
        private @Nullable Input<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings;
        private @Nullable Input<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings;
        private @Nullable Input<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerConfigurationsManagementSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalFeaturesServerConfigurations = defaults.additionalFeaturesServerConfigurations;
    	      this.sqlConnectivityUpdateSettings = defaults.sqlConnectivityUpdateSettings;
    	      this.sqlStorageUpdateSettings = defaults.sqlStorageUpdateSettings;
    	      this.sqlWorkloadTypeUpdateSettings = defaults.sqlWorkloadTypeUpdateSettings;
        }

        public Builder setAdditionalFeaturesServerConfigurations(@Nullable Input<AdditionalFeaturesServerConfigurationsArgs> additionalFeaturesServerConfigurations) {
            this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
            return this;
        }

        public Builder setAdditionalFeaturesServerConfigurations(@Nullable AdditionalFeaturesServerConfigurationsArgs additionalFeaturesServerConfigurations) {
            this.additionalFeaturesServerConfigurations = Input.ofNullable(additionalFeaturesServerConfigurations);
            return this;
        }

        public Builder setSqlConnectivityUpdateSettings(@Nullable Input<SqlConnectivityUpdateSettingsArgs> sqlConnectivityUpdateSettings) {
            this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
            return this;
        }

        public Builder setSqlConnectivityUpdateSettings(@Nullable SqlConnectivityUpdateSettingsArgs sqlConnectivityUpdateSettings) {
            this.sqlConnectivityUpdateSettings = Input.ofNullable(sqlConnectivityUpdateSettings);
            return this;
        }

        public Builder setSqlStorageUpdateSettings(@Nullable Input<SqlStorageUpdateSettingsArgs> sqlStorageUpdateSettings) {
            this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
            return this;
        }

        public Builder setSqlStorageUpdateSettings(@Nullable SqlStorageUpdateSettingsArgs sqlStorageUpdateSettings) {
            this.sqlStorageUpdateSettings = Input.ofNullable(sqlStorageUpdateSettings);
            return this;
        }

        public Builder setSqlWorkloadTypeUpdateSettings(@Nullable Input<SqlWorkloadTypeUpdateSettingsArgs> sqlWorkloadTypeUpdateSettings) {
            this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
            return this;
        }

        public Builder setSqlWorkloadTypeUpdateSettings(@Nullable SqlWorkloadTypeUpdateSettingsArgs sqlWorkloadTypeUpdateSettings) {
            this.sqlWorkloadTypeUpdateSettings = Input.ofNullable(sqlWorkloadTypeUpdateSettings);
            return this;
        }

        public ServerConfigurationsManagementSettingsArgs build() {
            return new ServerConfigurationsManagementSettingsArgs(additionalFeaturesServerConfigurations, sqlConnectivityUpdateSettings, sqlStorageUpdateSettings, sqlWorkloadTypeUpdateSettings);
        }
    }
}
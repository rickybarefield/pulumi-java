// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.enums.AuthenticationType;
import io.pulumi.azurenative.datamigration.enums.SqlSourcePlatform;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlConnectionInfoArgs Empty = new SqlConnectionInfoArgs();

    @InputImport(name="additionalSettings")
    private final @Nullable Input<String> additionalSettings;

    public Input<String> getAdditionalSettings() {
        return this.additionalSettings == null ? Input.empty() : this.additionalSettings;
    }

    @InputImport(name="authentication")
    private final @Nullable Input<Either<String,AuthenticationType>> authentication;

    public Input<Either<String,AuthenticationType>> getAuthentication() {
        return this.authentication == null ? Input.empty() : this.authentication;
    }

    @InputImport(name="dataSource", required=true)
    private final Input<String> dataSource;

    public Input<String> getDataSource() {
        return this.dataSource;
    }

    @InputImport(name="encryptConnection")
    private final @Nullable Input<Boolean> encryptConnection;

    public Input<Boolean> getEncryptConnection() {
        return this.encryptConnection == null ? Input.empty() : this.encryptConnection;
    }

    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    @InputImport(name="platform")
    private final @Nullable Input<Either<String,SqlSourcePlatform>> platform;

    public Input<Either<String,SqlSourcePlatform>> getPlatform() {
        return this.platform == null ? Input.empty() : this.platform;
    }

    @InputImport(name="trustServerCertificate")
    private final @Nullable Input<Boolean> trustServerCertificate;

    public Input<Boolean> getTrustServerCertificate() {
        return this.trustServerCertificate == null ? Input.empty() : this.trustServerCertificate;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="userName")
    private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public SqlConnectionInfoArgs(
        @Nullable Input<String> additionalSettings,
        @Nullable Input<Either<String,AuthenticationType>> authentication,
        Input<String> dataSource,
        @Nullable Input<Boolean> encryptConnection,
        @Nullable Input<String> password,
        @Nullable Input<Either<String,SqlSourcePlatform>> platform,
        @Nullable Input<Boolean> trustServerCertificate,
        Input<String> type,
        @Nullable Input<String> userName) {
        this.additionalSettings = additionalSettings;
        this.authentication = authentication;
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.encryptConnection = encryptConnection == null ? Input.ofNullable(true) : encryptConnection;
        this.password = password;
        this.platform = platform;
        this.trustServerCertificate = trustServerCertificate == null ? Input.ofNullable(false) : trustServerCertificate;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SqlConnectionInfoArgs() {
        this.additionalSettings = Input.empty();
        this.authentication = Input.empty();
        this.dataSource = Input.empty();
        this.encryptConnection = Input.empty();
        this.password = Input.empty();
        this.platform = Input.empty();
        this.trustServerCertificate = Input.empty();
        this.type = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> additionalSettings;
        private @Nullable Input<Either<String,AuthenticationType>> authentication;
        private Input<String> dataSource;
        private @Nullable Input<Boolean> encryptConnection;
        private @Nullable Input<String> password;
        private @Nullable Input<Either<String,SqlSourcePlatform>> platform;
        private @Nullable Input<Boolean> trustServerCertificate;
        private Input<String> type;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalSettings = defaults.additionalSettings;
    	      this.authentication = defaults.authentication;
    	      this.dataSource = defaults.dataSource;
    	      this.encryptConnection = defaults.encryptConnection;
    	      this.password = defaults.password;
    	      this.platform = defaults.platform;
    	      this.trustServerCertificate = defaults.trustServerCertificate;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setAdditionalSettings(@Nullable Input<String> additionalSettings) {
            this.additionalSettings = additionalSettings;
            return this;
        }

        public Builder setAdditionalSettings(@Nullable String additionalSettings) {
            this.additionalSettings = Input.ofNullable(additionalSettings);
            return this;
        }

        public Builder setAuthentication(@Nullable Input<Either<String,AuthenticationType>> authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setAuthentication(@Nullable Either<String,AuthenticationType> authentication) {
            this.authentication = Input.ofNullable(authentication);
            return this;
        }

        public Builder setDataSource(Input<String> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder setDataSource(String dataSource) {
            this.dataSource = Input.of(Objects.requireNonNull(dataSource));
            return this;
        }

        public Builder setEncryptConnection(@Nullable Input<Boolean> encryptConnection) {
            this.encryptConnection = encryptConnection;
            return this;
        }

        public Builder setEncryptConnection(@Nullable Boolean encryptConnection) {
            this.encryptConnection = Input.ofNullable(encryptConnection);
            return this;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setPlatform(@Nullable Input<Either<String,SqlSourcePlatform>> platform) {
            this.platform = platform;
            return this;
        }

        public Builder setPlatform(@Nullable Either<String,SqlSourcePlatform> platform) {
            this.platform = Input.ofNullable(platform);
            return this;
        }

        public Builder setTrustServerCertificate(@Nullable Input<Boolean> trustServerCertificate) {
            this.trustServerCertificate = trustServerCertificate;
            return this;
        }

        public Builder setTrustServerCertificate(@Nullable Boolean trustServerCertificate) {
            this.trustServerCertificate = Input.ofNullable(trustServerCertificate);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public SqlConnectionInfoArgs build() {
            return new SqlConnectionInfoArgs(additionalSettings, authentication, dataSource, encryptConnection, password, platform, trustServerCertificate, type, userName);
        }
    }
}
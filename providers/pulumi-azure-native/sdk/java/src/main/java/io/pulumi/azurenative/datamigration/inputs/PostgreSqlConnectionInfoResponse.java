// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PostgreSqlConnectionInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final PostgreSqlConnectionInfoResponse Empty = new PostgreSqlConnectionInfoResponse();

    @InputImport(name="databaseName")
    private final @Nullable String databaseName;

    public Optional<String> getDatabaseName() {
        return this.databaseName == null ? Optional.empty() : Optional.ofNullable(this.databaseName);
    }

    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    @InputImport(name="port", required=true)
    private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    @InputImport(name="serverName", required=true)
    private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="userName")
    private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public PostgreSqlConnectionInfoResponse(
        @Nullable String databaseName,
        @Nullable String password,
        Integer port,
        String serverName,
        String type,
        @Nullable String userName) {
        this.databaseName = databaseName;
        this.password = password;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private PostgreSqlConnectionInfoResponse() {
        this.databaseName = null;
        this.password = null;
        this.port = null;
        this.serverName = null;
        this.type = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String databaseName;
        private @Nullable String password;
        private Integer port;
        private String serverName;
        private String type;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }

        public PostgreSqlConnectionInfoResponse build() {
            return new PostgreSqlConnectionInfoResponse(databaseName, password, port, serverName, type, userName);
        }
    }
}
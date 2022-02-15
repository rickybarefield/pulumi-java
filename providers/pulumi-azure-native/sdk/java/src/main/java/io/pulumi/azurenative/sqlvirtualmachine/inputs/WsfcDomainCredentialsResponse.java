// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WsfcDomainCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final WsfcDomainCredentialsResponse Empty = new WsfcDomainCredentialsResponse();

    @InputImport(name="clusterBootstrapAccountPassword")
    private final @Nullable String clusterBootstrapAccountPassword;

    public Optional<String> getClusterBootstrapAccountPassword() {
        return this.clusterBootstrapAccountPassword == null ? Optional.empty() : Optional.ofNullable(this.clusterBootstrapAccountPassword);
    }

    @InputImport(name="clusterOperatorAccountPassword")
    private final @Nullable String clusterOperatorAccountPassword;

    public Optional<String> getClusterOperatorAccountPassword() {
        return this.clusterOperatorAccountPassword == null ? Optional.empty() : Optional.ofNullable(this.clusterOperatorAccountPassword);
    }

    @InputImport(name="sqlServiceAccountPassword")
    private final @Nullable String sqlServiceAccountPassword;

    public Optional<String> getSqlServiceAccountPassword() {
        return this.sqlServiceAccountPassword == null ? Optional.empty() : Optional.ofNullable(this.sqlServiceAccountPassword);
    }

    public WsfcDomainCredentialsResponse(
        @Nullable String clusterBootstrapAccountPassword,
        @Nullable String clusterOperatorAccountPassword,
        @Nullable String sqlServiceAccountPassword) {
        this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
        this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
        this.sqlServiceAccountPassword = sqlServiceAccountPassword;
    }

    private WsfcDomainCredentialsResponse() {
        this.clusterBootstrapAccountPassword = null;
        this.clusterOperatorAccountPassword = null;
        this.sqlServiceAccountPassword = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WsfcDomainCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterBootstrapAccountPassword;
        private @Nullable String clusterOperatorAccountPassword;
        private @Nullable String sqlServiceAccountPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(WsfcDomainCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterBootstrapAccountPassword = defaults.clusterBootstrapAccountPassword;
    	      this.clusterOperatorAccountPassword = defaults.clusterOperatorAccountPassword;
    	      this.sqlServiceAccountPassword = defaults.sqlServiceAccountPassword;
        }

        public Builder setClusterBootstrapAccountPassword(@Nullable String clusterBootstrapAccountPassword) {
            this.clusterBootstrapAccountPassword = clusterBootstrapAccountPassword;
            return this;
        }

        public Builder setClusterOperatorAccountPassword(@Nullable String clusterOperatorAccountPassword) {
            this.clusterOperatorAccountPassword = clusterOperatorAccountPassword;
            return this;
        }

        public Builder setSqlServiceAccountPassword(@Nullable String sqlServiceAccountPassword) {
            this.sqlServiceAccountPassword = sqlServiceAccountPassword;
            return this;
        }

        public WsfcDomainCredentialsResponse build() {
            return new WsfcDomainCredentialsResponse(clusterBootstrapAccountPassword, clusterOperatorAccountPassword, sqlServiceAccountPassword);
        }
    }
}
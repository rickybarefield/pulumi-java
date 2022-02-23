// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.aws.guardduty.inputs.OrganizationConfigurationDatasourcesS3LogsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationConfigurationDatasourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationConfigurationDatasourcesArgs Empty = new OrganizationConfigurationDatasourcesArgs();

    /**
     * Configuration for the builds to store logs to S3.
     * 
     */
    @InputImport(name="s3Logs")
    private final @Nullable Input<OrganizationConfigurationDatasourcesS3LogsArgs> s3Logs;

    public Input<OrganizationConfigurationDatasourcesS3LogsArgs> getS3Logs() {
        return this.s3Logs == null ? Input.empty() : this.s3Logs;
    }

    public OrganizationConfigurationDatasourcesArgs(@Nullable Input<OrganizationConfigurationDatasourcesS3LogsArgs> s3Logs) {
        this.s3Logs = s3Logs;
    }

    private OrganizationConfigurationDatasourcesArgs() {
        this.s3Logs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConfigurationDatasourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OrganizationConfigurationDatasourcesS3LogsArgs> s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationConfigurationDatasourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder setS3Logs(@Nullable Input<OrganizationConfigurationDatasourcesS3LogsArgs> s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }

        public Builder setS3Logs(@Nullable OrganizationConfigurationDatasourcesS3LogsArgs s3Logs) {
            this.s3Logs = Input.ofNullable(s3Logs);
            return this;
        }
        public OrganizationConfigurationDatasourcesArgs build() {
            return new OrganizationConfigurationDatasourcesArgs(s3Logs);
        }
    }
}
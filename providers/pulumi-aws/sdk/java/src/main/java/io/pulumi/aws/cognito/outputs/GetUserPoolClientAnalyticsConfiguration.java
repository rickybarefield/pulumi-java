// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUserPoolClientAnalyticsConfiguration {
    /**
     * (Optional) Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    private final String applicationArn;
    /**
     * (Optional) Application ID for an Amazon Pinpoint application.
     * 
     */
    private final String applicationId;
    /**
     * (Optional) ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    private final String externalId;
    /**
     * (Optional) ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * * `user_data_shared` (Optional) If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    private final String roleArn;
    private final Boolean userDataShared;

    @OutputCustomType.Constructor({"applicationArn","applicationId","externalId","roleArn","userDataShared"})
    private GetUserPoolClientAnalyticsConfiguration(
        String applicationArn,
        String applicationId,
        String externalId,
        String roleArn,
        Boolean userDataShared) {
        this.applicationArn = Objects.requireNonNull(applicationArn);
        this.applicationId = Objects.requireNonNull(applicationId);
        this.externalId = Objects.requireNonNull(externalId);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.userDataShared = Objects.requireNonNull(userDataShared);
    }

    /**
     * (Optional) Application ARN for an Amazon Pinpoint application. Conflicts with `external_id` and `role_arn`.
     * 
     */
    public String getApplicationArn() {
        return this.applicationArn;
    }
    /**
     * (Optional) Application ID for an Amazon Pinpoint application.
     * 
     */
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * (Optional) ID for the Analytics Configuration. Conflicts with `application_arn`.
     * 
     */
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * (Optional) ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics. Conflicts with `application_arn`.
     * * `user_data_shared` (Optional) If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    public Boolean getUserDataShared() {
        return this.userDataShared;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserPoolClientAnalyticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationArn;
        private String applicationId;
        private String externalId;
        private String roleArn;
        private Boolean userDataShared;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserPoolClientAnalyticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationArn = defaults.applicationArn;
    	      this.applicationId = defaults.applicationId;
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
    	      this.userDataShared = defaults.userDataShared;
        }

        public Builder setApplicationArn(String applicationArn) {
            this.applicationArn = Objects.requireNonNull(applicationArn);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setUserDataShared(Boolean userDataShared) {
            this.userDataShared = Objects.requireNonNull(userDataShared);
            return this;
        }
        public GetUserPoolClientAnalyticsConfiguration build() {
            return new GetUserPoolClientAnalyticsConfiguration(applicationArn, applicationId, externalId, roleArn, userDataShared);
        }
    }
}
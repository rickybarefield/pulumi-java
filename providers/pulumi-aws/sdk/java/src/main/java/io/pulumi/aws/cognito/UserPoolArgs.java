// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.cognito.inputs.UserPoolAccountRecoverySettingArgs;
import io.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigArgs;
import io.pulumi.aws.cognito.inputs.UserPoolDeviceConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolEmailConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigArgs;
import io.pulumi.aws.cognito.inputs.UserPoolPasswordPolicyArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSchemaArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSmsConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolSoftwareTokenMfaConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolUserPoolAddOnsArgs;
import io.pulumi.aws.cognito.inputs.UserPoolUsernameConfigurationArgs;
import io.pulumi.aws.cognito.inputs.UserPoolVerificationMessageTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolArgs Empty = new UserPoolArgs();

    /**
     * Configuration block to define which verified available method a user can use to recover their forgotten password. Detailed below.
     * 
     */
    @InputImport(name="accountRecoverySetting")
    private final @Nullable Input<UserPoolAccountRecoverySettingArgs> accountRecoverySetting;

    public Input<UserPoolAccountRecoverySettingArgs> getAccountRecoverySetting() {
        return this.accountRecoverySetting == null ? Input.empty() : this.accountRecoverySetting;
    }

    /**
     * Configuration block for creating a new user profile. Detailed below.
     * 
     */
    @InputImport(name="adminCreateUserConfig")
    private final @Nullable Input<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig;

    public Input<UserPoolAdminCreateUserConfigArgs> getAdminCreateUserConfig() {
        return this.adminCreateUserConfig == null ? Input.empty() : this.adminCreateUserConfig;
    }

    /**
     * Attributes supported as an alias for this user pool. Valid values: `phone_number`, `email`, or `preferred_username`. Conflicts with `username_attributes`.
     * 
     */
    @InputImport(name="aliasAttributes")
    private final @Nullable Input<List<String>> aliasAttributes;

    public Input<List<String>> getAliasAttributes() {
        return this.aliasAttributes == null ? Input.empty() : this.aliasAttributes;
    }

    /**
     * Attributes to be auto-verified. Valid values: `email`, `phone_number`.
     * 
     */
    @InputImport(name="autoVerifiedAttributes")
    private final @Nullable Input<List<String>> autoVerifiedAttributes;

    public Input<List<String>> getAutoVerifiedAttributes() {
        return this.autoVerifiedAttributes == null ? Input.empty() : this.autoVerifiedAttributes;
    }

    /**
     * Configuration block for the user pool's device tracking. Detailed below.
     * 
     */
    @InputImport(name="deviceConfiguration")
    private final @Nullable Input<UserPoolDeviceConfigurationArgs> deviceConfiguration;

    public Input<UserPoolDeviceConfigurationArgs> getDeviceConfiguration() {
        return this.deviceConfiguration == null ? Input.empty() : this.deviceConfiguration;
    }

    /**
     * Configuration block for configuring email. Detailed below.
     * 
     */
    @InputImport(name="emailConfiguration")
    private final @Nullable Input<UserPoolEmailConfigurationArgs> emailConfiguration;

    public Input<UserPoolEmailConfigurationArgs> getEmailConfiguration() {
        return this.emailConfiguration == null ? Input.empty() : this.emailConfiguration;
    }

    /**
     * String representing the email verification message. Conflicts with `verification_message_template` configuration block `email_message` argument.
     * 
     */
    @InputImport(name="emailVerificationMessage")
    private final @Nullable Input<String> emailVerificationMessage;

    public Input<String> getEmailVerificationMessage() {
        return this.emailVerificationMessage == null ? Input.empty() : this.emailVerificationMessage;
    }

    /**
     * String representing the email verification subject. Conflicts with `verification_message_template` configuration block `email_subject` argument.
     * 
     */
    @InputImport(name="emailVerificationSubject")
    private final @Nullable Input<String> emailVerificationSubject;

    public Input<String> getEmailVerificationSubject() {
        return this.emailVerificationSubject == null ? Input.empty() : this.emailVerificationSubject;
    }

    /**
     * Configuration block for the AWS Lambda triggers associated with the user pool. Detailed below.
     * 
     */
    @InputImport(name="lambdaConfig")
    private final @Nullable Input<UserPoolLambdaConfigArgs> lambdaConfig;

    public Input<UserPoolLambdaConfigArgs> getLambdaConfig() {
        return this.lambdaConfig == null ? Input.empty() : this.lambdaConfig;
    }

    /**
     * Multi-Factor Authentication (MFA) configuration for the User Pool. Defaults of `OFF`. Valid values are `OFF` (MFA Tokens are not required), `ON` (MFA is required for all users to sign in; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured), or `OPTIONAL` (MFA Will be required only for individual users who have MFA Enabled; requires at least one of `sms_configuration` or `software_token_mfa_configuration` to be configured).
     * 
     */
    @InputImport(name="mfaConfiguration")
    private final @Nullable Input<String> mfaConfiguration;

    public Input<String> getMfaConfiguration() {
        return this.mfaConfiguration == null ? Input.empty() : this.mfaConfiguration;
    }

    /**
     * Name of the attribute.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Configuration blocked for information about the user pool password policy. Detailed below.
     * 
     */
    @InputImport(name="passwordPolicy")
    private final @Nullable Input<UserPoolPasswordPolicyArgs> passwordPolicy;

    public Input<UserPoolPasswordPolicyArgs> getPasswordPolicy() {
        return this.passwordPolicy == null ? Input.empty() : this.passwordPolicy;
    }

    /**
     * Configuration block for the schema attributes of a user pool. Detailed below. Schema attributes from the [standard attribute set](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes) only need to be specified if they are different from the default configuration. Attributes can be added, but not modified or removed. Maximum of 50 attributes.
     * 
     */
    @InputImport(name="schemas")
    private final @Nullable Input<List<UserPoolSchemaArgs>> schemas;

    public Input<List<UserPoolSchemaArgs>> getSchemas() {
        return this.schemas == null ? Input.empty() : this.schemas;
    }

    /**
     * String representing the SMS authentication message. The Message must contain the `{####}` placeholder, which will be replaced with the code.
     * 
     */
    @InputImport(name="smsAuthenticationMessage")
    private final @Nullable Input<String> smsAuthenticationMessage;

    public Input<String> getSmsAuthenticationMessage() {
        return this.smsAuthenticationMessage == null ? Input.empty() : this.smsAuthenticationMessage;
    }

    /**
     * Configuration block for Short Message Service (SMS) settings. Detailed below. These settings apply to SMS user verification and SMS Multi-Factor Authentication (MFA). Due to Cognito API restrictions, the SMS configuration cannot be removed without recreating the Cognito User Pool. For user data safety, this resource will ignore the removal of this configuration by disabling drift detection.
     * 
     */
    @InputImport(name="smsConfiguration")
    private final @Nullable Input<UserPoolSmsConfigurationArgs> smsConfiguration;

    public Input<UserPoolSmsConfigurationArgs> getSmsConfiguration() {
        return this.smsConfiguration == null ? Input.empty() : this.smsConfiguration;
    }

    /**
     * String representing the SMS verification message. Conflicts with `verification_message_template` configuration block `sms_message` argument.
     * 
     */
    @InputImport(name="smsVerificationMessage")
    private final @Nullable Input<String> smsVerificationMessage;

    public Input<String> getSmsVerificationMessage() {
        return this.smsVerificationMessage == null ? Input.empty() : this.smsVerificationMessage;
    }

    /**
     * Configuration block for software token Mult-Factor Authentication (MFA) settings. Detailed below.
     * 
     */
    @InputImport(name="softwareTokenMfaConfiguration")
    private final @Nullable Input<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration;

    public Input<UserPoolSoftwareTokenMfaConfigurationArgs> getSoftwareTokenMfaConfiguration() {
        return this.softwareTokenMfaConfiguration == null ? Input.empty() : this.softwareTokenMfaConfiguration;
    }

    /**
     * Map of tags to assign to the User Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configuration block for user pool add-ons to enable user pool advanced security mode features. Detailed below.
     * 
     */
    @InputImport(name="userPoolAddOns")
    private final @Nullable Input<UserPoolUserPoolAddOnsArgs> userPoolAddOns;

    public Input<UserPoolUserPoolAddOnsArgs> getUserPoolAddOns() {
        return this.userPoolAddOns == null ? Input.empty() : this.userPoolAddOns;
    }

    /**
     * Whether email addresses or phone numbers can be specified as usernames when a user signs up. Conflicts with `alias_attributes`.
     * 
     */
    @InputImport(name="usernameAttributes")
    private final @Nullable Input<List<String>> usernameAttributes;

    public Input<List<String>> getUsernameAttributes() {
        return this.usernameAttributes == null ? Input.empty() : this.usernameAttributes;
    }

    /**
     * Configuration block for username configuration. Detailed below.
     * 
     */
    @InputImport(name="usernameConfiguration")
    private final @Nullable Input<UserPoolUsernameConfigurationArgs> usernameConfiguration;

    public Input<UserPoolUsernameConfigurationArgs> getUsernameConfiguration() {
        return this.usernameConfiguration == null ? Input.empty() : this.usernameConfiguration;
    }

    /**
     * Configuration block for verification message templates. Detailed below.
     * 
     */
    @InputImport(name="verificationMessageTemplate")
    private final @Nullable Input<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate;

    public Input<UserPoolVerificationMessageTemplateArgs> getVerificationMessageTemplate() {
        return this.verificationMessageTemplate == null ? Input.empty() : this.verificationMessageTemplate;
    }

    public UserPoolArgs(
        @Nullable Input<UserPoolAccountRecoverySettingArgs> accountRecoverySetting,
        @Nullable Input<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig,
        @Nullable Input<List<String>> aliasAttributes,
        @Nullable Input<List<String>> autoVerifiedAttributes,
        @Nullable Input<UserPoolDeviceConfigurationArgs> deviceConfiguration,
        @Nullable Input<UserPoolEmailConfigurationArgs> emailConfiguration,
        @Nullable Input<String> emailVerificationMessage,
        @Nullable Input<String> emailVerificationSubject,
        @Nullable Input<UserPoolLambdaConfigArgs> lambdaConfig,
        @Nullable Input<String> mfaConfiguration,
        @Nullable Input<String> name,
        @Nullable Input<UserPoolPasswordPolicyArgs> passwordPolicy,
        @Nullable Input<List<UserPoolSchemaArgs>> schemas,
        @Nullable Input<String> smsAuthenticationMessage,
        @Nullable Input<UserPoolSmsConfigurationArgs> smsConfiguration,
        @Nullable Input<String> smsVerificationMessage,
        @Nullable Input<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<UserPoolUserPoolAddOnsArgs> userPoolAddOns,
        @Nullable Input<List<String>> usernameAttributes,
        @Nullable Input<UserPoolUsernameConfigurationArgs> usernameConfiguration,
        @Nullable Input<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate) {
        this.accountRecoverySetting = accountRecoverySetting;
        this.adminCreateUserConfig = adminCreateUserConfig;
        this.aliasAttributes = aliasAttributes;
        this.autoVerifiedAttributes = autoVerifiedAttributes;
        this.deviceConfiguration = deviceConfiguration;
        this.emailConfiguration = emailConfiguration;
        this.emailVerificationMessage = emailVerificationMessage;
        this.emailVerificationSubject = emailVerificationSubject;
        this.lambdaConfig = lambdaConfig;
        this.mfaConfiguration = mfaConfiguration;
        this.name = name;
        this.passwordPolicy = passwordPolicy;
        this.schemas = schemas;
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        this.smsConfiguration = smsConfiguration;
        this.smsVerificationMessage = smsVerificationMessage;
        this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
        this.tags = tags;
        this.userPoolAddOns = userPoolAddOns;
        this.usernameAttributes = usernameAttributes;
        this.usernameConfiguration = usernameConfiguration;
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    private UserPoolArgs() {
        this.accountRecoverySetting = Input.empty();
        this.adminCreateUserConfig = Input.empty();
        this.aliasAttributes = Input.empty();
        this.autoVerifiedAttributes = Input.empty();
        this.deviceConfiguration = Input.empty();
        this.emailConfiguration = Input.empty();
        this.emailVerificationMessage = Input.empty();
        this.emailVerificationSubject = Input.empty();
        this.lambdaConfig = Input.empty();
        this.mfaConfiguration = Input.empty();
        this.name = Input.empty();
        this.passwordPolicy = Input.empty();
        this.schemas = Input.empty();
        this.smsAuthenticationMessage = Input.empty();
        this.smsConfiguration = Input.empty();
        this.smsVerificationMessage = Input.empty();
        this.softwareTokenMfaConfiguration = Input.empty();
        this.tags = Input.empty();
        this.userPoolAddOns = Input.empty();
        this.usernameAttributes = Input.empty();
        this.usernameConfiguration = Input.empty();
        this.verificationMessageTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UserPoolAccountRecoverySettingArgs> accountRecoverySetting;
        private @Nullable Input<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig;
        private @Nullable Input<List<String>> aliasAttributes;
        private @Nullable Input<List<String>> autoVerifiedAttributes;
        private @Nullable Input<UserPoolDeviceConfigurationArgs> deviceConfiguration;
        private @Nullable Input<UserPoolEmailConfigurationArgs> emailConfiguration;
        private @Nullable Input<String> emailVerificationMessage;
        private @Nullable Input<String> emailVerificationSubject;
        private @Nullable Input<UserPoolLambdaConfigArgs> lambdaConfig;
        private @Nullable Input<String> mfaConfiguration;
        private @Nullable Input<String> name;
        private @Nullable Input<UserPoolPasswordPolicyArgs> passwordPolicy;
        private @Nullable Input<List<UserPoolSchemaArgs>> schemas;
        private @Nullable Input<String> smsAuthenticationMessage;
        private @Nullable Input<UserPoolSmsConfigurationArgs> smsConfiguration;
        private @Nullable Input<String> smsVerificationMessage;
        private @Nullable Input<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<UserPoolUserPoolAddOnsArgs> userPoolAddOns;
        private @Nullable Input<List<String>> usernameAttributes;
        private @Nullable Input<UserPoolUsernameConfigurationArgs> usernameConfiguration;
        private @Nullable Input<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountRecoverySetting = defaults.accountRecoverySetting;
    	      this.adminCreateUserConfig = defaults.adminCreateUserConfig;
    	      this.aliasAttributes = defaults.aliasAttributes;
    	      this.autoVerifiedAttributes = defaults.autoVerifiedAttributes;
    	      this.deviceConfiguration = defaults.deviceConfiguration;
    	      this.emailConfiguration = defaults.emailConfiguration;
    	      this.emailVerificationMessage = defaults.emailVerificationMessage;
    	      this.emailVerificationSubject = defaults.emailVerificationSubject;
    	      this.lambdaConfig = defaults.lambdaConfig;
    	      this.mfaConfiguration = defaults.mfaConfiguration;
    	      this.name = defaults.name;
    	      this.passwordPolicy = defaults.passwordPolicy;
    	      this.schemas = defaults.schemas;
    	      this.smsAuthenticationMessage = defaults.smsAuthenticationMessage;
    	      this.smsConfiguration = defaults.smsConfiguration;
    	      this.smsVerificationMessage = defaults.smsVerificationMessage;
    	      this.softwareTokenMfaConfiguration = defaults.softwareTokenMfaConfiguration;
    	      this.tags = defaults.tags;
    	      this.userPoolAddOns = defaults.userPoolAddOns;
    	      this.usernameAttributes = defaults.usernameAttributes;
    	      this.usernameConfiguration = defaults.usernameConfiguration;
    	      this.verificationMessageTemplate = defaults.verificationMessageTemplate;
        }

        public Builder setAccountRecoverySetting(@Nullable Input<UserPoolAccountRecoverySettingArgs> accountRecoverySetting) {
            this.accountRecoverySetting = accountRecoverySetting;
            return this;
        }

        public Builder setAccountRecoverySetting(@Nullable UserPoolAccountRecoverySettingArgs accountRecoverySetting) {
            this.accountRecoverySetting = Input.ofNullable(accountRecoverySetting);
            return this;
        }

        public Builder setAdminCreateUserConfig(@Nullable Input<UserPoolAdminCreateUserConfigArgs> adminCreateUserConfig) {
            this.adminCreateUserConfig = adminCreateUserConfig;
            return this;
        }

        public Builder setAdminCreateUserConfig(@Nullable UserPoolAdminCreateUserConfigArgs adminCreateUserConfig) {
            this.adminCreateUserConfig = Input.ofNullable(adminCreateUserConfig);
            return this;
        }

        public Builder setAliasAttributes(@Nullable Input<List<String>> aliasAttributes) {
            this.aliasAttributes = aliasAttributes;
            return this;
        }

        public Builder setAliasAttributes(@Nullable List<String> aliasAttributes) {
            this.aliasAttributes = Input.ofNullable(aliasAttributes);
            return this;
        }

        public Builder setAutoVerifiedAttributes(@Nullable Input<List<String>> autoVerifiedAttributes) {
            this.autoVerifiedAttributes = autoVerifiedAttributes;
            return this;
        }

        public Builder setAutoVerifiedAttributes(@Nullable List<String> autoVerifiedAttributes) {
            this.autoVerifiedAttributes = Input.ofNullable(autoVerifiedAttributes);
            return this;
        }

        public Builder setDeviceConfiguration(@Nullable Input<UserPoolDeviceConfigurationArgs> deviceConfiguration) {
            this.deviceConfiguration = deviceConfiguration;
            return this;
        }

        public Builder setDeviceConfiguration(@Nullable UserPoolDeviceConfigurationArgs deviceConfiguration) {
            this.deviceConfiguration = Input.ofNullable(deviceConfiguration);
            return this;
        }

        public Builder setEmailConfiguration(@Nullable Input<UserPoolEmailConfigurationArgs> emailConfiguration) {
            this.emailConfiguration = emailConfiguration;
            return this;
        }

        public Builder setEmailConfiguration(@Nullable UserPoolEmailConfigurationArgs emailConfiguration) {
            this.emailConfiguration = Input.ofNullable(emailConfiguration);
            return this;
        }

        public Builder setEmailVerificationMessage(@Nullable Input<String> emailVerificationMessage) {
            this.emailVerificationMessage = emailVerificationMessage;
            return this;
        }

        public Builder setEmailVerificationMessage(@Nullable String emailVerificationMessage) {
            this.emailVerificationMessage = Input.ofNullable(emailVerificationMessage);
            return this;
        }

        public Builder setEmailVerificationSubject(@Nullable Input<String> emailVerificationSubject) {
            this.emailVerificationSubject = emailVerificationSubject;
            return this;
        }

        public Builder setEmailVerificationSubject(@Nullable String emailVerificationSubject) {
            this.emailVerificationSubject = Input.ofNullable(emailVerificationSubject);
            return this;
        }

        public Builder setLambdaConfig(@Nullable Input<UserPoolLambdaConfigArgs> lambdaConfig) {
            this.lambdaConfig = lambdaConfig;
            return this;
        }

        public Builder setLambdaConfig(@Nullable UserPoolLambdaConfigArgs lambdaConfig) {
            this.lambdaConfig = Input.ofNullable(lambdaConfig);
            return this;
        }

        public Builder setMfaConfiguration(@Nullable Input<String> mfaConfiguration) {
            this.mfaConfiguration = mfaConfiguration;
            return this;
        }

        public Builder setMfaConfiguration(@Nullable String mfaConfiguration) {
            this.mfaConfiguration = Input.ofNullable(mfaConfiguration);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPasswordPolicy(@Nullable Input<UserPoolPasswordPolicyArgs> passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            return this;
        }

        public Builder setPasswordPolicy(@Nullable UserPoolPasswordPolicyArgs passwordPolicy) {
            this.passwordPolicy = Input.ofNullable(passwordPolicy);
            return this;
        }

        public Builder setSchemas(@Nullable Input<List<UserPoolSchemaArgs>> schemas) {
            this.schemas = schemas;
            return this;
        }

        public Builder setSchemas(@Nullable List<UserPoolSchemaArgs> schemas) {
            this.schemas = Input.ofNullable(schemas);
            return this;
        }

        public Builder setSmsAuthenticationMessage(@Nullable Input<String> smsAuthenticationMessage) {
            this.smsAuthenticationMessage = smsAuthenticationMessage;
            return this;
        }

        public Builder setSmsAuthenticationMessage(@Nullable String smsAuthenticationMessage) {
            this.smsAuthenticationMessage = Input.ofNullable(smsAuthenticationMessage);
            return this;
        }

        public Builder setSmsConfiguration(@Nullable Input<UserPoolSmsConfigurationArgs> smsConfiguration) {
            this.smsConfiguration = smsConfiguration;
            return this;
        }

        public Builder setSmsConfiguration(@Nullable UserPoolSmsConfigurationArgs smsConfiguration) {
            this.smsConfiguration = Input.ofNullable(smsConfiguration);
            return this;
        }

        public Builder setSmsVerificationMessage(@Nullable Input<String> smsVerificationMessage) {
            this.smsVerificationMessage = smsVerificationMessage;
            return this;
        }

        public Builder setSmsVerificationMessage(@Nullable String smsVerificationMessage) {
            this.smsVerificationMessage = Input.ofNullable(smsVerificationMessage);
            return this;
        }

        public Builder setSoftwareTokenMfaConfiguration(@Nullable Input<UserPoolSoftwareTokenMfaConfigurationArgs> softwareTokenMfaConfiguration) {
            this.softwareTokenMfaConfiguration = softwareTokenMfaConfiguration;
            return this;
        }

        public Builder setSoftwareTokenMfaConfiguration(@Nullable UserPoolSoftwareTokenMfaConfigurationArgs softwareTokenMfaConfiguration) {
            this.softwareTokenMfaConfiguration = Input.ofNullable(softwareTokenMfaConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUserPoolAddOns(@Nullable Input<UserPoolUserPoolAddOnsArgs> userPoolAddOns) {
            this.userPoolAddOns = userPoolAddOns;
            return this;
        }

        public Builder setUserPoolAddOns(@Nullable UserPoolUserPoolAddOnsArgs userPoolAddOns) {
            this.userPoolAddOns = Input.ofNullable(userPoolAddOns);
            return this;
        }

        public Builder setUsernameAttributes(@Nullable Input<List<String>> usernameAttributes) {
            this.usernameAttributes = usernameAttributes;
            return this;
        }

        public Builder setUsernameAttributes(@Nullable List<String> usernameAttributes) {
            this.usernameAttributes = Input.ofNullable(usernameAttributes);
            return this;
        }

        public Builder setUsernameConfiguration(@Nullable Input<UserPoolUsernameConfigurationArgs> usernameConfiguration) {
            this.usernameConfiguration = usernameConfiguration;
            return this;
        }

        public Builder setUsernameConfiguration(@Nullable UserPoolUsernameConfigurationArgs usernameConfiguration) {
            this.usernameConfiguration = Input.ofNullable(usernameConfiguration);
            return this;
        }

        public Builder setVerificationMessageTemplate(@Nullable Input<UserPoolVerificationMessageTemplateArgs> verificationMessageTemplate) {
            this.verificationMessageTemplate = verificationMessageTemplate;
            return this;
        }

        public Builder setVerificationMessageTemplate(@Nullable UserPoolVerificationMessageTemplateArgs verificationMessageTemplate) {
            this.verificationMessageTemplate = Input.ofNullable(verificationMessageTemplate);
            return this;
        }
        public UserPoolArgs build() {
            return new UserPoolArgs(accountRecoverySetting, adminCreateUserConfig, aliasAttributes, autoVerifiedAttributes, deviceConfiguration, emailConfiguration, emailVerificationMessage, emailVerificationSubject, lambdaConfig, mfaConfiguration, name, passwordPolicy, schemas, smsAuthenticationMessage, smsConfiguration, smsVerificationMessage, softwareTokenMfaConfiguration, tags, userPoolAddOns, usernameAttributes, usernameConfiguration, verificationMessageTemplate);
        }
    }
}
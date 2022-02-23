// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolAdminCreateUserConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAdminCreateUserConfigGetArgs Empty = new UserPoolAdminCreateUserConfigGetArgs();

    /**
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
     * 
     */
    @InputImport(name="allowAdminCreateUserOnly")
    private final @Nullable Input<Boolean> allowAdminCreateUserOnly;

    public Input<Boolean> getAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly == null ? Input.empty() : this.allowAdminCreateUserOnly;
    }

    /**
     * Invite message template structure. Detailed below.
     * 
     */
    @InputImport(name="inviteMessageTemplate")
    private final @Nullable Input<UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs> inviteMessageTemplate;

    public Input<UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs> getInviteMessageTemplate() {
        return this.inviteMessageTemplate == null ? Input.empty() : this.inviteMessageTemplate;
    }

    public UserPoolAdminCreateUserConfigGetArgs(
        @Nullable Input<Boolean> allowAdminCreateUserOnly,
        @Nullable Input<UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs> inviteMessageTemplate) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    private UserPoolAdminCreateUserConfigGetArgs() {
        this.allowAdminCreateUserOnly = Input.empty();
        this.inviteMessageTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAdminCreateUserConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowAdminCreateUserOnly;
        private @Nullable Input<UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs> inviteMessageTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAdminCreateUserConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAdminCreateUserOnly = defaults.allowAdminCreateUserOnly;
    	      this.inviteMessageTemplate = defaults.inviteMessageTemplate;
        }

        public Builder setAllowAdminCreateUserOnly(@Nullable Input<Boolean> allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
            return this;
        }

        public Builder setAllowAdminCreateUserOnly(@Nullable Boolean allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = Input.ofNullable(allowAdminCreateUserOnly);
            return this;
        }

        public Builder setInviteMessageTemplate(@Nullable Input<UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs> inviteMessageTemplate) {
            this.inviteMessageTemplate = inviteMessageTemplate;
            return this;
        }

        public Builder setInviteMessageTemplate(@Nullable UserPoolAdminCreateUserConfigInviteMessageTemplateGetArgs inviteMessageTemplate) {
            this.inviteMessageTemplate = Input.ofNullable(inviteMessageTemplate);
            return this;
        }
        public UserPoolAdminCreateUserConfigGetArgs build() {
            return new UserPoolAdminCreateUserConfigGetArgs(allowAdminCreateUserOnly, inviteMessageTemplate);
        }
    }
}
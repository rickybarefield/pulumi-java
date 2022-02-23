// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberArgs Empty = new MemberArgs();

    /**
     * The ID of the member AWS account.
     * 
     */
    @InputImport(name="accountId", required=true)
    private final Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId;
    }

    /**
     * The email of the member AWS account.
     * 
     */
    @InputImport(name="email", required=true)
    private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
     * 
     */
    @InputImport(name="invite")
    private final @Nullable Input<Boolean> invite;

    public Input<Boolean> getInvite() {
        return this.invite == null ? Input.empty() : this.invite;
    }

    public MemberArgs(
        Input<String> accountId,
        Input<String> email,
        @Nullable Input<Boolean> invite) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.invite = invite;
    }

    private MemberArgs() {
        this.accountId = Input.empty();
        this.email = Input.empty();
        this.invite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountId;
        private Input<String> email;
        private @Nullable Input<Boolean> invite;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.email = defaults.email;
    	      this.invite = defaults.invite;
        }

        public Builder setAccountId(Input<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Input.of(Objects.requireNonNull(accountId));
            return this;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setInvite(@Nullable Input<Boolean> invite) {
            this.invite = invite;
            return this;
        }

        public Builder setInvite(@Nullable Boolean invite) {
            this.invite = Input.ofNullable(invite);
            return this;
        }
        public MemberArgs build() {
            return new MemberArgs(accountId, email, invite);
        }
    }
}
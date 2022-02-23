// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InviteAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final InviteAccepterState Empty = new InviteAccepterState();

    /**
     * The ID of the invitation.
     * 
     */
    @InputImport(name="invitationId")
    private final @Nullable Input<String> invitationId;

    public Input<String> getInvitationId() {
        return this.invitationId == null ? Input.empty() : this.invitationId;
    }

    /**
     * The account ID of the master Security Hub account whose invitation you're accepting.
     * 
     */
    @InputImport(name="masterId")
    private final @Nullable Input<String> masterId;

    public Input<String> getMasterId() {
        return this.masterId == null ? Input.empty() : this.masterId;
    }

    public InviteAccepterState(
        @Nullable Input<String> invitationId,
        @Nullable Input<String> masterId) {
        this.invitationId = invitationId;
        this.masterId = masterId;
    }

    private InviteAccepterState() {
        this.invitationId = Input.empty();
        this.masterId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InviteAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> invitationId;
        private @Nullable Input<String> masterId;

        public Builder() {
    	      // Empty
        }

        public Builder(InviteAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invitationId = defaults.invitationId;
    	      this.masterId = defaults.masterId;
        }

        public Builder setInvitationId(@Nullable Input<String> invitationId) {
            this.invitationId = invitationId;
            return this;
        }

        public Builder setInvitationId(@Nullable String invitationId) {
            this.invitationId = Input.ofNullable(invitationId);
            return this;
        }

        public Builder setMasterId(@Nullable Input<String> masterId) {
            this.masterId = masterId;
            return this;
        }

        public Builder setMasterId(@Nullable String masterId) {
            this.masterId = Input.ofNullable(masterId);
            return this;
        }
        public InviteAccepterState build() {
            return new InviteAccepterState(invitationId, masterId);
        }
    }
}
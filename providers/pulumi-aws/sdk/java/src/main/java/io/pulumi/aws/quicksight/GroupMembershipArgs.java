// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @InputImport(name="awsAccountId")
    private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    /**
     * The name of the group in which the member will be added.
     * 
     */
    @InputImport(name="groupName", required=true)
    private final Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName;
    }

    /**
     * The name of the member to add to the group.
     * 
     */
    @InputImport(name="memberName", required=true)
    private final Input<String> memberName;

    public Input<String> getMemberName() {
        return this.memberName;
    }

    /**
     * The namespace. Defaults to `default`. Currently only `default` is supported.
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    public GroupMembershipArgs(
        @Nullable Input<String> awsAccountId,
        Input<String> groupName,
        Input<String> memberName,
        @Nullable Input<String> namespace) {
        this.awsAccountId = awsAccountId;
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.memberName = Objects.requireNonNull(memberName, "expected parameter 'memberName' to be non-null");
        this.namespace = namespace;
    }

    private GroupMembershipArgs() {
        this.awsAccountId = Input.empty();
        this.groupName = Input.empty();
        this.memberName = Input.empty();
        this.namespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsAccountId;
        private Input<String> groupName;
        private Input<String> memberName;
        private @Nullable Input<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.groupName = defaults.groupName;
    	      this.memberName = defaults.memberName;
    	      this.namespace = defaults.namespace;
        }

        public Builder setAwsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setAwsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder setGroupName(Input<String> groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Input.of(Objects.requireNonNull(groupName));
            return this;
        }

        public Builder setMemberName(Input<String> memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }

        public Builder setMemberName(String memberName) {
            this.memberName = Input.of(Objects.requireNonNull(memberName));
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }
        public GroupMembershipArgs build() {
            return new GroupMembershipArgs(awsAccountId, groupName, memberName, namespace);
        }
    }
}
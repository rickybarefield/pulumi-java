// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GroupPolicyAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentArgs Empty = new GroupPolicyAttachmentArgs();

    /**
     * The group the policy should be applied to
     * 
     */
    @InputImport(name="group", required=true)
    private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @InputImport(name="policyArn", required=true)
    private final Input<String> policyArn;

    public Input<String> getPolicyArn() {
        return this.policyArn;
    }

    public GroupPolicyAttachmentArgs(
        Input<String> group,
        Input<String> policyArn) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.policyArn = Objects.requireNonNull(policyArn, "expected parameter 'policyArn' to be non-null");
    }

    private GroupPolicyAttachmentArgs() {
        this.group = Input.empty();
        this.policyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> group;
        private Input<String> policyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPolicyAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.policyArn = defaults.policyArn;
        }

        public Builder setGroup(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setPolicyArn(Input<String> policyArn) {
            this.policyArn = Objects.requireNonNull(policyArn);
            return this;
        }

        public Builder setPolicyArn(String policyArn) {
            this.policyArn = Input.of(Objects.requireNonNull(policyArn));
            return this;
        }
        public GroupPolicyAttachmentArgs build() {
            return new GroupPolicyAttachmentArgs(group, policyArn);
        }
    }
}
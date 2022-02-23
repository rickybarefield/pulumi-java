// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketReplicationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigArgs Empty = new BucketReplicationConfigArgs();

    /**
     * The name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The ARN of the IAM role for Amazon S3 to assume when replicating the objects.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    /**
     * Set of configuration blocks describing the rules managing the replication documented below.
     * 
     */
    @InputImport(name="rules", required=true)
    private final Input<List<BucketReplicationConfigRuleArgs>> rules;

    public Input<List<BucketReplicationConfigRuleArgs>> getRules() {
        return this.rules;
    }

    public BucketReplicationConfigArgs(
        Input<String> bucket,
        Input<String> role,
        Input<List<BucketReplicationConfigRuleArgs>> rules) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private BucketReplicationConfigArgs() {
        this.bucket = Input.empty();
        this.role = Input.empty();
        this.rules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> role;
        private Input<List<BucketReplicationConfigRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.role = defaults.role;
    	      this.rules = defaults.rules;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setRules(Input<List<BucketReplicationConfigRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<BucketReplicationConfigRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }
        public BucketReplicationConfigArgs build() {
            return new BucketReplicationConfigArgs(bucket, role, rules);
        }
    }
}
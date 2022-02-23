// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointPolicyDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPolicyDetailsArgs Empty = new MultiRegionAccessPointPolicyDetailsArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
     * 
     */
    @InputImport(name="policy", required=true)
    private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    public MultiRegionAccessPointPolicyDetailsArgs(
        Input<String> name,
        Input<String> policy) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private MultiRegionAccessPointPolicyDetailsArgs() {
        this.name = Input.empty();
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPolicyDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPolicyDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setPolicy(String policy) {
            this.policy = Input.of(Objects.requireNonNull(policy));
            return this;
        }
        public MultiRegionAccessPointPolicyDetailsArgs build() {
            return new MultiRegionAccessPointPolicyDetailsArgs(name, policy);
        }
    }
}
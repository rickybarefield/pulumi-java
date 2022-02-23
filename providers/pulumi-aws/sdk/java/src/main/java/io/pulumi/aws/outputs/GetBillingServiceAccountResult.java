// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBillingServiceAccountResult {
    /**
     * The ARN of the AWS billing service account.
     * 
     */
    private final String arn;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor({"arn","id"})
    private GetBillingServiceAccountResult(
        String arn,
        String id) {
        this.arn = Objects.requireNonNull(arn);
        this.id = Objects.requireNonNull(id);
    }

    /**
     * The ARN of the AWS billing service account.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBillingServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetBillingServiceAccountResult build() {
            return new GetBillingServiceAccountResult(arn, id);
        }
    }
}
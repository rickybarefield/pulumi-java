// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardsSubscriptionState extends io.pulumi.resources.ResourceArgs {

    public static final StandardsSubscriptionState Empty = new StandardsSubscriptionState();

    /**
     * The ARN of a standard - see below.
     * 
     */
    @InputImport(name="standardsArn")
    private final @Nullable Input<String> standardsArn;

    public Input<String> getStandardsArn() {
        return this.standardsArn == null ? Input.empty() : this.standardsArn;
    }

    public StandardsSubscriptionState(@Nullable Input<String> standardsArn) {
        this.standardsArn = standardsArn;
    }

    private StandardsSubscriptionState() {
        this.standardsArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardsSubscriptionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> standardsArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardsSubscriptionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.standardsArn = defaults.standardsArn;
        }

        public Builder setStandardsArn(@Nullable Input<String> standardsArn) {
            this.standardsArn = standardsArn;
            return this;
        }

        public Builder setStandardsArn(@Nullable String standardsArn) {
            this.standardsArn = Input.ofNullable(standardsArn);
            return this;
        }
        public StandardsSubscriptionState build() {
            return new StandardsSubscriptionState(standardsArn);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs Empty = new RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs();

    public RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs();
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod build() {
            return new RuleGroupRuleStatementOrStatementStatementXssMatchStatementFieldToMatchMethod();
        }
    }
}
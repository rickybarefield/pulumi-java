// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs();

    public WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementByteMatchStatementFieldToMatchMethodGetArgs();
        }
    }
}
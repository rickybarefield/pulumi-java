// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod();
        }
    }
}
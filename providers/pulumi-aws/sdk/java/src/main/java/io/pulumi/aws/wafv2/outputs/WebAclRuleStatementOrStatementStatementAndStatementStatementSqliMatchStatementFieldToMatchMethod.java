// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod {
    @OutputCustomType.Constructor({})
    private WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethod();
        }
    }
}
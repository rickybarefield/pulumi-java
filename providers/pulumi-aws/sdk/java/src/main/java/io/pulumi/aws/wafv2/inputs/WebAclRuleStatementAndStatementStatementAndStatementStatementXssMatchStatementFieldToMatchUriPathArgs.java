// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs();

    public WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathArgs();
        }
    }
}
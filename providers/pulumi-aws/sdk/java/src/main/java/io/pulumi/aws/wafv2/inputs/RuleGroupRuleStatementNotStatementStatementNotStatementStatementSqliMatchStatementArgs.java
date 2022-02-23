// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
    private final Input<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs(
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable Input<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setFieldToMatch(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder setTextTransformations(Input<List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder setTextTransformations(List<RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementNotStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
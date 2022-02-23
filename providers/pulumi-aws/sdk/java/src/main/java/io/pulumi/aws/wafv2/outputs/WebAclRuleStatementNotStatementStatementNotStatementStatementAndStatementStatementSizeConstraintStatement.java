// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement {
    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private final String comparisonOperator;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private final Integer size;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"comparisonOperator","fieldToMatch","size","textTransformations"})
    private WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement(
        String comparisonOperator,
        @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch,
        Integer size,
        List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
        this.fieldToMatch = fieldToMatch;
        this.size = Objects.requireNonNull(size);
        this.textTransformations = Objects.requireNonNull(textTransformations);
    }

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setSize(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementAndStatementStatementSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
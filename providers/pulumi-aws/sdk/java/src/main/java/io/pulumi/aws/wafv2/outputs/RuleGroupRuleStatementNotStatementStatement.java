// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementAndStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementGeoMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementLabelMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementNotStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementOrStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementSqliMatchStatement;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatement;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementNotStatementStatement {
    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementAndStatement andStatement;
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatement byteMatchStatement;
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementNotStatement notStatement;
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementOrStatement orStatement;
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatement xssMatchStatement;

    @OutputCustomType.Constructor({"andStatement","byteMatchStatement","geoMatchStatement","ipSetReferenceStatement","labelMatchStatement","notStatement","orStatement","regexPatternSetReferenceStatement","sizeConstraintStatement","sqliMatchStatement","xssMatchStatement"})
    private RuleGroupRuleStatementNotStatementStatement(
        @Nullable RuleGroupRuleStatementNotStatementStatementAndStatement andStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatement byteMatchStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatement geoMatchStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementLabelMatchStatement labelMatchStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementNotStatement notStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementOrStatement orStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementSqliMatchStatement sqliMatchStatement,
        @Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementAndStatement> getAndStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement> getIpSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }
    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementNotStatement> getNotStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementOrStatement> getOrStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementNotStatementStatementXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementNotStatementStatementAndStatement andStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementNotStatement notStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementOrStatement orStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementIpSetReferenceStatement ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable RuleGroupRuleStatementNotStatementStatementNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable RuleGroupRuleStatementNotStatementStatementRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable RuleGroupRuleStatementNotStatementStatementSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatement build() {
            return new RuleGroupRuleStatementNotStatementStatement(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupBodyParsingFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.RuleGroupJsonMatchScope;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupJsonMatchPattern;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupJsonBody {
    private final @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior;
    private final RuleGroupJsonMatchPattern matchPattern;
    private final RuleGroupJsonMatchScope matchScope;

    @OutputCustomType.Constructor({"invalidFallbackBehavior","matchPattern","matchScope"})
    private RuleGroupJsonBody(
        @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior,
        RuleGroupJsonMatchPattern matchPattern,
        RuleGroupJsonMatchScope matchScope) {
        this.invalidFallbackBehavior = invalidFallbackBehavior;
        this.matchPattern = Objects.requireNonNull(matchPattern);
        this.matchScope = Objects.requireNonNull(matchScope);
    }

    public Optional<RuleGroupBodyParsingFallbackBehavior> getInvalidFallbackBehavior() {
        return Optional.ofNullable(this.invalidFallbackBehavior);
    }
    public RuleGroupJsonMatchPattern getMatchPattern() {
        return this.matchPattern;
    }
    public RuleGroupJsonMatchScope getMatchScope() {
        return this.matchScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupJsonBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior;
        private RuleGroupJsonMatchPattern matchPattern;
        private RuleGroupJsonMatchScope matchScope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupJsonBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invalidFallbackBehavior = defaults.invalidFallbackBehavior;
    	      this.matchPattern = defaults.matchPattern;
    	      this.matchScope = defaults.matchScope;
        }

        public Builder setInvalidFallbackBehavior(@Nullable RuleGroupBodyParsingFallbackBehavior invalidFallbackBehavior) {
            this.invalidFallbackBehavior = invalidFallbackBehavior;
            return this;
        }

        public Builder setMatchPattern(RuleGroupJsonMatchPattern matchPattern) {
            this.matchPattern = Objects.requireNonNull(matchPattern);
            return this;
        }

        public Builder setMatchScope(RuleGroupJsonMatchScope matchScope) {
            this.matchScope = Objects.requireNonNull(matchScope);
            return this;
        }

        public RuleGroupJsonBody build() {
            return new RuleGroupJsonBody(invalidFallbackBehavior, matchPattern, matchScope);
        }
    }
}
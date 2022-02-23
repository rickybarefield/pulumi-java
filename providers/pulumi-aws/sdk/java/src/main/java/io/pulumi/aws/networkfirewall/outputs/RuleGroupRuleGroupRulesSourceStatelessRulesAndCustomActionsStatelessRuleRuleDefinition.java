// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition {
    /**
     * Set of actions to take on a packet that matches one of the stateless rule definition's `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
     * 
     */
    private final List<String> actions;
    /**
     * A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * 
     */
    private final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes matchAttributes;

    @OutputCustomType.Constructor({"actions","matchAttributes"})
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition(
        List<String> actions,
        RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes matchAttributes) {
        this.actions = Objects.requireNonNull(actions);
        this.matchAttributes = Objects.requireNonNull(matchAttributes);
    }

    /**
     * Set of actions to take on a packet that matches one of the stateless rule definition's `match_attributes`. For every rule you must specify 1 standard action, and you can add custom actions. Standard actions include: `aws:pass`, `aws:drop`, `aws:forward_to_sfe`.
     * 
     */
    public List<String> getActions() {
        return this.actions;
    }
    /**
     * A configuration block containing criteria for AWS Network Firewall to use to inspect an individual packet in stateless rule inspection. See Match Attributes below for details.
     * 
     */
    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes getMatchAttributes() {
        return this.matchAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> actions;
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes matchAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.matchAttributes = defaults.matchAttributes;
        }

        public Builder setActions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setMatchAttributes(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributes matchAttributes) {
            this.matchAttributes = Objects.requireNonNull(matchAttributes);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinition(actions, matchAttributes);
        }
    }
}
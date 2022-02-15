// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2;

import io.pulumi.awsnative.wafv2.enums.RuleGroupScope;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomResponseBodiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupRuleArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupTagArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    @InputImport(name="capacity", required=true)
    private final Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity;
    }

    @InputImport(name="customResponseBodies")
    private final @Nullable Input<RuleGroupCustomResponseBodiesArgs> customResponseBodies;

    public Input<RuleGroupCustomResponseBodiesArgs> getCustomResponseBodies() {
        return this.customResponseBodies == null ? Input.empty() : this.customResponseBodies;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="rules")
    private final @Nullable Input<List<RuleGroupRuleArgs>> rules;

    public Input<List<RuleGroupRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    @InputImport(name="scope", required=true)
    private final Input<RuleGroupScope> scope;

    public Input<RuleGroupScope> getScope() {
        return this.scope;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<RuleGroupTagArgs>> tags;

    public Input<List<RuleGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="visibilityConfig", required=true)
    private final Input<RuleGroupVisibilityConfigArgs> visibilityConfig;

    public Input<RuleGroupVisibilityConfigArgs> getVisibilityConfig() {
        return this.visibilityConfig;
    }

    public RuleGroupArgs(
        Input<Integer> capacity,
        @Nullable Input<RuleGroupCustomResponseBodiesArgs> customResponseBodies,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<RuleGroupRuleArgs>> rules,
        Input<RuleGroupScope> scope,
        @Nullable Input<List<RuleGroupTagArgs>> tags,
        Input<RuleGroupVisibilityConfigArgs> visibilityConfig) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.customResponseBodies = customResponseBodies;
        this.description = description;
        this.name = name;
        this.rules = rules;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
        this.visibilityConfig = Objects.requireNonNull(visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
    }

    private RuleGroupArgs() {
        this.capacity = Input.empty();
        this.customResponseBodies = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.rules = Input.empty();
        this.scope = Input.empty();
        this.tags = Input.empty();
        this.visibilityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> capacity;
        private @Nullable Input<RuleGroupCustomResponseBodiesArgs> customResponseBodies;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<RuleGroupRuleArgs>> rules;
        private Input<RuleGroupScope> scope;
        private @Nullable Input<List<RuleGroupTagArgs>> tags;
        private Input<RuleGroupVisibilityConfigArgs> visibilityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.customResponseBodies = defaults.customResponseBodies;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.visibilityConfig = defaults.visibilityConfig;
        }

        public Builder setCapacity(Input<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Input.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder setCustomResponseBodies(@Nullable Input<RuleGroupCustomResponseBodiesArgs> customResponseBodies) {
            this.customResponseBodies = customResponseBodies;
            return this;
        }

        public Builder setCustomResponseBodies(@Nullable RuleGroupCustomResponseBodiesArgs customResponseBodies) {
            this.customResponseBodies = Input.ofNullable(customResponseBodies);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRules(@Nullable Input<List<RuleGroupRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<RuleGroupRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setScope(Input<RuleGroupScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(RuleGroupScope scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder setTags(@Nullable Input<List<RuleGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<RuleGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVisibilityConfig(Input<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            this.visibilityConfig = Objects.requireNonNull(visibilityConfig);
            return this;
        }

        public Builder setVisibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            this.visibilityConfig = Input.of(Objects.requireNonNull(visibilityConfig));
            return this;
        }

        public RuleGroupArgs build() {
            return new RuleGroupArgs(capacity, customResponseBodies, description, name, rules, scope, tags, visibilityConfig);
        }
    }
}
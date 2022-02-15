// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleMatch;
import io.pulumi.gcp.compute.outputs.SecurityPolicyRuleRateLimitOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyRule {
    private final String action;
    private final @Nullable String description;
    private final SecurityPolicyRuleMatch match;
    private final @Nullable Boolean preview;
    private final Integer priority;
    private final @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions;

    @OutputCustomType.Constructor({"action","description","match","preview","priority","rateLimitOptions"})
    private SecurityPolicyRule(
        String action,
        @Nullable String description,
        SecurityPolicyRuleMatch match,
        @Nullable Boolean preview,
        Integer priority,
        @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
        this.action = Objects.requireNonNull(action);
        this.description = description;
        this.match = Objects.requireNonNull(match);
        this.preview = preview;
        this.priority = Objects.requireNonNull(priority);
        this.rateLimitOptions = rateLimitOptions;
    }

    public String getAction() {
        return this.action;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public SecurityPolicyRuleMatch getMatch() {
        return this.match;
    }
    public Optional<Boolean> getPreview() {
        return Optional.ofNullable(this.preview);
    }
    public Integer getPriority() {
        return this.priority;
    }
    public Optional<SecurityPolicyRuleRateLimitOptions> getRateLimitOptions() {
        return Optional.ofNullable(this.rateLimitOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String description;
        private SecurityPolicyRuleMatch match;
        private @Nullable Boolean preview;
        private Integer priority;
        private @Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.description = defaults.description;
    	      this.match = defaults.match;
    	      this.preview = defaults.preview;
    	      this.priority = defaults.priority;
    	      this.rateLimitOptions = defaults.rateLimitOptions;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setMatch(SecurityPolicyRuleMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setPreview(@Nullable Boolean preview) {
            this.preview = preview;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRateLimitOptions(@Nullable SecurityPolicyRuleRateLimitOptions rateLimitOptions) {
            this.rateLimitOptions = rateLimitOptions;
            return this;
        }

        public SecurityPolicyRule build() {
            return new SecurityPolicyRule(action, description, match, preview, priority, rateLimitOptions);
        }
    }
}
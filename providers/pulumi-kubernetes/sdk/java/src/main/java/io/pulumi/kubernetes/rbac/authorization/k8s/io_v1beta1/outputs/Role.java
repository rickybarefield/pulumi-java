// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs.PolicyRule;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Role {
    private final @Nullable String apiVersion;
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable List<PolicyRule> rules;

    @OutputCustomType.Constructor({"apiVersion","kind","metadata","rules"})
    private Role(
        @Nullable String apiVersion,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable List<PolicyRule> rules) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
    }

    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public List<PolicyRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Role defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<PolicyRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(Role defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setRules(@Nullable List<PolicyRule> rules) {
            this.rules = rules;
            return this;
        }

        public Role build() {
            return new Role(apiVersion, kind, metadata, rules);
        }
    }
}
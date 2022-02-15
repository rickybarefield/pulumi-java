// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.CachePolicyParametersInCacheKeyAndForwardedToOrigin;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CachePolicyConfig {
    private final @Nullable String comment;
    private final Double defaultTTL;
    private final Double maxTTL;
    private final Double minTTL;
    private final String name;
    private final CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin;

    @OutputCustomType.Constructor({"comment","defaultTTL","maxTTL","minTTL","name","parametersInCacheKeyAndForwardedToOrigin"})
    private CachePolicyConfig(
        @Nullable String comment,
        Double defaultTTL,
        Double maxTTL,
        Double minTTL,
        String name,
        CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
        this.comment = comment;
        this.defaultTTL = Objects.requireNonNull(defaultTTL);
        this.maxTTL = Objects.requireNonNull(maxTTL);
        this.minTTL = Objects.requireNonNull(minTTL);
        this.name = Objects.requireNonNull(name);
        this.parametersInCacheKeyAndForwardedToOrigin = Objects.requireNonNull(parametersInCacheKeyAndForwardedToOrigin);
    }

    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    public Double getDefaultTTL() {
        return this.defaultTTL;
    }
    public Double getMaxTTL() {
        return this.maxTTL;
    }
    public Double getMinTTL() {
        return this.minTTL;
    }
    public String getName() {
        return this.name;
    }
    public CachePolicyParametersInCacheKeyAndForwardedToOrigin getParametersInCacheKeyAndForwardedToOrigin() {
        return this.parametersInCacheKeyAndForwardedToOrigin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private Double defaultTTL;
        private Double maxTTL;
        private Double minTTL;
        private String name;
        private CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.defaultTTL = defaults.defaultTTL;
    	      this.maxTTL = defaults.maxTTL;
    	      this.minTTL = defaults.minTTL;
    	      this.name = defaults.name;
    	      this.parametersInCacheKeyAndForwardedToOrigin = defaults.parametersInCacheKeyAndForwardedToOrigin;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setDefaultTTL(Double defaultTTL) {
            this.defaultTTL = Objects.requireNonNull(defaultTTL);
            return this;
        }

        public Builder setMaxTTL(Double maxTTL) {
            this.maxTTL = Objects.requireNonNull(maxTTL);
            return this;
        }

        public Builder setMinTTL(Double minTTL) {
            this.minTTL = Objects.requireNonNull(minTTL);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParametersInCacheKeyAndForwardedToOrigin(CachePolicyParametersInCacheKeyAndForwardedToOrigin parametersInCacheKeyAndForwardedToOrigin) {
            this.parametersInCacheKeyAndForwardedToOrigin = Objects.requireNonNull(parametersInCacheKeyAndForwardedToOrigin);
            return this;
        }

        public CachePolicyConfig build() {
            return new CachePolicyConfig(comment, defaultTTL, maxTTL, minTTL, name, parametersInCacheKeyAndForwardedToOrigin);
        }
    }
}
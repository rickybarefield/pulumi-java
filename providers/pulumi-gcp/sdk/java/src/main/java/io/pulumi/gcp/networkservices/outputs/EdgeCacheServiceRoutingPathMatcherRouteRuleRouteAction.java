// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy;
import io.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction {
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy cdnPolicy;
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;

    @OutputCustomType.Constructor({"cdnPolicy","corsPolicy","urlRewrite"})
    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction(
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy cdnPolicy,
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy,
        @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite) {
        this.cdnPolicy = cdnPolicy;
        this.corsPolicy = corsPolicy;
        this.urlRewrite = urlRewrite;
    }

    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy> getCdnPolicy() {
        return Optional.ofNullable(this.cdnPolicy);
    }
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy> getCorsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite> getUrlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy cdnPolicy;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.urlRewrite = defaults.urlRewrite;
        }

        public Builder setCdnPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicy cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder setCorsPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setUrlRewrite(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction(cdnPolicy, corsPolicy, urlRewrite);
        }
    }
}
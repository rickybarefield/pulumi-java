// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.AccessLevelCustomExpr;
import java.util.Objects;

@OutputCustomType
public final class AccessLevelCustom {
    private final AccessLevelCustomExpr expr;

    @OutputCustomType.Constructor({"expr"})
    private AccessLevelCustom(AccessLevelCustomExpr expr) {
        this.expr = Objects.requireNonNull(expr);
    }

    public AccessLevelCustomExpr getExpr() {
        return this.expr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelCustom defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelCustomExpr expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelCustom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder setExpr(AccessLevelCustomExpr expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public AccessLevelCustom build() {
            return new AccessLevelCustom(expr);
        }
    }
}
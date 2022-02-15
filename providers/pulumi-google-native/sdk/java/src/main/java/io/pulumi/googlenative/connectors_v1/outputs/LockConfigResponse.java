// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LockConfigResponse {
    private final Boolean locked;
    private final String reason;

    @OutputCustomType.Constructor({"locked","reason"})
    private LockConfigResponse(
        Boolean locked,
        String reason) {
        this.locked = Objects.requireNonNull(locked);
        this.reason = Objects.requireNonNull(reason);
    }

    public Boolean getLocked() {
        return this.locked;
    }
    public String getReason() {
        return this.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LockConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean locked;
        private String reason;

        public Builder() {
    	      // Empty
        }

        public Builder(LockConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.reason = defaults.reason;
        }

        public Builder setLocked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }

        public LockConfigResponse build() {
            return new LockConfigResponse(locked, reason);
        }
    }
}
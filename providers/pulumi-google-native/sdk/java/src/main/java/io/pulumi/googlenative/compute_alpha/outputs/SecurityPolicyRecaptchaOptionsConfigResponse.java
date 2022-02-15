// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRecaptchaOptionsConfigResponse {
    private final String redirectSiteKey;

    @OutputCustomType.Constructor({"redirectSiteKey"})
    private SecurityPolicyRecaptchaOptionsConfigResponse(String redirectSiteKey) {
        this.redirectSiteKey = Objects.requireNonNull(redirectSiteKey);
    }

    public String getRedirectSiteKey() {
        return this.redirectSiteKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectSiteKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectSiteKey = defaults.redirectSiteKey;
        }

        public Builder setRedirectSiteKey(String redirectSiteKey) {
            this.redirectSiteKey = Objects.requireNonNull(redirectSiteKey);
            return this;
        }

        public SecurityPolicyRecaptchaOptionsConfigResponse build() {
            return new SecurityPolicyRecaptchaOptionsConfigResponse(redirectSiteKey);
        }
    }
}
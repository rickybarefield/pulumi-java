// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.OriginRequestPolicyCookiesConfigCookiesGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginRequestPolicyCookiesConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginRequestPolicyCookiesConfigGetArgs Empty = new OriginRequestPolicyCookiesConfigGetArgs();

    @InputImport(name="cookieBehavior", required=true)
    private final Input<String> cookieBehavior;

    public Input<String> getCookieBehavior() {
        return this.cookieBehavior;
    }

    @InputImport(name="cookies")
    private final @Nullable Input<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies;

    public Input<OriginRequestPolicyCookiesConfigCookiesGetArgs> getCookies() {
        return this.cookies == null ? Input.empty() : this.cookies;
    }

    public OriginRequestPolicyCookiesConfigGetArgs(
        Input<String> cookieBehavior,
        @Nullable Input<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies) {
        this.cookieBehavior = Objects.requireNonNull(cookieBehavior, "expected parameter 'cookieBehavior' to be non-null");
        this.cookies = cookies;
    }

    private OriginRequestPolicyCookiesConfigGetArgs() {
        this.cookieBehavior = Input.empty();
        this.cookies = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyCookiesConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cookieBehavior;
        private @Nullable Input<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyCookiesConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieBehavior = defaults.cookieBehavior;
    	      this.cookies = defaults.cookies;
        }

        public Builder setCookieBehavior(Input<String> cookieBehavior) {
            this.cookieBehavior = Objects.requireNonNull(cookieBehavior);
            return this;
        }

        public Builder setCookieBehavior(String cookieBehavior) {
            this.cookieBehavior = Input.of(Objects.requireNonNull(cookieBehavior));
            return this;
        }

        public Builder setCookies(@Nullable Input<OriginRequestPolicyCookiesConfigCookiesGetArgs> cookies) {
            this.cookies = cookies;
            return this;
        }

        public Builder setCookies(@Nullable OriginRequestPolicyCookiesConfigCookiesGetArgs cookies) {
            this.cookies = Input.ofNullable(cookies);
            return this;
        }
        public OriginRequestPolicyCookiesConfigGetArgs build() {
            return new OriginRequestPolicyCookiesConfigGetArgs(cookieBehavior, cookies);
        }
    }
}
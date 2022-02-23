// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountThrottleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountThrottleSettingsArgs Empty = new AccountThrottleSettingsArgs();

    /**
     * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    @InputImport(name="burstLimit")
    private final @Nullable Input<Integer> burstLimit;

    public Input<Integer> getBurstLimit() {
        return this.burstLimit == null ? Input.empty() : this.burstLimit;
    }

    /**
     * The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    @InputImport(name="rateLimit")
    private final @Nullable Input<Double> rateLimit;

    public Input<Double> getRateLimit() {
        return this.rateLimit == null ? Input.empty() : this.rateLimit;
    }

    public AccountThrottleSettingsArgs(
        @Nullable Input<Integer> burstLimit,
        @Nullable Input<Double> rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    private AccountThrottleSettingsArgs() {
        this.burstLimit = Input.empty();
        this.rateLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountThrottleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> burstLimit;
        private @Nullable Input<Double> rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountThrottleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder setBurstLimit(@Nullable Input<Integer> burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }

        public Builder setBurstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = Input.ofNullable(burstLimit);
            return this;
        }

        public Builder setRateLimit(@Nullable Input<Double> rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        public Builder setRateLimit(@Nullable Double rateLimit) {
            this.rateLimit = Input.ofNullable(rateLimit);
            return this;
        }
        public AccountThrottleSettingsArgs build() {
            return new AccountThrottleSettingsArgs(burstLimit, rateLimit);
        }
    }
}
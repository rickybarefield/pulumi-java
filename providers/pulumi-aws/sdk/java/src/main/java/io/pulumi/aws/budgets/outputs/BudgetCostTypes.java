// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetCostTypes {
    /**
     * A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeCredit;
    /**
     * Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeDiscount;
    /**
     * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeOtherSubscription;
    /**
     * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeRecurring;
    /**
     * A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeRefund;
    /**
     * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeSubscription;
    /**
     * A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeSupport;
    /**
     * A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeTax;
    /**
     * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    private final @Nullable Boolean includeUpfront;
    /**
     * Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    private final @Nullable Boolean useAmortized;
    /**
     * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    private final @Nullable Boolean useBlended;

    @OutputCustomType.Constructor({"includeCredit","includeDiscount","includeOtherSubscription","includeRecurring","includeRefund","includeSubscription","includeSupport","includeTax","includeUpfront","useAmortized","useBlended"})
    private BudgetCostTypes(
        @Nullable Boolean includeCredit,
        @Nullable Boolean includeDiscount,
        @Nullable Boolean includeOtherSubscription,
        @Nullable Boolean includeRecurring,
        @Nullable Boolean includeRefund,
        @Nullable Boolean includeSubscription,
        @Nullable Boolean includeSupport,
        @Nullable Boolean includeTax,
        @Nullable Boolean includeUpfront,
        @Nullable Boolean useAmortized,
        @Nullable Boolean useBlended) {
        this.includeCredit = includeCredit;
        this.includeDiscount = includeDiscount;
        this.includeOtherSubscription = includeOtherSubscription;
        this.includeRecurring = includeRecurring;
        this.includeRefund = includeRefund;
        this.includeSubscription = includeSubscription;
        this.includeSupport = includeSupport;
        this.includeTax = includeTax;
        this.includeUpfront = includeUpfront;
        this.useAmortized = useAmortized;
        this.useBlended = useBlended;
    }

    /**
     * A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeCredit() {
        return Optional.ofNullable(this.includeCredit);
    }
    /**
     * Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeDiscount() {
        return Optional.ofNullable(this.includeDiscount);
    }
    /**
     * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeOtherSubscription() {
        return Optional.ofNullable(this.includeOtherSubscription);
    }
    /**
     * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeRecurring() {
        return Optional.ofNullable(this.includeRecurring);
    }
    /**
     * A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeRefund() {
        return Optional.ofNullable(this.includeRefund);
    }
    /**
     * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeSubscription() {
        return Optional.ofNullable(this.includeSubscription);
    }
    /**
     * A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeSupport() {
        return Optional.ofNullable(this.includeSupport);
    }
    /**
     * A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeTax() {
        return Optional.ofNullable(this.includeTax);
    }
    /**
     * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    public Optional<Boolean> getIncludeUpfront() {
        return Optional.ofNullable(this.includeUpfront);
    }
    /**
     * Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    public Optional<Boolean> getUseAmortized() {
        return Optional.ofNullable(this.useAmortized);
    }
    /**
     * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    public Optional<Boolean> getUseBlended() {
        return Optional.ofNullable(this.useBlended);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetCostTypes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean includeCredit;
        private @Nullable Boolean includeDiscount;
        private @Nullable Boolean includeOtherSubscription;
        private @Nullable Boolean includeRecurring;
        private @Nullable Boolean includeRefund;
        private @Nullable Boolean includeSubscription;
        private @Nullable Boolean includeSupport;
        private @Nullable Boolean includeTax;
        private @Nullable Boolean includeUpfront;
        private @Nullable Boolean useAmortized;
        private @Nullable Boolean useBlended;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetCostTypes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeCredit = defaults.includeCredit;
    	      this.includeDiscount = defaults.includeDiscount;
    	      this.includeOtherSubscription = defaults.includeOtherSubscription;
    	      this.includeRecurring = defaults.includeRecurring;
    	      this.includeRefund = defaults.includeRefund;
    	      this.includeSubscription = defaults.includeSubscription;
    	      this.includeSupport = defaults.includeSupport;
    	      this.includeTax = defaults.includeTax;
    	      this.includeUpfront = defaults.includeUpfront;
    	      this.useAmortized = defaults.useAmortized;
    	      this.useBlended = defaults.useBlended;
        }

        public Builder setIncludeCredit(@Nullable Boolean includeCredit) {
            this.includeCredit = includeCredit;
            return this;
        }

        public Builder setIncludeDiscount(@Nullable Boolean includeDiscount) {
            this.includeDiscount = includeDiscount;
            return this;
        }

        public Builder setIncludeOtherSubscription(@Nullable Boolean includeOtherSubscription) {
            this.includeOtherSubscription = includeOtherSubscription;
            return this;
        }

        public Builder setIncludeRecurring(@Nullable Boolean includeRecurring) {
            this.includeRecurring = includeRecurring;
            return this;
        }

        public Builder setIncludeRefund(@Nullable Boolean includeRefund) {
            this.includeRefund = includeRefund;
            return this;
        }

        public Builder setIncludeSubscription(@Nullable Boolean includeSubscription) {
            this.includeSubscription = includeSubscription;
            return this;
        }

        public Builder setIncludeSupport(@Nullable Boolean includeSupport) {
            this.includeSupport = includeSupport;
            return this;
        }

        public Builder setIncludeTax(@Nullable Boolean includeTax) {
            this.includeTax = includeTax;
            return this;
        }

        public Builder setIncludeUpfront(@Nullable Boolean includeUpfront) {
            this.includeUpfront = includeUpfront;
            return this;
        }

        public Builder setUseAmortized(@Nullable Boolean useAmortized) {
            this.useAmortized = useAmortized;
            return this;
        }

        public Builder setUseBlended(@Nullable Boolean useBlended) {
            this.useBlended = useBlended;
            return this;
        }
        public BudgetCostTypes build() {
            return new BudgetCostTypes(includeCredit, includeDiscount, includeOtherSubscription, includeRecurring, includeRefund, includeSubscription, includeSupport, includeTax, includeUpfront, useAmortized, useBlended);
        }
    }
}
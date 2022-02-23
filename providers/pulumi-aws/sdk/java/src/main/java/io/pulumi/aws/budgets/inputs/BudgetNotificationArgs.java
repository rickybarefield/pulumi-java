// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetNotificationArgs Empty = new BudgetNotificationArgs();

    /**
     * (Required) Comparison operator to use to evaluate the condition. Can be `LESS_THAN`, `EQUAL_TO` or `GREATER_THAN`.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
    private final Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * (Required) What kind of budget value to notify on. Can be `ACTUAL` or `FORECASTED`
     * 
     */
    @InputImport(name="notificationType", required=true)
    private final Input<String> notificationType;

    public Input<String> getNotificationType() {
        return this.notificationType;
    }

    /**
     * (Optional) E-Mail addresses to notify. Either this or `subscriber_sns_topic_arns` is required.
     * 
     */
    @InputImport(name="subscriberEmailAddresses")
    private final @Nullable Input<List<String>> subscriberEmailAddresses;

    public Input<List<String>> getSubscriberEmailAddresses() {
        return this.subscriberEmailAddresses == null ? Input.empty() : this.subscriberEmailAddresses;
    }

    /**
     * (Optional) SNS topics to notify. Either this or `subscriber_email_addresses` is required.
     * 
     */
    @InputImport(name="subscriberSnsTopicArns")
    private final @Nullable Input<List<String>> subscriberSnsTopicArns;

    public Input<List<String>> getSubscriberSnsTopicArns() {
        return this.subscriberSnsTopicArns == null ? Input.empty() : this.subscriberSnsTopicArns;
    }

    /**
     * (Required) Threshold when the notification should be sent.
     * 
     */
    @InputImport(name="threshold", required=true)
    private final Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * (Required) What kind of threshold is defined. Can be `PERCENTAGE` OR `ABSOLUTE_VALUE`.
     * 
     */
    @InputImport(name="thresholdType", required=true)
    private final Input<String> thresholdType;

    public Input<String> getThresholdType() {
        return this.thresholdType;
    }

    public BudgetNotificationArgs(
        Input<String> comparisonOperator,
        Input<String> notificationType,
        @Nullable Input<List<String>> subscriberEmailAddresses,
        @Nullable Input<List<String>> subscriberSnsTopicArns,
        Input<Double> threshold,
        Input<String> thresholdType) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.notificationType = Objects.requireNonNull(notificationType, "expected parameter 'notificationType' to be non-null");
        this.subscriberEmailAddresses = subscriberEmailAddresses;
        this.subscriberSnsTopicArns = subscriberSnsTopicArns;
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.thresholdType = Objects.requireNonNull(thresholdType, "expected parameter 'thresholdType' to be non-null");
    }

    private BudgetNotificationArgs() {
        this.comparisonOperator = Input.empty();
        this.notificationType = Input.empty();
        this.subscriberEmailAddresses = Input.empty();
        this.subscriberSnsTopicArns = Input.empty();
        this.threshold = Input.empty();
        this.thresholdType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparisonOperator;
        private Input<String> notificationType;
        private @Nullable Input<List<String>> subscriberEmailAddresses;
        private @Nullable Input<List<String>> subscriberSnsTopicArns;
        private Input<Double> threshold;
        private Input<String> thresholdType;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.notificationType = defaults.notificationType;
    	      this.subscriberEmailAddresses = defaults.subscriberEmailAddresses;
    	      this.subscriberSnsTopicArns = defaults.subscriberSnsTopicArns;
    	      this.threshold = defaults.threshold;
    	      this.thresholdType = defaults.thresholdType;
        }

        public Builder setComparisonOperator(Input<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder setNotificationType(Input<String> notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }

        public Builder setNotificationType(String notificationType) {
            this.notificationType = Input.of(Objects.requireNonNull(notificationType));
            return this;
        }

        public Builder setSubscriberEmailAddresses(@Nullable Input<List<String>> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = subscriberEmailAddresses;
            return this;
        }

        public Builder setSubscriberEmailAddresses(@Nullable List<String> subscriberEmailAddresses) {
            this.subscriberEmailAddresses = Input.ofNullable(subscriberEmailAddresses);
            return this;
        }

        public Builder setSubscriberSnsTopicArns(@Nullable Input<List<String>> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = subscriberSnsTopicArns;
            return this;
        }

        public Builder setSubscriberSnsTopicArns(@Nullable List<String> subscriberSnsTopicArns) {
            this.subscriberSnsTopicArns = Input.ofNullable(subscriberSnsTopicArns);
            return this;
        }

        public Builder setThreshold(Input<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Input.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder setThresholdType(Input<String> thresholdType) {
            this.thresholdType = Objects.requireNonNull(thresholdType);
            return this;
        }

        public Builder setThresholdType(String thresholdType) {
            this.thresholdType = Input.of(Objects.requireNonNull(thresholdType));
            return this;
        }
        public BudgetNotificationArgs build() {
            return new BudgetNotificationArgs(comparisonOperator, notificationType, subscriberEmailAddresses, subscriberSnsTopicArns, threshold, thresholdType);
        }
    }
}
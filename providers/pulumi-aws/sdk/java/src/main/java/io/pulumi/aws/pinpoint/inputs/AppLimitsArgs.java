// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppLimitsArgs Empty = new AppLimitsArgs();

    /**
     * The maximum number of messages that the campaign can send daily.
     * 
     */
    @InputImport(name="daily")
    private final @Nullable Input<Integer> daily;

    public Input<Integer> getDaily() {
        return this.daily == null ? Input.empty() : this.daily;
    }

    /**
     * The length of time (in seconds) that the campaign can run before it ends and message deliveries stop. This duration begins at the scheduled start time for the campaign. The minimum value is 60.
     * 
     */
    @InputImport(name="maximumDuration")
    private final @Nullable Input<Integer> maximumDuration;

    public Input<Integer> getMaximumDuration() {
        return this.maximumDuration == null ? Input.empty() : this.maximumDuration;
    }

    /**
     * The number of messages that the campaign can send per second. The minimum value is 50, and the maximum is 20000.
     * 
     */
    @InputImport(name="messagesPerSecond")
    private final @Nullable Input<Integer> messagesPerSecond;

    public Input<Integer> getMessagesPerSecond() {
        return this.messagesPerSecond == null ? Input.empty() : this.messagesPerSecond;
    }

    /**
     * The maximum total number of messages that the campaign can send.
     * 
     */
    @InputImport(name="total")
    private final @Nullable Input<Integer> total;

    public Input<Integer> getTotal() {
        return this.total == null ? Input.empty() : this.total;
    }

    public AppLimitsArgs(
        @Nullable Input<Integer> daily,
        @Nullable Input<Integer> maximumDuration,
        @Nullable Input<Integer> messagesPerSecond,
        @Nullable Input<Integer> total) {
        this.daily = daily;
        this.maximumDuration = maximumDuration;
        this.messagesPerSecond = messagesPerSecond;
        this.total = total;
    }

    private AppLimitsArgs() {
        this.daily = Input.empty();
        this.maximumDuration = Input.empty();
        this.messagesPerSecond = Input.empty();
        this.total = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> daily;
        private @Nullable Input<Integer> maximumDuration;
        private @Nullable Input<Integer> messagesPerSecond;
        private @Nullable Input<Integer> total;

        public Builder() {
    	      // Empty
        }

        public Builder(AppLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daily = defaults.daily;
    	      this.maximumDuration = defaults.maximumDuration;
    	      this.messagesPerSecond = defaults.messagesPerSecond;
    	      this.total = defaults.total;
        }

        public Builder setDaily(@Nullable Input<Integer> daily) {
            this.daily = daily;
            return this;
        }

        public Builder setDaily(@Nullable Integer daily) {
            this.daily = Input.ofNullable(daily);
            return this;
        }

        public Builder setMaximumDuration(@Nullable Input<Integer> maximumDuration) {
            this.maximumDuration = maximumDuration;
            return this;
        }

        public Builder setMaximumDuration(@Nullable Integer maximumDuration) {
            this.maximumDuration = Input.ofNullable(maximumDuration);
            return this;
        }

        public Builder setMessagesPerSecond(@Nullable Input<Integer> messagesPerSecond) {
            this.messagesPerSecond = messagesPerSecond;
            return this;
        }

        public Builder setMessagesPerSecond(@Nullable Integer messagesPerSecond) {
            this.messagesPerSecond = Input.ofNullable(messagesPerSecond);
            return this;
        }

        public Builder setTotal(@Nullable Input<Integer> total) {
            this.total = total;
            return this;
        }

        public Builder setTotal(@Nullable Integer total) {
            this.total = Input.ofNullable(total);
            return this;
        }
        public AppLimitsArgs build() {
            return new AppLimitsArgs(daily, maximumDuration, messagesPerSecond, total);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotMessageGroup;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotFulfillmentStartResponseSpecification {
    private final @Nullable Boolean allowInterrupt;
    private final Integer delayInSeconds;
    private final List<BotMessageGroup> messageGroups;

    @OutputCustomType.Constructor({"allowInterrupt","delayInSeconds","messageGroups"})
    private BotFulfillmentStartResponseSpecification(
        @Nullable Boolean allowInterrupt,
        Integer delayInSeconds,
        List<BotMessageGroup> messageGroups) {
        this.allowInterrupt = allowInterrupt;
        this.delayInSeconds = Objects.requireNonNull(delayInSeconds);
        this.messageGroups = Objects.requireNonNull(messageGroups);
    }

    public Optional<Boolean> getAllowInterrupt() {
        return Optional.ofNullable(this.allowInterrupt);
    }
    public Integer getDelayInSeconds() {
        return this.delayInSeconds;
    }
    public List<BotMessageGroup> getMessageGroups() {
        return this.messageGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotFulfillmentStartResponseSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInterrupt;
        private Integer delayInSeconds;
        private List<BotMessageGroup> messageGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(BotFulfillmentStartResponseSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.delayInSeconds = defaults.delayInSeconds;
    	      this.messageGroups = defaults.messageGroups;
        }

        public Builder setAllowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder setDelayInSeconds(Integer delayInSeconds) {
            this.delayInSeconds = Objects.requireNonNull(delayInSeconds);
            return this;
        }

        public Builder setMessageGroups(List<BotMessageGroup> messageGroups) {
            this.messageGroups = Objects.requireNonNull(messageGroups);
            return this;
        }

        public BotFulfillmentStartResponseSpecification build() {
            return new BotFulfillmentStartResponseSpecification(allowInterrupt, delayInSeconds, messageGroups);
        }
    }
}
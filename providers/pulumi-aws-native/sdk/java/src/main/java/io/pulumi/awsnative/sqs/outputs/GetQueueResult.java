// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sqs.outputs;

import io.pulumi.awsnative.sqs.outputs.QueueTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetQueueResult {
    private final @Nullable String arn;
    private final @Nullable Boolean contentBasedDeduplication;
    private final @Nullable String deduplicationScope;
    private final @Nullable Integer delaySeconds;
    private final @Nullable String fifoThroughputLimit;
    private final @Nullable Integer kmsDataKeyReusePeriodSeconds;
    private final @Nullable String kmsMasterKeyId;
    private final @Nullable Integer maximumMessageSize;
    private final @Nullable Integer messageRetentionPeriod;
    private final @Nullable String queueUrl;
    private final @Nullable Integer receiveMessageWaitTimeSeconds;
    private final @Nullable Object redriveAllowPolicy;
    private final @Nullable Object redrivePolicy;
    private final @Nullable List<QueueTag> tags;
    private final @Nullable Integer visibilityTimeout;

    @OutputCustomType.Constructor({"arn","contentBasedDeduplication","deduplicationScope","delaySeconds","fifoThroughputLimit","kmsDataKeyReusePeriodSeconds","kmsMasterKeyId","maximumMessageSize","messageRetentionPeriod","queueUrl","receiveMessageWaitTimeSeconds","redriveAllowPolicy","redrivePolicy","tags","visibilityTimeout"})
    private GetQueueResult(
        @Nullable String arn,
        @Nullable Boolean contentBasedDeduplication,
        @Nullable String deduplicationScope,
        @Nullable Integer delaySeconds,
        @Nullable String fifoThroughputLimit,
        @Nullable Integer kmsDataKeyReusePeriodSeconds,
        @Nullable String kmsMasterKeyId,
        @Nullable Integer maximumMessageSize,
        @Nullable Integer messageRetentionPeriod,
        @Nullable String queueUrl,
        @Nullable Integer receiveMessageWaitTimeSeconds,
        @Nullable Object redriveAllowPolicy,
        @Nullable Object redrivePolicy,
        @Nullable List<QueueTag> tags,
        @Nullable Integer visibilityTimeout) {
        this.arn = arn;
        this.contentBasedDeduplication = contentBasedDeduplication;
        this.deduplicationScope = deduplicationScope;
        this.delaySeconds = delaySeconds;
        this.fifoThroughputLimit = fifoThroughputLimit;
        this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        this.kmsMasterKeyId = kmsMasterKeyId;
        this.maximumMessageSize = maximumMessageSize;
        this.messageRetentionPeriod = messageRetentionPeriod;
        this.queueUrl = queueUrl;
        this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
        this.redriveAllowPolicy = redriveAllowPolicy;
        this.redrivePolicy = redrivePolicy;
        this.tags = tags;
        this.visibilityTimeout = visibilityTimeout;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Boolean> getContentBasedDeduplication() {
        return Optional.ofNullable(this.contentBasedDeduplication);
    }
    public Optional<String> getDeduplicationScope() {
        return Optional.ofNullable(this.deduplicationScope);
    }
    public Optional<Integer> getDelaySeconds() {
        return Optional.ofNullable(this.delaySeconds);
    }
    public Optional<String> getFifoThroughputLimit() {
        return Optional.ofNullable(this.fifoThroughputLimit);
    }
    public Optional<Integer> getKmsDataKeyReusePeriodSeconds() {
        return Optional.ofNullable(this.kmsDataKeyReusePeriodSeconds);
    }
    public Optional<String> getKmsMasterKeyId() {
        return Optional.ofNullable(this.kmsMasterKeyId);
    }
    public Optional<Integer> getMaximumMessageSize() {
        return Optional.ofNullable(this.maximumMessageSize);
    }
    public Optional<Integer> getMessageRetentionPeriod() {
        return Optional.ofNullable(this.messageRetentionPeriod);
    }
    public Optional<String> getQueueUrl() {
        return Optional.ofNullable(this.queueUrl);
    }
    public Optional<Integer> getReceiveMessageWaitTimeSeconds() {
        return Optional.ofNullable(this.receiveMessageWaitTimeSeconds);
    }
    public Optional<Object> getRedriveAllowPolicy() {
        return Optional.ofNullable(this.redriveAllowPolicy);
    }
    public Optional<Object> getRedrivePolicy() {
        return Optional.ofNullable(this.redrivePolicy);
    }
    public List<QueueTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<Integer> getVisibilityTimeout() {
        return Optional.ofNullable(this.visibilityTimeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQueueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean contentBasedDeduplication;
        private @Nullable String deduplicationScope;
        private @Nullable Integer delaySeconds;
        private @Nullable String fifoThroughputLimit;
        private @Nullable Integer kmsDataKeyReusePeriodSeconds;
        private @Nullable String kmsMasterKeyId;
        private @Nullable Integer maximumMessageSize;
        private @Nullable Integer messageRetentionPeriod;
        private @Nullable String queueUrl;
        private @Nullable Integer receiveMessageWaitTimeSeconds;
        private @Nullable Object redriveAllowPolicy;
        private @Nullable Object redrivePolicy;
        private @Nullable List<QueueTag> tags;
        private @Nullable Integer visibilityTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQueueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.contentBasedDeduplication = defaults.contentBasedDeduplication;
    	      this.deduplicationScope = defaults.deduplicationScope;
    	      this.delaySeconds = defaults.delaySeconds;
    	      this.fifoThroughputLimit = defaults.fifoThroughputLimit;
    	      this.kmsDataKeyReusePeriodSeconds = defaults.kmsDataKeyReusePeriodSeconds;
    	      this.kmsMasterKeyId = defaults.kmsMasterKeyId;
    	      this.maximumMessageSize = defaults.maximumMessageSize;
    	      this.messageRetentionPeriod = defaults.messageRetentionPeriod;
    	      this.queueUrl = defaults.queueUrl;
    	      this.receiveMessageWaitTimeSeconds = defaults.receiveMessageWaitTimeSeconds;
    	      this.redriveAllowPolicy = defaults.redriveAllowPolicy;
    	      this.redrivePolicy = defaults.redrivePolicy;
    	      this.tags = defaults.tags;
    	      this.visibilityTimeout = defaults.visibilityTimeout;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setContentBasedDeduplication(@Nullable Boolean contentBasedDeduplication) {
            this.contentBasedDeduplication = contentBasedDeduplication;
            return this;
        }

        public Builder setDeduplicationScope(@Nullable String deduplicationScope) {
            this.deduplicationScope = deduplicationScope;
            return this;
        }

        public Builder setDelaySeconds(@Nullable Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
            return this;
        }

        public Builder setFifoThroughputLimit(@Nullable String fifoThroughputLimit) {
            this.fifoThroughputLimit = fifoThroughputLimit;
            return this;
        }

        public Builder setKmsDataKeyReusePeriodSeconds(@Nullable Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
            return this;
        }

        public Builder setKmsMasterKeyId(@Nullable String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
            return this;
        }

        public Builder setMaximumMessageSize(@Nullable Integer maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
            return this;
        }

        public Builder setMessageRetentionPeriod(@Nullable Integer messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
            return this;
        }

        public Builder setQueueUrl(@Nullable String queueUrl) {
            this.queueUrl = queueUrl;
            return this;
        }

        public Builder setReceiveMessageWaitTimeSeconds(@Nullable Integer receiveMessageWaitTimeSeconds) {
            this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
            return this;
        }

        public Builder setRedriveAllowPolicy(@Nullable Object redriveAllowPolicy) {
            this.redriveAllowPolicy = redriveAllowPolicy;
            return this;
        }

        public Builder setRedrivePolicy(@Nullable Object redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
            return this;
        }

        public Builder setTags(@Nullable List<QueueTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVisibilityTimeout(@Nullable Integer visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
            return this;
        }

        public GetQueueResult build() {
            return new GetQueueResult(arn, contentBasedDeduplication, deduplicationScope, delaySeconds, fifoThroughputLimit, kmsDataKeyReusePeriodSeconds, kmsMasterKeyId, maximumMessageSize, messageRetentionPeriod, queueUrl, receiveMessageWaitTimeSeconds, redriveAllowPolicy, redrivePolicy, tags, visibilityTimeout);
        }
    }
}
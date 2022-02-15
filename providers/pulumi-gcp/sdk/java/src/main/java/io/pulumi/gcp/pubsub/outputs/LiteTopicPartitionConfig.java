// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.pubsub.outputs.LiteTopicPartitionConfigCapacity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LiteTopicPartitionConfig {
    private final @Nullable LiteTopicPartitionConfigCapacity capacity;
    private final Integer count;

    @OutputCustomType.Constructor({"capacity","count"})
    private LiteTopicPartitionConfig(
        @Nullable LiteTopicPartitionConfigCapacity capacity,
        Integer count) {
        this.capacity = capacity;
        this.count = Objects.requireNonNull(count);
    }

    public Optional<LiteTopicPartitionConfigCapacity> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public Integer getCount() {
        return this.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicPartitionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LiteTopicPartitionConfigCapacity capacity;
        private Integer count;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicPartitionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.count = defaults.count;
        }

        public Builder setCapacity(@Nullable LiteTopicPartitionConfigCapacity capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public LiteTopicPartitionConfig build() {
            return new LiteTopicPartitionConfig(capacity, count);
        }
    }
}
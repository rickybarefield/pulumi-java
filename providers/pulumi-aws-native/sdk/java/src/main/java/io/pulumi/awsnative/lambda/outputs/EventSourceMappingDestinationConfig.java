// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.outputs;

import io.pulumi.awsnative.lambda.outputs.EventSourceMappingOnFailure;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventSourceMappingDestinationConfig {
    private final @Nullable EventSourceMappingOnFailure onFailure;

    @OutputCustomType.Constructor({"onFailure"})
    private EventSourceMappingDestinationConfig(@Nullable EventSourceMappingOnFailure onFailure) {
        this.onFailure = onFailure;
    }

    public Optional<EventSourceMappingOnFailure> getOnFailure() {
        return Optional.ofNullable(this.onFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventSourceMappingOnFailure onFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
        }

        public Builder setOnFailure(@Nullable EventSourceMappingOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        public EventSourceMappingDestinationConfig build() {
            return new EventSourceMappingDestinationConfig(onFailure);
        }
    }
}
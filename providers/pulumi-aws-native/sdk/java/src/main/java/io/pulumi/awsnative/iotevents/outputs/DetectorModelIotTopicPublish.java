// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelIotTopicPublish {
    private final String mqttTopic;
    private final @Nullable DetectorModelPayload payload;

    @OutputCustomType.Constructor({"mqttTopic","payload"})
    private DetectorModelIotTopicPublish(
        String mqttTopic,
        @Nullable DetectorModelPayload payload) {
        this.mqttTopic = Objects.requireNonNull(mqttTopic);
        this.payload = payload;
    }

    public String getMqttTopic() {
        return this.mqttTopic;
    }
    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelIotTopicPublish defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mqttTopic;
        private @Nullable DetectorModelPayload payload;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelIotTopicPublish defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttTopic = defaults.mqttTopic;
    	      this.payload = defaults.payload;
        }

        public Builder setMqttTopic(String mqttTopic) {
            this.mqttTopic = Objects.requireNonNull(mqttTopic);
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public DetectorModelIotTopicPublish build() {
            return new DetectorModelIotTopicPublish(mqttTopic, payload);
        }
    }
}
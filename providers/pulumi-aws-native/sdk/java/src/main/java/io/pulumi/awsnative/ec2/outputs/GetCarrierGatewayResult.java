// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.CarrierGatewayTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCarrierGatewayResult {
    private final @Nullable String carrierGatewayId;
    private final @Nullable String ownerId;
    private final @Nullable String state;
    private final @Nullable List<CarrierGatewayTag> tags;

    @OutputCustomType.Constructor({"carrierGatewayId","ownerId","state","tags"})
    private GetCarrierGatewayResult(
        @Nullable String carrierGatewayId,
        @Nullable String ownerId,
        @Nullable String state,
        @Nullable List<CarrierGatewayTag> tags) {
        this.carrierGatewayId = carrierGatewayId;
        this.ownerId = ownerId;
        this.state = state;
        this.tags = tags;
    }

    public Optional<String> getCarrierGatewayId() {
        return Optional.ofNullable(this.carrierGatewayId);
    }
    public Optional<String> getOwnerId() {
        return Optional.ofNullable(this.ownerId);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public List<CarrierGatewayTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCarrierGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String carrierGatewayId;
        private @Nullable String ownerId;
        private @Nullable String state;
        private @Nullable List<CarrierGatewayTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCarrierGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.ownerId = defaults.ownerId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder setCarrierGatewayId(@Nullable String carrierGatewayId) {
            this.carrierGatewayId = carrierGatewayId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setTags(@Nullable List<CarrierGatewayTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetCarrierGatewayResult build() {
            return new GetCarrierGatewayResult(carrierGatewayId, ownerId, state, tags);
        }
    }
}
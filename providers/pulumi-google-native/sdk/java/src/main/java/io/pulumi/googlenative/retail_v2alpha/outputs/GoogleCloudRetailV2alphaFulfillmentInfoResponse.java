// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaFulfillmentInfoResponse {
    private final List<String> placeIds;
    private final String type;

    @OutputCustomType.Constructor({"placeIds","type"})
    private GoogleCloudRetailV2alphaFulfillmentInfoResponse(
        List<String> placeIds,
        String type) {
        this.placeIds = Objects.requireNonNull(placeIds);
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getPlaceIds() {
        return this.placeIds;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaFulfillmentInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> placeIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaFulfillmentInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.placeIds = defaults.placeIds;
    	      this.type = defaults.type;
        }

        public Builder setPlaceIds(List<String> placeIds) {
            this.placeIds = Objects.requireNonNull(placeIds);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GoogleCloudRetailV2alphaFulfillmentInfoResponse build() {
            return new GoogleCloudRetailV2alphaFulfillmentInfoResponse(placeIds, type);
        }
    }
}
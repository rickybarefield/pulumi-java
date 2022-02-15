// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CategoricalStatsConfigResponse {
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @OutputCustomType.Constructor({"field"})
    private GooglePrivacyDlpV2CategoricalStatsConfigResponse(GooglePrivacyDlpV2FieldIdResponse field) {
        this.field = Objects.requireNonNull(field);
    }

    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CategoricalStatsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CategoricalStatsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public GooglePrivacyDlpV2CategoricalStatsConfigResponse build() {
            return new GooglePrivacyDlpV2CategoricalStatsConfigResponse(field);
        }
    }
}
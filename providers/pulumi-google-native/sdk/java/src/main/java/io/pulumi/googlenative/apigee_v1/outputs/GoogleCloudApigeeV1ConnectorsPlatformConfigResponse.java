// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1ConnectorsPlatformConfigResponse {
    private final Boolean enabled;
    private final String expiresAt;

    @OutputCustomType.Constructor({"enabled","expiresAt"})
    private GoogleCloudApigeeV1ConnectorsPlatformConfigResponse(
        Boolean enabled,
        String expiresAt) {
        this.enabled = Objects.requireNonNull(enabled);
        this.expiresAt = Objects.requireNonNull(expiresAt);
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getExpiresAt() {
        return this.expiresAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String expiresAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ConnectorsPlatformConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expiresAt = defaults.expiresAt;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setExpiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }

        public GoogleCloudApigeeV1ConnectorsPlatformConfigResponse build() {
            return new GoogleCloudApigeeV1ConnectorsPlatformConfigResponse(enabled, expiresAt);
        }
    }
}
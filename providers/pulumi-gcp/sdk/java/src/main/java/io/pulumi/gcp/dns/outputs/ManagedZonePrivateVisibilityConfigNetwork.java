// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePrivateVisibilityConfigNetwork {
    private final String networkUrl;

    @OutputCustomType.Constructor({"networkUrl"})
    private ManagedZonePrivateVisibilityConfigNetwork(String networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl);
    }

    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public ManagedZonePrivateVisibilityConfigNetwork build() {
            return new ManagedZonePrivateVisibilityConfigNetwork(networkUrl);
        }
    }
}
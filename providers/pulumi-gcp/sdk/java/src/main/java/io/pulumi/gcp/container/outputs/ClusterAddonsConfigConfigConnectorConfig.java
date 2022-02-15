// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ClusterAddonsConfigConfigConnectorConfig {
    private final Boolean enabled;

    @OutputCustomType.Constructor({"enabled"})
    private ClusterAddonsConfigConfigConnectorConfig(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled);
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigConfigConnectorConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigConfigConnectorConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public ClusterAddonsConfigConfigConnectorConfig build() {
            return new ClusterAddonsConfigConfigConnectorConfig(enabled);
        }
    }
}
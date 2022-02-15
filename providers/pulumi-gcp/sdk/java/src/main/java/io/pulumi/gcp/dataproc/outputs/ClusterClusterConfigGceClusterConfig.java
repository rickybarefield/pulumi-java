// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigGceClusterConfigShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfigGceClusterConfig {
    private final @Nullable Boolean internalIpOnly;
    private final @Nullable Map<String,String> metadata;
    private final @Nullable String network;
    private final @Nullable String serviceAccount;
    private final @Nullable List<String> serviceAccountScopes;
    private final @Nullable ClusterClusterConfigGceClusterConfigShieldedInstanceConfig shieldedInstanceConfig;
    private final @Nullable String subnetwork;
    private final @Nullable List<String> tags;
    private final @Nullable String zone;

    @OutputCustomType.Constructor({"internalIpOnly","metadata","network","serviceAccount","serviceAccountScopes","shieldedInstanceConfig","subnetwork","tags","zone"})
    private ClusterClusterConfigGceClusterConfig(
        @Nullable Boolean internalIpOnly,
        @Nullable Map<String,String> metadata,
        @Nullable String network,
        @Nullable String serviceAccount,
        @Nullable List<String> serviceAccountScopes,
        @Nullable ClusterClusterConfigGceClusterConfigShieldedInstanceConfig shieldedInstanceConfig,
        @Nullable String subnetwork,
        @Nullable List<String> tags,
        @Nullable String zone) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.network = network;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    public Optional<Boolean> getInternalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    public Optional<String> getNetwork() {
        return Optional.ofNullable(this.network);
    }
    public Optional<String> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public List<String> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? List.of() : this.serviceAccountScopes;
    }
    public Optional<ClusterClusterConfigGceClusterConfigShieldedInstanceConfig> getShieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }
    public Optional<String> getSubnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<String> getZone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigGceClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean internalIpOnly;
        private @Nullable Map<String,String> metadata;
        private @Nullable String network;
        private @Nullable String serviceAccount;
        private @Nullable List<String> serviceAccountScopes;
        private @Nullable ClusterClusterConfigGceClusterConfigShieldedInstanceConfig shieldedInstanceConfig;
        private @Nullable String subnetwork;
        private @Nullable List<String> tags;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigGceClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setInternalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = network;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable ClusterClusterConfigGceClusterConfigShieldedInstanceConfig shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }

        public ClusterClusterConfigGceClusterConfig build() {
            return new ClusterClusterConfigGceClusterConfig(internalIpOnly, metadata, network, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnetwork, tags, zone);
        }
    }
}
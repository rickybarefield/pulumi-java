// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.PrivateEndpointConnectionVaultPropertiesResponse;
import io.pulumi.azurenative.recoveryservices.outputs.UpgradeDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VaultPropertiesResponseEncryption;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VaultPropertiesResponse {
    private final @Nullable VaultPropertiesResponseEncryption encryption;
    private final List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
    private final String privateEndpointStateForBackup;
    private final String privateEndpointStateForSiteRecovery;
    private final String provisioningState;
    private final @Nullable UpgradeDetailsResponse upgradeDetails;

    @OutputCustomType.Constructor({"encryption","privateEndpointConnections","privateEndpointStateForBackup","privateEndpointStateForSiteRecovery","provisioningState","upgradeDetails"})
    private VaultPropertiesResponse(
        @Nullable VaultPropertiesResponseEncryption encryption,
        List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections,
        String privateEndpointStateForBackup,
        String privateEndpointStateForSiteRecovery,
        String provisioningState,
        @Nullable UpgradeDetailsResponse upgradeDetails) {
        this.encryption = encryption;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
        this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.upgradeDetails = upgradeDetails;
    }

    public Optional<VaultPropertiesResponseEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    public List<PrivateEndpointConnectionVaultPropertiesResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    public String getPrivateEndpointStateForBackup() {
        return this.privateEndpointStateForBackup;
    }
    public String getPrivateEndpointStateForSiteRecovery() {
        return this.privateEndpointStateForSiteRecovery;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<UpgradeDetailsResponse> getUpgradeDetails() {
        return Optional.ofNullable(this.upgradeDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VaultPropertiesResponseEncryption encryption;
        private List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections;
        private String privateEndpointStateForBackup;
        private String privateEndpointStateForSiteRecovery;
        private String provisioningState;
        private @Nullable UpgradeDetailsResponse upgradeDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateEndpointStateForBackup = defaults.privateEndpointStateForBackup;
    	      this.privateEndpointStateForSiteRecovery = defaults.privateEndpointStateForSiteRecovery;
    	      this.provisioningState = defaults.provisioningState;
    	      this.upgradeDetails = defaults.upgradeDetails;
        }

        public Builder setEncryption(@Nullable VaultPropertiesResponseEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionVaultPropertiesResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setPrivateEndpointStateForBackup(String privateEndpointStateForBackup) {
            this.privateEndpointStateForBackup = Objects.requireNonNull(privateEndpointStateForBackup);
            return this;
        }

        public Builder setPrivateEndpointStateForSiteRecovery(String privateEndpointStateForSiteRecovery) {
            this.privateEndpointStateForSiteRecovery = Objects.requireNonNull(privateEndpointStateForSiteRecovery);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setUpgradeDetails(@Nullable UpgradeDetailsResponse upgradeDetails) {
            this.upgradeDetails = upgradeDetails;
            return this;
        }

        public VaultPropertiesResponse build() {
            return new VaultPropertiesResponse(encryption, privateEndpointConnections, privateEndpointStateForBackup, privateEndpointStateForSiteRecovery, provisioningState, upgradeDetails);
        }
    }
}
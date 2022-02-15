// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.BillingProfileResponse;
import io.pulumi.azurenative.compute.inputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.inputs.ScheduledEventsProfileResponse;
import io.pulumi.azurenative.compute.inputs.SecurityProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetExtensionProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetStorageProfileResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetVMProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetVMProfileResponse Empty = new VirtualMachineScaleSetVMProfileResponse();

    @InputImport(name="billingProfile")
    private final @Nullable BillingProfileResponse billingProfile;

    public Optional<BillingProfileResponse> getBillingProfile() {
        return this.billingProfile == null ? Optional.empty() : Optional.ofNullable(this.billingProfile);
    }

    @InputImport(name="diagnosticsProfile")
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;

    public Optional<DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return this.diagnosticsProfile == null ? Optional.empty() : Optional.ofNullable(this.diagnosticsProfile);
    }

    @InputImport(name="evictionPolicy")
    private final @Nullable String evictionPolicy;

    public Optional<String> getEvictionPolicy() {
        return this.evictionPolicy == null ? Optional.empty() : Optional.ofNullable(this.evictionPolicy);
    }

    @InputImport(name="extensionProfile")
    private final @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;

    public Optional<VirtualMachineScaleSetExtensionProfileResponse> getExtensionProfile() {
        return this.extensionProfile == null ? Optional.empty() : Optional.ofNullable(this.extensionProfile);
    }

    @InputImport(name="licenseType")
    private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    @InputImport(name="networkProfile")
    private final @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;

    public Optional<VirtualMachineScaleSetNetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile == null ? Optional.empty() : Optional.ofNullable(this.networkProfile);
    }

    @InputImport(name="osProfile")
    private final @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;

    public Optional<VirtualMachineScaleSetOSProfileResponse> getOsProfile() {
        return this.osProfile == null ? Optional.empty() : Optional.ofNullable(this.osProfile);
    }

    @InputImport(name="priority")
    private final @Nullable String priority;

    public Optional<String> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="scheduledEventsProfile")
    private final @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;

    public Optional<ScheduledEventsProfileResponse> getScheduledEventsProfile() {
        return this.scheduledEventsProfile == null ? Optional.empty() : Optional.ofNullable(this.scheduledEventsProfile);
    }

    @InputImport(name="securityProfile")
    private final @Nullable SecurityProfileResponse securityProfile;

    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return this.securityProfile == null ? Optional.empty() : Optional.ofNullable(this.securityProfile);
    }

    @InputImport(name="storageProfile")
    private final @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;

    public Optional<VirtualMachineScaleSetStorageProfileResponse> getStorageProfile() {
        return this.storageProfile == null ? Optional.empty() : Optional.ofNullable(this.storageProfile);
    }

    @InputImport(name="userData")
    private final @Nullable String userData;

    public Optional<String> getUserData() {
        return this.userData == null ? Optional.empty() : Optional.ofNullable(this.userData);
    }

    public VirtualMachineScaleSetVMProfileResponse(
        @Nullable BillingProfileResponse billingProfile,
        @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @Nullable String evictionPolicy,
        @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile,
        @Nullable String licenseType,
        @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile,
        @Nullable VirtualMachineScaleSetOSProfileResponse osProfile,
        @Nullable String priority,
        @Nullable ScheduledEventsProfileResponse scheduledEventsProfile,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile,
        @Nullable String userData) {
        this.billingProfile = billingProfile;
        this.diagnosticsProfile = diagnosticsProfile;
        this.evictionPolicy = evictionPolicy;
        this.extensionProfile = extensionProfile;
        this.licenseType = licenseType;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.priority = priority;
        this.scheduledEventsProfile = scheduledEventsProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.userData = userData;
    }

    private VirtualMachineScaleSetVMProfileResponse() {
        this.billingProfile = null;
        this.diagnosticsProfile = null;
        this.evictionPolicy = null;
        this.extensionProfile = null;
        this.licenseType = null;
        this.networkProfile = null;
        this.osProfile = null;
        this.priority = null;
        this.scheduledEventsProfile = null;
        this.securityProfile = null;
        this.storageProfile = null;
        this.userData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BillingProfileResponse billingProfile;
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable String evictionPolicy;
        private @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;
        private @Nullable String licenseType;
        private @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;
        private @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;
        private @Nullable String priority;
        private @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;
        private @Nullable String userData;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingProfile = defaults.billingProfile;
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.extensionProfile = defaults.extensionProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.priority = defaults.priority;
    	      this.scheduledEventsProfile = defaults.scheduledEventsProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userData = defaults.userData;
        }

        public Builder setBillingProfile(@Nullable BillingProfileResponse billingProfile) {
            this.billingProfile = billingProfile;
            return this;
        }

        public Builder setDiagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        public Builder setEvictionPolicy(@Nullable String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }

        public Builder setExtensionProfile(@Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setNetworkProfile(@Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable VirtualMachineScaleSetOSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setPriority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }

        public Builder setScheduledEventsProfile(@Nullable ScheduledEventsProfileResponse scheduledEventsProfile) {
            this.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }

        public VirtualMachineScaleSetVMProfileResponse build() {
            return new VirtualMachineScaleSetVMProfileResponse(billingProfile, diagnosticsProfile, evictionPolicy, extensionProfile, licenseType, networkProfile, osProfile, priority, scheduledEventsProfile, securityProfile, storageProfile, userData);
        }
    }
}
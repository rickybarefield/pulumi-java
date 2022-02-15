// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetNetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetNetworkProfileResponse Empty = new VirtualMachineScaleSetNetworkProfileResponse();

    @InputImport(name="healthProbe")
    private final @Nullable ApiEntityReferenceResponse healthProbe;

    public Optional<ApiEntityReferenceResponse> getHealthProbe() {
        return this.healthProbe == null ? Optional.empty() : Optional.ofNullable(this.healthProbe);
    }

    @InputImport(name="networkApiVersion")
    private final @Nullable String networkApiVersion;

    public Optional<String> getNetworkApiVersion() {
        return this.networkApiVersion == null ? Optional.empty() : Optional.ofNullable(this.networkApiVersion);
    }

    @InputImport(name="networkInterfaceConfigurations")
    private final @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

    public List<VirtualMachineScaleSetNetworkConfigurationResponse> getNetworkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations == null ? List.of() : this.networkInterfaceConfigurations;
    }

    public VirtualMachineScaleSetNetworkProfileResponse(
        @Nullable ApiEntityReferenceResponse healthProbe,
        @Nullable String networkApiVersion,
        @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
        this.healthProbe = healthProbe;
        this.networkApiVersion = networkApiVersion;
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
    }

    private VirtualMachineScaleSetNetworkProfileResponse() {
        this.healthProbe = null;
        this.networkApiVersion = null;
        this.networkInterfaceConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiEntityReferenceResponse healthProbe;
        private @Nullable String networkApiVersion;
        private @Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthProbe = defaults.healthProbe;
    	      this.networkApiVersion = defaults.networkApiVersion;
    	      this.networkInterfaceConfigurations = defaults.networkInterfaceConfigurations;
        }

        public Builder setHealthProbe(@Nullable ApiEntityReferenceResponse healthProbe) {
            this.healthProbe = healthProbe;
            return this;
        }

        public Builder setNetworkApiVersion(@Nullable String networkApiVersion) {
            this.networkApiVersion = networkApiVersion;
            return this;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable List<VirtualMachineScaleSetNetworkConfigurationResponse> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }

        public VirtualMachineScaleSetNetworkProfileResponse build() {
            return new VirtualMachineScaleSetNetworkProfileResponse(healthProbe, networkApiVersion, networkInterfaceConfigurations);
        }
    }
}
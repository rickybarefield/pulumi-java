// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.IdentityProviderInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AddRecoveryServicesProviderInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddRecoveryServicesProviderInputPropertiesArgs Empty = new AddRecoveryServicesProviderInputPropertiesArgs();

    @InputImport(name="authenticationIdentityInput", required=true)
    private final Input<IdentityProviderInputArgs> authenticationIdentityInput;

    public Input<IdentityProviderInputArgs> getAuthenticationIdentityInput() {
        return this.authenticationIdentityInput;
    }

    @InputImport(name="dataPlaneAuthenticationIdentityInput")
    private final @Nullable Input<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput;

    public Input<IdentityProviderInputArgs> getDataPlaneAuthenticationIdentityInput() {
        return this.dataPlaneAuthenticationIdentityInput == null ? Input.empty() : this.dataPlaneAuthenticationIdentityInput;
    }

    @InputImport(name="machineId")
    private final @Nullable Input<String> machineId;

    public Input<String> getMachineId() {
        return this.machineId == null ? Input.empty() : this.machineId;
    }

    @InputImport(name="machineName", required=true)
    private final Input<String> machineName;

    public Input<String> getMachineName() {
        return this.machineName;
    }

    @InputImport(name="resourceAccessIdentityInput", required=true)
    private final Input<IdentityProviderInputArgs> resourceAccessIdentityInput;

    public Input<IdentityProviderInputArgs> getResourceAccessIdentityInput() {
        return this.resourceAccessIdentityInput;
    }

    public AddRecoveryServicesProviderInputPropertiesArgs(
        Input<IdentityProviderInputArgs> authenticationIdentityInput,
        @Nullable Input<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput,
        @Nullable Input<String> machineId,
        Input<String> machineName,
        Input<IdentityProviderInputArgs> resourceAccessIdentityInput) {
        this.authenticationIdentityInput = Objects.requireNonNull(authenticationIdentityInput, "expected parameter 'authenticationIdentityInput' to be non-null");
        this.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
        this.machineId = machineId;
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.resourceAccessIdentityInput = Objects.requireNonNull(resourceAccessIdentityInput, "expected parameter 'resourceAccessIdentityInput' to be non-null");
    }

    private AddRecoveryServicesProviderInputPropertiesArgs() {
        this.authenticationIdentityInput = Input.empty();
        this.dataPlaneAuthenticationIdentityInput = Input.empty();
        this.machineId = Input.empty();
        this.machineName = Input.empty();
        this.resourceAccessIdentityInput = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<IdentityProviderInputArgs> authenticationIdentityInput;
        private @Nullable Input<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput;
        private @Nullable Input<String> machineId;
        private Input<String> machineName;
        private Input<IdentityProviderInputArgs> resourceAccessIdentityInput;

        public Builder() {
    	      // Empty
        }

        public Builder(AddRecoveryServicesProviderInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationIdentityInput = defaults.authenticationIdentityInput;
    	      this.dataPlaneAuthenticationIdentityInput = defaults.dataPlaneAuthenticationIdentityInput;
    	      this.machineId = defaults.machineId;
    	      this.machineName = defaults.machineName;
    	      this.resourceAccessIdentityInput = defaults.resourceAccessIdentityInput;
        }

        public Builder setAuthenticationIdentityInput(Input<IdentityProviderInputArgs> authenticationIdentityInput) {
            this.authenticationIdentityInput = Objects.requireNonNull(authenticationIdentityInput);
            return this;
        }

        public Builder setAuthenticationIdentityInput(IdentityProviderInputArgs authenticationIdentityInput) {
            this.authenticationIdentityInput = Input.of(Objects.requireNonNull(authenticationIdentityInput));
            return this;
        }

        public Builder setDataPlaneAuthenticationIdentityInput(@Nullable Input<IdentityProviderInputArgs> dataPlaneAuthenticationIdentityInput) {
            this.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
            return this;
        }

        public Builder setDataPlaneAuthenticationIdentityInput(@Nullable IdentityProviderInputArgs dataPlaneAuthenticationIdentityInput) {
            this.dataPlaneAuthenticationIdentityInput = Input.ofNullable(dataPlaneAuthenticationIdentityInput);
            return this;
        }

        public Builder setMachineId(@Nullable Input<String> machineId) {
            this.machineId = machineId;
            return this;
        }

        public Builder setMachineId(@Nullable String machineId) {
            this.machineId = Input.ofNullable(machineId);
            return this;
        }

        public Builder setMachineName(Input<String> machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Input.of(Objects.requireNonNull(machineName));
            return this;
        }

        public Builder setResourceAccessIdentityInput(Input<IdentityProviderInputArgs> resourceAccessIdentityInput) {
            this.resourceAccessIdentityInput = Objects.requireNonNull(resourceAccessIdentityInput);
            return this;
        }

        public Builder setResourceAccessIdentityInput(IdentityProviderInputArgs resourceAccessIdentityInput) {
            this.resourceAccessIdentityInput = Input.of(Objects.requireNonNull(resourceAccessIdentityInput));
            return this;
        }

        public AddRecoveryServicesProviderInputPropertiesArgs build() {
            return new AddRecoveryServicesProviderInputPropertiesArgs(authenticationIdentityInput, dataPlaneAuthenticationIdentityInput, machineId, machineName, resourceAccessIdentityInput);
        }
    }
}
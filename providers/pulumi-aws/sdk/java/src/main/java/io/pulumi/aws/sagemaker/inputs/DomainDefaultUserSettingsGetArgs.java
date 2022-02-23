// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsGetArgs Empty = new DomainDefaultUserSettingsGetArgs();

    /**
     * The execution role ARN for the user.
     * 
     */
    @InputImport(name="executionRole", required=true)
    private final Input<String> executionRole;

    public Input<String> getExecutionRole() {
        return this.executionRole;
    }

    /**
     * The Jupyter server's app settings. See Jupyter Server App Settings below.
     * 
     */
    @InputImport(name="jupyterServerAppSettings")
    private final @Nullable Input<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;

    public Input<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Input.empty() : this.jupyterServerAppSettings;
    }

    /**
     * The kernel gateway app settings. See Kernel Gateway App Settings below.
     * 
     */
    @InputImport(name="kernelGatewayAppSettings")
    private final @Nullable Input<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;

    public Input<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Input.empty() : this.kernelGatewayAppSettings;
    }

    /**
     * The security groups.
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The sharing settings. See Sharing Settings below.
     * 
     */
    @InputImport(name="sharingSettings")
    private final @Nullable Input<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings;

    public Input<DomainDefaultUserSettingsSharingSettingsGetArgs> getSharingSettings() {
        return this.sharingSettings == null ? Input.empty() : this.sharingSettings;
    }

    /**
     * The TensorBoard app settings. See TensorBoard App Settings below.
     * 
     */
    @InputImport(name="tensorBoardAppSettings")
    private final @Nullable Input<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

    public Input<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> getTensorBoardAppSettings() {
        return this.tensorBoardAppSettings == null ? Input.empty() : this.tensorBoardAppSettings;
    }

    public DomainDefaultUserSettingsGetArgs(
        Input<String> executionRole,
        @Nullable Input<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings,
        @Nullable Input<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings,
        @Nullable Input<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
        this.executionRole = Objects.requireNonNull(executionRole, "expected parameter 'executionRole' to be non-null");
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
        this.tensorBoardAppSettings = tensorBoardAppSettings;
    }

    private DomainDefaultUserSettingsGetArgs() {
        this.executionRole = Input.empty();
        this.jupyterServerAppSettings = Input.empty();
        this.kernelGatewayAppSettings = Input.empty();
        this.securityGroups = Input.empty();
        this.sharingSettings = Input.empty();
        this.tensorBoardAppSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> executionRole;
        private @Nullable Input<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;
        private @Nullable Input<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings;
        private @Nullable Input<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
    	      this.tensorBoardAppSettings = defaults.tensorBoardAppSettings;
        }

        public Builder setExecutionRole(Input<String> executionRole) {
            this.executionRole = Objects.requireNonNull(executionRole);
            return this;
        }

        public Builder setExecutionRole(String executionRole) {
            this.executionRole = Input.of(Objects.requireNonNull(executionRole));
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable Input<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs jupyterServerAppSettings) {
            this.jupyterServerAppSettings = Input.ofNullable(jupyterServerAppSettings);
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable Input<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = Input.ofNullable(kernelGatewayAppSettings);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSharingSettings(@Nullable Input<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        public Builder setSharingSettings(@Nullable DomainDefaultUserSettingsSharingSettingsGetArgs sharingSettings) {
            this.sharingSettings = Input.ofNullable(sharingSettings);
            return this;
        }

        public Builder setTensorBoardAppSettings(@Nullable Input<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
            this.tensorBoardAppSettings = tensorBoardAppSettings;
            return this;
        }

        public Builder setTensorBoardAppSettings(@Nullable DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs tensorBoardAppSettings) {
            this.tensorBoardAppSettings = Input.ofNullable(tensorBoardAppSettings);
            return this;
        }
        public DomainDefaultUserSettingsGetArgs build() {
            return new DomainDefaultUserSettingsGetArgs(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings, tensorBoardAppSettings);
        }
    }
}
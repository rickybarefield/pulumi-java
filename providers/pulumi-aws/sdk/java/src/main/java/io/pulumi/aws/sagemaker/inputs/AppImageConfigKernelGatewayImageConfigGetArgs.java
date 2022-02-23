// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppImageConfigKernelGatewayImageConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigGetArgs Empty = new AppImageConfigKernelGatewayImageConfigGetArgs();

    /**
     * The URL where the Git repository is located. See File System Config details below.
     * 
     */
    @InputImport(name="fileSystemConfig")
    private final @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig;

    public Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> getFileSystemConfig() {
        return this.fileSystemConfig == null ? Input.empty() : this.fileSystemConfig;
    }

    /**
     * The default branch for the Git repository. See Kernel Spec details below.
     * 
     */
    @InputImport(name="kernelSpec", required=true)
    private final Input<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec;

    public Input<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> getKernelSpec() {
        return this.kernelSpec;
    }

    public AppImageConfigKernelGatewayImageConfigGetArgs(
        @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig,
        Input<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec) {
        this.fileSystemConfig = fileSystemConfig;
        this.kernelSpec = Objects.requireNonNull(kernelSpec, "expected parameter 'kernelSpec' to be non-null");
    }

    private AppImageConfigKernelGatewayImageConfigGetArgs() {
        this.fileSystemConfig = Input.empty();
        this.kernelSpec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppImageConfigKernelGatewayImageConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig;
        private Input<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(AppImageConfigKernelGatewayImageConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileSystemConfig = defaults.fileSystemConfig;
    	      this.kernelSpec = defaults.kernelSpec;
        }

        public Builder setFileSystemConfig(@Nullable Input<AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs> fileSystemConfig) {
            this.fileSystemConfig = fileSystemConfig;
            return this;
        }

        public Builder setFileSystemConfig(@Nullable AppImageConfigKernelGatewayImageConfigFileSystemConfigGetArgs fileSystemConfig) {
            this.fileSystemConfig = Input.ofNullable(fileSystemConfig);
            return this;
        }

        public Builder setKernelSpec(Input<AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs> kernelSpec) {
            this.kernelSpec = Objects.requireNonNull(kernelSpec);
            return this;
        }

        public Builder setKernelSpec(AppImageConfigKernelGatewayImageConfigKernelSpecGetArgs kernelSpec) {
            this.kernelSpec = Input.of(Objects.requireNonNull(kernelSpec));
            return this;
        }
        public AppImageConfigKernelGatewayImageConfigGetArgs build() {
            return new AppImageConfigKernelGatewayImageConfigGetArgs(fileSystemConfig, kernelSpec);
        }
    }
}
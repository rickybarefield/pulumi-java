// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AzureNodePoolConfigRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AzureNodePoolConfigSshConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureNodePoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigGetArgs Empty = new AzureNodePoolConfigGetArgs();

    @InputImport(name="rootVolume")
    private final @Nullable Input<AzureNodePoolConfigRootVolumeGetArgs> rootVolume;

    public Input<AzureNodePoolConfigRootVolumeGetArgs> getRootVolume() {
        return this.rootVolume == null ? Input.empty() : this.rootVolume;
    }

    @InputImport(name="sshConfig", required=true)
    private final Input<AzureNodePoolConfigSshConfigGetArgs> sshConfig;

    public Input<AzureNodePoolConfigSshConfigGetArgs> getSshConfig() {
        return this.sshConfig;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vmSize")
    private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public AzureNodePoolConfigGetArgs(
        @Nullable Input<AzureNodePoolConfigRootVolumeGetArgs> rootVolume,
        Input<AzureNodePoolConfigSshConfigGetArgs> sshConfig,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vmSize) {
        this.rootVolume = rootVolume;
        this.sshConfig = Objects.requireNonNull(sshConfig, "expected parameter 'sshConfig' to be non-null");
        this.tags = tags;
        this.vmSize = vmSize;
    }

    private AzureNodePoolConfigGetArgs() {
        this.rootVolume = Input.empty();
        this.sshConfig = Input.empty();
        this.tags = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureNodePoolConfigRootVolumeGetArgs> rootVolume;
        private Input<AzureNodePoolConfigSshConfigGetArgs> sshConfig;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootVolume = defaults.rootVolume;
    	      this.sshConfig = defaults.sshConfig;
    	      this.tags = defaults.tags;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setRootVolume(@Nullable Input<AzureNodePoolConfigRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder setRootVolume(@Nullable AzureNodePoolConfigRootVolumeGetArgs rootVolume) {
            this.rootVolume = Input.ofNullable(rootVolume);
            return this;
        }

        public Builder setSshConfig(Input<AzureNodePoolConfigSshConfigGetArgs> sshConfig) {
            this.sshConfig = Objects.requireNonNull(sshConfig);
            return this;
        }

        public Builder setSshConfig(AzureNodePoolConfigSshConfigGetArgs sshConfig) {
            this.sshConfig = Input.of(Objects.requireNonNull(sshConfig));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }

        public AzureNodePoolConfigGetArgs build() {
            return new AzureNodePoolConfigGetArgs(rootVolume, sshConfig, tags, vmSize);
        }
    }
}
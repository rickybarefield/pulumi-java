// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LaunchConfigurationEphemeralBlockDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationEphemeralBlockDeviceArgs Empty = new LaunchConfigurationEphemeralBlockDeviceArgs();

    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="virtualName", required=true)
    private final Input<String> virtualName;

    public Input<String> getVirtualName() {
        return this.virtualName;
    }

    public LaunchConfigurationEphemeralBlockDeviceArgs(
        Input<String> deviceName,
        Input<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private LaunchConfigurationEphemeralBlockDeviceArgs() {
        this.deviceName = Input.empty();
        this.virtualName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationEphemeralBlockDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private Input<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationEphemeralBlockDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setVirtualName(Input<String> virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }

        public Builder setVirtualName(String virtualName) {
            this.virtualName = Input.of(Objects.requireNonNull(virtualName));
            return this;
        }
        public LaunchConfigurationEphemeralBlockDeviceArgs build() {
            return new LaunchConfigurationEphemeralBlockDeviceArgs(deviceName, virtualName);
        }
    }
}
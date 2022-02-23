// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.DeviceDeviceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * The device to register with SageMaker Edge Manager. See Device details below.
     * 
     */
    @InputImport(name="device", required=true)
    private final Input<DeviceDeviceArgs> device;

    public Input<DeviceDeviceArgs> getDevice() {
        return this.device;
    }

    /**
     * The name of the Device Fleet.
     * 
     */
    @InputImport(name="deviceFleetName", required=true)
    private final Input<String> deviceFleetName;

    public Input<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }

    public DeviceArgs(
        Input<DeviceDeviceArgs> device,
        Input<String> deviceFleetName) {
        this.device = Objects.requireNonNull(device, "expected parameter 'device' to be non-null");
        this.deviceFleetName = Objects.requireNonNull(deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
    }

    private DeviceArgs() {
        this.device = Input.empty();
        this.deviceFleetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DeviceDeviceArgs> device;
        private Input<String> deviceFleetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.deviceFleetName = defaults.deviceFleetName;
        }

        public Builder setDevice(Input<DeviceDeviceArgs> device) {
            this.device = Objects.requireNonNull(device);
            return this;
        }

        public Builder setDevice(DeviceDeviceArgs device) {
            this.device = Input.of(Objects.requireNonNull(device));
            return this;
        }

        public Builder setDeviceFleetName(Input<String> deviceFleetName) {
            this.deviceFleetName = Objects.requireNonNull(deviceFleetName);
            return this;
        }

        public Builder setDeviceFleetName(String deviceFleetName) {
            this.deviceFleetName = Input.of(Objects.requireNonNull(deviceFleetName));
            return this;
        }
        public DeviceArgs build() {
            return new DeviceArgs(device, deviceFleetName);
        }
    }
}
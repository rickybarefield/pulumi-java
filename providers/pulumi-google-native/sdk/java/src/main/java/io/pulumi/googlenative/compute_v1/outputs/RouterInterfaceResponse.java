// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterInterfaceResponse {
    private final String ipRange;
    private final String linkedInterconnectAttachment;
    private final String linkedVpnTunnel;
    private final String managementType;
    private final String name;
    private final String privateIpAddress;
    private final String redundantInterface;
    private final String subnetwork;

    @OutputCustomType.Constructor({"ipRange","linkedInterconnectAttachment","linkedVpnTunnel","managementType","name","privateIpAddress","redundantInterface","subnetwork"})
    private RouterInterfaceResponse(
        String ipRange,
        String linkedInterconnectAttachment,
        String linkedVpnTunnel,
        String managementType,
        String name,
        String privateIpAddress,
        String redundantInterface,
        String subnetwork) {
        this.ipRange = Objects.requireNonNull(ipRange);
        this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment);
        this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel);
        this.managementType = Objects.requireNonNull(managementType);
        this.name = Objects.requireNonNull(name);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.redundantInterface = Objects.requireNonNull(redundantInterface);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    public String getIpRange() {
        return this.ipRange;
    }
    public String getLinkedInterconnectAttachment() {
        return this.linkedInterconnectAttachment;
    }
    public String getLinkedVpnTunnel() {
        return this.linkedVpnTunnel;
    }
    public String getManagementType() {
        return this.managementType;
    }
    public String getName() {
        return this.name;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    public String getRedundantInterface() {
        return this.redundantInterface;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipRange;
        private String linkedInterconnectAttachment;
        private String linkedVpnTunnel;
        private String managementType;
        private String name;
        private String privateIpAddress;
        private String redundantInterface;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipRange = defaults.ipRange;
    	      this.linkedInterconnectAttachment = defaults.linkedInterconnectAttachment;
    	      this.linkedVpnTunnel = defaults.linkedVpnTunnel;
    	      this.managementType = defaults.managementType;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.redundantInterface = defaults.redundantInterface;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setLinkedInterconnectAttachment(String linkedInterconnectAttachment) {
            this.linkedInterconnectAttachment = Objects.requireNonNull(linkedInterconnectAttachment);
            return this;
        }

        public Builder setLinkedVpnTunnel(String linkedVpnTunnel) {
            this.linkedVpnTunnel = Objects.requireNonNull(linkedVpnTunnel);
            return this;
        }

        public Builder setManagementType(String managementType) {
            this.managementType = Objects.requireNonNull(managementType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setRedundantInterface(String redundantInterface) {
            this.redundantInterface = Objects.requireNonNull(redundantInterface);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public RouterInterfaceResponse build() {
            return new RouterInterfaceResponse(ipRange, linkedInterconnectAttachment, linkedVpnTunnel, managementType, name, privateIpAddress, redundantInterface, subnetwork);
        }
    }
}
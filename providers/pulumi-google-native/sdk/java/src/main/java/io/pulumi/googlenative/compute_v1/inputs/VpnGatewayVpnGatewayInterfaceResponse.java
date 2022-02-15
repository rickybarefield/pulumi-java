// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VpnGatewayVpnGatewayInterfaceResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnGatewayVpnGatewayInterfaceResponse Empty = new VpnGatewayVpnGatewayInterfaceResponse();

    @InputImport(name="interconnectAttachment", required=true)
    private final String interconnectAttachment;

    public String getInterconnectAttachment() {
        return this.interconnectAttachment;
    }

    @InputImport(name="ipAddress", required=true)
    private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    public VpnGatewayVpnGatewayInterfaceResponse(
        String interconnectAttachment,
        String ipAddress) {
        this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment, "expected parameter 'interconnectAttachment' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
    }

    private VpnGatewayVpnGatewayInterfaceResponse() {
        this.interconnectAttachment = null;
        this.ipAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectAttachment;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayVpnGatewayInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectAttachment = defaults.interconnectAttachment;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setInterconnectAttachment(String interconnectAttachment) {
            this.interconnectAttachment = Objects.requireNonNull(interconnectAttachment);
            return this;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public VpnGatewayVpnGatewayInterfaceResponse build() {
            return new VpnGatewayVpnGatewayInterfaceResponse(interconnectAttachment, ipAddress);
        }
    }
}
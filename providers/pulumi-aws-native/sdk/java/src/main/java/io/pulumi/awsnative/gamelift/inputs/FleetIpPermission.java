// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.enums.FleetIpPermissionProtocol;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FleetIpPermission extends io.pulumi.resources.InvokeArgs {

    public static final FleetIpPermission Empty = new FleetIpPermission();

    @InputImport(name="fromPort", required=true)
    private final Integer fromPort;

    public Integer getFromPort() {
        return this.fromPort;
    }

    @InputImport(name="ipRange", required=true)
    private final String ipRange;

    public String getIpRange() {
        return this.ipRange;
    }

    @InputImport(name="protocol", required=true)
    private final FleetIpPermissionProtocol protocol;

    public FleetIpPermissionProtocol getProtocol() {
        return this.protocol;
    }

    @InputImport(name="toPort", required=true)
    private final Integer toPort;

    public Integer getToPort() {
        return this.toPort;
    }

    public FleetIpPermission(
        Integer fromPort,
        String ipRange,
        FleetIpPermissionProtocol protocol,
        Integer toPort) {
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.ipRange = Objects.requireNonNull(ipRange, "expected parameter 'ipRange' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private FleetIpPermission() {
        this.fromPort = null;
        this.ipRange = null;
        this.protocol = null;
        this.toPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetIpPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private String ipRange;
        private FleetIpPermissionProtocol protocol;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetIpPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.ipRange = defaults.ipRange;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setIpRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }

        public Builder setProtocol(FleetIpPermissionProtocol protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public FleetIpPermission build() {
            return new FleetIpPermission(fromPort, ipRange, protocol, toPort);
        }
    }
}
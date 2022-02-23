// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstancePublicPortsPortInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsPortInfoArgs Empty = new InstancePublicPortsPortInfoArgs();

    /**
     * Set of CIDR blocks.
     * 
     */
    @InputImport(name="cidrs")
    private final @Nullable Input<List<String>> cidrs;

    public Input<List<String>> getCidrs() {
        return this.cidrs == null ? Input.empty() : this.cidrs;
    }

    /**
     * First port in a range of open ports on an instance.
     * 
     */
    @InputImport(name="fromPort", required=true)
    private final Input<Integer> fromPort;

    public Input<Integer> getFromPort() {
        return this.fromPort;
    }

    /**
     * IP protocol name. Valid values are `tcp`, `all`, `udp`, and `icmp`.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol;
    }

    /**
     * Last port in a range of open ports on an instance.
     * 
     */
    @InputImport(name="toPort", required=true)
    private final Input<Integer> toPort;

    public Input<Integer> getToPort() {
        return this.toPort;
    }

    public InstancePublicPortsPortInfoArgs(
        @Nullable Input<List<String>> cidrs,
        Input<Integer> fromPort,
        Input<String> protocol,
        Input<Integer> toPort) {
        this.cidrs = cidrs;
        this.fromPort = Objects.requireNonNull(fromPort, "expected parameter 'fromPort' to be non-null");
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.toPort = Objects.requireNonNull(toPort, "expected parameter 'toPort' to be non-null");
    }

    private InstancePublicPortsPortInfoArgs() {
        this.cidrs = Input.empty();
        this.fromPort = Input.empty();
        this.protocol = Input.empty();
        this.toPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePublicPortsPortInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> cidrs;
        private Input<Integer> fromPort;
        private Input<String> protocol;
        private Input<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePublicPortsPortInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
    	      this.fromPort = defaults.fromPort;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder setCidrs(@Nullable Input<List<String>> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        public Builder setCidrs(@Nullable List<String> cidrs) {
            this.cidrs = Input.ofNullable(cidrs);
            return this;
        }

        public Builder setFromPort(Input<Integer> fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder setFromPort(Integer fromPort) {
            this.fromPort = Input.of(Objects.requireNonNull(fromPort));
            return this;
        }

        public Builder setProtocol(Input<String> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setToPort(Input<Integer> toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }

        public Builder setToPort(Integer toPort) {
            this.toPort = Input.of(Objects.requireNonNull(toPort));
            return this;
        }
        public InstancePublicPortsPortInfoArgs build() {
            return new InstancePublicPortsPortInfoArgs(cidrs, fromPort, protocol, toPort);
        }
    }
}
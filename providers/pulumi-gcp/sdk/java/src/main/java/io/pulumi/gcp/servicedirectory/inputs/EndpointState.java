// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointState extends io.pulumi.resources.ResourceArgs {

    public static final EndpointState Empty = new EndpointState();

    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    @InputImport(name="endpointId")
    private final @Nullable Input<String> endpointId;

    public Input<String> getEndpointId() {
        return this.endpointId == null ? Input.empty() : this.endpointId;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="service")
    private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public EndpointState(
        @Nullable Input<String> address,
        @Nullable Input<String> endpointId,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<Integer> port,
        @Nullable Input<String> service) {
        this.address = address;
        this.endpointId = endpointId;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.port = port;
        this.service = service;
    }

    private EndpointState() {
        this.address = Input.empty();
        this.endpointId = Input.empty();
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.port = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<String> endpointId;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.endpointId = defaults.endpointId;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.port = defaults.port;
    	      this.service = defaults.service;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setEndpointId(@Nullable Input<String> endpointId) {
            this.endpointId = endpointId;
            return this;
        }

        public Builder setEndpointId(@Nullable String endpointId) {
            this.endpointId = Input.ofNullable(endpointId);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public EndpointState build() {
            return new EndpointState(address, endpointId, metadata, name, network, port, service);
        }
    }
}
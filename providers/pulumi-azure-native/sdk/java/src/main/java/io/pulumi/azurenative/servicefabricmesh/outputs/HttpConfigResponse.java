// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.HttpHostConfigResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class HttpConfigResponse {
    private final List<HttpHostConfigResponse> hosts;
    private final String name;
    private final Integer port;

    @OutputCustomType.Constructor({"hosts","name","port"})
    private HttpConfigResponse(
        List<HttpHostConfigResponse> hosts,
        String name,
        Integer port) {
        this.hosts = Objects.requireNonNull(hosts);
        this.name = Objects.requireNonNull(name);
        this.port = Objects.requireNonNull(port);
    }

    public List<HttpHostConfigResponse> getHosts() {
        return this.hosts;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHostConfigResponse> hosts;
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setHosts(List<HttpHostConfigResponse> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public HttpConfigResponse build() {
            return new HttpConfigResponse(hosts, name, port);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteRetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteRetryPolicyArgs Empty = new RouteSpecHttpRouteRetryPolicyArgs();

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @InputImport(name="httpRetryEvents")
    private final @Nullable Input<List<String>> httpRetryEvents;

    public Input<List<String>> getHttpRetryEvents() {
        return this.httpRetryEvents == null ? Input.empty() : this.httpRetryEvents;
    }

    /**
     * The maximum number of retries.
     * 
     */
    @InputImport(name="maxRetries", required=true)
    private final Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @InputImport(name="perRetryTimeout", required=true)
    private final Input<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;

    public Input<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs> getPerRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @InputImport(name="tcpRetryEvents")
    private final @Nullable Input<List<String>> tcpRetryEvents;

    public Input<List<String>> getTcpRetryEvents() {
        return this.tcpRetryEvents == null ? Input.empty() : this.tcpRetryEvents;
    }

    public RouteSpecHttpRouteRetryPolicyArgs(
        @Nullable Input<List<String>> httpRetryEvents,
        Input<Integer> maxRetries,
        Input<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout,
        @Nullable Input<List<String>> tcpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
        this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
        this.tcpRetryEvents = tcpRetryEvents;
    }

    private RouteSpecHttpRouteRetryPolicyArgs() {
        this.httpRetryEvents = Input.empty();
        this.maxRetries = Input.empty();
        this.perRetryTimeout = Input.empty();
        this.tcpRetryEvents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> httpRetryEvents;
        private Input<Integer> maxRetries;
        private Input<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout;
        private @Nullable Input<List<String>> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder setHttpRetryEvents(@Nullable Input<List<String>> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }

        public Builder setHttpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = Input.ofNullable(httpRetryEvents);
            return this;
        }

        public Builder setMaxRetries(Input<Integer> maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Input.of(Objects.requireNonNull(maxRetries));
            return this;
        }

        public Builder setPerRetryTimeout(Input<RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs> perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }

        public Builder setPerRetryTimeout(RouteSpecHttpRouteRetryPolicyPerRetryTimeoutArgs perRetryTimeout) {
            this.perRetryTimeout = Input.of(Objects.requireNonNull(perRetryTimeout));
            return this;
        }

        public Builder setTcpRetryEvents(@Nullable Input<List<String>> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }

        public Builder setTcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = Input.ofNullable(tcpRetryEvents);
            return this;
        }
        public RouteSpecHttpRouteRetryPolicyArgs build() {
            return new RouteSpecHttpRouteRetryPolicyArgs(httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}
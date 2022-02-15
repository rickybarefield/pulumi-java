// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoggingDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingDestinationArgs Empty = new LoggingDestinationArgs();

    @InputImport(name="logs")
    private final @Nullable Input<List<String>> logs;

    public Input<List<String>> getLogs() {
        return this.logs == null ? Input.empty() : this.logs;
    }

    @InputImport(name="monitoredResource")
    private final @Nullable Input<String> monitoredResource;

    public Input<String> getMonitoredResource() {
        return this.monitoredResource == null ? Input.empty() : this.monitoredResource;
    }

    public LoggingDestinationArgs(
        @Nullable Input<List<String>> logs,
        @Nullable Input<String> monitoredResource) {
        this.logs = logs;
        this.monitoredResource = monitoredResource;
    }

    private LoggingDestinationArgs() {
        this.logs = Input.empty();
        this.monitoredResource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> logs;
        private @Nullable Input<String> monitoredResource;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.monitoredResource = defaults.monitoredResource;
        }

        public Builder setLogs(@Nullable Input<List<String>> logs) {
            this.logs = logs;
            return this;
        }

        public Builder setLogs(@Nullable List<String> logs) {
            this.logs = Input.ofNullable(logs);
            return this;
        }

        public Builder setMonitoredResource(@Nullable Input<String> monitoredResource) {
            this.monitoredResource = monitoredResource;
            return this;
        }

        public Builder setMonitoredResource(@Nullable String monitoredResource) {
            this.monitoredResource = Input.ofNullable(monitoredResource);
            return this;
        }

        public LoggingDestinationArgs build() {
            return new LoggingDestinationArgs(logs, monitoredResource);
        }
    }
}
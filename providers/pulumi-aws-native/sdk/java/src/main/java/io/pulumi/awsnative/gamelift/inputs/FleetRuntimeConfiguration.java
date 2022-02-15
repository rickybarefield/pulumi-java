// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.inputs;

import io.pulumi.awsnative.gamelift.inputs.FleetServerProcess;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FleetRuntimeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final FleetRuntimeConfiguration Empty = new FleetRuntimeConfiguration();

    @InputImport(name="gameSessionActivationTimeoutSeconds")
    private final @Nullable Integer gameSessionActivationTimeoutSeconds;

    public Optional<Integer> getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.gameSessionActivationTimeoutSeconds);
    }

    @InputImport(name="maxConcurrentGameSessionActivations")
    private final @Nullable Integer maxConcurrentGameSessionActivations;

    public Optional<Integer> getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentGameSessionActivations);
    }

    @InputImport(name="serverProcesses")
    private final @Nullable List<FleetServerProcess> serverProcesses;

    public List<FleetServerProcess> getServerProcesses() {
        return this.serverProcesses == null ? List.of() : this.serverProcesses;
    }

    public FleetRuntimeConfiguration(
        @Nullable Integer gameSessionActivationTimeoutSeconds,
        @Nullable Integer maxConcurrentGameSessionActivations,
        @Nullable List<FleetServerProcess> serverProcesses) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        this.serverProcesses = serverProcesses;
    }

    private FleetRuntimeConfiguration() {
        this.gameSessionActivationTimeoutSeconds = null;
        this.maxConcurrentGameSessionActivations = null;
        this.serverProcesses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetRuntimeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer gameSessionActivationTimeoutSeconds;
        private @Nullable Integer maxConcurrentGameSessionActivations;
        private @Nullable List<FleetServerProcess> serverProcesses;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetRuntimeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gameSessionActivationTimeoutSeconds = defaults.gameSessionActivationTimeoutSeconds;
    	      this.maxConcurrentGameSessionActivations = defaults.maxConcurrentGameSessionActivations;
    	      this.serverProcesses = defaults.serverProcesses;
        }

        public Builder setGameSessionActivationTimeoutSeconds(@Nullable Integer gameSessionActivationTimeoutSeconds) {
            this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
            return this;
        }

        public Builder setMaxConcurrentGameSessionActivations(@Nullable Integer maxConcurrentGameSessionActivations) {
            this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
            return this;
        }

        public Builder setServerProcesses(@Nullable List<FleetServerProcess> serverProcesses) {
            this.serverProcesses = serverProcesses;
            return this;
        }

        public FleetRuntimeConfiguration build() {
            return new FleetRuntimeConfiguration(gameSessionActivationTimeoutSeconds, maxConcurrentGameSessionActivations, serverProcesses);
        }
    }
}
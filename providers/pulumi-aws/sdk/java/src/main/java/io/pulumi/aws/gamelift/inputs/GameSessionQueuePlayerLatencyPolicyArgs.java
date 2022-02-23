// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameSessionQueuePlayerLatencyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameSessionQueuePlayerLatencyPolicyArgs Empty = new GameSessionQueuePlayerLatencyPolicyArgs();

    /**
     * Maximum latency value that is allowed for any player.
     * 
     */
    @InputImport(name="maximumIndividualPlayerLatencyMilliseconds", required=true)
    private final Input<Integer> maximumIndividualPlayerLatencyMilliseconds;

    public Input<Integer> getMaximumIndividualPlayerLatencyMilliseconds() {
        return this.maximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * Length of time that the policy is enforced while placing a new game session. Absence of value for this attribute means that the policy is enforced until the queue times out.
     * 
     */
    @InputImport(name="policyDurationSeconds")
    private final @Nullable Input<Integer> policyDurationSeconds;

    public Input<Integer> getPolicyDurationSeconds() {
        return this.policyDurationSeconds == null ? Input.empty() : this.policyDurationSeconds;
    }

    public GameSessionQueuePlayerLatencyPolicyArgs(
        Input<Integer> maximumIndividualPlayerLatencyMilliseconds,
        @Nullable Input<Integer> policyDurationSeconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds, "expected parameter 'maximumIndividualPlayerLatencyMilliseconds' to be non-null");
        this.policyDurationSeconds = policyDurationSeconds;
    }

    private GameSessionQueuePlayerLatencyPolicyArgs() {
        this.maximumIndividualPlayerLatencyMilliseconds = Input.empty();
        this.policyDurationSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameSessionQueuePlayerLatencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maximumIndividualPlayerLatencyMilliseconds;
        private @Nullable Input<Integer> policyDurationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(GameSessionQueuePlayerLatencyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumIndividualPlayerLatencyMilliseconds = defaults.maximumIndividualPlayerLatencyMilliseconds;
    	      this.policyDurationSeconds = defaults.policyDurationSeconds;
        }

        public Builder setMaximumIndividualPlayerLatencyMilliseconds(Input<Integer> maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds);
            return this;
        }

        public Builder setMaximumIndividualPlayerLatencyMilliseconds(Integer maximumIndividualPlayerLatencyMilliseconds) {
            this.maximumIndividualPlayerLatencyMilliseconds = Input.of(Objects.requireNonNull(maximumIndividualPlayerLatencyMilliseconds));
            return this;
        }

        public Builder setPolicyDurationSeconds(@Nullable Input<Integer> policyDurationSeconds) {
            this.policyDurationSeconds = policyDurationSeconds;
            return this;
        }

        public Builder setPolicyDurationSeconds(@Nullable Integer policyDurationSeconds) {
            this.policyDurationSeconds = Input.ofNullable(policyDurationSeconds);
            return this;
        }
        public GameSessionQueuePlayerLatencyPolicyArgs build() {
            return new GameSessionQueuePlayerLatencyPolicyArgs(maximumIndividualPlayerLatencyMilliseconds, policyDurationSeconds);
        }
    }
}
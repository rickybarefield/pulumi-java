// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.ReadWriteEndpointFailoverPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FailoverGroupReadWriteEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final FailoverGroupReadWriteEndpointArgs Empty = new FailoverGroupReadWriteEndpointArgs();

    @InputImport(name="failoverPolicy", required=true)
    private final Input<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy;

    public Input<Either<String,ReadWriteEndpointFailoverPolicy>> getFailoverPolicy() {
        return this.failoverPolicy;
    }

    @InputImport(name="failoverWithDataLossGracePeriodMinutes")
    private final @Nullable Input<Integer> failoverWithDataLossGracePeriodMinutes;

    public Input<Integer> getFailoverWithDataLossGracePeriodMinutes() {
        return this.failoverWithDataLossGracePeriodMinutes == null ? Input.empty() : this.failoverWithDataLossGracePeriodMinutes;
    }

    public FailoverGroupReadWriteEndpointArgs(
        Input<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy,
        @Nullable Input<Integer> failoverWithDataLossGracePeriodMinutes) {
        this.failoverPolicy = Objects.requireNonNull(failoverPolicy, "expected parameter 'failoverPolicy' to be non-null");
        this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
    }

    private FailoverGroupReadWriteEndpointArgs() {
        this.failoverPolicy = Input.empty();
        this.failoverWithDataLossGracePeriodMinutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReadWriteEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy;
        private @Nullable Input<Integer> failoverWithDataLossGracePeriodMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverGroupReadWriteEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.failoverWithDataLossGracePeriodMinutes = defaults.failoverWithDataLossGracePeriodMinutes;
        }

        public Builder setFailoverPolicy(Input<Either<String,ReadWriteEndpointFailoverPolicy>> failoverPolicy) {
            this.failoverPolicy = Objects.requireNonNull(failoverPolicy);
            return this;
        }

        public Builder setFailoverPolicy(Either<String,ReadWriteEndpointFailoverPolicy> failoverPolicy) {
            this.failoverPolicy = Input.of(Objects.requireNonNull(failoverPolicy));
            return this;
        }

        public Builder setFailoverWithDataLossGracePeriodMinutes(@Nullable Input<Integer> failoverWithDataLossGracePeriodMinutes) {
            this.failoverWithDataLossGracePeriodMinutes = failoverWithDataLossGracePeriodMinutes;
            return this;
        }

        public Builder setFailoverWithDataLossGracePeriodMinutes(@Nullable Integer failoverWithDataLossGracePeriodMinutes) {
            this.failoverWithDataLossGracePeriodMinutes = Input.ofNullable(failoverWithDataLossGracePeriodMinutes);
            return this;
        }

        public FailoverGroupReadWriteEndpointArgs build() {
            return new FailoverGroupReadWriteEndpointArgs(failoverPolicy, failoverWithDataLossGracePeriodMinutes);
        }
    }
}
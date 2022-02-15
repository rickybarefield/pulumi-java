// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobSchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSchedulingArgs Empty = new JobSchedulingArgs();

    @InputImport(name="maxFailuresPerHour")
    private final @Nullable Input<Integer> maxFailuresPerHour;

    public Input<Integer> getMaxFailuresPerHour() {
        return this.maxFailuresPerHour == null ? Input.empty() : this.maxFailuresPerHour;
    }

    @InputImport(name="maxFailuresTotal")
    private final @Nullable Input<Integer> maxFailuresTotal;

    public Input<Integer> getMaxFailuresTotal() {
        return this.maxFailuresTotal == null ? Input.empty() : this.maxFailuresTotal;
    }

    public JobSchedulingArgs(
        @Nullable Input<Integer> maxFailuresPerHour,
        @Nullable Input<Integer> maxFailuresTotal) {
        this.maxFailuresPerHour = maxFailuresPerHour;
        this.maxFailuresTotal = maxFailuresTotal;
    }

    private JobSchedulingArgs() {
        this.maxFailuresPerHour = Input.empty();
        this.maxFailuresTotal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxFailuresPerHour;
        private @Nullable Input<Integer> maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder setMaxFailuresPerHour(@Nullable Input<Integer> maxFailuresPerHour) {
            this.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder setMaxFailuresPerHour(@Nullable Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Input.ofNullable(maxFailuresPerHour);
            return this;
        }

        public Builder setMaxFailuresTotal(@Nullable Input<Integer> maxFailuresTotal) {
            this.maxFailuresTotal = maxFailuresTotal;
            return this;
        }

        public Builder setMaxFailuresTotal(@Nullable Integer maxFailuresTotal) {
            this.maxFailuresTotal = Input.ofNullable(maxFailuresTotal);
            return this;
        }

        public JobSchedulingArgs build() {
            return new JobSchedulingArgs(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class TimestampResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimestampResponse Empty = new TimestampResponse();

    @InputImport(name="nanos", required=true)
    private final Integer nanos;

    public Integer getNanos() {
        return this.nanos;
    }

    @InputImport(name="seconds", required=true)
    private final String seconds;

    public String getSeconds() {
        return this.seconds;
    }

    public TimestampResponse(
        Integer nanos,
        String seconds) {
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private TimestampResponse() {
        this.nanos = null;
        this.seconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimestampResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer nanos;
        private String seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TimestampResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder setNanos(Integer nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder setSeconds(String seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public TimestampResponse build() {
            return new TimestampResponse(nanos, seconds);
        }
    }
}
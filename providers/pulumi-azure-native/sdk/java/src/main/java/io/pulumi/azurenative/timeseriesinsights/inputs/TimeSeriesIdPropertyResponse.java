// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TimeSeriesIdPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final TimeSeriesIdPropertyResponse Empty = new TimeSeriesIdPropertyResponse();

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public TimeSeriesIdPropertyResponse(
        @Nullable String name,
        @Nullable String type) {
        this.name = name;
        this.type = type;
    }

    private TimeSeriesIdPropertyResponse() {
        this.name = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesIdPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesIdPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public TimeSeriesIdPropertyResponse build() {
            return new TimeSeriesIdPropertyResponse(name, type);
        }
    }
}
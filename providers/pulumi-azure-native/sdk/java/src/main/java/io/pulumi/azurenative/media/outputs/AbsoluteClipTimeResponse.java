// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AbsoluteClipTimeResponse {
    private final String odataType;
    private final String time;

    @OutputCustomType.Constructor({"odataType","time"})
    private AbsoluteClipTimeResponse(
        String odataType,
        String time) {
        this.odataType = Objects.requireNonNull(odataType);
        this.time = Objects.requireNonNull(time);
    }

    public String getOdataType() {
        return this.odataType;
    }
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteClipTimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteClipTimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.time = defaults.time;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }

        public AbsoluteClipTimeResponse build() {
            return new AbsoluteClipTimeResponse(odataType, time);
        }
    }
}
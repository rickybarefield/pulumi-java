// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.FailoverTargetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListDeviceFailoverTarsResult {
    private final @Nullable List<FailoverTargetResponse> value;

    @OutputCustomType.Constructor({"value"})
    private ListDeviceFailoverTarsResult(@Nullable List<FailoverTargetResponse> value) {
        this.value = value;
    }

    public List<FailoverTargetResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeviceFailoverTarsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FailoverTargetResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeviceFailoverTarsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable List<FailoverTargetResponse> value) {
            this.value = value;
            return this;
        }

        public ListDeviceFailoverTarsResult build() {
            return new ListDeviceFailoverTarsResult(value);
        }
    }
}
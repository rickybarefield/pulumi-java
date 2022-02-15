// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestorePolicyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestorePolicyPropertiesArgs Empty = new RestorePolicyPropertiesArgs();

    @InputImport(name="days")
    private final @Nullable Input<Integer> days;

    public Input<Integer> getDays() {
        return this.days == null ? Input.empty() : this.days;
    }

    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    public RestorePolicyPropertiesArgs(
        @Nullable Input<Integer> days,
        Input<Boolean> enabled) {
        this.days = days;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private RestorePolicyPropertiesArgs() {
        this.days = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> days;
        private Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePolicyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDays(@Nullable Input<Integer> days) {
            this.days = days;
            return this;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = Input.ofNullable(days);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public RestorePolicyPropertiesArgs build() {
            return new RestorePolicyPropertiesArgs(days, enabled);
        }
    }
}
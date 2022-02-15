// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolybaseSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolybaseSettingsResponse Empty = new PolybaseSettingsResponse();

    @InputImport(name="rejectSampleValue")
    private final @Nullable Object rejectSampleValue;

    public Optional<Object> getRejectSampleValue() {
        return this.rejectSampleValue == null ? Optional.empty() : Optional.ofNullable(this.rejectSampleValue);
    }

    @InputImport(name="rejectType")
    private final @Nullable String rejectType;

    public Optional<String> getRejectType() {
        return this.rejectType == null ? Optional.empty() : Optional.ofNullable(this.rejectType);
    }

    @InputImport(name="rejectValue")
    private final @Nullable Object rejectValue;

    public Optional<Object> getRejectValue() {
        return this.rejectValue == null ? Optional.empty() : Optional.ofNullable(this.rejectValue);
    }

    @InputImport(name="useTypeDefault")
    private final @Nullable Object useTypeDefault;

    public Optional<Object> getUseTypeDefault() {
        return this.useTypeDefault == null ? Optional.empty() : Optional.ofNullable(this.useTypeDefault);
    }

    public PolybaseSettingsResponse(
        @Nullable Object rejectSampleValue,
        @Nullable String rejectType,
        @Nullable Object rejectValue,
        @Nullable Object useTypeDefault) {
        this.rejectSampleValue = rejectSampleValue;
        this.rejectType = rejectType;
        this.rejectValue = rejectValue;
        this.useTypeDefault = useTypeDefault;
    }

    private PolybaseSettingsResponse() {
        this.rejectSampleValue = null;
        this.rejectType = null;
        this.rejectValue = null;
        this.useTypeDefault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolybaseSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object rejectSampleValue;
        private @Nullable String rejectType;
        private @Nullable Object rejectValue;
        private @Nullable Object useTypeDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(PolybaseSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rejectSampleValue = defaults.rejectSampleValue;
    	      this.rejectType = defaults.rejectType;
    	      this.rejectValue = defaults.rejectValue;
    	      this.useTypeDefault = defaults.useTypeDefault;
        }

        public Builder setRejectSampleValue(@Nullable Object rejectSampleValue) {
            this.rejectSampleValue = rejectSampleValue;
            return this;
        }

        public Builder setRejectType(@Nullable String rejectType) {
            this.rejectType = rejectType;
            return this;
        }

        public Builder setRejectValue(@Nullable Object rejectValue) {
            this.rejectValue = rejectValue;
            return this;
        }

        public Builder setUseTypeDefault(@Nullable Object useTypeDefault) {
            this.useTypeDefault = useTypeDefault;
            return this;
        }

        public PolybaseSettingsResponse build() {
            return new PolybaseSettingsResponse(rejectSampleValue, rejectType, rejectValue, useTypeDefault);
        }
    }
}
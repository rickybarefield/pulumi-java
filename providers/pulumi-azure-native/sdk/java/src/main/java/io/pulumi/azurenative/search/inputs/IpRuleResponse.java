// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IpRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpRuleResponse Empty = new IpRuleResponse();

    @InputImport(name="value")
    private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public IpRuleResponse(@Nullable String value) {
        this.value = value;
    }

    private IpRuleResponse() {
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public IpRuleResponse build() {
            return new IpRuleResponse(value);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MatchVariableResponse {
    private final @Nullable String selector;
    private final String variableName;

    @OutputCustomType.Constructor({"selector","variableName"})
    private MatchVariableResponse(
        @Nullable String selector,
        String variableName) {
        this.selector = selector;
        this.variableName = Objects.requireNonNull(variableName);
    }

    public Optional<String> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    public String getVariableName() {
        return this.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String selector;
        private String variableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchVariableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.selector = defaults.selector;
    	      this.variableName = defaults.variableName;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder setVariableName(String variableName) {
            this.variableName = Objects.requireNonNull(variableName);
            return this;
        }

        public MatchVariableResponse build() {
            return new MatchVariableResponse(selector, variableName);
        }
    }
}
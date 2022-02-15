// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlFilterResponse Empty = new SqlFilterResponse();

    @InputImport(name="compatibilityLevel")
    private final @Nullable Integer compatibilityLevel;

    public Optional<Integer> getCompatibilityLevel() {
        return this.compatibilityLevel == null ? Optional.empty() : Optional.ofNullable(this.compatibilityLevel);
    }

    @InputImport(name="requiresPreprocessing")
    private final @Nullable Boolean requiresPreprocessing;

    public Optional<Boolean> getRequiresPreprocessing() {
        return this.requiresPreprocessing == null ? Optional.empty() : Optional.ofNullable(this.requiresPreprocessing);
    }

    @InputImport(name="sqlExpression")
    private final @Nullable String sqlExpression;

    public Optional<String> getSqlExpression() {
        return this.sqlExpression == null ? Optional.empty() : Optional.ofNullable(this.sqlExpression);
    }

    public SqlFilterResponse(
        @Nullable Integer compatibilityLevel,
        @Nullable Boolean requiresPreprocessing,
        @Nullable String sqlExpression) {
        this.compatibilityLevel = compatibilityLevel == null ? 20 : compatibilityLevel;
        this.requiresPreprocessing = requiresPreprocessing == null ? true : requiresPreprocessing;
        this.sqlExpression = sqlExpression;
    }

    private SqlFilterResponse() {
        this.compatibilityLevel = null;
        this.requiresPreprocessing = null;
        this.sqlExpression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer compatibilityLevel;
        private @Nullable Boolean requiresPreprocessing;
        private @Nullable String sqlExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.requiresPreprocessing = defaults.requiresPreprocessing;
    	      this.sqlExpression = defaults.sqlExpression;
        }

        public Builder setCompatibilityLevel(@Nullable Integer compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder setRequiresPreprocessing(@Nullable Boolean requiresPreprocessing) {
            this.requiresPreprocessing = requiresPreprocessing;
            return this;
        }

        public Builder setSqlExpression(@Nullable String sqlExpression) {
            this.sqlExpression = sqlExpression;
            return this;
        }

        public SqlFilterResponse build() {
            return new SqlFilterResponse(compatibilityLevel, requiresPreprocessing, sqlExpression);
        }
    }
}
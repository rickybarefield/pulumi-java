// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MigrationValidationOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrationValidationOptionsResponse Empty = new MigrationValidationOptionsResponse();

    @InputImport(name="enableDataIntegrityValidation")
    private final @Nullable Boolean enableDataIntegrityValidation;

    public Optional<Boolean> getEnableDataIntegrityValidation() {
        return this.enableDataIntegrityValidation == null ? Optional.empty() : Optional.ofNullable(this.enableDataIntegrityValidation);
    }

    @InputImport(name="enableQueryAnalysisValidation")
    private final @Nullable Boolean enableQueryAnalysisValidation;

    public Optional<Boolean> getEnableQueryAnalysisValidation() {
        return this.enableQueryAnalysisValidation == null ? Optional.empty() : Optional.ofNullable(this.enableQueryAnalysisValidation);
    }

    @InputImport(name="enableSchemaValidation")
    private final @Nullable Boolean enableSchemaValidation;

    public Optional<Boolean> getEnableSchemaValidation() {
        return this.enableSchemaValidation == null ? Optional.empty() : Optional.ofNullable(this.enableSchemaValidation);
    }

    public MigrationValidationOptionsResponse(
        @Nullable Boolean enableDataIntegrityValidation,
        @Nullable Boolean enableQueryAnalysisValidation,
        @Nullable Boolean enableSchemaValidation) {
        this.enableDataIntegrityValidation = enableDataIntegrityValidation;
        this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
        this.enableSchemaValidation = enableSchemaValidation;
    }

    private MigrationValidationOptionsResponse() {
        this.enableDataIntegrityValidation = null;
        this.enableQueryAnalysisValidation = null;
        this.enableSchemaValidation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationValidationOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDataIntegrityValidation;
        private @Nullable Boolean enableQueryAnalysisValidation;
        private @Nullable Boolean enableSchemaValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationValidationOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDataIntegrityValidation = defaults.enableDataIntegrityValidation;
    	      this.enableQueryAnalysisValidation = defaults.enableQueryAnalysisValidation;
    	      this.enableSchemaValidation = defaults.enableSchemaValidation;
        }

        public Builder setEnableDataIntegrityValidation(@Nullable Boolean enableDataIntegrityValidation) {
            this.enableDataIntegrityValidation = enableDataIntegrityValidation;
            return this;
        }

        public Builder setEnableQueryAnalysisValidation(@Nullable Boolean enableQueryAnalysisValidation) {
            this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
            return this;
        }

        public Builder setEnableSchemaValidation(@Nullable Boolean enableSchemaValidation) {
            this.enableSchemaValidation = enableSchemaValidation;
            return this;
        }

        public MigrationValidationOptionsResponse build() {
            return new MigrationValidationOptionsResponse(enableDataIntegrityValidation, enableQueryAnalysisValidation, enableSchemaValidation);
        }
    }
}
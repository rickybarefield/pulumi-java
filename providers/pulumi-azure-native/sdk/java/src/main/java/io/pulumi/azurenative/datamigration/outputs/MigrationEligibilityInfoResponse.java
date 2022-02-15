// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MigrationEligibilityInfoResponse {
    private final Boolean isEligibleForMigration;
    private final List<String> validationMessages;

    @OutputCustomType.Constructor({"isEligibleForMigration","validationMessages"})
    private MigrationEligibilityInfoResponse(
        Boolean isEligibleForMigration,
        List<String> validationMessages) {
        this.isEligibleForMigration = Objects.requireNonNull(isEligibleForMigration);
        this.validationMessages = Objects.requireNonNull(validationMessages);
    }

    public Boolean getIsEligibleForMigration() {
        return this.isEligibleForMigration;
    }
    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationEligibilityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEligibleForMigration;
        private List<String> validationMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationEligibilityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEligibleForMigration = defaults.isEligibleForMigration;
    	      this.validationMessages = defaults.validationMessages;
        }

        public Builder setIsEligibleForMigration(Boolean isEligibleForMigration) {
            this.isEligibleForMigration = Objects.requireNonNull(isEligibleForMigration);
            return this;
        }

        public Builder setValidationMessages(List<String> validationMessages) {
            this.validationMessages = Objects.requireNonNull(validationMessages);
            return this;
        }

        public MigrationEligibilityInfoResponse build() {
            return new MigrationEligibilityInfoResponse(isEligibleForMigration, validationMessages);
        }
    }
}
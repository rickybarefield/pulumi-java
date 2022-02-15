// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.jobs_v4.outputs.CompensationRangeResponse;
import io.pulumi.googlenative.jobs_v4.outputs.MoneyResponse;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CompensationEntryResponse {
    private final MoneyResponse amount;
    private final String description;
    private final Double expectedUnitsPerYear;
    private final CompensationRangeResponse range;
    private final String type;
    private final String unit;

    @OutputCustomType.Constructor({"amount","description","expectedUnitsPerYear","range","type","unit"})
    private CompensationEntryResponse(
        MoneyResponse amount,
        String description,
        Double expectedUnitsPerYear,
        CompensationRangeResponse range,
        String type,
        String unit) {
        this.amount = Objects.requireNonNull(amount);
        this.description = Objects.requireNonNull(description);
        this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear);
        this.range = Objects.requireNonNull(range);
        this.type = Objects.requireNonNull(type);
        this.unit = Objects.requireNonNull(unit);
    }

    public MoneyResponse getAmount() {
        return this.amount;
    }
    public String getDescription() {
        return this.description;
    }
    public Double getExpectedUnitsPerYear() {
        return this.expectedUnitsPerYear;
    }
    public CompensationRangeResponse getRange() {
        return this.range;
    }
    public String getType() {
        return this.type;
    }
    public String getUnit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse amount;
        private String description;
        private Double expectedUnitsPerYear;
        private CompensationRangeResponse range;
        private String type;
        private String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.description = defaults.description;
    	      this.expectedUnitsPerYear = defaults.expectedUnitsPerYear;
    	      this.range = defaults.range;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setAmount(MoneyResponse amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setExpectedUnitsPerYear(Double expectedUnitsPerYear) {
            this.expectedUnitsPerYear = Objects.requireNonNull(expectedUnitsPerYear);
            return this;
        }

        public Builder setRange(CompensationRangeResponse range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public CompensationEntryResponse build() {
            return new CompensationEntryResponse(amount, description, expectedUnitsPerYear, range, type, unit);
        }
    }
}
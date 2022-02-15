// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AvailabilitySetResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvailabilitySetResourceSettingsResponse Empty = new AvailabilitySetResourceSettingsResponse();

    @InputImport(name="faultDomain")
    private final @Nullable Integer faultDomain;

    public Optional<Integer> getFaultDomain() {
        return this.faultDomain == null ? Optional.empty() : Optional.ofNullable(this.faultDomain);
    }

    @InputImport(name="resourceType", required=true)
    private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="targetResourceName", required=true)
    private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    @InputImport(name="updateDomain")
    private final @Nullable Integer updateDomain;

    public Optional<Integer> getUpdateDomain() {
        return this.updateDomain == null ? Optional.empty() : Optional.ofNullable(this.updateDomain);
    }

    public AvailabilitySetResourceSettingsResponse(
        @Nullable Integer faultDomain,
        String resourceType,
        String targetResourceName,
        @Nullable Integer updateDomain) {
        this.faultDomain = faultDomain;
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.updateDomain = updateDomain;
    }

    private AvailabilitySetResourceSettingsResponse() {
        this.faultDomain = null;
        this.resourceType = null;
        this.targetResourceName = null;
        this.updateDomain = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilitySetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer faultDomain;
        private String resourceType;
        private String targetResourceName;
        private @Nullable Integer updateDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilitySetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.faultDomain = defaults.faultDomain;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.updateDomain = defaults.updateDomain;
        }

        public Builder setFaultDomain(@Nullable Integer faultDomain) {
            this.faultDomain = faultDomain;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setUpdateDomain(@Nullable Integer updateDomain) {
            this.updateDomain = updateDomain;
            return this;
        }

        public AvailabilitySetResourceSettingsResponse build() {
            return new AvailabilitySetResourceSettingsResponse(faultDomain, resourceType, targetResourceName, updateDomain);
        }
    }
}
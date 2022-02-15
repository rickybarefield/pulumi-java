// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectReferenceDefinitionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HelmReleasePropertiesDefinitionResponse {
    private final @Nullable Double failureCount;
    private final @Nullable ObjectReferenceDefinitionResponse helmChartRef;
    private final @Nullable Double installFailureCount;
    private final @Nullable Double lastRevisionApplied;
    private final @Nullable Double upgradeFailureCount;

    @OutputCustomType.Constructor({"failureCount","helmChartRef","installFailureCount","lastRevisionApplied","upgradeFailureCount"})
    private HelmReleasePropertiesDefinitionResponse(
        @Nullable Double failureCount,
        @Nullable ObjectReferenceDefinitionResponse helmChartRef,
        @Nullable Double installFailureCount,
        @Nullable Double lastRevisionApplied,
        @Nullable Double upgradeFailureCount) {
        this.failureCount = failureCount;
        this.helmChartRef = helmChartRef;
        this.installFailureCount = installFailureCount;
        this.lastRevisionApplied = lastRevisionApplied;
        this.upgradeFailureCount = upgradeFailureCount;
    }

    public Optional<Double> getFailureCount() {
        return Optional.ofNullable(this.failureCount);
    }
    public Optional<ObjectReferenceDefinitionResponse> getHelmChartRef() {
        return Optional.ofNullable(this.helmChartRef);
    }
    public Optional<Double> getInstallFailureCount() {
        return Optional.ofNullable(this.installFailureCount);
    }
    public Optional<Double> getLastRevisionApplied() {
        return Optional.ofNullable(this.lastRevisionApplied);
    }
    public Optional<Double> getUpgradeFailureCount() {
        return Optional.ofNullable(this.upgradeFailureCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmReleasePropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double failureCount;
        private @Nullable ObjectReferenceDefinitionResponse helmChartRef;
        private @Nullable Double installFailureCount;
        private @Nullable Double lastRevisionApplied;
        private @Nullable Double upgradeFailureCount;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmReleasePropertiesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureCount = defaults.failureCount;
    	      this.helmChartRef = defaults.helmChartRef;
    	      this.installFailureCount = defaults.installFailureCount;
    	      this.lastRevisionApplied = defaults.lastRevisionApplied;
    	      this.upgradeFailureCount = defaults.upgradeFailureCount;
        }

        public Builder setFailureCount(@Nullable Double failureCount) {
            this.failureCount = failureCount;
            return this;
        }

        public Builder setHelmChartRef(@Nullable ObjectReferenceDefinitionResponse helmChartRef) {
            this.helmChartRef = helmChartRef;
            return this;
        }

        public Builder setInstallFailureCount(@Nullable Double installFailureCount) {
            this.installFailureCount = installFailureCount;
            return this;
        }

        public Builder setLastRevisionApplied(@Nullable Double lastRevisionApplied) {
            this.lastRevisionApplied = lastRevisionApplied;
            return this;
        }

        public Builder setUpgradeFailureCount(@Nullable Double upgradeFailureCount) {
            this.upgradeFailureCount = upgradeFailureCount;
            return this;
        }

        public HelmReleasePropertiesDefinitionResponse build() {
            return new HelmReleasePropertiesDefinitionResponse(failureCount, helmChartRef, installFailureCount, lastRevisionApplied, upgradeFailureCount);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptions;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfig {
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions;
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions;
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions;
    private final @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig;

    @OutputCustomType.Constructor({"bigQueryOptions","cloudStorageOptions","datastoreOptions","timespanConfig"})
    private PreventionJobTriggerInspectJobStorageConfig(
        @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions,
        @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions,
        @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions,
        @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig) {
        this.bigQueryOptions = bigQueryOptions;
        this.cloudStorageOptions = cloudStorageOptions;
        this.datastoreOptions = datastoreOptions;
        this.timespanConfig = timespanConfig;
    }

    public Optional<PreventionJobTriggerInspectJobStorageConfigBigQueryOptions> getBigQueryOptions() {
        return Optional.ofNullable(this.bigQueryOptions);
    }
    public Optional<PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions> getCloudStorageOptions() {
        return Optional.ofNullable(this.cloudStorageOptions);
    }
    public Optional<PreventionJobTriggerInspectJobStorageConfigDatastoreOptions> getDatastoreOptions() {
        return Optional.ofNullable(this.datastoreOptions);
    }
    public Optional<PreventionJobTriggerInspectJobStorageConfigTimespanConfig> getTimespanConfig() {
        return Optional.ofNullable(this.timespanConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions;
        private @Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder setBigQueryOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigBigQueryOptions bigQueryOptions) {
            this.bigQueryOptions = bigQueryOptions;
            return this;
        }

        public Builder setCloudStorageOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigCloudStorageOptions cloudStorageOptions) {
            this.cloudStorageOptions = cloudStorageOptions;
            return this;
        }

        public Builder setDatastoreOptions(@Nullable PreventionJobTriggerInspectJobStorageConfigDatastoreOptions datastoreOptions) {
            this.datastoreOptions = datastoreOptions;
            return this;
        }

        public Builder setTimespanConfig(@Nullable PreventionJobTriggerInspectJobStorageConfigTimespanConfig timespanConfig) {
            this.timespanConfig = timespanConfig;
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfig build() {
            return new PreventionJobTriggerInspectJobStorageConfig(bigQueryOptions, cloudStorageOptions, datastoreOptions, timespanConfig);
        }
    }
}
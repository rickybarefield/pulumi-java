// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.FhirStoreVersion;
import io.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.StreamConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.ValidationConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="defaultSearchHandlingStrict")
    private final @Nullable Input<Boolean> defaultSearchHandlingStrict;

    public Input<Boolean> getDefaultSearchHandlingStrict() {
        return this.defaultSearchHandlingStrict == null ? Input.empty() : this.defaultSearchHandlingStrict;
    }

    @InputImport(name="disableReferentialIntegrity")
    private final @Nullable Input<Boolean> disableReferentialIntegrity;

    public Input<Boolean> getDisableReferentialIntegrity() {
        return this.disableReferentialIntegrity == null ? Input.empty() : this.disableReferentialIntegrity;
    }

    @InputImport(name="disableResourceVersioning")
    private final @Nullable Input<Boolean> disableResourceVersioning;

    public Input<Boolean> getDisableResourceVersioning() {
        return this.disableResourceVersioning == null ? Input.empty() : this.disableResourceVersioning;
    }

    @InputImport(name="enableUpdateCreate")
    private final @Nullable Input<Boolean> enableUpdateCreate;

    public Input<Boolean> getEnableUpdateCreate() {
        return this.enableUpdateCreate == null ? Input.empty() : this.enableUpdateCreate;
    }

    @InputImport(name="fhirStoreId")
    private final @Nullable Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId == null ? Input.empty() : this.fhirStoreId;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="notificationConfig")
    private final @Nullable Input<NotificationConfigArgs> notificationConfig;

    public Input<NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="streamConfigs")
    private final @Nullable Input<List<StreamConfigArgs>> streamConfigs;

    public Input<List<StreamConfigArgs>> getStreamConfigs() {
        return this.streamConfigs == null ? Input.empty() : this.streamConfigs;
    }

    @InputImport(name="validationConfig")
    private final @Nullable Input<ValidationConfigArgs> validationConfig;

    public Input<ValidationConfigArgs> getValidationConfig() {
        return this.validationConfig == null ? Input.empty() : this.validationConfig;
    }

    @InputImport(name="version")
    private final @Nullable Input<FhirStoreVersion> version;

    public Input<FhirStoreVersion> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FhirStoreArgs(
        Input<String> datasetId,
        @Nullable Input<Boolean> defaultSearchHandlingStrict,
        @Nullable Input<Boolean> disableReferentialIntegrity,
        @Nullable Input<Boolean> disableResourceVersioning,
        @Nullable Input<Boolean> enableUpdateCreate,
        @Nullable Input<String> fhirStoreId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<NotificationConfigArgs> notificationConfig,
        @Nullable Input<String> project,
        @Nullable Input<List<StreamConfigArgs>> streamConfigs,
        @Nullable Input<ValidationConfigArgs> validationConfig,
        @Nullable Input<FhirStoreVersion> version) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableUpdateCreate = enableUpdateCreate;
        this.fhirStoreId = fhirStoreId;
        this.labels = labels;
        this.location = location;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.streamConfigs = streamConfigs;
        this.validationConfig = validationConfig;
        this.version = version;
    }

    private FhirStoreArgs() {
        this.datasetId = Input.empty();
        this.defaultSearchHandlingStrict = Input.empty();
        this.disableReferentialIntegrity = Input.empty();
        this.disableResourceVersioning = Input.empty();
        this.enableUpdateCreate = Input.empty();
        this.fhirStoreId = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.notificationConfig = Input.empty();
        this.project = Input.empty();
        this.streamConfigs = Input.empty();
        this.validationConfig = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private @Nullable Input<Boolean> defaultSearchHandlingStrict;
        private @Nullable Input<Boolean> disableReferentialIntegrity;
        private @Nullable Input<Boolean> disableResourceVersioning;
        private @Nullable Input<Boolean> enableUpdateCreate;
        private @Nullable Input<String> fhirStoreId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<NotificationConfigArgs> notificationConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<List<StreamConfigArgs>> streamConfigs;
        private @Nullable Input<ValidationConfigArgs> validationConfig;
        private @Nullable Input<FhirStoreVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.defaultSearchHandlingStrict = defaults.defaultSearchHandlingStrict;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.validationConfig = defaults.validationConfig;
    	      this.version = defaults.version;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setDefaultSearchHandlingStrict(@Nullable Input<Boolean> defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
            return this;
        }

        public Builder setDefaultSearchHandlingStrict(@Nullable Boolean defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = Input.ofNullable(defaultSearchHandlingStrict);
            return this;
        }

        public Builder setDisableReferentialIntegrity(@Nullable Input<Boolean> disableReferentialIntegrity) {
            this.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }

        public Builder setDisableReferentialIntegrity(@Nullable Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Input.ofNullable(disableReferentialIntegrity);
            return this;
        }

        public Builder setDisableResourceVersioning(@Nullable Input<Boolean> disableResourceVersioning) {
            this.disableResourceVersioning = disableResourceVersioning;
            return this;
        }

        public Builder setDisableResourceVersioning(@Nullable Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Input.ofNullable(disableResourceVersioning);
            return this;
        }

        public Builder setEnableUpdateCreate(@Nullable Input<Boolean> enableUpdateCreate) {
            this.enableUpdateCreate = enableUpdateCreate;
            return this;
        }

        public Builder setEnableUpdateCreate(@Nullable Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Input.ofNullable(enableUpdateCreate);
            return this;
        }

        public Builder setFhirStoreId(@Nullable Input<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder setFhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Input.ofNullable(fhirStoreId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setStreamConfigs(@Nullable Input<List<StreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }

        public Builder setStreamConfigs(@Nullable List<StreamConfigArgs> streamConfigs) {
            this.streamConfigs = Input.ofNullable(streamConfigs);
            return this;
        }

        public Builder setValidationConfig(@Nullable Input<ValidationConfigArgs> validationConfig) {
            this.validationConfig = validationConfig;
            return this;
        }

        public Builder setValidationConfig(@Nullable ValidationConfigArgs validationConfig) {
            this.validationConfig = Input.ofNullable(validationConfig);
            return this;
        }

        public Builder setVersion(@Nullable Input<FhirStoreVersion> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable FhirStoreVersion version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public FhirStoreArgs build() {
            return new FhirStoreArgs(datasetId, defaultSearchHandlingStrict, disableReferentialIntegrity, disableResourceVersioning, enableUpdateCreate, fhirStoreId, labels, location, notificationConfig, project, streamConfigs, validationConfig, version);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigEmailPreferencesGetArgs;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigScheduleOptionsGetArgs;
import io.pulumi.gcp.bigquery.inputs.DataTransferConfigSensitiveParamsGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataTransferConfigState extends io.pulumi.resources.ResourceArgs {

    public static final DataTransferConfigState Empty = new DataTransferConfigState();

    @InputImport(name="dataRefreshWindowDays")
    private final @Nullable Input<Integer> dataRefreshWindowDays;

    public Input<Integer> getDataRefreshWindowDays() {
        return this.dataRefreshWindowDays == null ? Input.empty() : this.dataRefreshWindowDays;
    }

    @InputImport(name="dataSourceId")
    private final @Nullable Input<String> dataSourceId;

    public Input<String> getDataSourceId() {
        return this.dataSourceId == null ? Input.empty() : this.dataSourceId;
    }

    @InputImport(name="destinationDatasetId")
    private final @Nullable Input<String> destinationDatasetId;

    public Input<String> getDestinationDatasetId() {
        return this.destinationDatasetId == null ? Input.empty() : this.destinationDatasetId;
    }

    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="emailPreferences")
    private final @Nullable Input<DataTransferConfigEmailPreferencesGetArgs> emailPreferences;

    public Input<DataTransferConfigEmailPreferencesGetArgs> getEmailPreferences() {
        return this.emailPreferences == null ? Input.empty() : this.emailPreferences;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="notificationPubsubTopic")
    private final @Nullable Input<String> notificationPubsubTopic;

    public Input<String> getNotificationPubsubTopic() {
        return this.notificationPubsubTopic == null ? Input.empty() : this.notificationPubsubTopic;
    }

    @InputImport(name="params")
    private final @Nullable Input<Map<String,String>> params;

    public Input<Map<String,String>> getParams() {
        return this.params == null ? Input.empty() : this.params;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="schedule")
    private final @Nullable Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    @InputImport(name="scheduleOptions")
    private final @Nullable Input<DataTransferConfigScheduleOptionsGetArgs> scheduleOptions;

    public Input<DataTransferConfigScheduleOptionsGetArgs> getScheduleOptions() {
        return this.scheduleOptions == null ? Input.empty() : this.scheduleOptions;
    }

    @InputImport(name="sensitiveParams")
    private final @Nullable Input<DataTransferConfigSensitiveParamsGetArgs> sensitiveParams;

    public Input<DataTransferConfigSensitiveParamsGetArgs> getSensitiveParams() {
        return this.sensitiveParams == null ? Input.empty() : this.sensitiveParams;
    }

    @InputImport(name="serviceAccountName")
    private final @Nullable Input<String> serviceAccountName;

    public Input<String> getServiceAccountName() {
        return this.serviceAccountName == null ? Input.empty() : this.serviceAccountName;
    }

    public DataTransferConfigState(
        @Nullable Input<Integer> dataRefreshWindowDays,
        @Nullable Input<String> dataSourceId,
        @Nullable Input<String> destinationDatasetId,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<String> displayName,
        @Nullable Input<DataTransferConfigEmailPreferencesGetArgs> emailPreferences,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> notificationPubsubTopic,
        @Nullable Input<Map<String,String>> params,
        @Nullable Input<String> project,
        @Nullable Input<String> schedule,
        @Nullable Input<DataTransferConfigScheduleOptionsGetArgs> scheduleOptions,
        @Nullable Input<DataTransferConfigSensitiveParamsGetArgs> sensitiveParams,
        @Nullable Input<String> serviceAccountName) {
        this.dataRefreshWindowDays = dataRefreshWindowDays;
        this.dataSourceId = dataSourceId;
        this.destinationDatasetId = destinationDatasetId;
        this.disabled = disabled;
        this.displayName = displayName;
        this.emailPreferences = emailPreferences;
        this.location = location;
        this.name = name;
        this.notificationPubsubTopic = notificationPubsubTopic;
        this.params = params;
        this.project = project;
        this.schedule = schedule;
        this.scheduleOptions = scheduleOptions;
        this.sensitiveParams = sensitiveParams;
        this.serviceAccountName = serviceAccountName;
    }

    private DataTransferConfigState() {
        this.dataRefreshWindowDays = Input.empty();
        this.dataSourceId = Input.empty();
        this.destinationDatasetId = Input.empty();
        this.disabled = Input.empty();
        this.displayName = Input.empty();
        this.emailPreferences = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.notificationPubsubTopic = Input.empty();
        this.params = Input.empty();
        this.project = Input.empty();
        this.schedule = Input.empty();
        this.scheduleOptions = Input.empty();
        this.sensitiveParams = Input.empty();
        this.serviceAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dataRefreshWindowDays;
        private @Nullable Input<String> dataSourceId;
        private @Nullable Input<String> destinationDatasetId;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<String> displayName;
        private @Nullable Input<DataTransferConfigEmailPreferencesGetArgs> emailPreferences;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> notificationPubsubTopic;
        private @Nullable Input<Map<String,String>> params;
        private @Nullable Input<String> project;
        private @Nullable Input<String> schedule;
        private @Nullable Input<DataTransferConfigScheduleOptionsGetArgs> scheduleOptions;
        private @Nullable Input<DataTransferConfigSensitiveParamsGetArgs> sensitiveParams;
        private @Nullable Input<String> serviceAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRefreshWindowDays = defaults.dataRefreshWindowDays;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.destinationDatasetId = defaults.destinationDatasetId;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.emailPreferences = defaults.emailPreferences;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notificationPubsubTopic = defaults.notificationPubsubTopic;
    	      this.params = defaults.params;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.scheduleOptions = defaults.scheduleOptions;
    	      this.sensitiveParams = defaults.sensitiveParams;
    	      this.serviceAccountName = defaults.serviceAccountName;
        }

        public Builder setDataRefreshWindowDays(@Nullable Input<Integer> dataRefreshWindowDays) {
            this.dataRefreshWindowDays = dataRefreshWindowDays;
            return this;
        }

        public Builder setDataRefreshWindowDays(@Nullable Integer dataRefreshWindowDays) {
            this.dataRefreshWindowDays = Input.ofNullable(dataRefreshWindowDays);
            return this;
        }

        public Builder setDataSourceId(@Nullable Input<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setDataSourceId(@Nullable String dataSourceId) {
            this.dataSourceId = Input.ofNullable(dataSourceId);
            return this;
        }

        public Builder setDestinationDatasetId(@Nullable Input<String> destinationDatasetId) {
            this.destinationDatasetId = destinationDatasetId;
            return this;
        }

        public Builder setDestinationDatasetId(@Nullable String destinationDatasetId) {
            this.destinationDatasetId = Input.ofNullable(destinationDatasetId);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEmailPreferences(@Nullable Input<DataTransferConfigEmailPreferencesGetArgs> emailPreferences) {
            this.emailPreferences = emailPreferences;
            return this;
        }

        public Builder setEmailPreferences(@Nullable DataTransferConfigEmailPreferencesGetArgs emailPreferences) {
            this.emailPreferences = Input.ofNullable(emailPreferences);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNotificationPubsubTopic(@Nullable Input<String> notificationPubsubTopic) {
            this.notificationPubsubTopic = notificationPubsubTopic;
            return this;
        }

        public Builder setNotificationPubsubTopic(@Nullable String notificationPubsubTopic) {
            this.notificationPubsubTopic = Input.ofNullable(notificationPubsubTopic);
            return this;
        }

        public Builder setParams(@Nullable Input<Map<String,String>> params) {
            this.params = params;
            return this;
        }

        public Builder setParams(@Nullable Map<String,String> params) {
            this.params = Input.ofNullable(params);
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

        public Builder setSchedule(@Nullable Input<String> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setScheduleOptions(@Nullable Input<DataTransferConfigScheduleOptionsGetArgs> scheduleOptions) {
            this.scheduleOptions = scheduleOptions;
            return this;
        }

        public Builder setScheduleOptions(@Nullable DataTransferConfigScheduleOptionsGetArgs scheduleOptions) {
            this.scheduleOptions = Input.ofNullable(scheduleOptions);
            return this;
        }

        public Builder setSensitiveParams(@Nullable Input<DataTransferConfigSensitiveParamsGetArgs> sensitiveParams) {
            this.sensitiveParams = sensitiveParams;
            return this;
        }

        public Builder setSensitiveParams(@Nullable DataTransferConfigSensitiveParamsGetArgs sensitiveParams) {
            this.sensitiveParams = Input.ofNullable(sensitiveParams);
            return this;
        }

        public Builder setServiceAccountName(@Nullable Input<String> serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder setServiceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = Input.ofNullable(serviceAccountName);
            return this;
        }

        public DataTransferConfigState build() {
            return new DataTransferConfigState(dataRefreshWindowDays, dataSourceId, destinationDatasetId, disabled, displayName, emailPreferences, location, name, notificationPubsubTopic, params, project, schedule, scheduleOptions, sensitiveParams, serviceAccountName);
        }
    }
}
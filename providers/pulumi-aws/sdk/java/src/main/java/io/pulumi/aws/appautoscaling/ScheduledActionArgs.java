// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling;

import io.pulumi.aws.appautoscaling.inputs.ScheduledActionScalableTargetActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * The date and time for the scheduled action to end in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * The name of the scheduled action.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
     * 
     */
    @InputImport(name="scalableDimension", required=true)
    private final Input<String> scalableDimension;

    public Input<String> getScalableDimension() {
        return this.scalableDimension;
    }

    /**
     * The new minimum and maximum capacity. You can set both values or just one. See below
     * 
     */
    @InputImport(name="scalableTargetAction", required=true)
    private final Input<ScheduledActionScalableTargetActionArgs> scalableTargetAction;

    public Input<ScheduledActionScalableTargetActionArgs> getScalableTargetAction() {
        return this.scalableTargetAction;
    }

    /**
     * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). Times for at expressions and cron expressions are evaluated using the time zone configured in `timezone`. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
     * 
     */
    @InputImport(name="schedule", required=true)
    private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    /**
     * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
     * 
     */
    @InputImport(name="serviceNamespace", required=true)
    private final Input<String> serviceNamespace;

    public Input<String> getServiceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * The date and time for the scheduled action to start in RFC 3339 format. The timezone is not affected by the setting of `timezone`.
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    /**
     * The time zone used when setting a scheduled action by using an at or cron expression. Does not affect timezone for `start_time` and `end_time`. Valid values are the [canonical names of the IANA time zones supported by Joda-Time](https://www.joda.org/joda-time/timezones.html), such as `Etc/GMT+9` or `Pacific/Tahiti`. Default is `UTC`.
     * 
     */
    @InputImport(name="timezone")
    private final @Nullable Input<String> timezone;

    public Input<String> getTimezone() {
        return this.timezone == null ? Input.empty() : this.timezone;
    }

    public ScheduledActionArgs(
        @Nullable Input<String> endTime,
        @Nullable Input<String> name,
        Input<String> resourceId,
        Input<String> scalableDimension,
        Input<ScheduledActionScalableTargetActionArgs> scalableTargetAction,
        Input<String> schedule,
        Input<String> serviceNamespace,
        @Nullable Input<String> startTime,
        @Nullable Input<String> timezone) {
        this.endTime = endTime;
        this.name = name;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.scalableDimension = Objects.requireNonNull(scalableDimension, "expected parameter 'scalableDimension' to be non-null");
        this.scalableTargetAction = Objects.requireNonNull(scalableTargetAction, "expected parameter 'scalableTargetAction' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
        this.startTime = startTime;
        this.timezone = timezone;
    }

    private ScheduledActionArgs() {
        this.endTime = Input.empty();
        this.name = Input.empty();
        this.resourceId = Input.empty();
        this.scalableDimension = Input.empty();
        this.scalableTargetAction = Input.empty();
        this.schedule = Input.empty();
        this.serviceNamespace = Input.empty();
        this.startTime = Input.empty();
        this.timezone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> name;
        private Input<String> resourceId;
        private Input<String> scalableDimension;
        private Input<ScheduledActionScalableTargetActionArgs> scalableTargetAction;
        private Input<String> schedule;
        private Input<String> serviceNamespace;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> timezone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.scalableTargetAction = defaults.scalableTargetAction;
    	      this.schedule = defaults.schedule;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.startTime = defaults.startTime;
    	      this.timezone = defaults.timezone;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
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

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setScalableDimension(Input<String> scalableDimension) {
            this.scalableDimension = Objects.requireNonNull(scalableDimension);
            return this;
        }

        public Builder setScalableDimension(String scalableDimension) {
            this.scalableDimension = Input.of(Objects.requireNonNull(scalableDimension));
            return this;
        }

        public Builder setScalableTargetAction(Input<ScheduledActionScalableTargetActionArgs> scalableTargetAction) {
            this.scalableTargetAction = Objects.requireNonNull(scalableTargetAction);
            return this;
        }

        public Builder setScalableTargetAction(ScheduledActionScalableTargetActionArgs scalableTargetAction) {
            this.scalableTargetAction = Input.of(Objects.requireNonNull(scalableTargetAction));
            return this;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setServiceNamespace(Input<String> serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }

        public Builder setServiceNamespace(String serviceNamespace) {
            this.serviceNamespace = Input.of(Objects.requireNonNull(serviceNamespace));
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTimezone(@Nullable Input<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setTimezone(@Nullable String timezone) {
            this.timezone = Input.ofNullable(timezone);
            return this;
        }
        public ScheduledActionArgs build() {
            return new ScheduledActionArgs(endTime, name, resourceId, scalableDimension, scalableTargetAction, schedule, serviceNamespace, startTime, timezone);
        }
    }
}
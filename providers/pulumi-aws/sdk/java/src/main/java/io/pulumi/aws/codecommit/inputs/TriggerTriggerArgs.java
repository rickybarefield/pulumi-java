// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerTriggerArgs Empty = new TriggerTriggerArgs();

    /**
     * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
     * 
     */
    @InputImport(name="branches")
    private final @Nullable Input<List<String>> branches;

    public Input<List<String>> getBranches() {
        return this.branches == null ? Input.empty() : this.branches;
    }

    /**
     * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
     * 
     */
    @InputImport(name="customData")
    private final @Nullable Input<String> customData;

    public Input<String> getCustomData() {
        return this.customData == null ? Input.empty() : this.customData;
    }

    /**
     * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
     * 
     */
    @InputImport(name="destinationArn", required=true)
    private final Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
     * 
     */
    @InputImport(name="events", required=true)
    private final Input<List<String>> events;

    public Input<List<String>> getEvents() {
        return this.events;
    }

    /**
     * The name of the trigger.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public TriggerTriggerArgs(
        @Nullable Input<List<String>> branches,
        @Nullable Input<String> customData,
        Input<String> destinationArn,
        Input<List<String>> events,
        Input<String> name) {
        this.branches = branches;
        this.customData = customData;
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TriggerTriggerArgs() {
        this.branches = Input.empty();
        this.customData = Input.empty();
        this.destinationArn = Input.empty();
        this.events = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> branches;
        private @Nullable Input<String> customData;
        private Input<String> destinationArn;
        private Input<List<String>> events;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branches = defaults.branches;
    	      this.customData = defaults.customData;
    	      this.destinationArn = defaults.destinationArn;
    	      this.events = defaults.events;
    	      this.name = defaults.name;
        }

        public Builder setBranches(@Nullable Input<List<String>> branches) {
            this.branches = branches;
            return this;
        }

        public Builder setBranches(@Nullable List<String> branches) {
            this.branches = Input.ofNullable(branches);
            return this;
        }

        public Builder setCustomData(@Nullable Input<String> customData) {
            this.customData = customData;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = Input.ofNullable(customData);
            return this;
        }

        public Builder setDestinationArn(Input<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Input.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder setEvents(Input<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }

        public Builder setEvents(List<String> events) {
            this.events = Input.of(Objects.requireNonNull(events));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public TriggerTriggerArgs build() {
            return new TriggerTriggerArgs(branches, customData, destinationArn, events, name);
        }
    }
}
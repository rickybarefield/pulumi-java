// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetSqlDbTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectToTargetSqlDbTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlDbTaskPropertiesArgs Empty = new ConnectToTargetSqlDbTaskPropertiesArgs();

    @InputImport(name="input")
    private final @Nullable Input<ConnectToTargetSqlDbTaskInputArgs> input;

    public Input<ConnectToTargetSqlDbTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    @InputImport(name="taskType", required=true)
    private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ConnectToTargetSqlDbTaskPropertiesArgs(
        @Nullable Input<ConnectToTargetSqlDbTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToTargetSqlDbTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlDbTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectToTargetSqlDbTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlDbTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<ConnectToTargetSqlDbTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ConnectToTargetSqlDbTaskInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder setTaskType(Input<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder setTaskType(String taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }

        public ConnectToTargetSqlDbTaskPropertiesArgs build() {
            return new ConnectToTargetSqlDbTaskPropertiesArgs(input, taskType);
        }
    }
}
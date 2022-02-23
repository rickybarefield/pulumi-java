// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs();

    /**
     * The ARN of the destination Kinesis data stream to write to.
     * 
     */
    @InputImport(name="resourceArn", required=true)
    private final Input<String> resourceArn;

    public Input<String> getResourceArn() {
        return this.resourceArn;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs(Input<String> resourceArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs() {
        this.resourceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder setResourceArn(Input<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }

        public Builder setResourceArn(String resourceArn) {
            this.resourceArn = Input.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs(resourceArn);
        }
    }
}
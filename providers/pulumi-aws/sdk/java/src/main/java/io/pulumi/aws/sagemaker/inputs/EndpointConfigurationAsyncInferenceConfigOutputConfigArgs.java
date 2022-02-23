// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs();

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * 
     */
    @InputImport(name="notificationConfig")
    private final @Nullable Input<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig;

    public Input<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Input.empty() : this.notificationConfig;
    }

    /**
     * The Amazon S3 location to upload inference responses to.
     * 
     */
    @InputImport(name="s3OutputPath", required=true)
    private final Input<String> s3OutputPath;

    public Input<String> getS3OutputPath() {
        return this.s3OutputPath;
    }

    public EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig,
        Input<String> s3OutputPath) {
        this.kmsKeyId = kmsKeyId;
        this.notificationConfig = notificationConfig;
        this.s3OutputPath = Objects.requireNonNull(s3OutputPath, "expected parameter 's3OutputPath' to be non-null");
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigArgs() {
        this.kmsKeyId = Input.empty();
        this.notificationConfig = Input.empty();
        this.s3OutputPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig;
        private Input<String> s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setNotificationConfig(@Nullable Input<EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder setNotificationConfig(@Nullable EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Input.ofNullable(notificationConfig);
            return this;
        }

        public Builder setS3OutputPath(Input<String> s3OutputPath) {
            this.s3OutputPath = Objects.requireNonNull(s3OutputPath);
            return this;
        }

        public Builder setS3OutputPath(String s3OutputPath) {
            this.s3OutputPath = Input.of(Objects.requireNonNull(s3OutputPath));
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigOutputConfigArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfigArgs(kmsKeyId, notificationConfig, s3OutputPath);
        }
    }
}
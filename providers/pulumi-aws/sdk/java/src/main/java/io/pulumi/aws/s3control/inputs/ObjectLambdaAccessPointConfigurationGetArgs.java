// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointConfigurationGetArgs Empty = new ObjectLambdaAccessPointConfigurationGetArgs();

    /**
     * Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    @InputImport(name="allowedFeatures")
    private final @Nullable Input<List<String>> allowedFeatures;

    public Input<List<String>> getAllowedFeatures() {
        return this.allowedFeatures == null ? Input.empty() : this.allowedFeatures;
    }

    /**
     * Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    @InputImport(name="cloudWatchMetricsEnabled")
    private final @Nullable Input<Boolean> cloudWatchMetricsEnabled;

    public Input<Boolean> getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled == null ? Input.empty() : this.cloudWatchMetricsEnabled;
    }

    /**
     * Standard access point associated with the Object Lambda Access Point.
     * 
     */
    @InputImport(name="supportingAccessPoint", required=true)
    private final Input<String> supportingAccessPoint;

    public Input<String> getSupportingAccessPoint() {
        return this.supportingAccessPoint;
    }

    /**
     * List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    @InputImport(name="transformationConfigurations", required=true)
    private final Input<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations;

    public Input<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> getTransformationConfigurations() {
        return this.transformationConfigurations;
    }

    public ObjectLambdaAccessPointConfigurationGetArgs(
        @Nullable Input<List<String>> allowedFeatures,
        @Nullable Input<Boolean> cloudWatchMetricsEnabled,
        Input<String> supportingAccessPoint,
        Input<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations) {
        this.allowedFeatures = allowedFeatures;
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint, "expected parameter 'supportingAccessPoint' to be non-null");
        this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations, "expected parameter 'transformationConfigurations' to be non-null");
    }

    private ObjectLambdaAccessPointConfigurationGetArgs() {
        this.allowedFeatures = Input.empty();
        this.cloudWatchMetricsEnabled = Input.empty();
        this.supportingAccessPoint = Input.empty();
        this.transformationConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedFeatures;
        private @Nullable Input<Boolean> cloudWatchMetricsEnabled;
        private Input<String> supportingAccessPoint;
        private Input<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedFeatures = defaults.allowedFeatures;
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.supportingAccessPoint = defaults.supportingAccessPoint;
    	      this.transformationConfigurations = defaults.transformationConfigurations;
        }

        public Builder setAllowedFeatures(@Nullable Input<List<String>> allowedFeatures) {
            this.allowedFeatures = allowedFeatures;
            return this;
        }

        public Builder setAllowedFeatures(@Nullable List<String> allowedFeatures) {
            this.allowedFeatures = Input.ofNullable(allowedFeatures);
            return this;
        }

        public Builder setCloudWatchMetricsEnabled(@Nullable Input<Boolean> cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }

        public Builder setCloudWatchMetricsEnabled(@Nullable Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Input.ofNullable(cloudWatchMetricsEnabled);
            return this;
        }

        public Builder setSupportingAccessPoint(Input<String> supportingAccessPoint) {
            this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint);
            return this;
        }

        public Builder setSupportingAccessPoint(String supportingAccessPoint) {
            this.supportingAccessPoint = Input.of(Objects.requireNonNull(supportingAccessPoint));
            return this;
        }

        public Builder setTransformationConfigurations(Input<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations) {
            this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations);
            return this;
        }

        public Builder setTransformationConfigurations(List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs> transformationConfigurations) {
            this.transformationConfigurations = Input.of(Objects.requireNonNull(transformationConfigurations));
            return this;
        }
        public ObjectLambdaAccessPointConfigurationGetArgs build() {
            return new ObjectLambdaAccessPointConfigurationGetArgs(allowedFeatures, cloudWatchMetricsEnabled, supportingAccessPoint, transformationConfigurations);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.cloudfront.inputs.CloudFrontOriginAccessIdentityConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class CloudFrontOriginAccessIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudFrontOriginAccessIdentityArgs Empty = new CloudFrontOriginAccessIdentityArgs();

    @InputImport(name="cloudFrontOriginAccessIdentityConfig", required=true)
    private final Input<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig;

    public Input<CloudFrontOriginAccessIdentityConfigArgs> getCloudFrontOriginAccessIdentityConfig() {
        return this.cloudFrontOriginAccessIdentityConfig;
    }

    public CloudFrontOriginAccessIdentityArgs(Input<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig) {
        this.cloudFrontOriginAccessIdentityConfig = Objects.requireNonNull(cloudFrontOriginAccessIdentityConfig, "expected parameter 'cloudFrontOriginAccessIdentityConfig' to be non-null");
    }

    private CloudFrontOriginAccessIdentityArgs() {
        this.cloudFrontOriginAccessIdentityConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFrontOriginAccessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFrontOriginAccessIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFrontOriginAccessIdentityConfig = defaults.cloudFrontOriginAccessIdentityConfig;
        }

        public Builder setCloudFrontOriginAccessIdentityConfig(Input<CloudFrontOriginAccessIdentityConfigArgs> cloudFrontOriginAccessIdentityConfig) {
            this.cloudFrontOriginAccessIdentityConfig = Objects.requireNonNull(cloudFrontOriginAccessIdentityConfig);
            return this;
        }

        public Builder setCloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigArgs cloudFrontOriginAccessIdentityConfig) {
            this.cloudFrontOriginAccessIdentityConfig = Input.of(Objects.requireNonNull(cloudFrontOriginAccessIdentityConfig));
            return this;
        }

        public CloudFrontOriginAccessIdentityArgs build() {
            return new CloudFrontOriginAccessIdentityArgs(cloudFrontOriginAccessIdentityConfig);
        }
    }
}
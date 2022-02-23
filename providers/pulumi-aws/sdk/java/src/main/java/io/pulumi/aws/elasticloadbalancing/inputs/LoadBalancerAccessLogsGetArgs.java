// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerAccessLogsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerAccessLogsGetArgs Empty = new LoadBalancerAccessLogsGetArgs();

    /**
     * The S3 bucket name to store the logs in.
     * 
     */
    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The S3 bucket prefix. Logs are stored in the root if not configured.
     * 
     */
    @InputImport(name="bucketPrefix")
    private final @Nullable Input<String> bucketPrefix;

    public Input<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Input.empty() : this.bucketPrefix;
    }

    /**
     * Boolean to enable / disable `access_logs`. Default is `true`
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The publishing interval in minutes. Default: 60 minutes.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    public LoadBalancerAccessLogsGetArgs(
        Input<String> bucket,
        @Nullable Input<String> bucketPrefix,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> interval) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketPrefix = bucketPrefix;
        this.enabled = enabled;
        this.interval = interval;
    }

    private LoadBalancerAccessLogsGetArgs() {
        this.bucket = Input.empty();
        this.bucketPrefix = Input.empty();
        this.enabled = Input.empty();
        this.interval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerAccessLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<String> bucketPrefix;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> interval;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerAccessLogsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setBucketPrefix(@Nullable Input<String> bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = Input.ofNullable(bucketPrefix);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }
        public LoadBalancerAccessLogsGetArgs build() {
            return new LoadBalancerAccessLogsGetArgs(bucket, bucketPrefix, enabled, interval);
        }
    }
}
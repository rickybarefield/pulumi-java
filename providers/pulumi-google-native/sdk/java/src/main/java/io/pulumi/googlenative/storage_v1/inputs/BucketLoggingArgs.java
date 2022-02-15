// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLoggingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLoggingArgs Empty = new BucketLoggingArgs();

    @InputImport(name="logBucket")
    private final @Nullable Input<String> logBucket;

    public Input<String> getLogBucket() {
        return this.logBucket == null ? Input.empty() : this.logBucket;
    }

    @InputImport(name="logObjectPrefix")
    private final @Nullable Input<String> logObjectPrefix;

    public Input<String> getLogObjectPrefix() {
        return this.logObjectPrefix == null ? Input.empty() : this.logObjectPrefix;
    }

    public BucketLoggingArgs(
        @Nullable Input<String> logBucket,
        @Nullable Input<String> logObjectPrefix) {
        this.logBucket = logBucket;
        this.logObjectPrefix = logObjectPrefix;
    }

    private BucketLoggingArgs() {
        this.logBucket = Input.empty();
        this.logObjectPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logBucket;
        private @Nullable Input<String> logObjectPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logBucket = defaults.logBucket;
    	      this.logObjectPrefix = defaults.logObjectPrefix;
        }

        public Builder setLogBucket(@Nullable Input<String> logBucket) {
            this.logBucket = logBucket;
            return this;
        }

        public Builder setLogBucket(@Nullable String logBucket) {
            this.logBucket = Input.ofNullable(logBucket);
            return this;
        }

        public Builder setLogObjectPrefix(@Nullable Input<String> logObjectPrefix) {
            this.logObjectPrefix = logObjectPrefix;
            return this;
        }

        public Builder setLogObjectPrefix(@Nullable String logObjectPrefix) {
            this.logObjectPrefix = Input.ofNullable(logObjectPrefix);
            return this;
        }

        public BucketLoggingArgs build() {
            return new BucketLoggingArgs(logBucket, logObjectPrefix);
        }
    }
}
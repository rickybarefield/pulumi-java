// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineThumbnailConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineThumbnailConfigGetArgs Empty = new PipelineThumbnailConfigGetArgs();

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files.
     * 
     */
    @InputImport(name="bucket")
    private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * The Amazon S3 storage class, Standard or ReducedRedundancy, that you want Elastic Transcoder to assign to the thumbnails that it stores in your Amazon S3 bucket.
     * 
     */
    @InputImport(name="storageClass")
    private final @Nullable Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    public PipelineThumbnailConfigGetArgs(
        @Nullable Input<String> bucket,
        @Nullable Input<String> storageClass) {
        this.bucket = bucket;
        this.storageClass = storageClass;
    }

    private PipelineThumbnailConfigGetArgs() {
        this.bucket = Input.empty();
        this.storageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineThumbnailConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<String> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineThumbnailConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setStorageClass(@Nullable Input<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }
        public PipelineThumbnailConfigGetArgs build() {
            return new PipelineThumbnailConfigGetArgs(bucket, storageClass);
        }
    }
}
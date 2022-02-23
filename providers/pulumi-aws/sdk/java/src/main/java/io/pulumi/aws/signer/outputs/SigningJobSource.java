// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.aws.signer.outputs.SigningJobSourceS3;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class SigningJobSource {
    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    private final SigningJobSourceS3 s3;

    @OutputCustomType.Constructor({"s3"})
    private SigningJobSource(SigningJobSourceS3 s3) {
        this.s3 = Objects.requireNonNull(s3);
    }

    /**
     * A configuration block describing the S3 Destination object: See S3 Destination below for details.
     * 
     */
    public SigningJobSourceS3 getS3() {
        return this.s3;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningJobSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SigningJobSourceS3 s3;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningJobSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3 = defaults.s3;
        }

        public Builder setS3(SigningJobSourceS3 s3) {
            this.s3 = Objects.requireNonNull(s3);
            return this;
        }
        public SigningJobSource build() {
            return new SigningJobSource(s3);
        }
    }
}
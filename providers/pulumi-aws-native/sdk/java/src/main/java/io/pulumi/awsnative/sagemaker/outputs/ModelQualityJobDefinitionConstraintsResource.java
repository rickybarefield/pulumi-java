// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelQualityJobDefinitionConstraintsResource {
    private final @Nullable String s3Uri;

    @OutputCustomType.Constructor({"s3Uri"})
    private ModelQualityJobDefinitionConstraintsResource(@Nullable String s3Uri) {
        this.s3Uri = s3Uri;
    }

    public Optional<String> getS3Uri() {
        return Optional.ofNullable(this.s3Uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionConstraintsResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionConstraintsResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setS3Uri(@Nullable String s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }

        public ModelQualityJobDefinitionConstraintsResource build() {
            return new ModelQualityJobDefinitionConstraintsResource(s3Uri);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.ProjectS3Destination;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectDataDeliveryObject extends io.pulumi.resources.InvokeArgs {

    public static final ProjectDataDeliveryObject Empty = new ProjectDataDeliveryObject();

    @InputImport(name="logGroup")
    private final @Nullable String logGroup;

    public Optional<String> getLogGroup() {
        return this.logGroup == null ? Optional.empty() : Optional.ofNullable(this.logGroup);
    }

    @InputImport(name="s3")
    private final @Nullable ProjectS3Destination s3;

    public Optional<ProjectS3Destination> getS3() {
        return this.s3 == null ? Optional.empty() : Optional.ofNullable(this.s3);
    }

    public ProjectDataDeliveryObject(
        @Nullable String logGroup,
        @Nullable ProjectS3Destination s3) {
        this.logGroup = logGroup;
        this.s3 = s3;
    }

    private ProjectDataDeliveryObject() {
        this.logGroup = null;
        this.s3 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectDataDeliveryObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroup;
        private @Nullable ProjectS3Destination s3;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectDataDeliveryObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroup = defaults.logGroup;
    	      this.s3 = defaults.s3;
        }

        public Builder setLogGroup(@Nullable String logGroup) {
            this.logGroup = logGroup;
            return this;
        }

        public Builder setS3(@Nullable ProjectS3Destination s3) {
            this.s3 = s3;
            return this;
        }

        public ProjectDataDeliveryObject build() {
            return new ProjectDataDeliveryObject(logGroup, s3);
        }
    }
}
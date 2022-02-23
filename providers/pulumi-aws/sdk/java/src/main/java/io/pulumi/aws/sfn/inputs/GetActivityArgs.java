// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sfn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetActivityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetActivityArgs Empty = new GetActivityArgs();

    /**
     * The Amazon Resource Name (ARN) that identifies the activity.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The name that identifies the activity.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public GetActivityArgs(
        @Nullable String arn,
        @Nullable String name) {
        this.arn = arn;
        this.name = name;
    }

    private GetActivityArgs() {
        this.arn = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GetActivityArgs build() {
            return new GetActivityArgs(arn, name);
        }
    }
}
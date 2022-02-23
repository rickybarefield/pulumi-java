// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSolutionStackArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSolutionStackArgs Empty = new GetSolutionStackArgs();

    /**
     * If more than one result is returned, use the most
     * recent solution stack.
     * 
     */
    @InputImport(name="mostRecent")
    private final @Nullable Boolean mostRecent;

    public Optional<Boolean> getMostRecent() {
        return this.mostRecent == null ? Optional.empty() : Optional.ofNullable(this.mostRecent);
    }

    /**
     * A regex string to apply to the solution stack list returned
     * by AWS. See [Elastic Beanstalk Supported Platforms][beanstalk-platforms] from
     * AWS documentation for reference solution stack names.
     * 
     */
    @InputImport(name="nameRegex", required=true)
    private final String nameRegex;

    public String getNameRegex() {
        return this.nameRegex;
    }

    public GetSolutionStackArgs(
        @Nullable Boolean mostRecent,
        String nameRegex) {
        this.mostRecent = mostRecent;
        this.nameRegex = Objects.requireNonNull(nameRegex, "expected parameter 'nameRegex' to be non-null");
    }

    private GetSolutionStackArgs() {
        this.mostRecent = null;
        this.nameRegex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSolutionStackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean mostRecent;
        private String nameRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSolutionStackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mostRecent = defaults.mostRecent;
    	      this.nameRegex = defaults.nameRegex;
        }

        public Builder setMostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }

        public Builder setNameRegex(String nameRegex) {
            this.nameRegex = Objects.requireNonNull(nameRegex);
            return this;
        }
        public GetSolutionStackArgs build() {
            return new GetSolutionStackArgs(mostRecent, nameRegex);
        }
    }
}
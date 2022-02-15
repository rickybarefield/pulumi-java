// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    @InputImport(name="projectId")
    private final @Nullable String projectId;

    public Optional<String> getProjectId() {
        return this.projectId == null ? Optional.empty() : Optional.ofNullable(this.projectId);
    }

    public GetProjectArgs(@Nullable String projectId) {
        this.projectId = projectId;
    }

    private GetProjectArgs() {
        this.projectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }

        public GetProjectArgs build() {
            return new GetProjectArgs(projectId);
        }
    }
}
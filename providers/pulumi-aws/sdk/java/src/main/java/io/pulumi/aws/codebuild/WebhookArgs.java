// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.codebuild.inputs.WebhookFilterGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * A regular expression used to determine which branches get built. Default is all branches are built. It is recommended to use `filter_group` over `branch_filter`.
     * 
     */
    @InputImport(name="branchFilter")
    private final @Nullable Input<String> branchFilter;

    public Input<String> getBranchFilter() {
        return this.branchFilter == null ? Input.empty() : this.branchFilter;
    }

    /**
     * The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
     * 
     */
    @InputImport(name="buildType")
    private final @Nullable Input<String> buildType;

    public Input<String> getBuildType() {
        return this.buildType == null ? Input.empty() : this.buildType;
    }

    /**
     * Information about the webhook's trigger. Filter group blocks are documented below.
     * 
     */
    @InputImport(name="filterGroups")
    private final @Nullable Input<List<WebhookFilterGroupArgs>> filterGroups;

    public Input<List<WebhookFilterGroupArgs>> getFilterGroups() {
        return this.filterGroups == null ? Input.empty() : this.filterGroups;
    }

    /**
     * The name of the build project.
     * 
     */
    @InputImport(name="projectName", required=true)
    private final Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName;
    }

    public WebhookArgs(
        @Nullable Input<String> branchFilter,
        @Nullable Input<String> buildType,
        @Nullable Input<List<WebhookFilterGroupArgs>> filterGroups,
        Input<String> projectName) {
        this.branchFilter = branchFilter;
        this.buildType = buildType;
        this.filterGroups = filterGroups;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
    }

    private WebhookArgs() {
        this.branchFilter = Input.empty();
        this.buildType = Input.empty();
        this.filterGroups = Input.empty();
        this.projectName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> branchFilter;
        private @Nullable Input<String> buildType;
        private @Nullable Input<List<WebhookFilterGroupArgs>> filterGroups;
        private Input<String> projectName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branchFilter = defaults.branchFilter;
    	      this.buildType = defaults.buildType;
    	      this.filterGroups = defaults.filterGroups;
    	      this.projectName = defaults.projectName;
        }

        public Builder setBranchFilter(@Nullable Input<String> branchFilter) {
            this.branchFilter = branchFilter;
            return this;
        }

        public Builder setBranchFilter(@Nullable String branchFilter) {
            this.branchFilter = Input.ofNullable(branchFilter);
            return this;
        }

        public Builder setBuildType(@Nullable Input<String> buildType) {
            this.buildType = buildType;
            return this;
        }

        public Builder setBuildType(@Nullable String buildType) {
            this.buildType = Input.ofNullable(buildType);
            return this;
        }

        public Builder setFilterGroups(@Nullable Input<List<WebhookFilterGroupArgs>> filterGroups) {
            this.filterGroups = filterGroups;
            return this;
        }

        public Builder setFilterGroups(@Nullable List<WebhookFilterGroupArgs> filterGroups) {
            this.filterGroups = Input.ofNullable(filterGroups);
            return this;
        }

        public Builder setProjectName(Input<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Input.of(Objects.requireNonNull(projectName));
            return this;
        }
        public WebhookArgs build() {
            return new WebhookArgs(branchFilter, buildType, filterGroups, projectName);
        }
    }
}
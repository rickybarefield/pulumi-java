// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs Empty = new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs();

    @InputImport(name="cloudRepo")
    private final @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo;

    public Input<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> getCloudRepo() {
        return this.cloudRepo == null ? Input.empty() : this.cloudRepo;
    }

    @InputImport(name="gerrit")
    private final @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit;

    public Input<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> getGerrit() {
        return this.gerrit == null ? Input.empty() : this.gerrit;
    }

    @InputImport(name="git")
    private final @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git;

    public Input<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> getGit() {
        return this.git == null ? Input.empty() : this.git;
    }

    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(
        @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo,
        @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit,
        @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git,
        @Nullable Input<Map<String,String>> labels) {
        this.cloudRepo = cloudRepo;
        this.gerrit = gerrit;
        this.git = git;
        this.labels = labels;
    }

    private GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs() {
        this.cloudRepo = Input.empty();
        this.gerrit = Input.empty();
        this.git = Input.empty();
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo;
        private @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit;
        private @Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git;
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRepo = defaults.cloudRepo;
    	      this.gerrit = defaults.gerrit;
    	      this.git = defaults.git;
    	      this.labels = defaults.labels;
        }

        public Builder setCloudRepo(@Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs> cloudRepo) {
            this.cloudRepo = cloudRepo;
            return this;
        }

        public Builder setCloudRepo(@Nullable GoogleDevtoolsContaineranalysisV1alpha1CloudRepoSourceContextArgs cloudRepo) {
            this.cloudRepo = Input.ofNullable(cloudRepo);
            return this;
        }

        public Builder setGerrit(@Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs> gerrit) {
            this.gerrit = gerrit;
            return this;
        }

        public Builder setGerrit(@Nullable GoogleDevtoolsContaineranalysisV1alpha1GerritSourceContextArgs gerrit) {
            this.gerrit = Input.ofNullable(gerrit);
            return this;
        }

        public Builder setGit(@Nullable Input<GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs> git) {
            this.git = git;
            return this;
        }

        public Builder setGit(@Nullable GoogleDevtoolsContaineranalysisV1alpha1GitSourceContextArgs git) {
            this.git = Input.ofNullable(git);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs build() {
            return new GoogleDevtoolsContaineranalysisV1alpha1SourceContextArgs(cloudRepo, gerrit, git, labels);
        }
    }
}
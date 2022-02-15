// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelReferenceArgs Empty = new ModelReferenceArgs();

    @InputImport(name="datasetId")
    private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    @InputImport(name="modelId")
    private final @Nullable Input<String> modelId;

    public Input<String> getModelId() {
        return this.modelId == null ? Input.empty() : this.modelId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ModelReferenceArgs(
        @Nullable Input<String> datasetId,
        @Nullable Input<String> modelId,
        @Nullable Input<String> project) {
        this.datasetId = datasetId;
        this.modelId = modelId;
        this.project = project;
    }

    private ModelReferenceArgs() {
        this.datasetId = Input.empty();
        this.modelId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> modelId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder setModelId(@Nullable Input<String> modelId) {
            this.modelId = modelId;
            return this;
        }

        public Builder setModelId(@Nullable String modelId) {
            this.modelId = Input.ofNullable(modelId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public ModelReferenceArgs build() {
            return new ModelReferenceArgs(datasetId, modelId, project);
        }
    }
}
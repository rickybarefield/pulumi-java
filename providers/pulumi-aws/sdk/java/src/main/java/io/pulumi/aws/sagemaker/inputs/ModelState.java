// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.ModelContainerGetArgs;
import io.pulumi.aws.sagemaker.inputs.ModelInferenceExecutionConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.ModelPrimaryContainerGetArgs;
import io.pulumi.aws.sagemaker.inputs.ModelVpcConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ModelState extends io.pulumi.resources.ResourceArgs {

    public static final ModelState Empty = new ModelState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this model.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies containers in the inference pipeline. If not specified, the `primary_container` argument is required. Fields are documented below.
     * 
     */
    @InputImport(name="containers")
    private final @Nullable Input<List<ModelContainerGetArgs>> containers;

    public Input<List<ModelContainerGetArgs>> getContainers() {
        return this.containers == null ? Input.empty() : this.containers;
    }

    /**
     * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
     * 
     */
    @InputImport(name="enableNetworkIsolation")
    private final @Nullable Input<Boolean> enableNetworkIsolation;

    public Input<Boolean> getEnableNetworkIsolation() {
        return this.enableNetworkIsolation == null ? Input.empty() : this.enableNetworkIsolation;
    }

    /**
     * A role that SageMaker can assume to access model artifacts and docker images for deployment.
     * 
     */
    @InputImport(name="executionRoleArn")
    private final @Nullable Input<String> executionRoleArn;

    public Input<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Input.empty() : this.executionRoleArn;
    }

    /**
     * Specifies details of how containers in a multi-container endpoint are called. see Inference Execution Config.
     * 
     */
    @InputImport(name="inferenceExecutionConfig")
    private final @Nullable Input<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig;

    public Input<ModelInferenceExecutionConfigGetArgs> getInferenceExecutionConfig() {
        return this.inferenceExecutionConfig == null ? Input.empty() : this.inferenceExecutionConfig;
    }

    /**
     * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
     * 
     */
    @InputImport(name="primaryContainer")
    private final @Nullable Input<ModelPrimaryContainerGetArgs> primaryContainer;

    public Input<ModelPrimaryContainerGetArgs> getPrimaryContainer() {
        return this.primaryContainer == null ? Input.empty() : this.primaryContainer;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
     * 
     */
    @InputImport(name="vpcConfig")
    private final @Nullable Input<ModelVpcConfigGetArgs> vpcConfig;

    public Input<ModelVpcConfigGetArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public ModelState(
        @Nullable Input<String> arn,
        @Nullable Input<List<ModelContainerGetArgs>> containers,
        @Nullable Input<Boolean> enableNetworkIsolation,
        @Nullable Input<String> executionRoleArn,
        @Nullable Input<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig,
        @Nullable Input<String> name,
        @Nullable Input<ModelPrimaryContainerGetArgs> primaryContainer,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<ModelVpcConfigGetArgs> vpcConfig) {
        this.arn = arn;
        this.containers = containers;
        this.enableNetworkIsolation = enableNetworkIsolation;
        this.executionRoleArn = executionRoleArn;
        this.inferenceExecutionConfig = inferenceExecutionConfig;
        this.name = name;
        this.primaryContainer = primaryContainer;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcConfig = vpcConfig;
    }

    private ModelState() {
        this.arn = Input.empty();
        this.containers = Input.empty();
        this.enableNetworkIsolation = Input.empty();
        this.executionRoleArn = Input.empty();
        this.inferenceExecutionConfig = Input.empty();
        this.name = Input.empty();
        this.primaryContainer = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<ModelContainerGetArgs>> containers;
        private @Nullable Input<Boolean> enableNetworkIsolation;
        private @Nullable Input<String> executionRoleArn;
        private @Nullable Input<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<ModelPrimaryContainerGetArgs> primaryContainer;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<ModelVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.containers = defaults.containers;
    	      this.enableNetworkIsolation = defaults.enableNetworkIsolation;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.inferenceExecutionConfig = defaults.inferenceExecutionConfig;
    	      this.name = defaults.name;
    	      this.primaryContainer = defaults.primaryContainer;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setContainers(@Nullable Input<List<ModelContainerGetArgs>> containers) {
            this.containers = containers;
            return this;
        }

        public Builder setContainers(@Nullable List<ModelContainerGetArgs> containers) {
            this.containers = Input.ofNullable(containers);
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Input<Boolean> enableNetworkIsolation) {
            this.enableNetworkIsolation = enableNetworkIsolation;
            return this;
        }

        public Builder setEnableNetworkIsolation(@Nullable Boolean enableNetworkIsolation) {
            this.enableNetworkIsolation = Input.ofNullable(enableNetworkIsolation);
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable Input<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Input.ofNullable(executionRoleArn);
            return this;
        }

        public Builder setInferenceExecutionConfig(@Nullable Input<ModelInferenceExecutionConfigGetArgs> inferenceExecutionConfig) {
            this.inferenceExecutionConfig = inferenceExecutionConfig;
            return this;
        }

        public Builder setInferenceExecutionConfig(@Nullable ModelInferenceExecutionConfigGetArgs inferenceExecutionConfig) {
            this.inferenceExecutionConfig = Input.ofNullable(inferenceExecutionConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPrimaryContainer(@Nullable Input<ModelPrimaryContainerGetArgs> primaryContainer) {
            this.primaryContainer = primaryContainer;
            return this;
        }

        public Builder setPrimaryContainer(@Nullable ModelPrimaryContainerGetArgs primaryContainer) {
            this.primaryContainer = Input.ofNullable(primaryContainer);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<ModelVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable ModelVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public ModelState build() {
            return new ModelState(arn, containers, enableNetworkIsolation, executionRoleArn, inferenceExecutionConfig, name, primaryContainer, tags, tagsAll, vpcConfig);
        }
    }
}
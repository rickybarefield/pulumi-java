// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.PipelineSourceTriggerDescriptorResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineTriggerDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineTriggerDescriptorResponse Empty = new PipelineTriggerDescriptorResponse();

    @InputImport(name="sourceTrigger")
    private final @Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger;

    public Optional<PipelineSourceTriggerDescriptorResponse> getSourceTrigger() {
        return this.sourceTrigger == null ? Optional.empty() : Optional.ofNullable(this.sourceTrigger);
    }

    public PipelineTriggerDescriptorResponse(@Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
    }

    private PipelineTriggerDescriptorResponse() {
        this.sourceTrigger = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTriggerDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTriggerDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceTrigger = defaults.sourceTrigger;
        }

        public Builder setSourceTrigger(@Nullable PipelineSourceTriggerDescriptorResponse sourceTrigger) {
            this.sourceTrigger = sourceTrigger;
            return this;
        }

        public PipelineTriggerDescriptorResponse build() {
            return new PipelineTriggerDescriptorResponse(sourceTrigger);
        }
    }
}
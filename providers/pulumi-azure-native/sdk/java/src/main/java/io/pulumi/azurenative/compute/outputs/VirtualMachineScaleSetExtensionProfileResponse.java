// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetExtensionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetExtensionProfileResponse {
    private final @Nullable List<VirtualMachineScaleSetExtensionResponse> extensions;
    private final @Nullable String extensionsTimeBudget;

    @OutputCustomType.Constructor({"extensions","extensionsTimeBudget"})
    private VirtualMachineScaleSetExtensionProfileResponse(
        @Nullable List<VirtualMachineScaleSetExtensionResponse> extensions,
        @Nullable String extensionsTimeBudget) {
        this.extensions = extensions;
        this.extensionsTimeBudget = extensionsTimeBudget;
    }

    public List<VirtualMachineScaleSetExtensionResponse> getExtensions() {
        return this.extensions == null ? List.of() : this.extensions;
    }
    public Optional<String> getExtensionsTimeBudget() {
        return Optional.ofNullable(this.extensionsTimeBudget);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetExtensionProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<VirtualMachineScaleSetExtensionResponse> extensions;
        private @Nullable String extensionsTimeBudget;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.extensionsTimeBudget = defaults.extensionsTimeBudget;
        }

        public Builder setExtensions(@Nullable List<VirtualMachineScaleSetExtensionResponse> extensions) {
            this.extensions = extensions;
            return this;
        }

        public Builder setExtensionsTimeBudget(@Nullable String extensionsTimeBudget) {
            this.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }

        public VirtualMachineScaleSetExtensionProfileResponse build() {
            return new VirtualMachineScaleSetExtensionProfileResponse(extensions, extensionsTimeBudget);
        }
    }
}
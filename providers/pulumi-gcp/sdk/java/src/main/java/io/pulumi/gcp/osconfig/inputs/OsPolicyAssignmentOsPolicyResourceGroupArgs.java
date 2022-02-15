// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupArgs();

    @InputImport(name="inventoryFilters")
    private final @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> getInventoryFilters() {
        return this.inventoryFilters == null ? Input.empty() : this.inventoryFilters;
    }

    @InputImport(name="resources", required=true)
    private final Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> getResources() {
        return this.resources;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupArgs(
        @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters,
        Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupArgs() {
        this.inventoryFilters = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters;
        private Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder setInventoryFilters(@Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters) {
            this.inventoryFilters = inventoryFilters;
            return this;
        }

        public Builder setInventoryFilters(@Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs> inventoryFilters) {
            this.inventoryFilters = Input.ofNullable(inventoryFilters);
            return this;
        }

        public Builder setResources(Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }

        public OsPolicyAssignmentOsPolicyResourceGroupArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupArgs(inventoryFilters, resources);
        }
    }
}
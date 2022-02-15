// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.TestBaseAccountSKUCapabilityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TestBaseAccountSKUResponse extends io.pulumi.resources.InvokeArgs {

    public static final TestBaseAccountSKUResponse Empty = new TestBaseAccountSKUResponse();

    @InputImport(name="capabilities", required=true)
    private final List<TestBaseAccountSKUCapabilityResponse> capabilities;

    public List<TestBaseAccountSKUCapabilityResponse> getCapabilities() {
        return this.capabilities;
    }

    @InputImport(name="locations")
    private final @Nullable List<String> locations;

    public List<String> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="resourceType")
    private final @Nullable String resourceType;

    public Optional<String> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    @InputImport(name="tier", required=true)
    private final String tier;

    public String getTier() {
        return this.tier;
    }

    public TestBaseAccountSKUResponse(
        List<TestBaseAccountSKUCapabilityResponse> capabilities,
        @Nullable List<String> locations,
        String name,
        @Nullable String resourceType,
        String tier) {
        this.capabilities = Objects.requireNonNull(capabilities, "expected parameter 'capabilities' to be non-null");
        this.locations = locations;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceType = resourceType;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private TestBaseAccountSKUResponse() {
        this.capabilities = List.of();
        this.locations = List.of();
        this.name = null;
        this.resourceType = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TestBaseAccountSKUResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TestBaseAccountSKUCapabilityResponse> capabilities;
        private @Nullable List<String> locations;
        private String name;
        private @Nullable String resourceType;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(TestBaseAccountSKUResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.resourceType = defaults.resourceType;
    	      this.tier = defaults.tier;
        }

        public Builder setCapabilities(List<TestBaseAccountSKUCapabilityResponse> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public TestBaseAccountSKUResponse build() {
            return new TestBaseAccountSKUResponse(capabilities, locations, name, resourceType, tier);
        }
    }
}
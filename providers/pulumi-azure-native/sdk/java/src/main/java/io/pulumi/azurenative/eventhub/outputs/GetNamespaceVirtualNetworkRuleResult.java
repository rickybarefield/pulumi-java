// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceVirtualNetworkRuleResult {
    private final String id;
    private final String name;
    private final String type;
    private final @Nullable String virtualNetworkSubnetId;

    @OutputCustomType.Constructor({"id","name","type","virtualNetworkSubnetId"})
    private GetNamespaceVirtualNetworkRuleResult(
        String id,
        String name,
        String type,
        @Nullable String virtualNetworkSubnetId) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVirtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceVirtualNetworkRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String type;
        private @Nullable String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceVirtualNetworkRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public GetNamespaceVirtualNetworkRuleResult build() {
            return new GetNamespaceVirtualNetworkRuleResult(id, name, type, virtualNetworkSubnetId);
        }
    }
}
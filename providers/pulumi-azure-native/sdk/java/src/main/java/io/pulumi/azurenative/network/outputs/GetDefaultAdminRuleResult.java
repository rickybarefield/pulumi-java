// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import io.pulumi.azurenative.network.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDefaultAdminRuleResult {
    private final String access;
    private final String description;
    private final List<String> destinationPortRanges;
    private final List<AddressPrefixItemResponse> destinations;
    private final String direction;
    private final String displayName;
    private final String etag;
    private final @Nullable String flag;
    private final String id;
    private final String kind;
    private final String name;
    private final Integer priority;
    private final String protocol;
    private final String provisioningState;
    private final List<String> sourcePortRanges;
    private final List<AddressPrefixItemResponse> sources;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"access","description","destinationPortRanges","destinations","direction","displayName","etag","flag","id","kind","name","priority","protocol","provisioningState","sourcePortRanges","sources","systemData","type"})
    private GetDefaultAdminRuleResult(
        String access,
        String description,
        List<String> destinationPortRanges,
        List<AddressPrefixItemResponse> destinations,
        String direction,
        String displayName,
        String etag,
        @Nullable String flag,
        String id,
        String kind,
        String name,
        Integer priority,
        String protocol,
        String provisioningState,
        List<String> sourcePortRanges,
        List<AddressPrefixItemResponse> sources,
        SystemDataResponse systemData,
        String type) {
        this.access = Objects.requireNonNull(access);
        this.description = Objects.requireNonNull(description);
        this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
        this.destinations = Objects.requireNonNull(destinations);
        this.direction = Objects.requireNonNull(direction);
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = Objects.requireNonNull(etag);
        this.flag = flag;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
        this.protocol = Objects.requireNonNull(protocol);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
        this.sources = Objects.requireNonNull(sources);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getAccess() {
        return this.access;
    }
    public String getDescription() {
        return this.description;
    }
    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges;
    }
    public List<AddressPrefixItemResponse> getDestinations() {
        return this.destinations;
    }
    public String getDirection() {
        return this.direction;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getFlag() {
        return Optional.ofNullable(this.flag);
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public Integer getPriority() {
        return this.priority;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges;
    }
    public List<AddressPrefixItemResponse> getSources() {
        return this.sources;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultAdminRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private String etag;
        private @Nullable String flag;
        private String id;
        private String kind;
        private String name;
        private Integer priority;
        private String protocol;
        private String provisioningState;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultAdminRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAccess(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDestinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }

        public Builder setDestinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFlag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }

        public Builder setSources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetDefaultAdminRuleResult build() {
            return new GetDefaultAdminRuleResult(access, description, destinationPortRanges, destinations, direction, displayName, etag, flag, id, kind, name, priority, protocol, provisioningState, sourcePortRanges, sources, systemData, type);
        }
    }
}
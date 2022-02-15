// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobAgentResult {
    private final String databaseId;
    private final String id;
    private final String location;
    private final String name;
    private final @Nullable SkuResponse sku;
    private final String state;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"databaseId","id","location","name","sku","state","tags","type"})
    private GetJobAgentResult(
        String databaseId,
        String id,
        String location,
        String name,
        @Nullable SkuResponse sku,
        String state,
        @Nullable Map<String,String> tags,
        String type) {
        this.databaseId = Objects.requireNonNull(databaseId);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.sku = sku;
        this.state = Objects.requireNonNull(state);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getDatabaseId() {
        return this.databaseId;
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobAgentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseId;
        private String id;
        private String location;
        private String name;
        private @Nullable SkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobAgentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDatabaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetJobAgentResult build() {
            return new GetJobAgentResult(databaseId, id, location, name, sku, state, tags, type);
        }
    }
}
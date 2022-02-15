// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListManagedClusterAccessProfileResult {
    private final String id;
    private final @Nullable String kubeConfig;
    private final String location;
    private final String name;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"id","kubeConfig","location","name","tags","type"})
    private ListManagedClusterAccessProfileResult(
        String id,
        @Nullable String kubeConfig,
        String location,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.kubeConfig = kubeConfig;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getKubeConfig() {
        return Optional.ofNullable(this.kubeConfig);
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
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

    public static Builder builder(ListManagedClusterAccessProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String kubeConfig;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListManagedClusterAccessProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kubeConfig = defaults.kubeConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKubeConfig(@Nullable String kubeConfig) {
            this.kubeConfig = kubeConfig;
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

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ListManagedClusterAccessProfileResult build() {
            return new ListManagedClusterAccessProfileResult(id, kubeConfig, location, name, tags, type);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StaticSiteUserARMResourceResponse {
    private final String displayName;
    private final String id;
    private final @Nullable String kind;
    private final String name;
    private final String provider;
    private final @Nullable String roles;
    private final String type;
    private final String userId;

    @OutputCustomType.Constructor({"displayName","id","kind","name","provider","roles","type","userId"})
    private StaticSiteUserARMResourceResponse(
        String displayName,
        String id,
        @Nullable String kind,
        String name,
        String provider,
        @Nullable String roles,
        String type,
        String userId) {
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.provider = Objects.requireNonNull(provider);
        this.roles = roles;
        this.type = Objects.requireNonNull(type);
        this.userId = Objects.requireNonNull(userId);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getName() {
        return this.name;
    }
    public String getProvider() {
        return this.provider;
    }
    public Optional<String> getRoles() {
        return Optional.ofNullable(this.roles);
    }
    public String getType() {
        return this.type;
    }
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteUserARMResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private @Nullable String kind;
        private String name;
        private String provider;
        private @Nullable String roles;
        private String type;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteUserARMResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.userId = defaults.userId;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setRoles(@Nullable String roles) {
            this.roles = roles;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public StaticSiteUserARMResourceResponse build() {
            return new StaticSiteUserARMResourceResponse(displayName, id, kind, name, provider, roles, type, userId);
        }
    }
}
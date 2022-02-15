// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationRoleResult {
    private final Boolean deleted;
    private final String description;
    private final String etag;
    private final List<String> includedPermissions;
    private final String name;
    private final String stage;
    private final String title;

    @OutputCustomType.Constructor({"deleted","description","etag","includedPermissions","name","stage","title"})
    private GetOrganizationRoleResult(
        Boolean deleted,
        String description,
        String etag,
        List<String> includedPermissions,
        String name,
        String stage,
        String title) {
        this.deleted = Objects.requireNonNull(deleted);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.includedPermissions = Objects.requireNonNull(includedPermissions);
        this.name = Objects.requireNonNull(name);
        this.stage = Objects.requireNonNull(stage);
        this.title = Objects.requireNonNull(title);
    }

    public Boolean getDeleted() {
        return this.deleted;
    }
    public String getDescription() {
        return this.description;
    }
    public String getEtag() {
        return this.etag;
    }
    public List<String> getIncludedPermissions() {
        return this.includedPermissions;
    }
    public String getName() {
        return this.name;
    }
    public String getStage() {
        return this.stage;
    }
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleted;
        private String description;
        private String etag;
        private List<String> includedPermissions;
        private String name;
        private String stage;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.includedPermissions = defaults.includedPermissions;
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setDeleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setIncludedPermissions(List<String> includedPermissions) {
            this.includedPermissions = Objects.requireNonNull(includedPermissions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GetOrganizationRoleResult build() {
            return new GetOrganizationRoleResult(deleted, description, etag, includedPermissions, name, stage, title);
        }
    }
}
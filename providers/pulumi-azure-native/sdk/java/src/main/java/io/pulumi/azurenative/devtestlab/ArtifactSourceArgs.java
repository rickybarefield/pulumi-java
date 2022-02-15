// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.EnableStatus;
import io.pulumi.azurenative.devtestlab.enums.SourceControlType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArtifactSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactSourceArgs Empty = new ArtifactSourceArgs();

    @InputImport(name="armTemplateFolderPath")
    private final @Nullable Input<String> armTemplateFolderPath;

    public Input<String> getArmTemplateFolderPath() {
        return this.armTemplateFolderPath == null ? Input.empty() : this.armTemplateFolderPath;
    }

    @InputImport(name="branchRef")
    private final @Nullable Input<String> branchRef;

    public Input<String> getBranchRef() {
        return this.branchRef == null ? Input.empty() : this.branchRef;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="folderPath")
    private final @Nullable Input<String> folderPath;

    public Input<String> getFolderPath() {
        return this.folderPath == null ? Input.empty() : this.folderPath;
    }

    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="securityToken")
    private final @Nullable Input<String> securityToken;

    public Input<String> getSecurityToken() {
        return this.securityToken == null ? Input.empty() : this.securityToken;
    }

    @InputImport(name="sourceType")
    private final @Nullable Input<Either<String,SourceControlType>> sourceType;

    public Input<Either<String,SourceControlType>> getSourceType() {
        return this.sourceType == null ? Input.empty() : this.sourceType;
    }

    @InputImport(name="status")
    private final @Nullable Input<Either<String,EnableStatus>> status;

    public Input<Either<String,EnableStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public ArtifactSourceArgs(
        @Nullable Input<String> armTemplateFolderPath,
        @Nullable Input<String> branchRef,
        @Nullable Input<String> displayName,
        @Nullable Input<String> folderPath,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> securityToken,
        @Nullable Input<Either<String,SourceControlType>> sourceType,
        @Nullable Input<Either<String,EnableStatus>> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uri) {
        this.armTemplateFolderPath = armTemplateFolderPath;
        this.branchRef = branchRef;
        this.displayName = displayName;
        this.folderPath = folderPath;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityToken = securityToken;
        this.sourceType = sourceType;
        this.status = status;
        this.tags = tags;
        this.uri = uri;
    }

    private ArtifactSourceArgs() {
        this.armTemplateFolderPath = Input.empty();
        this.branchRef = Input.empty();
        this.displayName = Input.empty();
        this.folderPath = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.securityToken = Input.empty();
        this.sourceType = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> armTemplateFolderPath;
        private @Nullable Input<String> branchRef;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> folderPath;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> securityToken;
        private @Nullable Input<Either<String,SourceControlType>> sourceType;
        private @Nullable Input<Either<String,EnableStatus>> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.armTemplateFolderPath = defaults.armTemplateFolderPath;
    	      this.branchRef = defaults.branchRef;
    	      this.displayName = defaults.displayName;
    	      this.folderPath = defaults.folderPath;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityToken = defaults.securityToken;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.uri = defaults.uri;
        }

        public Builder setArmTemplateFolderPath(@Nullable Input<String> armTemplateFolderPath) {
            this.armTemplateFolderPath = armTemplateFolderPath;
            return this;
        }

        public Builder setArmTemplateFolderPath(@Nullable String armTemplateFolderPath) {
            this.armTemplateFolderPath = Input.ofNullable(armTemplateFolderPath);
            return this;
        }

        public Builder setBranchRef(@Nullable Input<String> branchRef) {
            this.branchRef = branchRef;
            return this;
        }

        public Builder setBranchRef(@Nullable String branchRef) {
            this.branchRef = Input.ofNullable(branchRef);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFolderPath(@Nullable Input<String> folderPath) {
            this.folderPath = folderPath;
            return this;
        }

        public Builder setFolderPath(@Nullable String folderPath) {
            this.folderPath = Input.ofNullable(folderPath);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSecurityToken(@Nullable Input<String> securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public Builder setSecurityToken(@Nullable String securityToken) {
            this.securityToken = Input.ofNullable(securityToken);
            return this;
        }

        public Builder setSourceType(@Nullable Input<Either<String,SourceControlType>> sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder setSourceType(@Nullable Either<String,SourceControlType> sourceType) {
            this.sourceType = Input.ofNullable(sourceType);
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,EnableStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,EnableStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }

        public ArtifactSourceArgs build() {
            return new ArtifactSourceArgs(armTemplateFolderPath, branchRef, displayName, folderPath, labName, location, name, resourceGroupName, securityToken, sourceType, status, tags, uri);
        }
    }
}
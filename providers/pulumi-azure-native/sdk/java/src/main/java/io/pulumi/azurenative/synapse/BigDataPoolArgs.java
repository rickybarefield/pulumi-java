// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.NodeSize;
import io.pulumi.azurenative.synapse.enums.NodeSizeFamily;
import io.pulumi.azurenative.synapse.inputs.AutoPausePropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.AutoScalePropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.DynamicExecutorAllocationArgs;
import io.pulumi.azurenative.synapse.inputs.LibraryInfoArgs;
import io.pulumi.azurenative.synapse.inputs.LibraryRequirementsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BigDataPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final BigDataPoolArgs Empty = new BigDataPoolArgs();

    @InputImport(name="autoPause")
    private final @Nullable Input<AutoPausePropertiesArgs> autoPause;

    public Input<AutoPausePropertiesArgs> getAutoPause() {
        return this.autoPause == null ? Input.empty() : this.autoPause;
    }

    @InputImport(name="autoScale")
    private final @Nullable Input<AutoScalePropertiesArgs> autoScale;

    public Input<AutoScalePropertiesArgs> getAutoScale() {
        return this.autoScale == null ? Input.empty() : this.autoScale;
    }

    @InputImport(name="bigDataPoolName")
    private final @Nullable Input<String> bigDataPoolName;

    public Input<String> getBigDataPoolName() {
        return this.bigDataPoolName == null ? Input.empty() : this.bigDataPoolName;
    }

    @InputImport(name="cacheSize")
    private final @Nullable Input<Integer> cacheSize;

    public Input<Integer> getCacheSize() {
        return this.cacheSize == null ? Input.empty() : this.cacheSize;
    }

    @InputImport(name="creationDate")
    private final @Nullable Input<String> creationDate;

    public Input<String> getCreationDate() {
        return this.creationDate == null ? Input.empty() : this.creationDate;
    }

    @InputImport(name="customLibraries")
    private final @Nullable Input<List<LibraryInfoArgs>> customLibraries;

    public Input<List<LibraryInfoArgs>> getCustomLibraries() {
        return this.customLibraries == null ? Input.empty() : this.customLibraries;
    }

    @InputImport(name="defaultSparkLogFolder")
    private final @Nullable Input<String> defaultSparkLogFolder;

    public Input<String> getDefaultSparkLogFolder() {
        return this.defaultSparkLogFolder == null ? Input.empty() : this.defaultSparkLogFolder;
    }

    @InputImport(name="dynamicExecutorAllocation")
    private final @Nullable Input<DynamicExecutorAllocationArgs> dynamicExecutorAllocation;

    public Input<DynamicExecutorAllocationArgs> getDynamicExecutorAllocation() {
        return this.dynamicExecutorAllocation == null ? Input.empty() : this.dynamicExecutorAllocation;
    }

    @InputImport(name="force")
    private final @Nullable Input<Boolean> force;

    public Input<Boolean> getForce() {
        return this.force == null ? Input.empty() : this.force;
    }

    @InputImport(name="isComputeIsolationEnabled")
    private final @Nullable Input<Boolean> isComputeIsolationEnabled;

    public Input<Boolean> getIsComputeIsolationEnabled() {
        return this.isComputeIsolationEnabled == null ? Input.empty() : this.isComputeIsolationEnabled;
    }

    @InputImport(name="libraryRequirements")
    private final @Nullable Input<LibraryRequirementsArgs> libraryRequirements;

    public Input<LibraryRequirementsArgs> getLibraryRequirements() {
        return this.libraryRequirements == null ? Input.empty() : this.libraryRequirements;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="nodeCount")
    private final @Nullable Input<Integer> nodeCount;

    public Input<Integer> getNodeCount() {
        return this.nodeCount == null ? Input.empty() : this.nodeCount;
    }

    @InputImport(name="nodeSize")
    private final @Nullable Input<Either<String,NodeSize>> nodeSize;

    public Input<Either<String,NodeSize>> getNodeSize() {
        return this.nodeSize == null ? Input.empty() : this.nodeSize;
    }

    @InputImport(name="nodeSizeFamily")
    private final @Nullable Input<Either<String,NodeSizeFamily>> nodeSizeFamily;

    public Input<Either<String,NodeSizeFamily>> getNodeSizeFamily() {
        return this.nodeSizeFamily == null ? Input.empty() : this.nodeSizeFamily;
    }

    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sessionLevelPackagesEnabled")
    private final @Nullable Input<Boolean> sessionLevelPackagesEnabled;

    public Input<Boolean> getSessionLevelPackagesEnabled() {
        return this.sessionLevelPackagesEnabled == null ? Input.empty() : this.sessionLevelPackagesEnabled;
    }

    @InputImport(name="sparkConfigProperties")
    private final @Nullable Input<LibraryRequirementsArgs> sparkConfigProperties;

    public Input<LibraryRequirementsArgs> getSparkConfigProperties() {
        return this.sparkConfigProperties == null ? Input.empty() : this.sparkConfigProperties;
    }

    @InputImport(name="sparkEventsFolder")
    private final @Nullable Input<String> sparkEventsFolder;

    public Input<String> getSparkEventsFolder() {
        return this.sparkEventsFolder == null ? Input.empty() : this.sparkEventsFolder;
    }

    @InputImport(name="sparkVersion")
    private final @Nullable Input<String> sparkVersion;

    public Input<String> getSparkVersion() {
        return this.sparkVersion == null ? Input.empty() : this.sparkVersion;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public BigDataPoolArgs(
        @Nullable Input<AutoPausePropertiesArgs> autoPause,
        @Nullable Input<AutoScalePropertiesArgs> autoScale,
        @Nullable Input<String> bigDataPoolName,
        @Nullable Input<Integer> cacheSize,
        @Nullable Input<String> creationDate,
        @Nullable Input<List<LibraryInfoArgs>> customLibraries,
        @Nullable Input<String> defaultSparkLogFolder,
        @Nullable Input<DynamicExecutorAllocationArgs> dynamicExecutorAllocation,
        @Nullable Input<Boolean> force,
        @Nullable Input<Boolean> isComputeIsolationEnabled,
        @Nullable Input<LibraryRequirementsArgs> libraryRequirements,
        @Nullable Input<String> location,
        @Nullable Input<Integer> nodeCount,
        @Nullable Input<Either<String,NodeSize>> nodeSize,
        @Nullable Input<Either<String,NodeSizeFamily>> nodeSizeFamily,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> sessionLevelPackagesEnabled,
        @Nullable Input<LibraryRequirementsArgs> sparkConfigProperties,
        @Nullable Input<String> sparkEventsFolder,
        @Nullable Input<String> sparkVersion,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName) {
        this.autoPause = autoPause;
        this.autoScale = autoScale;
        this.bigDataPoolName = bigDataPoolName;
        this.cacheSize = cacheSize;
        this.creationDate = creationDate;
        this.customLibraries = customLibraries;
        this.defaultSparkLogFolder = defaultSparkLogFolder;
        this.dynamicExecutorAllocation = dynamicExecutorAllocation;
        this.force = force;
        this.isComputeIsolationEnabled = isComputeIsolationEnabled;
        this.libraryRequirements = libraryRequirements;
        this.location = location;
        this.nodeCount = nodeCount;
        this.nodeSize = nodeSize;
        this.nodeSizeFamily = nodeSizeFamily;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
        this.sparkConfigProperties = sparkConfigProperties;
        this.sparkEventsFolder = sparkEventsFolder;
        this.sparkVersion = sparkVersion;
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private BigDataPoolArgs() {
        this.autoPause = Input.empty();
        this.autoScale = Input.empty();
        this.bigDataPoolName = Input.empty();
        this.cacheSize = Input.empty();
        this.creationDate = Input.empty();
        this.customLibraries = Input.empty();
        this.defaultSparkLogFolder = Input.empty();
        this.dynamicExecutorAllocation = Input.empty();
        this.force = Input.empty();
        this.isComputeIsolationEnabled = Input.empty();
        this.libraryRequirements = Input.empty();
        this.location = Input.empty();
        this.nodeCount = Input.empty();
        this.nodeSize = Input.empty();
        this.nodeSizeFamily = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sessionLevelPackagesEnabled = Input.empty();
        this.sparkConfigProperties = Input.empty();
        this.sparkEventsFolder = Input.empty();
        this.sparkVersion = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoPausePropertiesArgs> autoPause;
        private @Nullable Input<AutoScalePropertiesArgs> autoScale;
        private @Nullable Input<String> bigDataPoolName;
        private @Nullable Input<Integer> cacheSize;
        private @Nullable Input<String> creationDate;
        private @Nullable Input<List<LibraryInfoArgs>> customLibraries;
        private @Nullable Input<String> defaultSparkLogFolder;
        private @Nullable Input<DynamicExecutorAllocationArgs> dynamicExecutorAllocation;
        private @Nullable Input<Boolean> force;
        private @Nullable Input<Boolean> isComputeIsolationEnabled;
        private @Nullable Input<LibraryRequirementsArgs> libraryRequirements;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> nodeCount;
        private @Nullable Input<Either<String,NodeSize>> nodeSize;
        private @Nullable Input<Either<String,NodeSizeFamily>> nodeSizeFamily;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> sessionLevelPackagesEnabled;
        private @Nullable Input<LibraryRequirementsArgs> sparkConfigProperties;
        private @Nullable Input<String> sparkEventsFolder;
        private @Nullable Input<String> sparkVersion;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BigDataPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPause = defaults.autoPause;
    	      this.autoScale = defaults.autoScale;
    	      this.bigDataPoolName = defaults.bigDataPoolName;
    	      this.cacheSize = defaults.cacheSize;
    	      this.creationDate = defaults.creationDate;
    	      this.customLibraries = defaults.customLibraries;
    	      this.defaultSparkLogFolder = defaults.defaultSparkLogFolder;
    	      this.dynamicExecutorAllocation = defaults.dynamicExecutorAllocation;
    	      this.force = defaults.force;
    	      this.isComputeIsolationEnabled = defaults.isComputeIsolationEnabled;
    	      this.libraryRequirements = defaults.libraryRequirements;
    	      this.location = defaults.location;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeSize = defaults.nodeSize;
    	      this.nodeSizeFamily = defaults.nodeSizeFamily;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sessionLevelPackagesEnabled = defaults.sessionLevelPackagesEnabled;
    	      this.sparkConfigProperties = defaults.sparkConfigProperties;
    	      this.sparkEventsFolder = defaults.sparkEventsFolder;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAutoPause(@Nullable Input<AutoPausePropertiesArgs> autoPause) {
            this.autoPause = autoPause;
            return this;
        }

        public Builder setAutoPause(@Nullable AutoPausePropertiesArgs autoPause) {
            this.autoPause = Input.ofNullable(autoPause);
            return this;
        }

        public Builder setAutoScale(@Nullable Input<AutoScalePropertiesArgs> autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setAutoScale(@Nullable AutoScalePropertiesArgs autoScale) {
            this.autoScale = Input.ofNullable(autoScale);
            return this;
        }

        public Builder setBigDataPoolName(@Nullable Input<String> bigDataPoolName) {
            this.bigDataPoolName = bigDataPoolName;
            return this;
        }

        public Builder setBigDataPoolName(@Nullable String bigDataPoolName) {
            this.bigDataPoolName = Input.ofNullable(bigDataPoolName);
            return this;
        }

        public Builder setCacheSize(@Nullable Input<Integer> cacheSize) {
            this.cacheSize = cacheSize;
            return this;
        }

        public Builder setCacheSize(@Nullable Integer cacheSize) {
            this.cacheSize = Input.ofNullable(cacheSize);
            return this;
        }

        public Builder setCreationDate(@Nullable Input<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setCreationDate(@Nullable String creationDate) {
            this.creationDate = Input.ofNullable(creationDate);
            return this;
        }

        public Builder setCustomLibraries(@Nullable Input<List<LibraryInfoArgs>> customLibraries) {
            this.customLibraries = customLibraries;
            return this;
        }

        public Builder setCustomLibraries(@Nullable List<LibraryInfoArgs> customLibraries) {
            this.customLibraries = Input.ofNullable(customLibraries);
            return this;
        }

        public Builder setDefaultSparkLogFolder(@Nullable Input<String> defaultSparkLogFolder) {
            this.defaultSparkLogFolder = defaultSparkLogFolder;
            return this;
        }

        public Builder setDefaultSparkLogFolder(@Nullable String defaultSparkLogFolder) {
            this.defaultSparkLogFolder = Input.ofNullable(defaultSparkLogFolder);
            return this;
        }

        public Builder setDynamicExecutorAllocation(@Nullable Input<DynamicExecutorAllocationArgs> dynamicExecutorAllocation) {
            this.dynamicExecutorAllocation = dynamicExecutorAllocation;
            return this;
        }

        public Builder setDynamicExecutorAllocation(@Nullable DynamicExecutorAllocationArgs dynamicExecutorAllocation) {
            this.dynamicExecutorAllocation = Input.ofNullable(dynamicExecutorAllocation);
            return this;
        }

        public Builder setForce(@Nullable Input<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder setForce(@Nullable Boolean force) {
            this.force = Input.ofNullable(force);
            return this;
        }

        public Builder setIsComputeIsolationEnabled(@Nullable Input<Boolean> isComputeIsolationEnabled) {
            this.isComputeIsolationEnabled = isComputeIsolationEnabled;
            return this;
        }

        public Builder setIsComputeIsolationEnabled(@Nullable Boolean isComputeIsolationEnabled) {
            this.isComputeIsolationEnabled = Input.ofNullable(isComputeIsolationEnabled);
            return this;
        }

        public Builder setLibraryRequirements(@Nullable Input<LibraryRequirementsArgs> libraryRequirements) {
            this.libraryRequirements = libraryRequirements;
            return this;
        }

        public Builder setLibraryRequirements(@Nullable LibraryRequirementsArgs libraryRequirements) {
            this.libraryRequirements = Input.ofNullable(libraryRequirements);
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

        public Builder setNodeCount(@Nullable Input<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Input.ofNullable(nodeCount);
            return this;
        }

        public Builder setNodeSize(@Nullable Input<Either<String,NodeSize>> nodeSize) {
            this.nodeSize = nodeSize;
            return this;
        }

        public Builder setNodeSize(@Nullable Either<String,NodeSize> nodeSize) {
            this.nodeSize = Input.ofNullable(nodeSize);
            return this;
        }

        public Builder setNodeSizeFamily(@Nullable Input<Either<String,NodeSizeFamily>> nodeSizeFamily) {
            this.nodeSizeFamily = nodeSizeFamily;
            return this;
        }

        public Builder setNodeSizeFamily(@Nullable Either<String,NodeSizeFamily> nodeSizeFamily) {
            this.nodeSizeFamily = Input.ofNullable(nodeSizeFamily);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setSessionLevelPackagesEnabled(@Nullable Input<Boolean> sessionLevelPackagesEnabled) {
            this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
            return this;
        }

        public Builder setSessionLevelPackagesEnabled(@Nullable Boolean sessionLevelPackagesEnabled) {
            this.sessionLevelPackagesEnabled = Input.ofNullable(sessionLevelPackagesEnabled);
            return this;
        }

        public Builder setSparkConfigProperties(@Nullable Input<LibraryRequirementsArgs> sparkConfigProperties) {
            this.sparkConfigProperties = sparkConfigProperties;
            return this;
        }

        public Builder setSparkConfigProperties(@Nullable LibraryRequirementsArgs sparkConfigProperties) {
            this.sparkConfigProperties = Input.ofNullable(sparkConfigProperties);
            return this;
        }

        public Builder setSparkEventsFolder(@Nullable Input<String> sparkEventsFolder) {
            this.sparkEventsFolder = sparkEventsFolder;
            return this;
        }

        public Builder setSparkEventsFolder(@Nullable String sparkEventsFolder) {
            this.sparkEventsFolder = Input.ofNullable(sparkEventsFolder);
            return this;
        }

        public Builder setSparkVersion(@Nullable Input<String> sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        public Builder setSparkVersion(@Nullable String sparkVersion) {
            this.sparkVersion = Input.ofNullable(sparkVersion);
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

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public BigDataPoolArgs build() {
            return new BigDataPoolArgs(autoPause, autoScale, bigDataPoolName, cacheSize, creationDate, customLibraries, defaultSparkLogFolder, dynamicExecutorAllocation, force, isComputeIsolationEnabled, libraryRequirements, location, nodeCount, nodeSize, nodeSizeFamily, provisioningState, resourceGroupName, sessionLevelPackagesEnabled, sparkConfigProperties, sparkEventsFolder, sparkVersion, tags, workspaceName);
        }
    }
}
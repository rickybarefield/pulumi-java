// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.enums.UpgradeHistoryEntryAction;
import io.pulumi.googlenative.notebooks_v1.enums.UpgradeHistoryEntryState;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UpgradeHistoryEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final UpgradeHistoryEntryArgs Empty = new UpgradeHistoryEntryArgs();

    @InputImport(name="action")
    private final @Nullable Input<UpgradeHistoryEntryAction> action;

    public Input<UpgradeHistoryEntryAction> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    @InputImport(name="containerImage")
    private final @Nullable Input<String> containerImage;

    public Input<String> getContainerImage() {
        return this.containerImage == null ? Input.empty() : this.containerImage;
    }

    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    @InputImport(name="framework")
    private final @Nullable Input<String> framework;

    public Input<String> getFramework() {
        return this.framework == null ? Input.empty() : this.framework;
    }

    @InputImport(name="snapshot")
    private final @Nullable Input<String> snapshot;

    public Input<String> getSnapshot() {
        return this.snapshot == null ? Input.empty() : this.snapshot;
    }

    @InputImport(name="state")
    private final @Nullable Input<UpgradeHistoryEntryState> state;

    public Input<UpgradeHistoryEntryState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="targetImage")
    private final @Nullable Input<String> targetImage;

    public Input<String> getTargetImage() {
        return this.targetImage == null ? Input.empty() : this.targetImage;
    }

    @InputImport(name="targetVersion")
    private final @Nullable Input<String> targetVersion;

    public Input<String> getTargetVersion() {
        return this.targetVersion == null ? Input.empty() : this.targetVersion;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    @InputImport(name="vmImage")
    private final @Nullable Input<String> vmImage;

    public Input<String> getVmImage() {
        return this.vmImage == null ? Input.empty() : this.vmImage;
    }

    public UpgradeHistoryEntryArgs(
        @Nullable Input<UpgradeHistoryEntryAction> action,
        @Nullable Input<String> containerImage,
        @Nullable Input<String> createTime,
        @Nullable Input<String> framework,
        @Nullable Input<String> snapshot,
        @Nullable Input<UpgradeHistoryEntryState> state,
        @Nullable Input<String> targetImage,
        @Nullable Input<String> targetVersion,
        @Nullable Input<String> version,
        @Nullable Input<String> vmImage) {
        this.action = action;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.framework = framework;
        this.snapshot = snapshot;
        this.state = state;
        this.targetImage = targetImage;
        this.targetVersion = targetVersion;
        this.version = version;
        this.vmImage = vmImage;
    }

    private UpgradeHistoryEntryArgs() {
        this.action = Input.empty();
        this.containerImage = Input.empty();
        this.createTime = Input.empty();
        this.framework = Input.empty();
        this.snapshot = Input.empty();
        this.state = Input.empty();
        this.targetImage = Input.empty();
        this.targetVersion = Input.empty();
        this.version = Input.empty();
        this.vmImage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeHistoryEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UpgradeHistoryEntryAction> action;
        private @Nullable Input<String> containerImage;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> framework;
        private @Nullable Input<String> snapshot;
        private @Nullable Input<UpgradeHistoryEntryState> state;
        private @Nullable Input<String> targetImage;
        private @Nullable Input<String> targetVersion;
        private @Nullable Input<String> version;
        private @Nullable Input<String> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeHistoryEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.framework = defaults.framework;
    	      this.snapshot = defaults.snapshot;
    	      this.state = defaults.state;
    	      this.targetImage = defaults.targetImage;
    	      this.targetVersion = defaults.targetVersion;
    	      this.version = defaults.version;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder setAction(@Nullable Input<UpgradeHistoryEntryAction> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable UpgradeHistoryEntryAction action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setContainerImage(@Nullable Input<String> containerImage) {
            this.containerImage = containerImage;
            return this;
        }

        public Builder setContainerImage(@Nullable String containerImage) {
            this.containerImage = Input.ofNullable(containerImage);
            return this;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setFramework(@Nullable Input<String> framework) {
            this.framework = framework;
            return this;
        }

        public Builder setFramework(@Nullable String framework) {
            this.framework = Input.ofNullable(framework);
            return this;
        }

        public Builder setSnapshot(@Nullable Input<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder setSnapshot(@Nullable String snapshot) {
            this.snapshot = Input.ofNullable(snapshot);
            return this;
        }

        public Builder setState(@Nullable Input<UpgradeHistoryEntryState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable UpgradeHistoryEntryState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTargetImage(@Nullable Input<String> targetImage) {
            this.targetImage = targetImage;
            return this;
        }

        public Builder setTargetImage(@Nullable String targetImage) {
            this.targetImage = Input.ofNullable(targetImage);
            return this;
        }

        public Builder setTargetVersion(@Nullable Input<String> targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        public Builder setTargetVersion(@Nullable String targetVersion) {
            this.targetVersion = Input.ofNullable(targetVersion);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVmImage(@Nullable Input<String> vmImage) {
            this.vmImage = vmImage;
            return this;
        }

        public Builder setVmImage(@Nullable String vmImage) {
            this.vmImage = Input.ofNullable(vmImage);
            return this;
        }

        public UpgradeHistoryEntryArgs build() {
            return new UpgradeHistoryEntryArgs(action, containerImage, createTime, framework, snapshot, state, targetImage, targetVersion, version, vmImage);
        }
    }
}
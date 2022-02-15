// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointOrigination;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointAuthorizationArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointCmafPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointDashPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointMssPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OriginEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointArgs Empty = new OriginEndpointArgs();

    @InputImport(name="authorization")
    private final @Nullable Input<OriginEndpointAuthorizationArgs> authorization;

    public Input<OriginEndpointAuthorizationArgs> getAuthorization() {
        return this.authorization == null ? Input.empty() : this.authorization;
    }

    @InputImport(name="channelId", required=true)
    private final Input<String> channelId;

    public Input<String> getChannelId() {
        return this.channelId;
    }

    @InputImport(name="cmafPackage")
    private final @Nullable Input<OriginEndpointCmafPackageArgs> cmafPackage;

    public Input<OriginEndpointCmafPackageArgs> getCmafPackage() {
        return this.cmafPackage == null ? Input.empty() : this.cmafPackage;
    }

    @InputImport(name="dashPackage")
    private final @Nullable Input<OriginEndpointDashPackageArgs> dashPackage;

    public Input<OriginEndpointDashPackageArgs> getDashPackage() {
        return this.dashPackage == null ? Input.empty() : this.dashPackage;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="hlsPackage")
    private final @Nullable Input<OriginEndpointHlsPackageArgs> hlsPackage;

    public Input<OriginEndpointHlsPackageArgs> getHlsPackage() {
        return this.hlsPackage == null ? Input.empty() : this.hlsPackage;
    }

    @InputImport(name="manifestName")
    private final @Nullable Input<String> manifestName;

    public Input<String> getManifestName() {
        return this.manifestName == null ? Input.empty() : this.manifestName;
    }

    @InputImport(name="mssPackage")
    private final @Nullable Input<OriginEndpointMssPackageArgs> mssPackage;

    public Input<OriginEndpointMssPackageArgs> getMssPackage() {
        return this.mssPackage == null ? Input.empty() : this.mssPackage;
    }

    @InputImport(name="origination")
    private final @Nullable Input<OriginEndpointOrigination> origination;

    public Input<OriginEndpointOrigination> getOrigination() {
        return this.origination == null ? Input.empty() : this.origination;
    }

    @InputImport(name="startoverWindowSeconds")
    private final @Nullable Input<Integer> startoverWindowSeconds;

    public Input<Integer> getStartoverWindowSeconds() {
        return this.startoverWindowSeconds == null ? Input.empty() : this.startoverWindowSeconds;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<OriginEndpointTagArgs>> tags;

    public Input<List<OriginEndpointTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="timeDelaySeconds")
    private final @Nullable Input<Integer> timeDelaySeconds;

    public Input<Integer> getTimeDelaySeconds() {
        return this.timeDelaySeconds == null ? Input.empty() : this.timeDelaySeconds;
    }

    @InputImport(name="whitelist")
    private final @Nullable Input<List<String>> whitelist;

    public Input<List<String>> getWhitelist() {
        return this.whitelist == null ? Input.empty() : this.whitelist;
    }

    public OriginEndpointArgs(
        @Nullable Input<OriginEndpointAuthorizationArgs> authorization,
        Input<String> channelId,
        @Nullable Input<OriginEndpointCmafPackageArgs> cmafPackage,
        @Nullable Input<OriginEndpointDashPackageArgs> dashPackage,
        @Nullable Input<String> description,
        @Nullable Input<OriginEndpointHlsPackageArgs> hlsPackage,
        @Nullable Input<String> manifestName,
        @Nullable Input<OriginEndpointMssPackageArgs> mssPackage,
        @Nullable Input<OriginEndpointOrigination> origination,
        @Nullable Input<Integer> startoverWindowSeconds,
        @Nullable Input<List<OriginEndpointTagArgs>> tags,
        @Nullable Input<Integer> timeDelaySeconds,
        @Nullable Input<List<String>> whitelist) {
        this.authorization = authorization;
        this.channelId = Objects.requireNonNull(channelId, "expected parameter 'channelId' to be non-null");
        this.cmafPackage = cmafPackage;
        this.dashPackage = dashPackage;
        this.description = description;
        this.hlsPackage = hlsPackage;
        this.manifestName = manifestName;
        this.mssPackage = mssPackage;
        this.origination = origination;
        this.startoverWindowSeconds = startoverWindowSeconds;
        this.tags = tags;
        this.timeDelaySeconds = timeDelaySeconds;
        this.whitelist = whitelist;
    }

    private OriginEndpointArgs() {
        this.authorization = Input.empty();
        this.channelId = Input.empty();
        this.cmafPackage = Input.empty();
        this.dashPackage = Input.empty();
        this.description = Input.empty();
        this.hlsPackage = Input.empty();
        this.manifestName = Input.empty();
        this.mssPackage = Input.empty();
        this.origination = Input.empty();
        this.startoverWindowSeconds = Input.empty();
        this.tags = Input.empty();
        this.timeDelaySeconds = Input.empty();
        this.whitelist = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OriginEndpointAuthorizationArgs> authorization;
        private Input<String> channelId;
        private @Nullable Input<OriginEndpointCmafPackageArgs> cmafPackage;
        private @Nullable Input<OriginEndpointDashPackageArgs> dashPackage;
        private @Nullable Input<String> description;
        private @Nullable Input<OriginEndpointHlsPackageArgs> hlsPackage;
        private @Nullable Input<String> manifestName;
        private @Nullable Input<OriginEndpointMssPackageArgs> mssPackage;
        private @Nullable Input<OriginEndpointOrigination> origination;
        private @Nullable Input<Integer> startoverWindowSeconds;
        private @Nullable Input<List<OriginEndpointTagArgs>> tags;
        private @Nullable Input<Integer> timeDelaySeconds;
        private @Nullable Input<List<String>> whitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorization = defaults.authorization;
    	      this.channelId = defaults.channelId;
    	      this.cmafPackage = defaults.cmafPackage;
    	      this.dashPackage = defaults.dashPackage;
    	      this.description = defaults.description;
    	      this.hlsPackage = defaults.hlsPackage;
    	      this.manifestName = defaults.manifestName;
    	      this.mssPackage = defaults.mssPackage;
    	      this.origination = defaults.origination;
    	      this.startoverWindowSeconds = defaults.startoverWindowSeconds;
    	      this.tags = defaults.tags;
    	      this.timeDelaySeconds = defaults.timeDelaySeconds;
    	      this.whitelist = defaults.whitelist;
        }

        public Builder setAuthorization(@Nullable Input<OriginEndpointAuthorizationArgs> authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder setAuthorization(@Nullable OriginEndpointAuthorizationArgs authorization) {
            this.authorization = Input.ofNullable(authorization);
            return this;
        }

        public Builder setChannelId(Input<String> channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = Input.of(Objects.requireNonNull(channelId));
            return this;
        }

        public Builder setCmafPackage(@Nullable Input<OriginEndpointCmafPackageArgs> cmafPackage) {
            this.cmafPackage = cmafPackage;
            return this;
        }

        public Builder setCmafPackage(@Nullable OriginEndpointCmafPackageArgs cmafPackage) {
            this.cmafPackage = Input.ofNullable(cmafPackage);
            return this;
        }

        public Builder setDashPackage(@Nullable Input<OriginEndpointDashPackageArgs> dashPackage) {
            this.dashPackage = dashPackage;
            return this;
        }

        public Builder setDashPackage(@Nullable OriginEndpointDashPackageArgs dashPackage) {
            this.dashPackage = Input.ofNullable(dashPackage);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setHlsPackage(@Nullable Input<OriginEndpointHlsPackageArgs> hlsPackage) {
            this.hlsPackage = hlsPackage;
            return this;
        }

        public Builder setHlsPackage(@Nullable OriginEndpointHlsPackageArgs hlsPackage) {
            this.hlsPackage = Input.ofNullable(hlsPackage);
            return this;
        }

        public Builder setManifestName(@Nullable Input<String> manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder setManifestName(@Nullable String manifestName) {
            this.manifestName = Input.ofNullable(manifestName);
            return this;
        }

        public Builder setMssPackage(@Nullable Input<OriginEndpointMssPackageArgs> mssPackage) {
            this.mssPackage = mssPackage;
            return this;
        }

        public Builder setMssPackage(@Nullable OriginEndpointMssPackageArgs mssPackage) {
            this.mssPackage = Input.ofNullable(mssPackage);
            return this;
        }

        public Builder setOrigination(@Nullable Input<OriginEndpointOrigination> origination) {
            this.origination = origination;
            return this;
        }

        public Builder setOrigination(@Nullable OriginEndpointOrigination origination) {
            this.origination = Input.ofNullable(origination);
            return this;
        }

        public Builder setStartoverWindowSeconds(@Nullable Input<Integer> startoverWindowSeconds) {
            this.startoverWindowSeconds = startoverWindowSeconds;
            return this;
        }

        public Builder setStartoverWindowSeconds(@Nullable Integer startoverWindowSeconds) {
            this.startoverWindowSeconds = Input.ofNullable(startoverWindowSeconds);
            return this;
        }

        public Builder setTags(@Nullable Input<List<OriginEndpointTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<OriginEndpointTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTimeDelaySeconds(@Nullable Input<Integer> timeDelaySeconds) {
            this.timeDelaySeconds = timeDelaySeconds;
            return this;
        }

        public Builder setTimeDelaySeconds(@Nullable Integer timeDelaySeconds) {
            this.timeDelaySeconds = Input.ofNullable(timeDelaySeconds);
            return this;
        }

        public Builder setWhitelist(@Nullable Input<List<String>> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public Builder setWhitelist(@Nullable List<String> whitelist) {
            this.whitelist = Input.ofNullable(whitelist);
            return this;
        }

        public OriginEndpointArgs build() {
            return new OriginEndpointArgs(authorization, channelId, cmafPackage, dashPackage, description, hlsPackage, manifestName, mssPackage, origination, startoverWindowSeconds, tags, timeDelaySeconds, whitelist);
        }
    }
}
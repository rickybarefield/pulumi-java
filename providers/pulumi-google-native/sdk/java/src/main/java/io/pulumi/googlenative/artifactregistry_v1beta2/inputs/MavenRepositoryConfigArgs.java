// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.artifactregistry_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.artifactregistry_v1beta2.enums.MavenRepositoryConfigVersionPolicy;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MavenRepositoryConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MavenRepositoryConfigArgs Empty = new MavenRepositoryConfigArgs();

    @InputImport(name="allowSnapshotOverwrites")
    private final @Nullable Input<Boolean> allowSnapshotOverwrites;

    public Input<Boolean> getAllowSnapshotOverwrites() {
        return this.allowSnapshotOverwrites == null ? Input.empty() : this.allowSnapshotOverwrites;
    }

    @InputImport(name="versionPolicy")
    private final @Nullable Input<MavenRepositoryConfigVersionPolicy> versionPolicy;

    public Input<MavenRepositoryConfigVersionPolicy> getVersionPolicy() {
        return this.versionPolicy == null ? Input.empty() : this.versionPolicy;
    }

    public MavenRepositoryConfigArgs(
        @Nullable Input<Boolean> allowSnapshotOverwrites,
        @Nullable Input<MavenRepositoryConfigVersionPolicy> versionPolicy) {
        this.allowSnapshotOverwrites = allowSnapshotOverwrites;
        this.versionPolicy = versionPolicy;
    }

    private MavenRepositoryConfigArgs() {
        this.allowSnapshotOverwrites = Input.empty();
        this.versionPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MavenRepositoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowSnapshotOverwrites;
        private @Nullable Input<MavenRepositoryConfigVersionPolicy> versionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(MavenRepositoryConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSnapshotOverwrites = defaults.allowSnapshotOverwrites;
    	      this.versionPolicy = defaults.versionPolicy;
        }

        public Builder setAllowSnapshotOverwrites(@Nullable Input<Boolean> allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = allowSnapshotOverwrites;
            return this;
        }

        public Builder setAllowSnapshotOverwrites(@Nullable Boolean allowSnapshotOverwrites) {
            this.allowSnapshotOverwrites = Input.ofNullable(allowSnapshotOverwrites);
            return this;
        }

        public Builder setVersionPolicy(@Nullable Input<MavenRepositoryConfigVersionPolicy> versionPolicy) {
            this.versionPolicy = versionPolicy;
            return this;
        }

        public Builder setVersionPolicy(@Nullable MavenRepositoryConfigVersionPolicy versionPolicy) {
            this.versionPolicy = Input.ofNullable(versionPolicy);
            return this;
        }

        public MavenRepositoryConfigArgs build() {
            return new MavenRepositoryConfigArgs(allowSnapshotOverwrites, versionPolicy);
        }
    }
}
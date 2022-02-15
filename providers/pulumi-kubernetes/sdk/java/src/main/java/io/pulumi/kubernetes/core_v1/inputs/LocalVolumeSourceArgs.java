// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalVolumeSourceArgs Empty = new LocalVolumeSourceArgs();

    @InputImport(name="fsType")
    private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    public LocalVolumeSourceArgs(
        @Nullable Input<String> fsType,
        Input<String> path) {
        this.fsType = fsType;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private LocalVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.path = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private Input<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.path = defaults.path;
        }

        public Builder setFsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public LocalVolumeSourceArgs build() {
            return new LocalVolumeSourceArgs(fsType, path);
        }
    }
}
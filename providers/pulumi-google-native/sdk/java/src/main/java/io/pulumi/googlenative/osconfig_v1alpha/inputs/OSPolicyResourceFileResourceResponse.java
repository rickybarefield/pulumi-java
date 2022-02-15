// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1alpha.inputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.Objects;


public final class OSPolicyResourceFileResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileResourceResponse Empty = new OSPolicyResourceFileResourceResponse();

    @InputImport(name="content", required=true)
    private final String content;

    public String getContent() {
        return this.content;
    }

    @InputImport(name="file", required=true)
    private final OSPolicyResourceFileResponse file;

    public OSPolicyResourceFileResponse getFile() {
        return this.file;
    }

    @InputImport(name="path", required=true)
    private final String path;

    public String getPath() {
        return this.path;
    }

    @InputImport(name="permissions", required=true)
    private final String permissions;

    public String getPermissions() {
        return this.permissions;
    }

    @InputImport(name="state", required=true)
    private final String state;

    public String getState() {
        return this.state;
    }

    public OSPolicyResourceFileResourceResponse(
        String content,
        OSPolicyResourceFileResponse file,
        String path,
        String permissions,
        String state) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private OSPolicyResourceFileResourceResponse() {
        this.content = null;
        this.file = null;
        this.path = null;
        this.permissions = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private OSPolicyResourceFileResponse file;
        private String path;
        private String permissions;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.file = defaults.file;
    	      this.path = defaults.path;
    	      this.permissions = defaults.permissions;
    	      this.state = defaults.state;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setFile(OSPolicyResourceFileResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public OSPolicyResourceFileResourceResponse build() {
            return new OSPolicyResourceFileResourceResponse(content, file, path, permissions, state);
        }
    }
}
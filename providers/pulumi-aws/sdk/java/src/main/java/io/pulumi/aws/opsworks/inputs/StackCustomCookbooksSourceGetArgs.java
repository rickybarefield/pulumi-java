// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackCustomCookbooksSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackCustomCookbooksSourceGetArgs Empty = new StackCustomCookbooksSourceGetArgs();

    /**
     * Password to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="password")
    private final @Nullable Input<String> password;

    public Input<String> getPassword() {
        return this.password == null ? Input.empty() : this.password;
    }

    /**
     * For sources that are version-aware, the revision to use.
     * 
     */
    @InputImport(name="revision")
    private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * SSH key to use when authenticating to the source. The provider cannot perform drift detection of this configuration.
     * 
     */
    @InputImport(name="sshKey")
    private final @Nullable Input<String> sshKey;

    public Input<String> getSshKey() {
        return this.sshKey == null ? Input.empty() : this.sshKey;
    }

    /**
     * The type of source to use. For example, "archive".
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * The URL where the cookbooks resource can be found.
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    /**
     * Username to use when authenticating to the source.
     * 
     */
    @InputImport(name="username")
    private final @Nullable Input<String> username;

    public Input<String> getUsername() {
        return this.username == null ? Input.empty() : this.username;
    }

    public StackCustomCookbooksSourceGetArgs(
        @Nullable Input<String> password,
        @Nullable Input<String> revision,
        @Nullable Input<String> sshKey,
        Input<String> type,
        Input<String> url,
        @Nullable Input<String> username) {
        this.password = password;
        this.revision = revision;
        this.sshKey = sshKey;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.username = username;
    }

    private StackCustomCookbooksSourceGetArgs() {
        this.password = Input.empty();
        this.revision = Input.empty();
        this.sshKey = Input.empty();
        this.type = Input.empty();
        this.url = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackCustomCookbooksSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> password;
        private @Nullable Input<String> revision;
        private @Nullable Input<String> sshKey;
        private Input<String> type;
        private Input<String> url;
        private @Nullable Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(StackCustomCookbooksSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.revision = defaults.revision;
    	      this.sshKey = defaults.sshKey;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable Input<String> password) {
            this.password = password;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = Input.ofNullable(password);
            return this;
        }

        public Builder setRevision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder setSshKey(@Nullable Input<String> sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        public Builder setSshKey(@Nullable String sshKey) {
            this.sshKey = Input.ofNullable(sshKey);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUsername(@Nullable Input<String> username) {
            this.username = username;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = Input.ofNullable(username);
            return this;
        }
        public StackCustomCookbooksSourceGetArgs build() {
            return new StackCustomCookbooksSourceGetArgs(password, revision, sshKey, type, url, username);
        }
    }
}
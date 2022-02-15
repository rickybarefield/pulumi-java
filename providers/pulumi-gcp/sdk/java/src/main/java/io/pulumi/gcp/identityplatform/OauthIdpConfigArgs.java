// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OauthIdpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OauthIdpConfigArgs Empty = new OauthIdpConfigArgs();

    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    @InputImport(name="clientSecret")
    private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="issuer", required=true)
    private final Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public OauthIdpConfigArgs(
        Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<String> displayName,
        @Nullable Input<Boolean> enabled,
        Input<String> issuer,
        @Nullable Input<String> name,
        @Nullable Input<String> project) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = clientSecret;
        this.displayName = displayName;
        this.enabled = enabled;
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.name = name;
        this.project = project;
    }

    private OauthIdpConfigArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.displayName = Input.empty();
        this.enabled = Input.empty();
        this.issuer = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OauthIdpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Boolean> enabled;
        private Input<String> issuer;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(OauthIdpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.displayName = defaults.displayName;
    	      this.enabled = defaults.enabled;
    	      this.issuer = defaults.issuer;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
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

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setIssuer(Input<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Input.of(Objects.requireNonNull(issuer));
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public OauthIdpConfigArgs build() {
            return new OauthIdpConfigArgs(clientId, clientSecret, displayName, enabled, issuer, name, project);
        }
    }
}
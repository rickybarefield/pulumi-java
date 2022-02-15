// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.identityplatform.OauthIdpConfigArgs;
import io.pulumi.gcp.identityplatform.inputs.OauthIdpConfigState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:identityplatform/oauthIdpConfig:OauthIdpConfig")
public class OauthIdpConfig extends io.pulumi.resources.CustomResource {
    @OutputExport(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId;
    }
    @OutputExport(name="clientSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> clientSecret;

    public Output</* @Nullable */ String> getClientSecret() {
        return this.clientSecret;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="issuer", type=String.class, parameters={})
    private Output<String> issuer;

    public Output<String> getIssuer() {
        return this.issuer;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public OauthIdpConfig(String name, OauthIdpConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/oauthIdpConfig:OauthIdpConfig", name, args == null ? OauthIdpConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private OauthIdpConfig(String name, Input<String> id, @Nullable OauthIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/oauthIdpConfig:OauthIdpConfig", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static OauthIdpConfig get(String name, Input<String> id, @Nullable OauthIdpConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new OauthIdpConfig(name, id, state, options);
    }
}
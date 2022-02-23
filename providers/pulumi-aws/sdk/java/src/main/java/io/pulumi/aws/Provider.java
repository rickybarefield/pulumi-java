// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.ProviderArgs;
import io.pulumi.aws.Utilities;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The provider type for the aws package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:aws")
public class Provider extends io.pulumi.resources.ProviderResource {
    /**
     * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @OutputExport(name="accessKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessKey;

    /**
     * @return The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    public Output</* @Nullable */ String> getAccessKey() {
        return this.accessKey;
    }
    /**
     * The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    @OutputExport(name="httpProxy", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpProxy;

    /**
     * @return The address of an HTTP proxy to use when accessing the AWS API. Can also be configured using the `HTTP_PROXY` or
     * `HTTPS_PROXY` environment variables.
     * 
     */
    public Output</* @Nullable */ String> getHttpProxy() {
        return this.httpProxy;
    }
    /**
     * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    @OutputExport(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    /**
     * @return The profile for API operations. If not set, the default profile created with `aws configure` will be used.
     * 
     */
    public Output</* @Nullable */ String> getProfile() {
        return this.profile;
    }
    /**
     * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
     * 
     */
    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    /**
     * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    @OutputExport(name="secretKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretKey;

    /**
     * @return The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS console.
     * 
     */
    public Output</* @Nullable */ String> getSecretKey() {
        return this.secretKey;
    }
    /**
     * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    @OutputExport(name="sharedCredentialsFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedCredentialsFile;

    /**
     * @return The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
     * 
     */
    public Output</* @Nullable */ String> getSharedCredentialsFile() {
        return this.sharedCredentialsFile;
    }
    /**
     * session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    @OutputExport(name="token", type=String.class, parameters={})
    private Output</* @Nullable */ String> token;

    /**
     * @return session token. A session token is only required if you are using temporary security credentials.
     * 
     */
    public Output</* @Nullable */ String> getToken() {
        return this.token;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
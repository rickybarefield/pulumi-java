// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OpenIdConnectProviderState extends io.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectProviderState Empty = new OpenIdConnectProviderState();

    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A list of client IDs (also known as audiences). When a mobile or web app registers with an OpenID Connect provider, they establish a value that identifies the application. (This is the value that's sent as the client_id parameter on OAuth requests.)
     * 
     */
    @InputImport(name="clientIdLists")
    private final @Nullable Input<List<String>> clientIdLists;

    public Input<List<String>> getClientIdLists() {
        return this.clientIdLists == null ? Input.empty() : this.clientIdLists;
    }

    /**
     * Map of resource tags for the IAM OIDC provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * A list of server certificate thumbprints for the OpenID Connect (OIDC) identity provider's server certificate(s).
     * 
     */
    @InputImport(name="thumbprintLists")
    private final @Nullable Input<List<String>> thumbprintLists;

    public Input<List<String>> getThumbprintLists() {
        return this.thumbprintLists == null ? Input.empty() : this.thumbprintLists;
    }

    /**
     * The URL of the identity provider. Corresponds to the _iss_ claim.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public OpenIdConnectProviderState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> clientIdLists,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<String>> thumbprintLists,
        @Nullable Input<String> url) {
        this.arn = arn;
        this.clientIdLists = clientIdLists;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.thumbprintLists = thumbprintLists;
        this.url = url;
    }

    private OpenIdConnectProviderState() {
        this.arn = Input.empty();
        this.clientIdLists = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.thumbprintLists = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> clientIdLists;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<String>> thumbprintLists;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clientIdLists = defaults.clientIdLists;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.thumbprintLists = defaults.thumbprintLists;
    	      this.url = defaults.url;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setClientIdLists(@Nullable Input<List<String>> clientIdLists) {
            this.clientIdLists = clientIdLists;
            return this;
        }

        public Builder setClientIdLists(@Nullable List<String> clientIdLists) {
            this.clientIdLists = Input.ofNullable(clientIdLists);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setThumbprintLists(@Nullable Input<List<String>> thumbprintLists) {
            this.thumbprintLists = thumbprintLists;
            return this;
        }

        public Builder setThumbprintLists(@Nullable List<String> thumbprintLists) {
            this.thumbprintLists = Input.ofNullable(thumbprintLists);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public OpenIdConnectProviderState build() {
            return new OpenIdConnectProviderState(arn, clientIdLists, tags, tagsAll, thumbprintLists, url);
        }
    }
}
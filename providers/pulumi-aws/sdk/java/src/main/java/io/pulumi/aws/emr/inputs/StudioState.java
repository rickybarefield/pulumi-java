// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioState extends io.pulumi.resources.ResourceArgs {

    public static final StudioState Empty = new StudioState();

    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies whether the Studio authenticates users using IAM or Amazon Web Services SSO. Valid values are `SSO` or `IAM`.
     * 
     */
    @InputImport(name="authMode")
    private final @Nullable Input<String> authMode;

    public Input<String> getAuthMode() {
        return this.authMode == null ? Input.empty() : this.authMode;
    }

    /**
     * The Amazon S3 location to back up Amazon EMR Studio Workspaces and notebook files.
     * 
     */
    @InputImport(name="defaultS3Location")
    private final @Nullable Input<String> defaultS3Location;

    public Input<String> getDefaultS3Location() {
        return this.defaultS3Location == null ? Input.empty() : this.defaultS3Location;
    }

    /**
     * A detailed description of the Amazon EMR Studio.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the Amazon EMR Studio Engine security group. The Engine security group allows inbound network traffic from the Workspace security group, and it must be in the same VPC specified by `vpc_id`.
     * 
     */
    @InputImport(name="engineSecurityGroupId")
    private final @Nullable Input<String> engineSecurityGroupId;

    public Input<String> getEngineSecurityGroupId() {
        return this.engineSecurityGroupId == null ? Input.empty() : this.engineSecurityGroupId;
    }

    /**
     * The authentication endpoint of your identity provider (IdP). Specify this value when you use IAM authentication and want to let federated users log in to a Studio with the Studio URL and credentials from your IdP. Amazon EMR Studio redirects users to this endpoint to enter credentials.
     * 
     */
    @InputImport(name="idpAuthUrl")
    private final @Nullable Input<String> idpAuthUrl;

    public Input<String> getIdpAuthUrl() {
        return this.idpAuthUrl == null ? Input.empty() : this.idpAuthUrl;
    }

    /**
     * The name that your identity provider (IdP) uses for its RelayState parameter. For example, RelayState or TargetSource. Specify this value when you use IAM authentication and want to let federated users log in to a Studio using the Studio URL. The RelayState parameter differs by IdP.
     * 
     */
    @InputImport(name="idpRelayStateParameterName")
    private final @Nullable Input<String> idpRelayStateParameterName;

    public Input<String> getIdpRelayStateParameterName() {
        return this.idpRelayStateParameterName == null ? Input.empty() : this.idpRelayStateParameterName;
    }

    /**
     * A descriptive name for the Amazon EMR Studio.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The IAM role that the Amazon EMR Studio assumes. The service role provides a way for Amazon EMR Studio to interoperate with other Amazon Web Services services.
     * 
     */
    @InputImport(name="serviceRole")
    private final @Nullable Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole == null ? Input.empty() : this.serviceRole;
    }

    /**
     * A list of subnet IDs to associate with the Amazon EMR Studio. A Studio can have a maximum of 5 subnets. The subnets must belong to the VPC specified by `vpc_id`. Studio users can create a Workspace in any of the specified subnets.
     * 
     */
    @InputImport(name="subnetIds")
    private final @Nullable Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Input.empty() : this.subnetIds;
    }

    /**
     * list of tags to apply to the EMR Cluster. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The unique access URL of the Amazon EMR Studio.
     * 
     */
    @InputImport(name="url")
    private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * - The IAM user role that users and groups assume when logged in to an Amazon EMR Studio. Only specify a User Role when you use Amazon Web Services SSO authentication. The permissions attached to the User Role can be scoped down for each user or group using session policies.
     * 
     */
    @InputImport(name="userRole")
    private final @Nullable Input<String> userRole;

    public Input<String> getUserRole() {
        return this.userRole == null ? Input.empty() : this.userRole;
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (Amazon VPC) to associate with the Studio.
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    /**
     * The ID of the Amazon EMR Studio Workspace security group. The Workspace security group allows outbound network traffic to resources in the Engine security group, and it must be in the same VPC specified by `vpc_id`.
     * 
     */
    @InputImport(name="workspaceSecurityGroupId")
    private final @Nullable Input<String> workspaceSecurityGroupId;

    public Input<String> getWorkspaceSecurityGroupId() {
        return this.workspaceSecurityGroupId == null ? Input.empty() : this.workspaceSecurityGroupId;
    }

    public StudioState(
        @Nullable Input<String> arn,
        @Nullable Input<String> authMode,
        @Nullable Input<String> defaultS3Location,
        @Nullable Input<String> description,
        @Nullable Input<String> engineSecurityGroupId,
        @Nullable Input<String> idpAuthUrl,
        @Nullable Input<String> idpRelayStateParameterName,
        @Nullable Input<String> name,
        @Nullable Input<String> serviceRole,
        @Nullable Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> url,
        @Nullable Input<String> userRole,
        @Nullable Input<String> vpcId,
        @Nullable Input<String> workspaceSecurityGroupId) {
        this.arn = arn;
        this.authMode = authMode;
        this.defaultS3Location = defaultS3Location;
        this.description = description;
        this.engineSecurityGroupId = engineSecurityGroupId;
        this.idpAuthUrl = idpAuthUrl;
        this.idpRelayStateParameterName = idpRelayStateParameterName;
        this.name = name;
        this.serviceRole = serviceRole;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.url = url;
        this.userRole = userRole;
        this.vpcId = vpcId;
        this.workspaceSecurityGroupId = workspaceSecurityGroupId;
    }

    private StudioState() {
        this.arn = Input.empty();
        this.authMode = Input.empty();
        this.defaultS3Location = Input.empty();
        this.description = Input.empty();
        this.engineSecurityGroupId = Input.empty();
        this.idpAuthUrl = Input.empty();
        this.idpRelayStateParameterName = Input.empty();
        this.name = Input.empty();
        this.serviceRole = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.url = Input.empty();
        this.userRole = Input.empty();
        this.vpcId = Input.empty();
        this.workspaceSecurityGroupId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> authMode;
        private @Nullable Input<String> defaultS3Location;
        private @Nullable Input<String> description;
        private @Nullable Input<String> engineSecurityGroupId;
        private @Nullable Input<String> idpAuthUrl;
        private @Nullable Input<String> idpRelayStateParameterName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> serviceRole;
        private @Nullable Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> url;
        private @Nullable Input<String> userRole;
        private @Nullable Input<String> vpcId;
        private @Nullable Input<String> workspaceSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authMode = defaults.authMode;
    	      this.defaultS3Location = defaults.defaultS3Location;
    	      this.description = defaults.description;
    	      this.engineSecurityGroupId = defaults.engineSecurityGroupId;
    	      this.idpAuthUrl = defaults.idpAuthUrl;
    	      this.idpRelayStateParameterName = defaults.idpRelayStateParameterName;
    	      this.name = defaults.name;
    	      this.serviceRole = defaults.serviceRole;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.url = defaults.url;
    	      this.userRole = defaults.userRole;
    	      this.vpcId = defaults.vpcId;
    	      this.workspaceSecurityGroupId = defaults.workspaceSecurityGroupId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAuthMode(@Nullable Input<String> authMode) {
            this.authMode = authMode;
            return this;
        }

        public Builder setAuthMode(@Nullable String authMode) {
            this.authMode = Input.ofNullable(authMode);
            return this;
        }

        public Builder setDefaultS3Location(@Nullable Input<String> defaultS3Location) {
            this.defaultS3Location = defaultS3Location;
            return this;
        }

        public Builder setDefaultS3Location(@Nullable String defaultS3Location) {
            this.defaultS3Location = Input.ofNullable(defaultS3Location);
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

        public Builder setEngineSecurityGroupId(@Nullable Input<String> engineSecurityGroupId) {
            this.engineSecurityGroupId = engineSecurityGroupId;
            return this;
        }

        public Builder setEngineSecurityGroupId(@Nullable String engineSecurityGroupId) {
            this.engineSecurityGroupId = Input.ofNullable(engineSecurityGroupId);
            return this;
        }

        public Builder setIdpAuthUrl(@Nullable Input<String> idpAuthUrl) {
            this.idpAuthUrl = idpAuthUrl;
            return this;
        }

        public Builder setIdpAuthUrl(@Nullable String idpAuthUrl) {
            this.idpAuthUrl = Input.ofNullable(idpAuthUrl);
            return this;
        }

        public Builder setIdpRelayStateParameterName(@Nullable Input<String> idpRelayStateParameterName) {
            this.idpRelayStateParameterName = idpRelayStateParameterName;
            return this;
        }

        public Builder setIdpRelayStateParameterName(@Nullable String idpRelayStateParameterName) {
            this.idpRelayStateParameterName = Input.ofNullable(idpRelayStateParameterName);
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

        public Builder setServiceRole(@Nullable Input<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder setServiceRole(@Nullable String serviceRole) {
            this.serviceRole = Input.ofNullable(serviceRole);
            return this;
        }

        public Builder setSubnetIds(@Nullable Input<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }

        public Builder setSubnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Input.ofNullable(subnetIds);
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

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder setUserRole(@Nullable Input<String> userRole) {
            this.userRole = userRole;
            return this;
        }

        public Builder setUserRole(@Nullable String userRole) {
            this.userRole = Input.ofNullable(userRole);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }

        public Builder setWorkspaceSecurityGroupId(@Nullable Input<String> workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = workspaceSecurityGroupId;
            return this;
        }

        public Builder setWorkspaceSecurityGroupId(@Nullable String workspaceSecurityGroupId) {
            this.workspaceSecurityGroupId = Input.ofNullable(workspaceSecurityGroupId);
            return this;
        }
        public StudioState build() {
            return new StudioState(arn, authMode, defaultS3Location, description, engineSecurityGroupId, idpAuthUrl, idpRelayStateParameterName, name, serviceRole, subnetIds, tags, tagsAll, url, userRole, vpcId, workspaceSecurityGroupId);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.transfer.inputs;

import io.pulumi.aws.transfer.inputs.UserHomeDirectoryMappingGetArgs;
import io.pulumi.aws.transfer.inputs.UserPosixProfileGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * Amazon Resource Name (ARN) of Transfer User
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The landing directory (folder) for a user when they log in to the server using their SFTP client.  It should begin with a `/`.  The first item in the path is the name of the home bucket (accessible as `${Transfer:HomeBucket}` in the policy) and the rest is the home directory (accessible as `${Transfer:HomeDirectory}` in the policy). For example, `/example-bucket-1234/username` would set the home bucket to `example-bucket-1234` and the home directory to `username`.
     * 
     */
    @InputImport(name="homeDirectory")
    private final @Nullable Input<String> homeDirectory;

    public Input<String> getHomeDirectory() {
        return this.homeDirectory == null ? Input.empty() : this.homeDirectory;
    }

    /**
     * Logical directory mappings that specify what S3 paths and keys should be visible to your user and how you want to make them visible. See Home Directory Mappings below.
     * 
     */
    @InputImport(name="homeDirectoryMappings")
    private final @Nullable Input<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings;

    public Input<List<UserHomeDirectoryMappingGetArgs>> getHomeDirectoryMappings() {
        return this.homeDirectoryMappings == null ? Input.empty() : this.homeDirectoryMappings;
    }

    /**
     * The type of landing directory (folder) you mapped for your users' home directory. Valid values are `PATH` and `LOGICAL`.
     * 
     */
    @InputImport(name="homeDirectoryType")
    private final @Nullable Input<String> homeDirectoryType;

    public Input<String> getHomeDirectoryType() {
        return this.homeDirectoryType == null ? Input.empty() : this.homeDirectoryType;
    }

    /**
     * An IAM JSON policy document that scopes down user access to portions of their Amazon S3 bucket. IAM variables you can use inside this policy include `${Transfer:UserName}`, `${Transfer:HomeDirectory}`, and `${Transfer:HomeBucket}`. These are evaluated on-the-fly when navigating the bucket.
     * 
     */
    @InputImport(name="policy")
    private final @Nullable Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    /**
     * Specifies the full POSIX identity, including user ID (Uid), group ID (Gid), and any secondary groups IDs (SecondaryGids), that controls your users' access to your Amazon EFS file systems. See Posix Profile below.
     * 
     */
    @InputImport(name="posixProfile")
    private final @Nullable Input<UserPosixProfileGetArgs> posixProfile;

    public Input<UserPosixProfileGetArgs> getPosixProfile() {
        return this.posixProfile == null ? Input.empty() : this.posixProfile;
    }

    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to controls your user’s access to your Amazon S3 bucket.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * The Server ID of the Transfer Server (e.g., `s-12345678`)
     * 
     */
    @InputImport(name="serverId")
    private final @Nullable Input<String> serverId;

    public Input<String> getServerId() {
        return this.serverId == null ? Input.empty() : this.serverId;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The name used for log in to your SFTP server.
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserState(
        @Nullable Input<String> arn,
        @Nullable Input<String> homeDirectory,
        @Nullable Input<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings,
        @Nullable Input<String> homeDirectoryType,
        @Nullable Input<String> policy,
        @Nullable Input<UserPosixProfileGetArgs> posixProfile,
        @Nullable Input<String> role,
        @Nullable Input<String> serverId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> userName) {
        this.arn = arn;
        this.homeDirectory = homeDirectory;
        this.homeDirectoryMappings = homeDirectoryMappings;
        this.homeDirectoryType = homeDirectoryType;
        this.policy = policy;
        this.posixProfile = posixProfile;
        this.role = role;
        this.serverId = serverId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userName = userName;
    }

    private UserState() {
        this.arn = Input.empty();
        this.homeDirectory = Input.empty();
        this.homeDirectoryMappings = Input.empty();
        this.homeDirectoryType = Input.empty();
        this.policy = Input.empty();
        this.posixProfile = Input.empty();
        this.role = Input.empty();
        this.serverId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> homeDirectory;
        private @Nullable Input<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings;
        private @Nullable Input<String> homeDirectoryType;
        private @Nullable Input<String> policy;
        private @Nullable Input<UserPosixProfileGetArgs> posixProfile;
        private @Nullable Input<String> role;
        private @Nullable Input<String> serverId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.homeDirectory = defaults.homeDirectory;
    	      this.homeDirectoryMappings = defaults.homeDirectoryMappings;
    	      this.homeDirectoryType = defaults.homeDirectoryType;
    	      this.policy = defaults.policy;
    	      this.posixProfile = defaults.posixProfile;
    	      this.role = defaults.role;
    	      this.serverId = defaults.serverId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userName = defaults.userName;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setHomeDirectory(@Nullable Input<String> homeDirectory) {
            this.homeDirectory = homeDirectory;
            return this;
        }

        public Builder setHomeDirectory(@Nullable String homeDirectory) {
            this.homeDirectory = Input.ofNullable(homeDirectory);
            return this;
        }

        public Builder setHomeDirectoryMappings(@Nullable Input<List<UserHomeDirectoryMappingGetArgs>> homeDirectoryMappings) {
            this.homeDirectoryMappings = homeDirectoryMappings;
            return this;
        }

        public Builder setHomeDirectoryMappings(@Nullable List<UserHomeDirectoryMappingGetArgs> homeDirectoryMappings) {
            this.homeDirectoryMappings = Input.ofNullable(homeDirectoryMappings);
            return this;
        }

        public Builder setHomeDirectoryType(@Nullable Input<String> homeDirectoryType) {
            this.homeDirectoryType = homeDirectoryType;
            return this;
        }

        public Builder setHomeDirectoryType(@Nullable String homeDirectoryType) {
            this.homeDirectoryType = Input.ofNullable(homeDirectoryType);
            return this;
        }

        public Builder setPolicy(@Nullable Input<String> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable String policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public Builder setPosixProfile(@Nullable Input<UserPosixProfileGetArgs> posixProfile) {
            this.posixProfile = posixProfile;
            return this;
        }

        public Builder setPosixProfile(@Nullable UserPosixProfileGetArgs posixProfile) {
            this.posixProfile = Input.ofNullable(posixProfile);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setServerId(@Nullable Input<String> serverId) {
            this.serverId = serverId;
            return this;
        }

        public Builder setServerId(@Nullable String serverId) {
            this.serverId = Input.ofNullable(serverId);
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

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public UserState build() {
            return new UserState(arn, homeDirectory, homeDirectoryMappings, homeDirectoryType, policy, posixProfile, role, serverId, tags, tagsAll, userName);
        }
    }
}
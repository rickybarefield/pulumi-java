// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.workspaces.WorkspaceArgs;
import io.pulumi.aws.workspaces.inputs.WorkspaceState;
import io.pulumi.aws.workspaces.outputs.WorkspaceWorkspaceProperties;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a workspace in [AWS Workspaces](https://docs.aws.amazon.com/workspaces/latest/adminguide/amazon-workspaces.html) Service
 * 
 * > **NOTE:** AWS WorkSpaces service requires [`workspaces_DefaultRole`](https://docs.aws.amazon.com/workspaces/latest/adminguide/workspaces-access-control.html#create-default-role) IAM role to operate normally.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Workspaces can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:workspaces/workspace:Workspace example ws-9z9zmbkhv
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/workspace:Workspace")
public class Workspace extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the bundle for the WorkSpace.
     * 
     */
    @OutputExport(name="bundleId", type=String.class, parameters={})
    private Output<String> bundleId;

    /**
     * @return The ID of the bundle for the WorkSpace.
     * 
     */
    public Output<String> getBundleId() {
        return this.bundleId;
    }
    /**
     * The name of the WorkSpace, as seen by the operating system.
     * 
     */
    @OutputExport(name="computerName", type=String.class, parameters={})
    private Output<String> computerName;

    /**
     * @return The name of the WorkSpace, as seen by the operating system.
     * 
     */
    public Output<String> getComputerName() {
        return this.computerName;
    }
    /**
     * The ID of the directory for the WorkSpace.
     * 
     */
    @OutputExport(name="directoryId", type=String.class, parameters={})
    private Output<String> directoryId;

    /**
     * @return The ID of the directory for the WorkSpace.
     * 
     */
    public Output<String> getDirectoryId() {
        return this.directoryId;
    }
    /**
     * The IP address of the WorkSpace.
     * 
     */
    @OutputExport(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The IP address of the WorkSpace.
     * 
     */
    public Output<String> getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Indicates whether the data stored on the root volume is encrypted.
     * 
     */
    @OutputExport(name="rootVolumeEncryptionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> rootVolumeEncryptionEnabled;

    /**
     * @return Indicates whether the data stored on the root volume is encrypted.
     * 
     */
    public Output</* @Nullable */ Boolean> getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled;
    }
    /**
     * The operational state of the WorkSpace.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The operational state of the WorkSpace.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The tags for the WorkSpace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags for the WorkSpace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }
    /**
     * Indicates whether the data stored on the user volume is encrypted.
     * 
     */
    @OutputExport(name="userVolumeEncryptionEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> userVolumeEncryptionEnabled;

    /**
     * @return Indicates whether the data stored on the user volume is encrypted.
     * 
     */
    public Output</* @Nullable */ Boolean> getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled;
    }
    /**
     * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
     * 
     */
    @OutputExport(name="volumeEncryptionKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> volumeEncryptionKey;

    /**
     * @return The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
     * 
     */
    public Output</* @Nullable */ String> getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }
    /**
     * The WorkSpace properties.
     * 
     */
    @OutputExport(name="workspaceProperties", type=WorkspaceWorkspaceProperties.class, parameters={})
    private Output<WorkspaceWorkspaceProperties> workspaceProperties;

    /**
     * @return The WorkSpace properties.
     * 
     */
    public Output<WorkspaceWorkspaceProperties> getWorkspaceProperties() {
        return this.workspaceProperties;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workspace(String name, WorkspaceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/workspace:Workspace", name, args == null ? WorkspaceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Workspace(String name, Input<String> id, @Nullable WorkspaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/workspace:Workspace", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Workspace get(String name, Input<String> id, @Nullable WorkspaceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Workspace(name, id, state, options);
    }
}
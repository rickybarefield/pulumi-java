// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DefaultVpcArgs;
import io.pulumi.aws.ec2.inputs.DefaultVpcState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage the [default AWS VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html)
 * in the current region.
 * 
 * For AWS accounts created after 2013-12-04, each region comes with a Default VPC.
 * **This is an advanced resource**, and has special caveats to be aware of when
 * using it. Please read this document in its entirety before using this resource.
 * 
 * The `aws.ec2.DefaultVpc` behaves differently from normal resources, in that
 * this provider does not _create_ this resource, but instead "adopts" it
 * into management.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Default VPCs can be imported using the `vpc id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultVpc:DefaultVpc default vpc-a01106c2
 * ```
 * 
 */
@ResourceType(type="aws:ec2/defaultVpc:DefaultVpc")
public class DefaultVpc extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of VPC
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of VPC
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether or not an Amazon-provided IPv6 CIDR
     * block with a /56 prefix length for the VPC was assigned
     * 
     */
    @OutputExport(name="assignGeneratedIpv6CidrBlock", type=Boolean.class, parameters={})
    private Output<Boolean> assignGeneratedIpv6CidrBlock;

    /**
     * @return Whether or not an Amazon-provided IPv6 CIDR
     * block with a /56 prefix length for the VPC was assigned
     * 
     */
    public Output<Boolean> getAssignGeneratedIpv6CidrBlock() {
        return this.assignGeneratedIpv6CidrBlock;
    }
    /**
     * The CIDR block of the VPC
     * 
     */
    @OutputExport(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block of the VPC
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The ID of the network ACL created by default on VPC creation
     * 
     */
    @OutputExport(name="defaultNetworkAclId", type=String.class, parameters={})
    private Output<String> defaultNetworkAclId;

    /**
     * @return The ID of the network ACL created by default on VPC creation
     * 
     */
    public Output<String> getDefaultNetworkAclId() {
        return this.defaultNetworkAclId;
    }
    /**
     * The ID of the route table created by default on VPC creation
     * 
     */
    @OutputExport(name="defaultRouteTableId", type=String.class, parameters={})
    private Output<String> defaultRouteTableId;

    /**
     * @return The ID of the route table created by default on VPC creation
     * 
     */
    public Output<String> getDefaultRouteTableId() {
        return this.defaultRouteTableId;
    }
    /**
     * The ID of the security group created by default on VPC creation
     * 
     */
    @OutputExport(name="defaultSecurityGroupId", type=String.class, parameters={})
    private Output<String> defaultSecurityGroupId;

    /**
     * @return The ID of the security group created by default on VPC creation
     * 
     */
    public Output<String> getDefaultSecurityGroupId() {
        return this.defaultSecurityGroupId;
    }
    @OutputExport(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    /**
     * A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    @OutputExport(name="enableClassiclink", type=Boolean.class, parameters={})
    private Output<Boolean> enableClassiclink;

    /**
     * @return A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    public Output<Boolean> getEnableClassiclink() {
        return this.enableClassiclink;
    }
    @OutputExport(name="enableClassiclinkDnsSupport", type=Boolean.class, parameters={})
    private Output<Boolean> enableClassiclinkDnsSupport;

    public Output<Boolean> getEnableClassiclinkDnsSupport() {
        return this.enableClassiclinkDnsSupport;
    }
    /**
     * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    @OutputExport(name="enableDnsHostnames", type=Boolean.class, parameters={})
    private Output<Boolean> enableDnsHostnames;

    /**
     * @return A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    public Output<Boolean> getEnableDnsHostnames() {
        return this.enableDnsHostnames;
    }
    /**
     * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    @OutputExport(name="enableDnsSupport", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDnsSupport;

    /**
     * @return A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableDnsSupport() {
        return this.enableDnsSupport;
    }
    /**
     * Tenancy of instances spin up within VPC.
     * 
     */
    @OutputExport(name="instanceTenancy", type=String.class, parameters={})
    private Output<String> instanceTenancy;

    /**
     * @return Tenancy of instances spin up within VPC.
     * 
     */
    public Output<String> getInstanceTenancy() {
        return this.instanceTenancy;
    }
    @OutputExport(name="ipv4IpamPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv4IpamPoolId;

    public Output</* @Nullable */ String> getIpv4IpamPoolId() {
        return this.ipv4IpamPoolId;
    }
    @OutputExport(name="ipv4NetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipv4NetmaskLength;

    public Output</* @Nullable */ Integer> getIpv4NetmaskLength() {
        return this.ipv4NetmaskLength;
    }
    /**
     * The association ID for the IPv6 CIDR block of the VPC
     * 
     */
    @OutputExport(name="ipv6AssociationId", type=String.class, parameters={})
    private Output<String> ipv6AssociationId;

    /**
     * @return The association ID for the IPv6 CIDR block of the VPC
     * 
     */
    public Output<String> getIpv6AssociationId() {
        return this.ipv6AssociationId;
    }
    /**
     * The IPv6 CIDR block of the VPC
     * 
     */
    @OutputExport(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output<String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block of the VPC
     * 
     */
    public Output<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    @OutputExport(name="ipv6CidrBlockNetworkBorderGroup", type=String.class, parameters={})
    private Output<String> ipv6CidrBlockNetworkBorderGroup;

    public Output<String> getIpv6CidrBlockNetworkBorderGroup() {
        return this.ipv6CidrBlockNetworkBorderGroup;
    }
    @OutputExport(name="ipv6IpamPoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6IpamPoolId;

    public Output</* @Nullable */ String> getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId;
    }
    @OutputExport(name="ipv6NetmaskLength", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipv6NetmaskLength;

    public Output</* @Nullable */ Integer> getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength;
    }
    /**
     * The ID of the main route table associated with
     * this VPC. Note that you can change a VPC's main route table by using an
     * `aws.ec2.MainRouteTableAssociation`
     * 
     */
    @OutputExport(name="mainRouteTableId", type=String.class, parameters={})
    private Output<String> mainRouteTableId;

    /**
     * @return The ID of the main route table associated with
     * this VPC. Note that you can change a VPC's main route table by using an
     * `aws.ec2.MainRouteTableAssociation`
     * 
     */
    public Output<String> getMainRouteTableId() {
        return this.mainRouteTableId;
    }
    /**
     * The ID of the AWS account that owns the VPC.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the VPC.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * A map of tags to assign to the resource.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultVpc(String name, @Nullable DefaultVpcArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultVpc:DefaultVpc", name, args == null ? DefaultVpcArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefaultVpc(String name, Input<String> id, @Nullable DefaultVpcState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultVpc:DefaultVpc", name, state, makeResourceOptions(options, id));
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
    public static DefaultVpc get(String name, Input<String> id, @Nullable DefaultVpcState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultVpc(name, id, state, options);
    }
}
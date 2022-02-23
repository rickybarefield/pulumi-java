// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetRouteResult {
    private final String carrierGatewayId;
    private final String destinationCidrBlock;
    private final String destinationIpv6CidrBlock;
    private final String destinationPrefixListId;
    private final String egressOnlyGatewayId;
    private final String gatewayId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String instanceId;
    private final String localGatewayId;
    private final String natGatewayId;
    private final String networkInterfaceId;
    private final String routeTableId;
    private final String transitGatewayId;
    private final String vpcPeeringConnectionId;

    @OutputCustomType.Constructor({"carrierGatewayId","destinationCidrBlock","destinationIpv6CidrBlock","destinationPrefixListId","egressOnlyGatewayId","gatewayId","id","instanceId","localGatewayId","natGatewayId","networkInterfaceId","routeTableId","transitGatewayId","vpcPeeringConnectionId"})
    private GetRouteResult(
        String carrierGatewayId,
        String destinationCidrBlock,
        String destinationIpv6CidrBlock,
        String destinationPrefixListId,
        String egressOnlyGatewayId,
        String gatewayId,
        String id,
        String instanceId,
        String localGatewayId,
        String natGatewayId,
        String networkInterfaceId,
        String routeTableId,
        String transitGatewayId,
        String vpcPeeringConnectionId) {
        this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
        this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
        this.destinationIpv6CidrBlock = Objects.requireNonNull(destinationIpv6CidrBlock);
        this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId);
        this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId);
        this.gatewayId = Objects.requireNonNull(gatewayId);
        this.id = Objects.requireNonNull(id);
        this.instanceId = Objects.requireNonNull(instanceId);
        this.localGatewayId = Objects.requireNonNull(localGatewayId);
        this.natGatewayId = Objects.requireNonNull(natGatewayId);
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
        this.routeTableId = Objects.requireNonNull(routeTableId);
        this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
        this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
    }

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }
    public String getDestinationIpv6CidrBlock() {
        return this.destinationIpv6CidrBlock;
    }
    public String getDestinationPrefixListId() {
        return this.destinationPrefixListId;
    }
    public String getEgressOnlyGatewayId() {
        return this.egressOnlyGatewayId;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getInstanceId() {
        return this.instanceId;
    }
    public String getLocalGatewayId() {
        return this.localGatewayId;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }
    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }
    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierGatewayId;
        private String destinationCidrBlock;
        private String destinationIpv6CidrBlock;
        private String destinationPrefixListId;
        private String egressOnlyGatewayId;
        private String gatewayId;
        private String id;
        private String instanceId;
        private String localGatewayId;
        private String natGatewayId;
        private String networkInterfaceId;
        private String routeTableId;
        private String transitGatewayId;
        private String vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.destinationCidrBlock = defaults.destinationCidrBlock;
    	      this.destinationIpv6CidrBlock = defaults.destinationIpv6CidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder setCarrierGatewayId(String carrierGatewayId) {
            this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
            return this;
        }

        public Builder setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = Objects.requireNonNull(destinationCidrBlock);
            return this;
        }

        public Builder setDestinationIpv6CidrBlock(String destinationIpv6CidrBlock) {
            this.destinationIpv6CidrBlock = Objects.requireNonNull(destinationIpv6CidrBlock);
            return this;
        }

        public Builder setDestinationPrefixListId(String destinationPrefixListId) {
            this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId);
            return this;
        }

        public Builder setEgressOnlyGatewayId(String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId);
            return this;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setLocalGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }

        public Builder setNatGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setRouteTableId(String routeTableId) {
            this.routeTableId = Objects.requireNonNull(routeTableId);
            return this;
        }

        public Builder setTransitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }

        public Builder setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }
        public GetRouteResult build() {
            return new GetRouteResult(carrierGatewayId, destinationCidrBlock, destinationIpv6CidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, id, instanceId, localGatewayId, natGatewayId, networkInterfaceId, routeTableId, transitGatewayId, vpcPeeringConnectionId);
        }
    }
}
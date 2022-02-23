// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BgpPeerState extends io.pulumi.resources.ResourceArgs {

    public static final BgpPeerState Empty = new BgpPeerState();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @InputImport(name="addressFamily")
    private final @Nullable Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily == null ? Input.empty() : this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @InputImport(name="amazonAddress")
    private final @Nullable Input<String> amazonAddress;

    public Input<String> getAmazonAddress() {
        return this.amazonAddress == null ? Input.empty() : this.amazonAddress;
    }

    /**
     * The Direct Connect endpoint on which the BGP peer terminates.
     * 
     */
    @InputImport(name="awsDevice")
    private final @Nullable Input<String> awsDevice;

    public Input<String> getAwsDevice() {
        return this.awsDevice == null ? Input.empty() : this.awsDevice;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @InputImport(name="bgpAsn")
    private final @Nullable Input<Integer> bgpAsn;

    public Input<Integer> getBgpAsn() {
        return this.bgpAsn == null ? Input.empty() : this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @InputImport(name="bgpAuthKey")
    private final @Nullable Input<String> bgpAuthKey;

    public Input<String> getBgpAuthKey() {
        return this.bgpAuthKey == null ? Input.empty() : this.bgpAuthKey;
    }

    /**
     * The ID of the BGP peer.
     * 
     */
    @InputImport(name="bgpPeerId")
    private final @Nullable Input<String> bgpPeerId;

    public Input<String> getBgpPeerId() {
        return this.bgpPeerId == null ? Input.empty() : this.bgpPeerId;
    }

    /**
     * The Up/Down state of the BGP peer.
     * 
     */
    @InputImport(name="bgpStatus")
    private final @Nullable Input<String> bgpStatus;

    public Input<String> getBgpStatus() {
        return this.bgpStatus == null ? Input.empty() : this.bgpStatus;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @InputImport(name="customerAddress")
    private final @Nullable Input<String> customerAddress;

    public Input<String> getCustomerAddress() {
        return this.customerAddress == null ? Input.empty() : this.customerAddress;
    }

    /**
     * The ID of the Direct Connect virtual interface on which to create the BGP peer.
     * 
     */
    @InputImport(name="virtualInterfaceId")
    private final @Nullable Input<String> virtualInterfaceId;

    public Input<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId == null ? Input.empty() : this.virtualInterfaceId;
    }

    public BgpPeerState(
        @Nullable Input<String> addressFamily,
        @Nullable Input<String> amazonAddress,
        @Nullable Input<String> awsDevice,
        @Nullable Input<Integer> bgpAsn,
        @Nullable Input<String> bgpAuthKey,
        @Nullable Input<String> bgpPeerId,
        @Nullable Input<String> bgpStatus,
        @Nullable Input<String> customerAddress,
        @Nullable Input<String> virtualInterfaceId) {
        this.addressFamily = addressFamily;
        this.amazonAddress = amazonAddress;
        this.awsDevice = awsDevice;
        this.bgpAsn = bgpAsn;
        this.bgpAuthKey = bgpAuthKey;
        this.bgpPeerId = bgpPeerId;
        this.bgpStatus = bgpStatus;
        this.customerAddress = customerAddress;
        this.virtualInterfaceId = virtualInterfaceId;
    }

    private BgpPeerState() {
        this.addressFamily = Input.empty();
        this.amazonAddress = Input.empty();
        this.awsDevice = Input.empty();
        this.bgpAsn = Input.empty();
        this.bgpAuthKey = Input.empty();
        this.bgpPeerId = Input.empty();
        this.bgpStatus = Input.empty();
        this.customerAddress = Input.empty();
        this.virtualInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpPeerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressFamily;
        private @Nullable Input<String> amazonAddress;
        private @Nullable Input<String> awsDevice;
        private @Nullable Input<Integer> bgpAsn;
        private @Nullable Input<String> bgpAuthKey;
        private @Nullable Input<String> bgpPeerId;
        private @Nullable Input<String> bgpStatus;
        private @Nullable Input<String> customerAddress;
        private @Nullable Input<String> virtualInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BgpPeerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.awsDevice = defaults.awsDevice;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.bgpPeerId = defaults.bgpPeerId;
    	      this.bgpStatus = defaults.bgpStatus;
    	      this.customerAddress = defaults.customerAddress;
    	      this.virtualInterfaceId = defaults.virtualInterfaceId;
        }

        public Builder setAddressFamily(@Nullable Input<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        public Builder setAddressFamily(@Nullable String addressFamily) {
            this.addressFamily = Input.ofNullable(addressFamily);
            return this;
        }

        public Builder setAmazonAddress(@Nullable Input<String> amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }

        public Builder setAmazonAddress(@Nullable String amazonAddress) {
            this.amazonAddress = Input.ofNullable(amazonAddress);
            return this;
        }

        public Builder setAwsDevice(@Nullable Input<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }

        public Builder setAwsDevice(@Nullable String awsDevice) {
            this.awsDevice = Input.ofNullable(awsDevice);
            return this;
        }

        public Builder setBgpAsn(@Nullable Input<Integer> bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }

        public Builder setBgpAsn(@Nullable Integer bgpAsn) {
            this.bgpAsn = Input.ofNullable(bgpAsn);
            return this;
        }

        public Builder setBgpAuthKey(@Nullable Input<String> bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }

        public Builder setBgpAuthKey(@Nullable String bgpAuthKey) {
            this.bgpAuthKey = Input.ofNullable(bgpAuthKey);
            return this;
        }

        public Builder setBgpPeerId(@Nullable Input<String> bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        public Builder setBgpPeerId(@Nullable String bgpPeerId) {
            this.bgpPeerId = Input.ofNullable(bgpPeerId);
            return this;
        }

        public Builder setBgpStatus(@Nullable Input<String> bgpStatus) {
            this.bgpStatus = bgpStatus;
            return this;
        }

        public Builder setBgpStatus(@Nullable String bgpStatus) {
            this.bgpStatus = Input.ofNullable(bgpStatus);
            return this;
        }

        public Builder setCustomerAddress(@Nullable Input<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Builder setCustomerAddress(@Nullable String customerAddress) {
            this.customerAddress = Input.ofNullable(customerAddress);
            return this;
        }

        public Builder setVirtualInterfaceId(@Nullable Input<String> virtualInterfaceId) {
            this.virtualInterfaceId = virtualInterfaceId;
            return this;
        }

        public Builder setVirtualInterfaceId(@Nullable String virtualInterfaceId) {
            this.virtualInterfaceId = Input.ofNullable(virtualInterfaceId);
            return this;
        }
        public BgpPeerState build() {
            return new BgpPeerState(addressFamily, amazonAddress, awsDevice, bgpAsn, bgpAuthKey, bgpPeerId, bgpStatus, customerAddress, virtualInterfaceId);
        }
    }
}
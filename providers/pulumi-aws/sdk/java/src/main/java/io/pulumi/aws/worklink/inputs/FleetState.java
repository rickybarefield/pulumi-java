// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.aws.worklink.inputs.FleetIdentityProviderGetArgs;
import io.pulumi.aws.worklink.inputs.FleetNetworkGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetState extends io.pulumi.resources.ResourceArgs {

    public static final FleetState Empty = new FleetState();

    /**
     * The ARN of the created WorkLink Fleet.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
     * 
     */
    @InputImport(name="auditStreamArn")
    private final @Nullable Input<String> auditStreamArn;

    public Input<String> getAuditStreamArn() {
        return this.auditStreamArn == null ? Input.empty() : this.auditStreamArn;
    }

    /**
     * The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    @InputImport(name="companyCode")
    private final @Nullable Input<String> companyCode;

    public Input<String> getCompanyCode() {
        return this.companyCode == null ? Input.empty() : this.companyCode;
    }

    /**
     * The time that the fleet was created.
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable Input<String> createdTime;

    public Input<String> getCreatedTime() {
        return this.createdTime == null ? Input.empty() : this.createdTime;
    }

    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @InputImport(name="deviceCaCertificate")
    private final @Nullable Input<String> deviceCaCertificate;

    public Input<String> getDeviceCaCertificate() {
        return this.deviceCaCertificate == null ? Input.empty() : this.deviceCaCertificate;
    }

    /**
     * The name of the fleet.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @InputImport(name="identityProvider")
    private final @Nullable Input<FleetIdentityProviderGetArgs> identityProvider;

    public Input<FleetIdentityProviderGetArgs> getIdentityProvider() {
        return this.identityProvider == null ? Input.empty() : this.identityProvider;
    }

    /**
     * The time that the fleet was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTime")
    private final @Nullable Input<String> lastUpdatedTime;

    public Input<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Input.empty() : this.lastUpdatedTime;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<FleetNetworkGetArgs> network;

    public Input<FleetNetworkGetArgs> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    @InputImport(name="optimizeForEndUserLocation")
    private final @Nullable Input<Boolean> optimizeForEndUserLocation;

    public Input<Boolean> getOptimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation == null ? Input.empty() : this.optimizeForEndUserLocation;
    }

    public FleetState(
        @Nullable Input<String> arn,
        @Nullable Input<String> auditStreamArn,
        @Nullable Input<String> companyCode,
        @Nullable Input<String> createdTime,
        @Nullable Input<String> deviceCaCertificate,
        @Nullable Input<String> displayName,
        @Nullable Input<FleetIdentityProviderGetArgs> identityProvider,
        @Nullable Input<String> lastUpdatedTime,
        @Nullable Input<String> name,
        @Nullable Input<FleetNetworkGetArgs> network,
        @Nullable Input<Boolean> optimizeForEndUserLocation) {
        this.arn = arn;
        this.auditStreamArn = auditStreamArn;
        this.companyCode = companyCode;
        this.createdTime = createdTime;
        this.deviceCaCertificate = deviceCaCertificate;
        this.displayName = displayName;
        this.identityProvider = identityProvider;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.network = network;
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
    }

    private FleetState() {
        this.arn = Input.empty();
        this.auditStreamArn = Input.empty();
        this.companyCode = Input.empty();
        this.createdTime = Input.empty();
        this.deviceCaCertificate = Input.empty();
        this.displayName = Input.empty();
        this.identityProvider = Input.empty();
        this.lastUpdatedTime = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.optimizeForEndUserLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> auditStreamArn;
        private @Nullable Input<String> companyCode;
        private @Nullable Input<String> createdTime;
        private @Nullable Input<String> deviceCaCertificate;
        private @Nullable Input<String> displayName;
        private @Nullable Input<FleetIdentityProviderGetArgs> identityProvider;
        private @Nullable Input<String> lastUpdatedTime;
        private @Nullable Input<String> name;
        private @Nullable Input<FleetNetworkGetArgs> network;
        private @Nullable Input<Boolean> optimizeForEndUserLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auditStreamArn = defaults.auditStreamArn;
    	      this.companyCode = defaults.companyCode;
    	      this.createdTime = defaults.createdTime;
    	      this.deviceCaCertificate = defaults.deviceCaCertificate;
    	      this.displayName = defaults.displayName;
    	      this.identityProvider = defaults.identityProvider;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.optimizeForEndUserLocation = defaults.optimizeForEndUserLocation;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAuditStreamArn(@Nullable Input<String> auditStreamArn) {
            this.auditStreamArn = auditStreamArn;
            return this;
        }

        public Builder setAuditStreamArn(@Nullable String auditStreamArn) {
            this.auditStreamArn = Input.ofNullable(auditStreamArn);
            return this;
        }

        public Builder setCompanyCode(@Nullable Input<String> companyCode) {
            this.companyCode = companyCode;
            return this;
        }

        public Builder setCompanyCode(@Nullable String companyCode) {
            this.companyCode = Input.ofNullable(companyCode);
            return this;
        }

        public Builder setCreatedTime(@Nullable Input<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = Input.ofNullable(createdTime);
            return this;
        }

        public Builder setDeviceCaCertificate(@Nullable Input<String> deviceCaCertificate) {
            this.deviceCaCertificate = deviceCaCertificate;
            return this;
        }

        public Builder setDeviceCaCertificate(@Nullable String deviceCaCertificate) {
            this.deviceCaCertificate = Input.ofNullable(deviceCaCertificate);
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

        public Builder setIdentityProvider(@Nullable Input<FleetIdentityProviderGetArgs> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setIdentityProvider(@Nullable FleetIdentityProviderGetArgs identityProvider) {
            this.identityProvider = Input.ofNullable(identityProvider);
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable Input<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Input.ofNullable(lastUpdatedTime);
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

        public Builder setNetwork(@Nullable Input<FleetNetworkGetArgs> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable FleetNetworkGetArgs network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setOptimizeForEndUserLocation(@Nullable Input<Boolean> optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = optimizeForEndUserLocation;
            return this;
        }

        public Builder setOptimizeForEndUserLocation(@Nullable Boolean optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = Input.ofNullable(optimizeForEndUserLocation);
            return this;
        }
        public FleetState build() {
            return new FleetState(arn, auditStreamArn, companyCode, createdTime, deviceCaCertificate, displayName, identityProvider, lastUpdatedTime, name, network, optimizeForEndUserLocation);
        }
    }
}
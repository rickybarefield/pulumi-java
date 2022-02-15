// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetEnvironmentConfigPrivateEnvironmentConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigPrivateEnvironmentConfig Empty = new GetEnvironmentConfigPrivateEnvironmentConfig();

    @InputImport(name="cloudComposerConnectionSubnetwork", required=true)
    private final String cloudComposerConnectionSubnetwork;

    public String getCloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork;
    }

    @InputImport(name="cloudComposerNetworkIpv4CidrBlock", required=true)
    private final String cloudComposerNetworkIpv4CidrBlock;

    public String getCloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }

    @InputImport(name="cloudSqlIpv4CidrBlock", required=true)
    private final String cloudSqlIpv4CidrBlock;

    public String getCloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }

    @InputImport(name="enablePrivateEndpoint", required=true)
    private final Boolean enablePrivateEndpoint;

    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    @InputImport(name="enablePrivatelyUsedPublicIps", required=true)
    private final Boolean enablePrivatelyUsedPublicIps;

    public Boolean getEnablePrivatelyUsedPublicIps() {
        return this.enablePrivatelyUsedPublicIps;
    }

    @InputImport(name="masterIpv4CidrBlock", required=true)
    private final String masterIpv4CidrBlock;

    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    @InputImport(name="webServerIpv4CidrBlock", required=true)
    private final String webServerIpv4CidrBlock;

    public String getWebServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
    }

    public GetEnvironmentConfigPrivateEnvironmentConfig(
        String cloudComposerConnectionSubnetwork,
        String cloudComposerNetworkIpv4CidrBlock,
        String cloudSqlIpv4CidrBlock,
        Boolean enablePrivateEndpoint,
        Boolean enablePrivatelyUsedPublicIps,
        String masterIpv4CidrBlock,
        String webServerIpv4CidrBlock) {
        this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork, "expected parameter 'cloudComposerConnectionSubnetwork' to be non-null");
        this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock, "expected parameter 'cloudComposerNetworkIpv4CidrBlock' to be non-null");
        this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock, "expected parameter 'cloudSqlIpv4CidrBlock' to be non-null");
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint, "expected parameter 'enablePrivateEndpoint' to be non-null");
        this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps, "expected parameter 'enablePrivatelyUsedPublicIps' to be non-null");
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock, "expected parameter 'masterIpv4CidrBlock' to be non-null");
        this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock, "expected parameter 'webServerIpv4CidrBlock' to be non-null");
    }

    private GetEnvironmentConfigPrivateEnvironmentConfig() {
        this.cloudComposerConnectionSubnetwork = null;
        this.cloudComposerNetworkIpv4CidrBlock = null;
        this.cloudSqlIpv4CidrBlock = null;
        this.enablePrivateEndpoint = null;
        this.enablePrivatelyUsedPublicIps = null;
        this.masterIpv4CidrBlock = null;
        this.webServerIpv4CidrBlock = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigPrivateEnvironmentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudComposerConnectionSubnetwork;
        private String cloudComposerNetworkIpv4CidrBlock;
        private String cloudSqlIpv4CidrBlock;
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivatelyUsedPublicIps;
        private String masterIpv4CidrBlock;
        private String webServerIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigPrivateEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivatelyUsedPublicIps = defaults.enablePrivatelyUsedPublicIps;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
        }

        public Builder setCloudComposerConnectionSubnetwork(String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
            return this;
        }

        public Builder setCloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }

        public Builder setCloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
            return this;
        }

        public Builder setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder setEnablePrivatelyUsedPublicIps(Boolean enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }

        public Builder setWebServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
            return this;
        }

        public GetEnvironmentConfigPrivateEnvironmentConfig build() {
            return new GetEnvironmentConfigPrivateEnvironmentConfig(cloudComposerConnectionSubnetwork, cloudComposerNetworkIpv4CidrBlock, cloudSqlIpv4CidrBlock, enablePrivateEndpoint, enablePrivatelyUsedPublicIps, masterIpv4CidrBlock, webServerIpv4CidrBlock);
        }
    }
}
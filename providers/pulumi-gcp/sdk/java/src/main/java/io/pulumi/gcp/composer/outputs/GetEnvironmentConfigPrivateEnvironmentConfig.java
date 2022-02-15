// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigPrivateEnvironmentConfig {
    private final String cloudComposerConnectionSubnetwork;
    private final String cloudComposerNetworkIpv4CidrBlock;
    private final String cloudSqlIpv4CidrBlock;
    private final Boolean enablePrivateEndpoint;
    private final Boolean enablePrivatelyUsedPublicIps;
    private final String masterIpv4CidrBlock;
    private final String webServerIpv4CidrBlock;

    @OutputCustomType.Constructor({"cloudComposerConnectionSubnetwork","cloudComposerNetworkIpv4CidrBlock","cloudSqlIpv4CidrBlock","enablePrivateEndpoint","enablePrivatelyUsedPublicIps","masterIpv4CidrBlock","webServerIpv4CidrBlock"})
    private GetEnvironmentConfigPrivateEnvironmentConfig(
        String cloudComposerConnectionSubnetwork,
        String cloudComposerNetworkIpv4CidrBlock,
        String cloudSqlIpv4CidrBlock,
        Boolean enablePrivateEndpoint,
        Boolean enablePrivatelyUsedPublicIps,
        String masterIpv4CidrBlock,
        String webServerIpv4CidrBlock) {
        this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
        this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
        this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
        this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps);
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
        this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
    }

    public String getCloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork;
    }
    public String getCloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }
    public String getCloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }
    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    public Boolean getEnablePrivatelyUsedPublicIps() {
        return this.enablePrivatelyUsedPublicIps;
    }
    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    public String getWebServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
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
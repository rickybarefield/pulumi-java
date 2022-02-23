// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.aws.connect.outputs.GetQuickConnectQuickConnectConfigPhoneConfig;
import io.pulumi.aws.connect.outputs.GetQuickConnectQuickConnectConfigQueueConfig;
import io.pulumi.aws.connect.outputs.GetQuickConnectQuickConnectConfigUserConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetQuickConnectQuickConnectConfig {
    /**
     * Specifies the phone configuration of the Quick Connect. This is returned only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    private final List<GetQuickConnectQuickConnectConfigPhoneConfig> phoneConfigs;
    /**
     * Specifies the queue configuration of the Quick Connect. This is returned only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    private final List<GetQuickConnectQuickConnectConfigQueueConfig> queueConfigs;
    /**
     * Specifies the configuration type of the Quick Connect. Valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    private final String quickConnectType;
    /**
     * Specifies the user configuration of the Quick Connect. This is returned only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    private final List<GetQuickConnectQuickConnectConfigUserConfig> userConfigs;

    @OutputCustomType.Constructor({"phoneConfigs","queueConfigs","quickConnectType","userConfigs"})
    private GetQuickConnectQuickConnectConfig(
        List<GetQuickConnectQuickConnectConfigPhoneConfig> phoneConfigs,
        List<GetQuickConnectQuickConnectConfigQueueConfig> queueConfigs,
        String quickConnectType,
        List<GetQuickConnectQuickConnectConfigUserConfig> userConfigs) {
        this.phoneConfigs = Objects.requireNonNull(phoneConfigs);
        this.queueConfigs = Objects.requireNonNull(queueConfigs);
        this.quickConnectType = Objects.requireNonNull(quickConnectType);
        this.userConfigs = Objects.requireNonNull(userConfigs);
    }

    /**
     * Specifies the phone configuration of the Quick Connect. This is returned only if `quick_connect_type` is `PHONE_NUMBER`. The `phone_config` block is documented below.
     * 
     */
    public List<GetQuickConnectQuickConnectConfigPhoneConfig> getPhoneConfigs() {
        return this.phoneConfigs;
    }
    /**
     * Specifies the queue configuration of the Quick Connect. This is returned only if `quick_connect_type` is `QUEUE`. The `queue_config` block is documented below.
     * 
     */
    public List<GetQuickConnectQuickConnectConfigQueueConfig> getQueueConfigs() {
        return this.queueConfigs;
    }
    /**
     * Specifies the configuration type of the Quick Connect. Valid values are `PHONE_NUMBER`, `QUEUE`, `USER`.
     * 
     */
    public String getQuickConnectType() {
        return this.quickConnectType;
    }
    /**
     * Specifies the user configuration of the Quick Connect. This is returned only if `quick_connect_type` is `USER`. The `user_config` block is documented below.
     * 
     */
    public List<GetQuickConnectQuickConnectConfigUserConfig> getUserConfigs() {
        return this.userConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuickConnectQuickConnectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetQuickConnectQuickConnectConfigPhoneConfig> phoneConfigs;
        private List<GetQuickConnectQuickConnectConfigQueueConfig> queueConfigs;
        private String quickConnectType;
        private List<GetQuickConnectQuickConnectConfigUserConfig> userConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuickConnectQuickConnectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneConfigs = defaults.phoneConfigs;
    	      this.queueConfigs = defaults.queueConfigs;
    	      this.quickConnectType = defaults.quickConnectType;
    	      this.userConfigs = defaults.userConfigs;
        }

        public Builder setPhoneConfigs(List<GetQuickConnectQuickConnectConfigPhoneConfig> phoneConfigs) {
            this.phoneConfigs = Objects.requireNonNull(phoneConfigs);
            return this;
        }

        public Builder setQueueConfigs(List<GetQuickConnectQuickConnectConfigQueueConfig> queueConfigs) {
            this.queueConfigs = Objects.requireNonNull(queueConfigs);
            return this;
        }

        public Builder setQuickConnectType(String quickConnectType) {
            this.quickConnectType = Objects.requireNonNull(quickConnectType);
            return this;
        }

        public Builder setUserConfigs(List<GetQuickConnectQuickConnectConfigUserConfig> userConfigs) {
            this.userConfigs = Objects.requireNonNull(userConfigs);
            return this;
        }
        public GetQuickConnectQuickConnectConfig build() {
            return new GetQuickConnectQuickConnectConfig(phoneConfigs, queueConfigs, quickConnectType, userConfigs);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetLateDataRuleConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetLateDataRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetLateDataRuleArgs Empty = new DatasetLateDataRuleArgs();

    @InputImport(name="ruleConfiguration", required=true)
    private final Input<DatasetLateDataRuleConfigurationArgs> ruleConfiguration;

    public Input<DatasetLateDataRuleConfigurationArgs> getRuleConfiguration() {
        return this.ruleConfiguration;
    }

    @InputImport(name="ruleName")
    private final @Nullable Input<String> ruleName;

    public Input<String> getRuleName() {
        return this.ruleName == null ? Input.empty() : this.ruleName;
    }

    public DatasetLateDataRuleArgs(
        Input<DatasetLateDataRuleConfigurationArgs> ruleConfiguration,
        @Nullable Input<String> ruleName) {
        this.ruleConfiguration = Objects.requireNonNull(ruleConfiguration, "expected parameter 'ruleConfiguration' to be non-null");
        this.ruleName = ruleName;
    }

    private DatasetLateDataRuleArgs() {
        this.ruleConfiguration = Input.empty();
        this.ruleName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetLateDataRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DatasetLateDataRuleConfigurationArgs> ruleConfiguration;
        private @Nullable Input<String> ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetLateDataRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleConfiguration = defaults.ruleConfiguration;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setRuleConfiguration(Input<DatasetLateDataRuleConfigurationArgs> ruleConfiguration) {
            this.ruleConfiguration = Objects.requireNonNull(ruleConfiguration);
            return this;
        }

        public Builder setRuleConfiguration(DatasetLateDataRuleConfigurationArgs ruleConfiguration) {
            this.ruleConfiguration = Input.of(Objects.requireNonNull(ruleConfiguration));
            return this;
        }

        public Builder setRuleName(@Nullable Input<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder setRuleName(@Nullable String ruleName) {
            this.ruleName = Input.ofNullable(ruleName);
            return this;
        }

        public DatasetLateDataRuleArgs build() {
            return new DatasetLateDataRuleArgs(ruleConfiguration, ruleName);
        }
    }
}
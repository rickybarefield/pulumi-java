// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleQueryStringKeyValue;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleQueryStringConfig {
    private final @Nullable List<ListenerRuleQueryStringKeyValue> values;

    @OutputCustomType.Constructor({"values"})
    private ListenerRuleQueryStringConfig(@Nullable List<ListenerRuleQueryStringKeyValue> values) {
        this.values = values;
    }

    public List<ListenerRuleQueryStringKeyValue> getValues() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleQueryStringConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ListenerRuleQueryStringKeyValue> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleQueryStringConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable List<ListenerRuleQueryStringKeyValue> values) {
            this.values = values;
            return this;
        }

        public ListenerRuleQueryStringConfig build() {
            return new ListenerRuleQueryStringConfig(values);
        }
    }
}
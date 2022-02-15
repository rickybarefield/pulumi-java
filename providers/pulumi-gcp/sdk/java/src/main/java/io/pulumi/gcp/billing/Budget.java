// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.billing.BudgetArgs;
import io.pulumi.gcp.billing.inputs.BudgetState;
import io.pulumi.gcp.billing.outputs.BudgetAllUpdatesRule;
import io.pulumi.gcp.billing.outputs.BudgetAmount;
import io.pulumi.gcp.billing.outputs.BudgetBudgetFilter;
import io.pulumi.gcp.billing.outputs.BudgetThresholdRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:billing/budget:Budget")
public class Budget extends io.pulumi.resources.CustomResource {
    @OutputExport(name="allUpdatesRule", type=BudgetAllUpdatesRule.class, parameters={})
    private Output</* @Nullable */ BudgetAllUpdatesRule> allUpdatesRule;

    public Output</* @Nullable */ BudgetAllUpdatesRule> getAllUpdatesRule() {
        return this.allUpdatesRule;
    }
    @OutputExport(name="amount", type=BudgetAmount.class, parameters={})
    private Output<BudgetAmount> amount;

    public Output<BudgetAmount> getAmount() {
        return this.amount;
    }
    @OutputExport(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    @OutputExport(name="budgetFilter", type=BudgetBudgetFilter.class, parameters={})
    private Output<BudgetBudgetFilter> budgetFilter;

    public Output<BudgetBudgetFilter> getBudgetFilter() {
        return this.budgetFilter;
    }
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="thresholdRules", type=List.class, parameters={BudgetThresholdRule.class})
    private Output<List<BudgetThresholdRule>> thresholdRules;

    public Output<List<BudgetThresholdRule>> getThresholdRules() {
        return this.thresholdRules;
    }

    public Budget(String name, BudgetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, args == null ? BudgetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Budget(String name, Input<String> id, @Nullable BudgetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/budget:Budget", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Budget get(String name, Input<String> id, @Nullable BudgetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Budget(name, id, state, options);
    }
}
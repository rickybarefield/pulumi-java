// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.certificatemanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.certificatemanager.AccountArgs;
import io.pulumi.awsnative.certificatemanager.outputs.AccountExpiryEventsConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:certificatemanager:Account")
public class Account extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }
    @OutputExport(name="expiryEventsConfiguration", type=AccountExpiryEventsConfiguration.class, parameters={})
    private Output<AccountExpiryEventsConfiguration> expiryEventsConfiguration;

    public Output<AccountExpiryEventsConfiguration> getExpiryEventsConfiguration() {
        return this.expiryEventsConfiguration;
    }

    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:certificatemanager:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Account(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:certificatemanager:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Account get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}
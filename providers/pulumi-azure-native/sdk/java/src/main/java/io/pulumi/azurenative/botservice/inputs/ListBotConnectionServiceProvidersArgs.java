// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import java.util.Objects;


public final class ListBotConnectionServiceProvidersArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListBotConnectionServiceProvidersArgs Empty = new ListBotConnectionServiceProvidersArgs();

    public ListBotConnectionServiceProvidersArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBotConnectionServiceProvidersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(ListBotConnectionServiceProvidersArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public ListBotConnectionServiceProvidersArgs build() {
            return new ListBotConnectionServiceProvidersArgs();
        }
    }
}
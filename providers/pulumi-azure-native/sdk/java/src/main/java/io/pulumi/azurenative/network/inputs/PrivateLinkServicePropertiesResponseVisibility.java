// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkServicePropertiesResponseVisibility extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServicePropertiesResponseVisibility Empty = new PrivateLinkServicePropertiesResponseVisibility();

    @InputImport(name="subscriptions")
    private final @Nullable List<String> subscriptions;

    public List<String> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public PrivateLinkServicePropertiesResponseVisibility(@Nullable List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    private PrivateLinkServicePropertiesResponseVisibility() {
        this.subscriptions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServicePropertiesResponseVisibility defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServicePropertiesResponseVisibility defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder setSubscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public PrivateLinkServicePropertiesResponseVisibility build() {
            return new PrivateLinkServicePropertiesResponseVisibility(subscriptions);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apikeys_v2.inputs.V2AndroidApplicationArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class V2AndroidKeyRestrictionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final V2AndroidKeyRestrictionsArgs Empty = new V2AndroidKeyRestrictionsArgs();

    @InputImport(name="allowedApplications")
    private final @Nullable Input<List<V2AndroidApplicationArgs>> allowedApplications;

    public Input<List<V2AndroidApplicationArgs>> getAllowedApplications() {
        return this.allowedApplications == null ? Input.empty() : this.allowedApplications;
    }

    public V2AndroidKeyRestrictionsArgs(@Nullable Input<List<V2AndroidApplicationArgs>> allowedApplications) {
        this.allowedApplications = allowedApplications;
    }

    private V2AndroidKeyRestrictionsArgs() {
        this.allowedApplications = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2AndroidKeyRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<V2AndroidApplicationArgs>> allowedApplications;

        public Builder() {
    	      // Empty
        }

        public Builder(V2AndroidKeyRestrictionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedApplications = defaults.allowedApplications;
        }

        public Builder setAllowedApplications(@Nullable Input<List<V2AndroidApplicationArgs>> allowedApplications) {
            this.allowedApplications = allowedApplications;
            return this;
        }

        public Builder setAllowedApplications(@Nullable List<V2AndroidApplicationArgs> allowedApplications) {
            this.allowedApplications = Input.ofNullable(allowedApplications);
            return this;
        }

        public V2AndroidKeyRestrictionsArgs build() {
            return new V2AndroidKeyRestrictionsArgs(allowedApplications);
        }
    }
}
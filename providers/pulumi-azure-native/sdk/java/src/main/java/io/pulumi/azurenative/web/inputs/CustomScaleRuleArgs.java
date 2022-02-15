// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ScaleRuleAuthArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomScaleRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomScaleRuleArgs Empty = new CustomScaleRuleArgs();

    @InputImport(name="auth")
    private final @Nullable Input<List<ScaleRuleAuthArgs>> auth;

    public Input<List<ScaleRuleAuthArgs>> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    @InputImport(name="metadata")
    private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public CustomScaleRuleArgs(
        @Nullable Input<List<ScaleRuleAuthArgs>> auth,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> type) {
        this.auth = auth;
        this.metadata = metadata;
        this.type = type;
    }

    private CustomScaleRuleArgs() {
        this.auth = Input.empty();
        this.metadata = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ScaleRuleAuthArgs>> auth;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomScaleRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.metadata = defaults.metadata;
    	      this.type = defaults.type;
        }

        public Builder setAuth(@Nullable Input<List<ScaleRuleAuthArgs>> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable List<ScaleRuleAuthArgs> auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public CustomScaleRuleArgs build() {
            return new CustomScaleRuleArgs(auth, metadata, type);
        }
    }
}
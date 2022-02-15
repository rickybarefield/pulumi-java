// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RequestMirrorPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestMirrorPolicyArgs Empty = new RequestMirrorPolicyArgs();

    @InputImport(name="backendService")
    private final @Nullable Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService == null ? Input.empty() : this.backendService;
    }

    public RequestMirrorPolicyArgs(@Nullable Input<String> backendService) {
        this.backendService = backendService;
    }

    private RequestMirrorPolicyArgs() {
        this.backendService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestMirrorPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestMirrorPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(@Nullable Input<String> backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder setBackendService(@Nullable String backendService) {
            this.backendService = Input.ofNullable(backendService);
            return this;
        }

        public RequestMirrorPolicyArgs build() {
            return new RequestMirrorPolicyArgs(backendService);
        }
    }
}
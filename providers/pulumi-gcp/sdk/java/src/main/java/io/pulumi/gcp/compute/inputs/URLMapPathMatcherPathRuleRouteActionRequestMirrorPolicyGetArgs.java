// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs Empty = new URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs();

    @InputImport(name="backendService", required=true)
    private final Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService;
    }

    public URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs(Input<String> backendService) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
    }

    private URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs() {
        this.backendService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder setBackendService(Input<String> backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }

        public Builder setBackendService(String backendService) {
            this.backendService = Input.of(Objects.requireNonNull(backendService));
            return this;
        }

        public URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionRequestMirrorPolicyGetArgs(backendService);
        }
    }
}
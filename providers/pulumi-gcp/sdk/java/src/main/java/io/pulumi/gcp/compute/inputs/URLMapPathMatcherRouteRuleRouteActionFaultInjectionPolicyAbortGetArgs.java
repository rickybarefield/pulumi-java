// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs Empty = new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs();

    @InputImport(name="httpStatus")
    private final @Nullable Input<Integer> httpStatus;

    public Input<Integer> getHttpStatus() {
        return this.httpStatus == null ? Input.empty() : this.httpStatus;
    }

    @InputImport(name="percentage")
    private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs(
        @Nullable Input<Integer> httpStatus,
        @Nullable Input<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs() {
        this.httpStatus = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> httpStatus;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder setHttpStatus(@Nullable Input<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder setHttpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Input.ofNullable(httpStatus);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }

        public URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyAbortGetArgs(httpStatus, percentage);
        }
    }
}
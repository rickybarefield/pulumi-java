// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicequotas;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class ServiceQuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceQuotaArgs Empty = new ServiceQuotaArgs();

    /**
     * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
     * 
     */
    @InputImport(name="quotaCode", required=true)
    private final Input<String> quotaCode;

    public Input<String> getQuotaCode() {
        return this.quotaCode;
    }

    /**
     * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
     * 
     */
    @InputImport(name="serviceCode", required=true)
    private final Input<String> serviceCode;

    public Input<String> getServiceCode() {
        return this.serviceCode;
    }

    /**
     * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<Double> value;

    public Input<Double> getValue() {
        return this.value;
    }

    public ServiceQuotaArgs(
        Input<String> quotaCode,
        Input<String> serviceCode,
        Input<Double> value) {
        this.quotaCode = Objects.requireNonNull(quotaCode, "expected parameter 'quotaCode' to be non-null");
        this.serviceCode = Objects.requireNonNull(serviceCode, "expected parameter 'serviceCode' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceQuotaArgs() {
        this.quotaCode = Input.empty();
        this.serviceCode = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceQuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> quotaCode;
        private Input<String> serviceCode;
        private Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceQuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quotaCode = defaults.quotaCode;
    	      this.serviceCode = defaults.serviceCode;
    	      this.value = defaults.value;
        }

        public Builder setQuotaCode(Input<String> quotaCode) {
            this.quotaCode = Objects.requireNonNull(quotaCode);
            return this;
        }

        public Builder setQuotaCode(String quotaCode) {
            this.quotaCode = Input.of(Objects.requireNonNull(quotaCode));
            return this;
        }

        public Builder setServiceCode(Input<String> serviceCode) {
            this.serviceCode = Objects.requireNonNull(serviceCode);
            return this;
        }

        public Builder setServiceCode(String serviceCode) {
            this.serviceCode = Input.of(Objects.requireNonNull(serviceCode));
            return this;
        }

        public Builder setValue(Input<Double> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public ServiceQuotaArgs build() {
            return new ServiceQuotaArgs(quotaCode, serviceCode, value);
        }
    }
}
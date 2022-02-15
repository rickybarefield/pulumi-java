// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusGetArgs Empty = new ServicePerimetersServicePerimeterStatusGetArgs();

    @InputImport(name="accessLevels")
    private final @Nullable Input<List<String>> accessLevels;

    public Input<List<String>> getAccessLevels() {
        return this.accessLevels == null ? Input.empty() : this.accessLevels;
    }

    @InputImport(name="egressPolicies")
    private final @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;

    public Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> getEgressPolicies() {
        return this.egressPolicies == null ? Input.empty() : this.egressPolicies;
    }

    @InputImport(name="ingressPolicies")
    private final @Nullable Input<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;

    public Input<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> getIngressPolicies() {
        return this.ingressPolicies == null ? Input.empty() : this.ingressPolicies;
    }

    @InputImport(name="resources")
    private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    @InputImport(name="restrictedServices")
    private final @Nullable Input<List<String>> restrictedServices;

    public Input<List<String>> getRestrictedServices() {
        return this.restrictedServices == null ? Input.empty() : this.restrictedServices;
    }

    @InputImport(name="vpcAccessibleServices")
    private final @Nullable Input<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

    public Input<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> getVpcAccessibleServices() {
        return this.vpcAccessibleServices == null ? Input.empty() : this.vpcAccessibleServices;
    }

    public ServicePerimetersServicePerimeterStatusGetArgs(
        @Nullable Input<List<String>> accessLevels,
        @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies,
        @Nullable Input<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies,
        @Nullable Input<List<String>> resources,
        @Nullable Input<List<String>> restrictedServices,
        @Nullable Input<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.egressPolicies = egressPolicies;
        this.ingressPolicies = ingressPolicies;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

    private ServicePerimetersServicePerimeterStatusGetArgs() {
        this.accessLevels = Input.empty();
        this.egressPolicies = Input.empty();
        this.ingressPolicies = Input.empty();
        this.resources = Input.empty();
        this.restrictedServices = Input.empty();
        this.vpcAccessibleServices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessLevels;
        private @Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies;
        private @Nullable Input<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies;
        private @Nullable Input<List<String>> resources;
        private @Nullable Input<List<String>> restrictedServices;
        private @Nullable Input<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder setAccessLevels(@Nullable Input<List<String>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }

        public Builder setAccessLevels(@Nullable List<String> accessLevels) {
            this.accessLevels = Input.ofNullable(accessLevels);
            return this;
        }

        public Builder setEgressPolicies(@Nullable Input<List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs>> egressPolicies) {
            this.egressPolicies = egressPolicies;
            return this;
        }

        public Builder setEgressPolicies(@Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyGetArgs> egressPolicies) {
            this.egressPolicies = Input.ofNullable(egressPolicies);
            return this;
        }

        public Builder setIngressPolicies(@Nullable Input<List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs>> ingressPolicies) {
            this.ingressPolicies = ingressPolicies;
            return this;
        }

        public Builder setIngressPolicies(@Nullable List<ServicePerimetersServicePerimeterStatusIngressPolicyGetArgs> ingressPolicies) {
            this.ingressPolicies = Input.ofNullable(ingressPolicies);
            return this;
        }

        public Builder setResources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder setRestrictedServices(@Nullable Input<List<String>> restrictedServices) {
            this.restrictedServices = restrictedServices;
            return this;
        }

        public Builder setRestrictedServices(@Nullable List<String> restrictedServices) {
            this.restrictedServices = Input.ofNullable(restrictedServices);
            return this;
        }

        public Builder setVpcAccessibleServices(@Nullable Input<ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs> vpcAccessibleServices) {
            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }

        public Builder setVpcAccessibleServices(@Nullable ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs vpcAccessibleServices) {
            this.vpcAccessibleServices = Input.ofNullable(vpcAccessibleServices);
            return this;
        }

        public ServicePerimetersServicePerimeterStatusGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusGetArgs(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
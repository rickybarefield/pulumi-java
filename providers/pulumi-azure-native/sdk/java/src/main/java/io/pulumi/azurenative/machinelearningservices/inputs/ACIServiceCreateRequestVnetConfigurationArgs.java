// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ACIServiceCreateRequestVnetConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ACIServiceCreateRequestVnetConfigurationArgs Empty = new ACIServiceCreateRequestVnetConfigurationArgs();

    @InputImport(name="subnetName")
    private final @Nullable Input<String> subnetName;

    public Input<String> getSubnetName() {
        return this.subnetName == null ? Input.empty() : this.subnetName;
    }

    @InputImport(name="vnetName")
    private final @Nullable Input<String> vnetName;

    public Input<String> getVnetName() {
        return this.vnetName == null ? Input.empty() : this.vnetName;
    }

    public ACIServiceCreateRequestVnetConfigurationArgs(
        @Nullable Input<String> subnetName,
        @Nullable Input<String> vnetName) {
        this.subnetName = subnetName;
        this.vnetName = vnetName;
    }

    private ACIServiceCreateRequestVnetConfigurationArgs() {
        this.subnetName = Input.empty();
        this.vnetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceCreateRequestVnetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> subnetName;
        private @Nullable Input<String> vnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceCreateRequestVnetConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetName = defaults.subnetName;
    	      this.vnetName = defaults.vnetName;
        }

        public Builder setSubnetName(@Nullable Input<String> subnetName) {
            this.subnetName = subnetName;
            return this;
        }

        public Builder setSubnetName(@Nullable String subnetName) {
            this.subnetName = Input.ofNullable(subnetName);
            return this;
        }

        public Builder setVnetName(@Nullable Input<String> vnetName) {
            this.vnetName = vnetName;
            return this;
        }

        public Builder setVnetName(@Nullable String vnetName) {
            this.vnetName = Input.ofNullable(vnetName);
            return this;
        }

        public ACIServiceCreateRequestVnetConfigurationArgs build() {
            return new ACIServiceCreateRequestVnetConfigurationArgs(subnetName, vnetName);
        }
    }
}
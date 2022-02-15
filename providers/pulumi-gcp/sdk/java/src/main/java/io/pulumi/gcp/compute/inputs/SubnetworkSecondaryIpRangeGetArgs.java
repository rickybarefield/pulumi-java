// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SubnetworkSecondaryIpRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkSecondaryIpRangeGetArgs Empty = new SubnetworkSecondaryIpRangeGetArgs();

    @InputImport(name="ipCidrRange", required=true)
    private final Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    @InputImport(name="rangeName", required=true)
    private final Input<String> rangeName;

    public Input<String> getRangeName() {
        return this.rangeName;
    }

    public SubnetworkSecondaryIpRangeGetArgs(
        Input<String> ipCidrRange,
        Input<String> rangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.rangeName = Objects.requireNonNull(rangeName, "expected parameter 'rangeName' to be non-null");
    }

    private SubnetworkSecondaryIpRangeGetArgs() {
        this.ipCidrRange = Input.empty();
        this.rangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryIpRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipCidrRange;
        private Input<String> rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryIpRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder setIpCidrRange(Input<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Input.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }

        public Builder setRangeName(Input<String> rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }

        public Builder setRangeName(String rangeName) {
            this.rangeName = Input.of(Objects.requireNonNull(rangeName));
            return this;
        }

        public SubnetworkSecondaryIpRangeGetArgs build() {
            return new SubnetworkSecondaryIpRangeGetArgs(ipCidrRange, rangeName);
        }
    }
}
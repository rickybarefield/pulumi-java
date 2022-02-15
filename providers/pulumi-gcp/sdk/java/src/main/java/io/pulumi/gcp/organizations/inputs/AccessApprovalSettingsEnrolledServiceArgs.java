// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsEnrolledServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsEnrolledServiceArgs Empty = new AccessApprovalSettingsEnrolledServiceArgs();

    @InputImport(name="cloudProduct", required=true)
    private final Input<String> cloudProduct;

    public Input<String> getCloudProduct() {
        return this.cloudProduct;
    }

    @InputImport(name="enrollmentLevel")
    private final @Nullable Input<String> enrollmentLevel;

    public Input<String> getEnrollmentLevel() {
        return this.enrollmentLevel == null ? Input.empty() : this.enrollmentLevel;
    }

    public AccessApprovalSettingsEnrolledServiceArgs(
        Input<String> cloudProduct,
        @Nullable Input<String> enrollmentLevel) {
        this.cloudProduct = Objects.requireNonNull(cloudProduct, "expected parameter 'cloudProduct' to be non-null");
        this.enrollmentLevel = enrollmentLevel;
    }

    private AccessApprovalSettingsEnrolledServiceArgs() {
        this.cloudProduct = Input.empty();
        this.enrollmentLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsEnrolledServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloudProduct;
        private @Nullable Input<String> enrollmentLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsEnrolledServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProduct = defaults.cloudProduct;
    	      this.enrollmentLevel = defaults.enrollmentLevel;
        }

        public Builder setCloudProduct(Input<String> cloudProduct) {
            this.cloudProduct = Objects.requireNonNull(cloudProduct);
            return this;
        }

        public Builder setCloudProduct(String cloudProduct) {
            this.cloudProduct = Input.of(Objects.requireNonNull(cloudProduct));
            return this;
        }

        public Builder setEnrollmentLevel(@Nullable Input<String> enrollmentLevel) {
            this.enrollmentLevel = enrollmentLevel;
            return this;
        }

        public Builder setEnrollmentLevel(@Nullable String enrollmentLevel) {
            this.enrollmentLevel = Input.ofNullable(enrollmentLevel);
            return this;
        }

        public AccessApprovalSettingsEnrolledServiceArgs build() {
            return new AccessApprovalSettingsEnrolledServiceArgs(cloudProduct, enrollmentLevel);
        }
    }
}
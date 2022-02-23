// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateValidationState extends io.pulumi.resources.ResourceArgs {

    public static final CertificateValidationState Empty = new CertificateValidationState();

    /**
     * The ARN of the certificate that is being validated.
     * 
     */
    @InputImport(name="certificateArn")
    private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * List of FQDNs that implement the validation. Only valid for DNS validation method ACM certificates. If this is set, the resource can implement additional sanity checks and has an explicit dependency on the resource that is implementing the validation
     * 
     */
    @InputImport(name="validationRecordFqdns")
    private final @Nullable Input<List<String>> validationRecordFqdns;

    public Input<List<String>> getValidationRecordFqdns() {
        return this.validationRecordFqdns == null ? Input.empty() : this.validationRecordFqdns;
    }

    public CertificateValidationState(
        @Nullable Input<String> certificateArn,
        @Nullable Input<List<String>> validationRecordFqdns) {
        this.certificateArn = certificateArn;
        this.validationRecordFqdns = validationRecordFqdns;
    }

    private CertificateValidationState() {
        this.certificateArn = Input.empty();
        this.validationRecordFqdns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateValidationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<List<String>> validationRecordFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateValidationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.validationRecordFqdns = defaults.validationRecordFqdns;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setValidationRecordFqdns(@Nullable Input<List<String>> validationRecordFqdns) {
            this.validationRecordFqdns = validationRecordFqdns;
            return this;
        }

        public Builder setValidationRecordFqdns(@Nullable List<String> validationRecordFqdns) {
            this.validationRecordFqdns = Input.ofNullable(validationRecordFqdns);
            return this;
        }
        public CertificateValidationState build() {
            return new CertificateValidationState(certificateArn, validationRecordFqdns);
        }
    }
}
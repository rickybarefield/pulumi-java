// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3DtmfInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3DtmfInputResponse Empty = new GoogleCloudDialogflowCxV3DtmfInputResponse();

    @InputImport(name="digits", required=true)
    private final String digits;

    public String getDigits() {
        return this.digits;
    }

    @InputImport(name="finishDigit", required=true)
    private final String finishDigit;

    public String getFinishDigit() {
        return this.finishDigit;
    }

    public GoogleCloudDialogflowCxV3DtmfInputResponse(
        String digits,
        String finishDigit) {
        this.digits = Objects.requireNonNull(digits, "expected parameter 'digits' to be non-null");
        this.finishDigit = Objects.requireNonNull(finishDigit, "expected parameter 'finishDigit' to be non-null");
    }

    private GoogleCloudDialogflowCxV3DtmfInputResponse() {
        this.digits = null;
        this.finishDigit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String digits;
        private String finishDigit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digits = defaults.digits;
    	      this.finishDigit = defaults.finishDigit;
        }

        public Builder setDigits(String digits) {
            this.digits = Objects.requireNonNull(digits);
            return this;
        }

        public Builder setFinishDigit(String finishDigit) {
            this.finishDigit = Objects.requireNonNull(finishDigit);
            return this;
        }

        public GoogleCloudDialogflowCxV3DtmfInputResponse build() {
            return new GoogleCloudDialogflowCxV3DtmfInputResponse(digits, finishDigit);
        }
    }
}
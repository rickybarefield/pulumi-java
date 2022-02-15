// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse {
    private final String phoneNumber;

    @OutputCustomType.Constructor({"phoneNumber"})
    private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse(phoneNumber);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class X12EnvelopeOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12EnvelopeOverrideResponse Empty = new X12EnvelopeOverrideResponse();

    @InputImport(name="dateFormat", required=true)
    private final String dateFormat;

    public String getDateFormat() {
        return this.dateFormat;
    }

    @InputImport(name="functionalIdentifierCode")
    private final @Nullable String functionalIdentifierCode;

    public Optional<String> getFunctionalIdentifierCode() {
        return this.functionalIdentifierCode == null ? Optional.empty() : Optional.ofNullable(this.functionalIdentifierCode);
    }

    @InputImport(name="headerVersion", required=true)
    private final String headerVersion;

    public String getHeaderVersion() {
        return this.headerVersion;
    }

    @InputImport(name="messageId", required=true)
    private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    @InputImport(name="protocolVersion", required=true)
    private final String protocolVersion;

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    @InputImport(name="receiverApplicationId", required=true)
    private final String receiverApplicationId;

    public String getReceiverApplicationId() {
        return this.receiverApplicationId;
    }

    @InputImport(name="responsibleAgencyCode", required=true)
    private final String responsibleAgencyCode;

    public String getResponsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    @InputImport(name="senderApplicationId", required=true)
    private final String senderApplicationId;

    public String getSenderApplicationId() {
        return this.senderApplicationId;
    }

    @InputImport(name="targetNamespace", required=true)
    private final String targetNamespace;

    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    @InputImport(name="timeFormat", required=true)
    private final String timeFormat;

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public X12EnvelopeOverrideResponse(
        String dateFormat,
        @Nullable String functionalIdentifierCode,
        String headerVersion,
        String messageId,
        String protocolVersion,
        String receiverApplicationId,
        String responsibleAgencyCode,
        String senderApplicationId,
        String targetNamespace,
        String timeFormat) {
        this.dateFormat = Objects.requireNonNull(dateFormat, "expected parameter 'dateFormat' to be non-null");
        this.functionalIdentifierCode = functionalIdentifierCode;
        this.headerVersion = Objects.requireNonNull(headerVersion, "expected parameter 'headerVersion' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.protocolVersion = Objects.requireNonNull(protocolVersion, "expected parameter 'protocolVersion' to be non-null");
        this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
        this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode, "expected parameter 'responsibleAgencyCode' to be non-null");
        this.senderApplicationId = Objects.requireNonNull(senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
        this.targetNamespace = Objects.requireNonNull(targetNamespace, "expected parameter 'targetNamespace' to be non-null");
        this.timeFormat = Objects.requireNonNull(timeFormat, "expected parameter 'timeFormat' to be non-null");
    }

    private X12EnvelopeOverrideResponse() {
        this.dateFormat = null;
        this.functionalIdentifierCode = null;
        this.headerVersion = null;
        this.messageId = null;
        this.protocolVersion = null;
        this.receiverApplicationId = null;
        this.responsibleAgencyCode = null;
        this.senderApplicationId = null;
        this.targetNamespace = null;
        this.timeFormat = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dateFormat;
        private @Nullable String functionalIdentifierCode;
        private String headerVersion;
        private String messageId;
        private String protocolVersion;
        private String receiverApplicationId;
        private String responsibleAgencyCode;
        private String senderApplicationId;
        private String targetNamespace;
        private String timeFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.functionalIdentifierCode = defaults.functionalIdentifierCode;
    	      this.headerVersion = defaults.headerVersion;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.responsibleAgencyCode = defaults.responsibleAgencyCode;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.timeFormat = defaults.timeFormat;
        }

        public Builder setDateFormat(String dateFormat) {
            this.dateFormat = Objects.requireNonNull(dateFormat);
            return this;
        }

        public Builder setFunctionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            this.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder setHeaderVersion(String headerVersion) {
            this.headerVersion = Objects.requireNonNull(headerVersion);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setProtocolVersion(String protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder setReceiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder setResponsibleAgencyCode(String responsibleAgencyCode) {
            this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
            return this;
        }

        public Builder setSenderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder setTargetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder setTimeFormat(String timeFormat) {
            this.timeFormat = Objects.requireNonNull(timeFormat);
            return this;
        }

        public X12EnvelopeOverrideResponse build() {
            return new X12EnvelopeOverrideResponse(dateFormat, functionalIdentifierCode, headerVersion, messageId, protocolVersion, receiverApplicationId, responsibleAgencyCode, senderApplicationId, targetNamespace, timeFormat);
        }
    }
}
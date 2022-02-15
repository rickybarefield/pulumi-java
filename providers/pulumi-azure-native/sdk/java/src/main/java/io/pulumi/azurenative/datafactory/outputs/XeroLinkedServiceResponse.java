// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class XeroLinkedServiceResponse {
    private final @Nullable List<Object> annotations;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable Object connectionProperties;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerKey;
    private final @Nullable String description;
    private final @Nullable Object encryptedCredential;
    private final @Nullable Object host;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKey;
    private final String type;
    private final @Nullable Object useEncryptedEndpoints;
    private final @Nullable Object useHostVerification;
    private final @Nullable Object usePeerVerification;

    @OutputCustomType.Constructor({"annotations","connectVia","connectionProperties","consumerKey","description","encryptedCredential","host","parameters","privateKey","type","useEncryptedEndpoints","useHostVerification","usePeerVerification"})
    private XeroLinkedServiceResponse(
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object connectionProperties,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerKey,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object host,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKey,
        String type,
        @Nullable Object useEncryptedEndpoints,
        @Nullable Object useHostVerification,
        @Nullable Object usePeerVerification) {
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.connectionProperties = connectionProperties;
        this.consumerKey = consumerKey;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.host = host;
        this.parameters = parameters;
        this.privateKey = privateKey;
        this.type = Objects.requireNonNull(type);
        this.useEncryptedEndpoints = useEncryptedEndpoints;
        this.useHostVerification = useHostVerification;
        this.usePeerVerification = usePeerVerification;
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<Object> getConnectionProperties() {
        return Optional.ofNullable(this.connectionProperties);
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getConsumerKey() {
        return Optional.ofNullable(this.consumerKey);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    public Optional<Object> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getPrivateKey() {
        return Optional.ofNullable(this.privateKey);
    }
    public String getType() {
        return this.type;
    }
    public Optional<Object> getUseEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }
    public Optional<Object> getUseHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }
    public Optional<Object> getUsePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(XeroLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object connectionProperties;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerKey;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object host;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKey;
        private String type;
        private @Nullable Object useEncryptedEndpoints;
        private @Nullable Object useHostVerification;
        private @Nullable Object usePeerVerification;

        public Builder() {
    	      // Empty
        }

        public Builder(XeroLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.consumerKey = defaults.consumerKey;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.host = defaults.host;
    	      this.parameters = defaults.parameters;
    	      this.privateKey = defaults.privateKey;
    	      this.type = defaults.type;
    	      this.useEncryptedEndpoints = defaults.useEncryptedEndpoints;
    	      this.useHostVerification = defaults.useHostVerification;
    	      this.usePeerVerification = defaults.usePeerVerification;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setConnectionProperties(@Nullable Object connectionProperties) {
            this.connectionProperties = connectionProperties;
            return this;
        }

        public Builder setConsumerKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> consumerKey) {
            this.consumerKey = consumerKey;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setHost(@Nullable Object host) {
            this.host = host;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPrivateKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseEncryptedEndpoints(@Nullable Object useEncryptedEndpoints) {
            this.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder setUseHostVerification(@Nullable Object useHostVerification) {
            this.useHostVerification = useHostVerification;
            return this;
        }

        public Builder setUsePeerVerification(@Nullable Object usePeerVerification) {
            this.usePeerVerification = usePeerVerification;
            return this;
        }

        public XeroLinkedServiceResponse build() {
            return new XeroLinkedServiceResponse(annotations, connectVia, connectionProperties, consumerKey, description, encryptedCredential, host, parameters, privateKey, type, useEncryptedEndpoints, useHostVerification, usePeerVerification);
        }
    }
}
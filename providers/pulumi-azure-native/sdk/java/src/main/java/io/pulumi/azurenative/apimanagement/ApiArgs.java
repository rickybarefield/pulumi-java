// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.ApiType;
import io.pulumi.azurenative.apimanagement.enums.ContentFormat;
import io.pulumi.azurenative.apimanagement.enums.Protocol;
import io.pulumi.azurenative.apimanagement.enums.SoapApiType;
import io.pulumi.azurenative.apimanagement.inputs.ApiCreateOrUpdatePropertiesWsdlSelectorArgs;
import io.pulumi.azurenative.apimanagement.inputs.ApiVersionSetContractDetailsArgs;
import io.pulumi.azurenative.apimanagement.inputs.AuthenticationSettingsContractArgs;
import io.pulumi.azurenative.apimanagement.inputs.SubscriptionKeyParameterNamesContractArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiArgs Empty = new ApiArgs();

    @InputImport(name="apiId")
    private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    @InputImport(name="apiRevision")
    private final @Nullable Input<String> apiRevision;

    public Input<String> getApiRevision() {
        return this.apiRevision == null ? Input.empty() : this.apiRevision;
    }

    @InputImport(name="apiRevisionDescription")
    private final @Nullable Input<String> apiRevisionDescription;

    public Input<String> getApiRevisionDescription() {
        return this.apiRevisionDescription == null ? Input.empty() : this.apiRevisionDescription;
    }

    @InputImport(name="apiType")
    private final @Nullable Input<Either<String,ApiType>> apiType;

    public Input<Either<String,ApiType>> getApiType() {
        return this.apiType == null ? Input.empty() : this.apiType;
    }

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="apiVersionDescription")
    private final @Nullable Input<String> apiVersionDescription;

    public Input<String> getApiVersionDescription() {
        return this.apiVersionDescription == null ? Input.empty() : this.apiVersionDescription;
    }

    @InputImport(name="apiVersionSet")
    private final @Nullable Input<ApiVersionSetContractDetailsArgs> apiVersionSet;

    public Input<ApiVersionSetContractDetailsArgs> getApiVersionSet() {
        return this.apiVersionSet == null ? Input.empty() : this.apiVersionSet;
    }

    @InputImport(name="apiVersionSetId")
    private final @Nullable Input<String> apiVersionSetId;

    public Input<String> getApiVersionSetId() {
        return this.apiVersionSetId == null ? Input.empty() : this.apiVersionSetId;
    }

    @InputImport(name="authenticationSettings")
    private final @Nullable Input<AuthenticationSettingsContractArgs> authenticationSettings;

    public Input<AuthenticationSettingsContractArgs> getAuthenticationSettings() {
        return this.authenticationSettings == null ? Input.empty() : this.authenticationSettings;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="format")
    private final @Nullable Input<Either<String,ContentFormat>> format;

    public Input<Either<String,ContentFormat>> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    @InputImport(name="isCurrent")
    private final @Nullable Input<Boolean> isCurrent;

    public Input<Boolean> getIsCurrent() {
        return this.isCurrent == null ? Input.empty() : this.isCurrent;
    }

    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    @InputImport(name="protocols")
    private final @Nullable Input<List<Protocol>> protocols;

    public Input<List<Protocol>> getProtocols() {
        return this.protocols == null ? Input.empty() : this.protocols;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="serviceUrl")
    private final @Nullable Input<String> serviceUrl;

    public Input<String> getServiceUrl() {
        return this.serviceUrl == null ? Input.empty() : this.serviceUrl;
    }

    @InputImport(name="soapApiType")
    private final @Nullable Input<Either<String,SoapApiType>> soapApiType;

    public Input<Either<String,SoapApiType>> getSoapApiType() {
        return this.soapApiType == null ? Input.empty() : this.soapApiType;
    }

    @InputImport(name="sourceApiId")
    private final @Nullable Input<String> sourceApiId;

    public Input<String> getSourceApiId() {
        return this.sourceApiId == null ? Input.empty() : this.sourceApiId;
    }

    @InputImport(name="subscriptionKeyParameterNames")
    private final @Nullable Input<SubscriptionKeyParameterNamesContractArgs> subscriptionKeyParameterNames;

    public Input<SubscriptionKeyParameterNamesContractArgs> getSubscriptionKeyParameterNames() {
        return this.subscriptionKeyParameterNames == null ? Input.empty() : this.subscriptionKeyParameterNames;
    }

    @InputImport(name="subscriptionRequired")
    private final @Nullable Input<Boolean> subscriptionRequired;

    public Input<Boolean> getSubscriptionRequired() {
        return this.subscriptionRequired == null ? Input.empty() : this.subscriptionRequired;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    @InputImport(name="wsdlSelector")
    private final @Nullable Input<ApiCreateOrUpdatePropertiesWsdlSelectorArgs> wsdlSelector;

    public Input<ApiCreateOrUpdatePropertiesWsdlSelectorArgs> getWsdlSelector() {
        return this.wsdlSelector == null ? Input.empty() : this.wsdlSelector;
    }

    public ApiArgs(
        @Nullable Input<String> apiId,
        @Nullable Input<String> apiRevision,
        @Nullable Input<String> apiRevisionDescription,
        @Nullable Input<Either<String,ApiType>> apiType,
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> apiVersionDescription,
        @Nullable Input<ApiVersionSetContractDetailsArgs> apiVersionSet,
        @Nullable Input<String> apiVersionSetId,
        @Nullable Input<AuthenticationSettingsContractArgs> authenticationSettings,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Either<String,ContentFormat>> format,
        @Nullable Input<Boolean> isCurrent,
        Input<String> path,
        @Nullable Input<List<Protocol>> protocols,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> serviceUrl,
        @Nullable Input<Either<String,SoapApiType>> soapApiType,
        @Nullable Input<String> sourceApiId,
        @Nullable Input<SubscriptionKeyParameterNamesContractArgs> subscriptionKeyParameterNames,
        @Nullable Input<Boolean> subscriptionRequired,
        @Nullable Input<String> value,
        @Nullable Input<ApiCreateOrUpdatePropertiesWsdlSelectorArgs> wsdlSelector) {
        this.apiId = apiId;
        this.apiRevision = apiRevision;
        this.apiRevisionDescription = apiRevisionDescription;
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.apiVersionDescription = apiVersionDescription;
        this.apiVersionSet = apiVersionSet;
        this.apiVersionSetId = apiVersionSetId;
        this.authenticationSettings = authenticationSettings;
        this.description = description;
        this.displayName = displayName;
        this.format = format;
        this.isCurrent = isCurrent;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.protocols = protocols;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceUrl = serviceUrl;
        this.soapApiType = soapApiType;
        this.sourceApiId = sourceApiId;
        this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
        this.subscriptionRequired = subscriptionRequired;
        this.value = value;
        this.wsdlSelector = wsdlSelector;
    }

    private ApiArgs() {
        this.apiId = Input.empty();
        this.apiRevision = Input.empty();
        this.apiRevisionDescription = Input.empty();
        this.apiType = Input.empty();
        this.apiVersion = Input.empty();
        this.apiVersionDescription = Input.empty();
        this.apiVersionSet = Input.empty();
        this.apiVersionSetId = Input.empty();
        this.authenticationSettings = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.format = Input.empty();
        this.isCurrent = Input.empty();
        this.path = Input.empty();
        this.protocols = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.serviceUrl = Input.empty();
        this.soapApiType = Input.empty();
        this.sourceApiId = Input.empty();
        this.subscriptionKeyParameterNames = Input.empty();
        this.subscriptionRequired = Input.empty();
        this.value = Input.empty();
        this.wsdlSelector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> apiRevision;
        private @Nullable Input<String> apiRevisionDescription;
        private @Nullable Input<Either<String,ApiType>> apiType;
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> apiVersionDescription;
        private @Nullable Input<ApiVersionSetContractDetailsArgs> apiVersionSet;
        private @Nullable Input<String> apiVersionSetId;
        private @Nullable Input<AuthenticationSettingsContractArgs> authenticationSettings;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Either<String,ContentFormat>> format;
        private @Nullable Input<Boolean> isCurrent;
        private Input<String> path;
        private @Nullable Input<List<Protocol>> protocols;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> serviceUrl;
        private @Nullable Input<Either<String,SoapApiType>> soapApiType;
        private @Nullable Input<String> sourceApiId;
        private @Nullable Input<SubscriptionKeyParameterNamesContractArgs> subscriptionKeyParameterNames;
        private @Nullable Input<Boolean> subscriptionRequired;
        private @Nullable Input<String> value;
        private @Nullable Input<ApiCreateOrUpdatePropertiesWsdlSelectorArgs> wsdlSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.apiRevision = defaults.apiRevision;
    	      this.apiRevisionDescription = defaults.apiRevisionDescription;
    	      this.apiType = defaults.apiType;
    	      this.apiVersion = defaults.apiVersion;
    	      this.apiVersionDescription = defaults.apiVersionDescription;
    	      this.apiVersionSet = defaults.apiVersionSet;
    	      this.apiVersionSetId = defaults.apiVersionSetId;
    	      this.authenticationSettings = defaults.authenticationSettings;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.format = defaults.format;
    	      this.isCurrent = defaults.isCurrent;
    	      this.path = defaults.path;
    	      this.protocols = defaults.protocols;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.soapApiType = defaults.soapApiType;
    	      this.sourceApiId = defaults.sourceApiId;
    	      this.subscriptionKeyParameterNames = defaults.subscriptionKeyParameterNames;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.value = defaults.value;
    	      this.wsdlSelector = defaults.wsdlSelector;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setApiRevision(@Nullable Input<String> apiRevision) {
            this.apiRevision = apiRevision;
            return this;
        }

        public Builder setApiRevision(@Nullable String apiRevision) {
            this.apiRevision = Input.ofNullable(apiRevision);
            return this;
        }

        public Builder setApiRevisionDescription(@Nullable Input<String> apiRevisionDescription) {
            this.apiRevisionDescription = apiRevisionDescription;
            return this;
        }

        public Builder setApiRevisionDescription(@Nullable String apiRevisionDescription) {
            this.apiRevisionDescription = Input.ofNullable(apiRevisionDescription);
            return this;
        }

        public Builder setApiType(@Nullable Input<Either<String,ApiType>> apiType) {
            this.apiType = apiType;
            return this;
        }

        public Builder setApiType(@Nullable Either<String,ApiType> apiType) {
            this.apiType = Input.ofNullable(apiType);
            return this;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setApiVersionDescription(@Nullable Input<String> apiVersionDescription) {
            this.apiVersionDescription = apiVersionDescription;
            return this;
        }

        public Builder setApiVersionDescription(@Nullable String apiVersionDescription) {
            this.apiVersionDescription = Input.ofNullable(apiVersionDescription);
            return this;
        }

        public Builder setApiVersionSet(@Nullable Input<ApiVersionSetContractDetailsArgs> apiVersionSet) {
            this.apiVersionSet = apiVersionSet;
            return this;
        }

        public Builder setApiVersionSet(@Nullable ApiVersionSetContractDetailsArgs apiVersionSet) {
            this.apiVersionSet = Input.ofNullable(apiVersionSet);
            return this;
        }

        public Builder setApiVersionSetId(@Nullable Input<String> apiVersionSetId) {
            this.apiVersionSetId = apiVersionSetId;
            return this;
        }

        public Builder setApiVersionSetId(@Nullable String apiVersionSetId) {
            this.apiVersionSetId = Input.ofNullable(apiVersionSetId);
            return this;
        }

        public Builder setAuthenticationSettings(@Nullable Input<AuthenticationSettingsContractArgs> authenticationSettings) {
            this.authenticationSettings = authenticationSettings;
            return this;
        }

        public Builder setAuthenticationSettings(@Nullable AuthenticationSettingsContractArgs authenticationSettings) {
            this.authenticationSettings = Input.ofNullable(authenticationSettings);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setFormat(@Nullable Input<Either<String,ContentFormat>> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable Either<String,ContentFormat> format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setIsCurrent(@Nullable Input<Boolean> isCurrent) {
            this.isCurrent = isCurrent;
            return this;
        }

        public Builder setIsCurrent(@Nullable Boolean isCurrent) {
            this.isCurrent = Input.ofNullable(isCurrent);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setProtocols(@Nullable Input<List<Protocol>> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setProtocols(@Nullable List<Protocol> protocols) {
            this.protocols = Input.ofNullable(protocols);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setServiceUrl(@Nullable Input<String> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder setServiceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = Input.ofNullable(serviceUrl);
            return this;
        }

        public Builder setSoapApiType(@Nullable Input<Either<String,SoapApiType>> soapApiType) {
            this.soapApiType = soapApiType;
            return this;
        }

        public Builder setSoapApiType(@Nullable Either<String,SoapApiType> soapApiType) {
            this.soapApiType = Input.ofNullable(soapApiType);
            return this;
        }

        public Builder setSourceApiId(@Nullable Input<String> sourceApiId) {
            this.sourceApiId = sourceApiId;
            return this;
        }

        public Builder setSourceApiId(@Nullable String sourceApiId) {
            this.sourceApiId = Input.ofNullable(sourceApiId);
            return this;
        }

        public Builder setSubscriptionKeyParameterNames(@Nullable Input<SubscriptionKeyParameterNamesContractArgs> subscriptionKeyParameterNames) {
            this.subscriptionKeyParameterNames = subscriptionKeyParameterNames;
            return this;
        }

        public Builder setSubscriptionKeyParameterNames(@Nullable SubscriptionKeyParameterNamesContractArgs subscriptionKeyParameterNames) {
            this.subscriptionKeyParameterNames = Input.ofNullable(subscriptionKeyParameterNames);
            return this;
        }

        public Builder setSubscriptionRequired(@Nullable Input<Boolean> subscriptionRequired) {
            this.subscriptionRequired = subscriptionRequired;
            return this;
        }

        public Builder setSubscriptionRequired(@Nullable Boolean subscriptionRequired) {
            this.subscriptionRequired = Input.ofNullable(subscriptionRequired);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setWsdlSelector(@Nullable Input<ApiCreateOrUpdatePropertiesWsdlSelectorArgs> wsdlSelector) {
            this.wsdlSelector = wsdlSelector;
            return this;
        }

        public Builder setWsdlSelector(@Nullable ApiCreateOrUpdatePropertiesWsdlSelectorArgs wsdlSelector) {
            this.wsdlSelector = Input.ofNullable(wsdlSelector);
            return this;
        }

        public ApiArgs build() {
            return new ApiArgs(apiId, apiRevision, apiRevisionDescription, apiType, apiVersion, apiVersionDescription, apiVersionSet, apiVersionSetId, authenticationSettings, description, displayName, format, isCurrent, path, protocols, resourceGroupName, serviceName, serviceUrl, soapApiType, sourceApiId, subscriptionKeyParameterNames, subscriptionRequired, value, wsdlSelector);
        }
    }
}
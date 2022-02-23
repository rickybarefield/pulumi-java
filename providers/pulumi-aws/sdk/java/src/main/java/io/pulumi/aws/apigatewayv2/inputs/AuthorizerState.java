// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.aws.apigatewayv2.inputs.AuthorizerJwtConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerState extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerState Empty = new AuthorizerState();

    /**
     * The API identifier.
     * 
     */
    @InputImport(name="apiId")
    private final @Nullable Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId == null ? Input.empty() : this.apiId;
    }

    /**
     * The required credentials as an IAM role for API Gateway to invoke the authorizer.
     * Supported only for `REQUEST` authorizers.
     * 
     */
    @InputImport(name="authorizerCredentialsArn")
    private final @Nullable Input<String> authorizerCredentialsArn;

    public Input<String> getAuthorizerCredentialsArn() {
        return this.authorizerCredentialsArn == null ? Input.empty() : this.authorizerCredentialsArn;
    }

    /**
     * The format of the payload sent to an HTTP API Lambda authorizer. Required for HTTP API Lambda authorizers.
     * Valid values: `1.0`, `2.0`.
     * 
     */
    @InputImport(name="authorizerPayloadFormatVersion")
    private final @Nullable Input<String> authorizerPayloadFormatVersion;

    public Input<String> getAuthorizerPayloadFormatVersion() {
        return this.authorizerPayloadFormatVersion == null ? Input.empty() : this.authorizerPayloadFormatVersion;
    }

    /**
     * The time to live (TTL) for cached authorizer results, in seconds. If it equals 0, authorization caching is disabled.
     * If it is greater than 0, API Gateway caches authorizer responses. The maximum value is 3600, or 1 hour. Defaults to `300`.
     * Supported only for HTTP API Lambda authorizers.
     * 
     */
    @InputImport(name="authorizerResultTtlInSeconds")
    private final @Nullable Input<Integer> authorizerResultTtlInSeconds;

    public Input<Integer> getAuthorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds == null ? Input.empty() : this.authorizerResultTtlInSeconds;
    }

    /**
     * The authorizer type. Valid values: `JWT`, `REQUEST`.
     * Specify `REQUEST` for a Lambda function using incoming request parameters.
     * For HTTP APIs, specify `JWT` to use JSON Web Tokens.
     * 
     */
    @InputImport(name="authorizerType")
    private final @Nullable Input<String> authorizerType;

    public Input<String> getAuthorizerType() {
        return this.authorizerType == null ? Input.empty() : this.authorizerType;
    }

    /**
     * The authorizer's Uniform Resource Identifier (URI).
     * For `REQUEST` authorizers this must be a well-formed Lambda function URI, such as the `invoke_arn` attribute of the `aws.lambda.Function` resource.
     * Supported only for `REQUEST` authorizers. Must be between 1 and 2048 characters in length.
     * 
     */
    @InputImport(name="authorizerUri")
    private final @Nullable Input<String> authorizerUri;

    public Input<String> getAuthorizerUri() {
        return this.authorizerUri == null ? Input.empty() : this.authorizerUri;
    }

    /**
     * Whether a Lambda authorizer returns a response in a simple format. If enabled, the Lambda authorizer can return a boolean value instead of an IAM policy.
     * Supported only for HTTP APIs.
     * 
     */
    @InputImport(name="enableSimpleResponses")
    private final @Nullable Input<Boolean> enableSimpleResponses;

    public Input<Boolean> getEnableSimpleResponses() {
        return this.enableSimpleResponses == null ? Input.empty() : this.enableSimpleResponses;
    }

    /**
     * The identity sources for which authorization is requested.
     * For `REQUEST` authorizers the value is a list of one or more mapping expressions of the specified request parameters.
     * For `JWT` authorizers the single entry specifies where to extract the JSON Web Token (JWT) from inbound requests.
     * 
     */
    @InputImport(name="identitySources")
    private final @Nullable Input<List<String>> identitySources;

    public Input<List<String>> getIdentitySources() {
        return this.identitySources == null ? Input.empty() : this.identitySources;
    }

    /**
     * The configuration of a JWT authorizer. Required for the `JWT` authorizer type.
     * Supported only for HTTP APIs.
     * 
     */
    @InputImport(name="jwtConfiguration")
    private final @Nullable Input<AuthorizerJwtConfigurationGetArgs> jwtConfiguration;

    public Input<AuthorizerJwtConfigurationGetArgs> getJwtConfiguration() {
        return this.jwtConfiguration == null ? Input.empty() : this.jwtConfiguration;
    }

    /**
     * The name of the authorizer. Must be between 1 and 128 characters in length.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public AuthorizerState(
        @Nullable Input<String> apiId,
        @Nullable Input<String> authorizerCredentialsArn,
        @Nullable Input<String> authorizerPayloadFormatVersion,
        @Nullable Input<Integer> authorizerResultTtlInSeconds,
        @Nullable Input<String> authorizerType,
        @Nullable Input<String> authorizerUri,
        @Nullable Input<Boolean> enableSimpleResponses,
        @Nullable Input<List<String>> identitySources,
        @Nullable Input<AuthorizerJwtConfigurationGetArgs> jwtConfiguration,
        @Nullable Input<String> name) {
        this.apiId = apiId;
        this.authorizerCredentialsArn = authorizerCredentialsArn;
        this.authorizerPayloadFormatVersion = authorizerPayloadFormatVersion;
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        this.authorizerType = authorizerType;
        this.authorizerUri = authorizerUri;
        this.enableSimpleResponses = enableSimpleResponses;
        this.identitySources = identitySources;
        this.jwtConfiguration = jwtConfiguration;
        this.name = name;
    }

    private AuthorizerState() {
        this.apiId = Input.empty();
        this.authorizerCredentialsArn = Input.empty();
        this.authorizerPayloadFormatVersion = Input.empty();
        this.authorizerResultTtlInSeconds = Input.empty();
        this.authorizerType = Input.empty();
        this.authorizerUri = Input.empty();
        this.enableSimpleResponses = Input.empty();
        this.identitySources = Input.empty();
        this.jwtConfiguration = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiId;
        private @Nullable Input<String> authorizerCredentialsArn;
        private @Nullable Input<String> authorizerPayloadFormatVersion;
        private @Nullable Input<Integer> authorizerResultTtlInSeconds;
        private @Nullable Input<String> authorizerType;
        private @Nullable Input<String> authorizerUri;
        private @Nullable Input<Boolean> enableSimpleResponses;
        private @Nullable Input<List<String>> identitySources;
        private @Nullable Input<AuthorizerJwtConfigurationGetArgs> jwtConfiguration;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.authorizerCredentialsArn = defaults.authorizerCredentialsArn;
    	      this.authorizerPayloadFormatVersion = defaults.authorizerPayloadFormatVersion;
    	      this.authorizerResultTtlInSeconds = defaults.authorizerResultTtlInSeconds;
    	      this.authorizerType = defaults.authorizerType;
    	      this.authorizerUri = defaults.authorizerUri;
    	      this.enableSimpleResponses = defaults.enableSimpleResponses;
    	      this.identitySources = defaults.identitySources;
    	      this.jwtConfiguration = defaults.jwtConfiguration;
    	      this.name = defaults.name;
        }

        public Builder setApiId(@Nullable Input<String> apiId) {
            this.apiId = apiId;
            return this;
        }

        public Builder setApiId(@Nullable String apiId) {
            this.apiId = Input.ofNullable(apiId);
            return this;
        }

        public Builder setAuthorizerCredentialsArn(@Nullable Input<String> authorizerCredentialsArn) {
            this.authorizerCredentialsArn = authorizerCredentialsArn;
            return this;
        }

        public Builder setAuthorizerCredentialsArn(@Nullable String authorizerCredentialsArn) {
            this.authorizerCredentialsArn = Input.ofNullable(authorizerCredentialsArn);
            return this;
        }

        public Builder setAuthorizerPayloadFormatVersion(@Nullable Input<String> authorizerPayloadFormatVersion) {
            this.authorizerPayloadFormatVersion = authorizerPayloadFormatVersion;
            return this;
        }

        public Builder setAuthorizerPayloadFormatVersion(@Nullable String authorizerPayloadFormatVersion) {
            this.authorizerPayloadFormatVersion = Input.ofNullable(authorizerPayloadFormatVersion);
            return this;
        }

        public Builder setAuthorizerResultTtlInSeconds(@Nullable Input<Integer> authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }

        public Builder setAuthorizerResultTtlInSeconds(@Nullable Integer authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = Input.ofNullable(authorizerResultTtlInSeconds);
            return this;
        }

        public Builder setAuthorizerType(@Nullable Input<String> authorizerType) {
            this.authorizerType = authorizerType;
            return this;
        }

        public Builder setAuthorizerType(@Nullable String authorizerType) {
            this.authorizerType = Input.ofNullable(authorizerType);
            return this;
        }

        public Builder setAuthorizerUri(@Nullable Input<String> authorizerUri) {
            this.authorizerUri = authorizerUri;
            return this;
        }

        public Builder setAuthorizerUri(@Nullable String authorizerUri) {
            this.authorizerUri = Input.ofNullable(authorizerUri);
            return this;
        }

        public Builder setEnableSimpleResponses(@Nullable Input<Boolean> enableSimpleResponses) {
            this.enableSimpleResponses = enableSimpleResponses;
            return this;
        }

        public Builder setEnableSimpleResponses(@Nullable Boolean enableSimpleResponses) {
            this.enableSimpleResponses = Input.ofNullable(enableSimpleResponses);
            return this;
        }

        public Builder setIdentitySources(@Nullable Input<List<String>> identitySources) {
            this.identitySources = identitySources;
            return this;
        }

        public Builder setIdentitySources(@Nullable List<String> identitySources) {
            this.identitySources = Input.ofNullable(identitySources);
            return this;
        }

        public Builder setJwtConfiguration(@Nullable Input<AuthorizerJwtConfigurationGetArgs> jwtConfiguration) {
            this.jwtConfiguration = jwtConfiguration;
            return this;
        }

        public Builder setJwtConfiguration(@Nullable AuthorizerJwtConfigurationGetArgs jwtConfiguration) {
            this.jwtConfiguration = Input.ofNullable(jwtConfiguration);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public AuthorizerState build() {
            return new AuthorizerState(apiId, authorizerCredentialsArn, authorizerPayloadFormatVersion, authorizerResultTtlInSeconds, authorizerType, authorizerUri, enableSimpleResponses, identitySources, jwtConfiguration, name);
        }
    }
}
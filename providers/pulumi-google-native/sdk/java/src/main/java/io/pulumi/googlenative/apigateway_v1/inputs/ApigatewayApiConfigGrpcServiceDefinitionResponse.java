// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.apigateway_v1.inputs.ApigatewayApiConfigFileResponse;
import java.util.List;
import java.util.Objects;


public final class ApigatewayApiConfigGrpcServiceDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApigatewayApiConfigGrpcServiceDefinitionResponse Empty = new ApigatewayApiConfigGrpcServiceDefinitionResponse();

    @InputImport(name="fileDescriptorSet", required=true)
    private final ApigatewayApiConfigFileResponse fileDescriptorSet;

    public ApigatewayApiConfigFileResponse getFileDescriptorSet() {
        return this.fileDescriptorSet;
    }

    @InputImport(name="source", required=true)
    private final List<ApigatewayApiConfigFileResponse> source;

    public List<ApigatewayApiConfigFileResponse> getSource() {
        return this.source;
    }

    public ApigatewayApiConfigGrpcServiceDefinitionResponse(
        ApigatewayApiConfigFileResponse fileDescriptorSet,
        List<ApigatewayApiConfigFileResponse> source) {
        this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet, "expected parameter 'fileDescriptorSet' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private ApigatewayApiConfigGrpcServiceDefinitionResponse() {
        this.fileDescriptorSet = null;
        this.source = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse fileDescriptorSet;
        private List<ApigatewayApiConfigFileResponse> source;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigGrpcServiceDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.source = defaults.source;
        }

        public Builder setFileDescriptorSet(ApigatewayApiConfigFileResponse fileDescriptorSet) {
            this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
            return this;
        }

        public Builder setSource(List<ApigatewayApiConfigFileResponse> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public ApigatewayApiConfigGrpcServiceDefinitionResponse build() {
            return new ApigatewayApiConfigGrpcServiceDefinitionResponse(fileDescriptorSet, source);
        }
    }
}
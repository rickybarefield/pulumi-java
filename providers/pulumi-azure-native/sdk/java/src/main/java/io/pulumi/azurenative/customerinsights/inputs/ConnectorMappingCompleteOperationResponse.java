// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorMappingCompleteOperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingCompleteOperationResponse Empty = new ConnectorMappingCompleteOperationResponse();

    @InputImport(name="completionOperationType")
    private final @Nullable String completionOperationType;

    public Optional<String> getCompletionOperationType() {
        return this.completionOperationType == null ? Optional.empty() : Optional.ofNullable(this.completionOperationType);
    }

    @InputImport(name="destinationFolder")
    private final @Nullable String destinationFolder;

    public Optional<String> getDestinationFolder() {
        return this.destinationFolder == null ? Optional.empty() : Optional.ofNullable(this.destinationFolder);
    }

    public ConnectorMappingCompleteOperationResponse(
        @Nullable String completionOperationType,
        @Nullable String destinationFolder) {
        this.completionOperationType = completionOperationType;
        this.destinationFolder = destinationFolder;
    }

    private ConnectorMappingCompleteOperationResponse() {
        this.completionOperationType = null;
        this.destinationFolder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingCompleteOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String completionOperationType;
        private @Nullable String destinationFolder;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingCompleteOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionOperationType = defaults.completionOperationType;
    	      this.destinationFolder = defaults.destinationFolder;
        }

        public Builder setCompletionOperationType(@Nullable String completionOperationType) {
            this.completionOperationType = completionOperationType;
            return this;
        }

        public Builder setDestinationFolder(@Nullable String destinationFolder) {
            this.destinationFolder = destinationFolder;
            return this;
        }

        public ConnectorMappingCompleteOperationResponse build() {
            return new ConnectorMappingCompleteOperationResponse(completionOperationType, destinationFolder);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.inputs.MetadataOptionsResponse;
import java.lang.Boolean;
import java.util.Objects;


public final class TransferOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransferOptionsResponse Empty = new TransferOptionsResponse();

    @InputImport(name="deleteObjectsFromSourceAfterTransfer", required=true)
    private final Boolean deleteObjectsFromSourceAfterTransfer;

    public Boolean getDeleteObjectsFromSourceAfterTransfer() {
        return this.deleteObjectsFromSourceAfterTransfer;
    }

    @InputImport(name="deleteObjectsUniqueInSink", required=true)
    private final Boolean deleteObjectsUniqueInSink;

    public Boolean getDeleteObjectsUniqueInSink() {
        return this.deleteObjectsUniqueInSink;
    }

    @InputImport(name="metadataOptions", required=true)
    private final MetadataOptionsResponse metadataOptions;

    public MetadataOptionsResponse getMetadataOptions() {
        return this.metadataOptions;
    }

    @InputImport(name="overwriteObjectsAlreadyExistingInSink", required=true)
    private final Boolean overwriteObjectsAlreadyExistingInSink;

    public Boolean getOverwriteObjectsAlreadyExistingInSink() {
        return this.overwriteObjectsAlreadyExistingInSink;
    }

    public TransferOptionsResponse(
        Boolean deleteObjectsFromSourceAfterTransfer,
        Boolean deleteObjectsUniqueInSink,
        MetadataOptionsResponse metadataOptions,
        Boolean overwriteObjectsAlreadyExistingInSink) {
        this.deleteObjectsFromSourceAfterTransfer = Objects.requireNonNull(deleteObjectsFromSourceAfterTransfer, "expected parameter 'deleteObjectsFromSourceAfterTransfer' to be non-null");
        this.deleteObjectsUniqueInSink = Objects.requireNonNull(deleteObjectsUniqueInSink, "expected parameter 'deleteObjectsUniqueInSink' to be non-null");
        this.metadataOptions = Objects.requireNonNull(metadataOptions, "expected parameter 'metadataOptions' to be non-null");
        this.overwriteObjectsAlreadyExistingInSink = Objects.requireNonNull(overwriteObjectsAlreadyExistingInSink, "expected parameter 'overwriteObjectsAlreadyExistingInSink' to be non-null");
    }

    private TransferOptionsResponse() {
        this.deleteObjectsFromSourceAfterTransfer = null;
        this.deleteObjectsUniqueInSink = null;
        this.metadataOptions = null;
        this.overwriteObjectsAlreadyExistingInSink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteObjectsFromSourceAfterTransfer;
        private Boolean deleteObjectsUniqueInSink;
        private MetadataOptionsResponse metadataOptions;
        private Boolean overwriteObjectsAlreadyExistingInSink;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteObjectsFromSourceAfterTransfer = defaults.deleteObjectsFromSourceAfterTransfer;
    	      this.deleteObjectsUniqueInSink = defaults.deleteObjectsUniqueInSink;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.overwriteObjectsAlreadyExistingInSink = defaults.overwriteObjectsAlreadyExistingInSink;
        }

        public Builder setDeleteObjectsFromSourceAfterTransfer(Boolean deleteObjectsFromSourceAfterTransfer) {
            this.deleteObjectsFromSourceAfterTransfer = Objects.requireNonNull(deleteObjectsFromSourceAfterTransfer);
            return this;
        }

        public Builder setDeleteObjectsUniqueInSink(Boolean deleteObjectsUniqueInSink) {
            this.deleteObjectsUniqueInSink = Objects.requireNonNull(deleteObjectsUniqueInSink);
            return this;
        }

        public Builder setMetadataOptions(MetadataOptionsResponse metadataOptions) {
            this.metadataOptions = Objects.requireNonNull(metadataOptions);
            return this;
        }

        public Builder setOverwriteObjectsAlreadyExistingInSink(Boolean overwriteObjectsAlreadyExistingInSink) {
            this.overwriteObjectsAlreadyExistingInSink = Objects.requireNonNull(overwriteObjectsAlreadyExistingInSink);
            return this;
        }

        public TransferOptionsResponse build() {
            return new TransferOptionsResponse(deleteObjectsFromSourceAfterTransfer, deleteObjectsUniqueInSink, metadataOptions, overwriteObjectsAlreadyExistingInSink);
        }
    }
}
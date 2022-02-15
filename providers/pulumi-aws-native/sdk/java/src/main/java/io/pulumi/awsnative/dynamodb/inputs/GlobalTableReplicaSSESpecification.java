// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableReplicaSSESpecification extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableReplicaSSESpecification Empty = new GlobalTableReplicaSSESpecification();

    @InputImport(name="kMSMasterKeyId", required=true)
    private final String kMSMasterKeyId;

    public String getKMSMasterKeyId() {
        return this.kMSMasterKeyId;
    }

    public GlobalTableReplicaSSESpecification(String kMSMasterKeyId) {
        this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId, "expected parameter 'kMSMasterKeyId' to be non-null");
    }

    private GlobalTableReplicaSSESpecification() {
        this.kMSMasterKeyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableReplicaSSESpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kMSMasterKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableReplicaSSESpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSMasterKeyId = defaults.kMSMasterKeyId;
        }

        public Builder setKMSMasterKeyId(String kMSMasterKeyId) {
            this.kMSMasterKeyId = Objects.requireNonNull(kMSMasterKeyId);
            return this;
        }

        public GlobalTableReplicaSSESpecification build() {
            return new GlobalTableReplicaSSESpecification(kMSMasterKeyId);
        }
    }
}
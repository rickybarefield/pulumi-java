// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs();

    /**
     * A local file certificate.
     * 
     */
    @InputImport(name="file")
    private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs> file;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
    private final @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs> sds;

    public Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs(
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs> file,
        @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs() {
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs> file;
        private @Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateFileGetArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setSds(@Nullable Input<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder setSds(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateSdsGetArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs(file, sds);
        }
    }
}
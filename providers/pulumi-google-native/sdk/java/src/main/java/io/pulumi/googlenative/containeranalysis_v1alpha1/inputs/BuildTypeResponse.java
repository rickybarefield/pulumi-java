// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildSignatureResponse;
import java.lang.String;
import java.util.Objects;


public final class BuildTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildTypeResponse Empty = new BuildTypeResponse();

    @InputImport(name="builderVersion", required=true)
    private final String builderVersion;

    public String getBuilderVersion() {
        return this.builderVersion;
    }

    @InputImport(name="signature", required=true)
    private final BuildSignatureResponse signature;

    public BuildSignatureResponse getSignature() {
        return this.signature;
    }

    public BuildTypeResponse(
        String builderVersion,
        BuildSignatureResponse signature) {
        this.builderVersion = Objects.requireNonNull(builderVersion, "expected parameter 'builderVersion' to be non-null");
        this.signature = Objects.requireNonNull(signature, "expected parameter 'signature' to be non-null");
    }

    private BuildTypeResponse() {
        this.builderVersion = null;
        this.signature = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;
        private BuildSignatureResponse signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder setBuilderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }

        public Builder setSignature(BuildSignatureResponse signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }

        public BuildTypeResponse build() {
            return new BuildTypeResponse(builderVersion, signature);
        }
    }
}
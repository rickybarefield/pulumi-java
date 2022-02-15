// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.gkehub_v1alpha2.outputs.ResourceManifestResponse;
import io.pulumi.googlenative.gkehub_v1alpha2.outputs.ResourceOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class KubernetesResourceResponse {
    private final List<ResourceManifestResponse> connectResources;
    private final String membershipCrManifest;
    private final List<ResourceManifestResponse> membershipResources;
    private final ResourceOptionsResponse resourceOptions;

    @OutputCustomType.Constructor({"connectResources","membershipCrManifest","membershipResources","resourceOptions"})
    private KubernetesResourceResponse(
        List<ResourceManifestResponse> connectResources,
        String membershipCrManifest,
        List<ResourceManifestResponse> membershipResources,
        ResourceOptionsResponse resourceOptions) {
        this.connectResources = Objects.requireNonNull(connectResources);
        this.membershipCrManifest = Objects.requireNonNull(membershipCrManifest);
        this.membershipResources = Objects.requireNonNull(membershipResources);
        this.resourceOptions = Objects.requireNonNull(resourceOptions);
    }

    public List<ResourceManifestResponse> getConnectResources() {
        return this.connectResources;
    }
    public String getMembershipCrManifest() {
        return this.membershipCrManifest;
    }
    public List<ResourceManifestResponse> getMembershipResources() {
        return this.membershipResources;
    }
    public ResourceOptionsResponse getResourceOptions() {
        return this.resourceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceManifestResponse> connectResources;
        private String membershipCrManifest;
        private List<ResourceManifestResponse> membershipResources;
        private ResourceOptionsResponse resourceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectResources = defaults.connectResources;
    	      this.membershipCrManifest = defaults.membershipCrManifest;
    	      this.membershipResources = defaults.membershipResources;
    	      this.resourceOptions = defaults.resourceOptions;
        }

        public Builder setConnectResources(List<ResourceManifestResponse> connectResources) {
            this.connectResources = Objects.requireNonNull(connectResources);
            return this;
        }

        public Builder setMembershipCrManifest(String membershipCrManifest) {
            this.membershipCrManifest = Objects.requireNonNull(membershipCrManifest);
            return this;
        }

        public Builder setMembershipResources(List<ResourceManifestResponse> membershipResources) {
            this.membershipResources = Objects.requireNonNull(membershipResources);
            return this;
        }

        public Builder setResourceOptions(ResourceOptionsResponse resourceOptions) {
            this.resourceOptions = Objects.requireNonNull(resourceOptions);
            return this;
        }

        public KubernetesResourceResponse build() {
            return new KubernetesResourceResponse(connectResources, membershipCrManifest, membershipResources, resourceOptions);
        }
    }
}
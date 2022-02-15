// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.networkservices_v1.outputs.EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EndpointMatcherMetadataLabelMatcherResponse {
    private final String metadataLabelMatchCriteria;
    private final List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels;

    @OutputCustomType.Constructor({"metadataLabelMatchCriteria","metadataLabels"})
    private EndpointMatcherMetadataLabelMatcherResponse(
        String metadataLabelMatchCriteria,
        List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels) {
        this.metadataLabelMatchCriteria = Objects.requireNonNull(metadataLabelMatchCriteria);
        this.metadataLabels = Objects.requireNonNull(metadataLabels);
    }

    public String getMetadataLabelMatchCriteria() {
        return this.metadataLabelMatchCriteria;
    }
    public List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> getMetadataLabels() {
        return this.metadataLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherMetadataLabelMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metadataLabelMatchCriteria;
        private List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherMetadataLabelMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatchCriteria = defaults.metadataLabelMatchCriteria;
    	      this.metadataLabels = defaults.metadataLabels;
        }

        public Builder setMetadataLabelMatchCriteria(String metadataLabelMatchCriteria) {
            this.metadataLabelMatchCriteria = Objects.requireNonNull(metadataLabelMatchCriteria);
            return this;
        }

        public Builder setMetadataLabels(List<EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse> metadataLabels) {
            this.metadataLabels = Objects.requireNonNull(metadataLabels);
            return this;
        }

        public EndpointMatcherMetadataLabelMatcherResponse build() {
            return new EndpointMatcherMetadataLabelMatcherResponse(metadataLabelMatchCriteria, metadataLabels);
        }
    }
}
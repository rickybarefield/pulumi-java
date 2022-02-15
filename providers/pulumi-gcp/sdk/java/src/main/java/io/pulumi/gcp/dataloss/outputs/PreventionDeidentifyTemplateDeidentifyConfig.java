// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations;
import java.util.Objects;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfig {
    private final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations infoTypeTransformations;

    @OutputCustomType.Constructor({"infoTypeTransformations"})
    private PreventionDeidentifyTemplateDeidentifyConfig(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations infoTypeTransformations) {
        this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations getInfoTypeTransformations() {
        return this.infoTypeTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations infoTypeTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
        }

        public Builder setInfoTypeTransformations(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformations infoTypeTransformations) {
            this.infoTypeTransformations = Objects.requireNonNull(infoTypeTransformations);
            return this;
        }

        public PreventionDeidentifyTemplateDeidentifyConfig build() {
            return new PreventionDeidentifyTemplateDeidentifyConfig(infoTypeTransformations);
        }
    }
}
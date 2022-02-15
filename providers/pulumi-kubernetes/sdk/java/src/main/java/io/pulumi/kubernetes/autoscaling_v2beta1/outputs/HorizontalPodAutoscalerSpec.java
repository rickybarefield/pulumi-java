// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.MetricSpec;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HorizontalPodAutoscalerSpec {
    private final Integer maxReplicas;
    private final @Nullable List<MetricSpec> metrics;
    private final @Nullable Integer minReplicas;
    private final CrossVersionObjectReference scaleTargetRef;

    @OutputCustomType.Constructor({"maxReplicas","metrics","minReplicas","scaleTargetRef"})
    private HorizontalPodAutoscalerSpec(
        Integer maxReplicas,
        @Nullable List<MetricSpec> metrics,
        @Nullable Integer minReplicas,
        CrossVersionObjectReference scaleTargetRef) {
        this.maxReplicas = Objects.requireNonNull(maxReplicas);
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
    }

    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }
    public List<MetricSpec> getMetrics() {
        return this.metrics == null ? List.of() : this.metrics;
    }
    public Optional<Integer> getMinReplicas() {
        return Optional.ofNullable(this.minReplicas);
    }
    public CrossVersionObjectReference getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxReplicas;
        private @Nullable List<MetricSpec> metrics;
        private @Nullable Integer minReplicas;
        private CrossVersionObjectReference scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMetrics(@Nullable List<MetricSpec> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setScaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }

        public HorizontalPodAutoscalerSpec build() {
            return new HorizontalPodAutoscalerSpec(maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}
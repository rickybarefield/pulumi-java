// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyCpuUtilizationArgs;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyMetricArgs;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlArgs;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleInControlArgs;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScalingScheduleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyArgs Empty = new AutoscalerAutoscalingPolicyArgs();

    @InputImport(name="cooldownPeriod")
    private final @Nullable Input<Integer> cooldownPeriod;

    public Input<Integer> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Input.empty() : this.cooldownPeriod;
    }

    @InputImport(name="cpuUtilization")
    private final @Nullable Input<AutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    public Input<AutoscalerAutoscalingPolicyCpuUtilizationArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Input.empty() : this.cpuUtilization;
    }

    @InputImport(name="loadBalancingUtilization")
    private final @Nullable Input<AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    public Input<AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Input.empty() : this.loadBalancingUtilization;
    }

    @InputImport(name="maxReplicas", required=true)
    private final Input<Integer> maxReplicas;

    public Input<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    @InputImport(name="metrics")
    private final @Nullable Input<List<AutoscalerAutoscalingPolicyMetricArgs>> metrics;

    public Input<List<AutoscalerAutoscalingPolicyMetricArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    @InputImport(name="minReplicas", required=true)
    private final Input<Integer> minReplicas;

    public Input<Integer> getMinReplicas() {
        return this.minReplicas;
    }

    @InputImport(name="mode")
    private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="scaleDownControl")
    private final @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl;

    public Input<AutoscalerAutoscalingPolicyScaleDownControlArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Input.empty() : this.scaleDownControl;
    }

    @InputImport(name="scaleInControl")
    private final @Nullable Input<AutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl;

    public Input<AutoscalerAutoscalingPolicyScaleInControlArgs> getScaleInControl() {
        return this.scaleInControl == null ? Input.empty() : this.scaleInControl;
    }

    @InputImport(name="scalingSchedules")
    private final @Nullable Input<List<AutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

    public Input<List<AutoscalerAutoscalingPolicyScalingScheduleArgs>> getScalingSchedules() {
        return this.scalingSchedules == null ? Input.empty() : this.scalingSchedules;
    }

    public AutoscalerAutoscalingPolicyArgs(
        @Nullable Input<Integer> cooldownPeriod,
        @Nullable Input<AutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization,
        @Nullable Input<AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization,
        Input<Integer> maxReplicas,
        @Nullable Input<List<AutoscalerAutoscalingPolicyMetricArgs>> metrics,
        Input<Integer> minReplicas,
        @Nullable Input<String> mode,
        @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl,
        @Nullable Input<AutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl,
        @Nullable Input<List<AutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
        this.cooldownPeriod = cooldownPeriod;
        this.cpuUtilization = cpuUtilization;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = Objects.requireNonNull(minReplicas, "expected parameter 'minReplicas' to be non-null");
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private AutoscalerAutoscalingPolicyArgs() {
        this.cooldownPeriod = Input.empty();
        this.cpuUtilization = Input.empty();
        this.loadBalancingUtilization = Input.empty();
        this.maxReplicas = Input.empty();
        this.metrics = Input.empty();
        this.minReplicas = Input.empty();
        this.mode = Input.empty();
        this.scaleDownControl = Input.empty();
        this.scaleInControl = Input.empty();
        this.scalingSchedules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> cooldownPeriod;
        private @Nullable Input<AutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization;
        private @Nullable Input<AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;
        private Input<Integer> maxReplicas;
        private @Nullable Input<List<AutoscalerAutoscalingPolicyMetricArgs>> metrics;
        private Input<Integer> minReplicas;
        private @Nullable Input<String> mode;
        private @Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl;
        private @Nullable Input<AutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl;
        private @Nullable Input<List<AutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder setCooldownPeriod(@Nullable Input<Integer> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder setCooldownPeriod(@Nullable Integer cooldownPeriod) {
            this.cooldownPeriod = Input.ofNullable(cooldownPeriod);
            return this;
        }

        public Builder setCpuUtilization(@Nullable Input<AutoscalerAutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder setCpuUtilization(@Nullable AutoscalerAutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Input.ofNullable(cpuUtilization);
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable Input<AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable AutoscalerAutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Input.ofNullable(loadBalancingUtilization);
            return this;
        }

        public Builder setMaxReplicas(Input<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }

        public Builder setMaxReplicas(Integer maxReplicas) {
            this.maxReplicas = Input.of(Objects.requireNonNull(maxReplicas));
            return this;
        }

        public Builder setMetrics(@Nullable Input<List<AutoscalerAutoscalingPolicyMetricArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<AutoscalerAutoscalingPolicyMetricArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setMinReplicas(Input<Integer> minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }

        public Builder setMinReplicas(Integer minReplicas) {
            this.minReplicas = Input.of(Objects.requireNonNull(minReplicas));
            return this;
        }

        public Builder setMode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setScaleDownControl(@Nullable Input<AutoscalerAutoscalingPolicyScaleDownControlArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }

        public Builder setScaleDownControl(@Nullable AutoscalerAutoscalingPolicyScaleDownControlArgs scaleDownControl) {
            this.scaleDownControl = Input.ofNullable(scaleDownControl);
            return this;
        }

        public Builder setScaleInControl(@Nullable Input<AutoscalerAutoscalingPolicyScaleInControlArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }

        public Builder setScaleInControl(@Nullable AutoscalerAutoscalingPolicyScaleInControlArgs scaleInControl) {
            this.scaleInControl = Input.ofNullable(scaleInControl);
            return this;
        }

        public Builder setScalingSchedules(@Nullable Input<List<AutoscalerAutoscalingPolicyScalingScheduleArgs>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }

        public Builder setScalingSchedules(@Nullable List<AutoscalerAutoscalingPolicyScalingScheduleArgs> scalingSchedules) {
            this.scalingSchedules = Input.ofNullable(scalingSchedules);
            return this;
        }

        public AutoscalerAutoscalingPolicyArgs build() {
            return new AutoscalerAutoscalingPolicyArgs(cooldownPeriod, cpuUtilization, loadBalancingUtilization, maxReplicas, metrics, minReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
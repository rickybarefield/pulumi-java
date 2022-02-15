// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.MetricRangeResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.PerformanceThresholdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WindowsBasedSliResponse {
    private final String goodBadMetricFilter;
    private final PerformanceThresholdResponse goodTotalRatioThreshold;
    private final MetricRangeResponse metricMeanInRange;
    private final MetricRangeResponse metricSumInRange;
    private final String windowPeriod;

    @OutputCustomType.Constructor({"goodBadMetricFilter","goodTotalRatioThreshold","metricMeanInRange","metricSumInRange","windowPeriod"})
    private WindowsBasedSliResponse(
        String goodBadMetricFilter,
        PerformanceThresholdResponse goodTotalRatioThreshold,
        MetricRangeResponse metricMeanInRange,
        MetricRangeResponse metricSumInRange,
        String windowPeriod) {
        this.goodBadMetricFilter = Objects.requireNonNull(goodBadMetricFilter);
        this.goodTotalRatioThreshold = Objects.requireNonNull(goodTotalRatioThreshold);
        this.metricMeanInRange = Objects.requireNonNull(metricMeanInRange);
        this.metricSumInRange = Objects.requireNonNull(metricSumInRange);
        this.windowPeriod = Objects.requireNonNull(windowPeriod);
    }

    public String getGoodBadMetricFilter() {
        return this.goodBadMetricFilter;
    }
    public PerformanceThresholdResponse getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold;
    }
    public MetricRangeResponse getMetricMeanInRange() {
        return this.metricMeanInRange;
    }
    public MetricRangeResponse getMetricSumInRange() {
        return this.metricSumInRange;
    }
    public String getWindowPeriod() {
        return this.windowPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsBasedSliResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String goodBadMetricFilter;
        private PerformanceThresholdResponse goodTotalRatioThreshold;
        private MetricRangeResponse metricMeanInRange;
        private MetricRangeResponse metricSumInRange;
        private String windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsBasedSliResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodBadMetricFilter = defaults.goodBadMetricFilter;
    	      this.goodTotalRatioThreshold = defaults.goodTotalRatioThreshold;
    	      this.metricMeanInRange = defaults.metricMeanInRange;
    	      this.metricSumInRange = defaults.metricSumInRange;
    	      this.windowPeriod = defaults.windowPeriod;
        }

        public Builder setGoodBadMetricFilter(String goodBadMetricFilter) {
            this.goodBadMetricFilter = Objects.requireNonNull(goodBadMetricFilter);
            return this;
        }

        public Builder setGoodTotalRatioThreshold(PerformanceThresholdResponse goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Objects.requireNonNull(goodTotalRatioThreshold);
            return this;
        }

        public Builder setMetricMeanInRange(MetricRangeResponse metricMeanInRange) {
            this.metricMeanInRange = Objects.requireNonNull(metricMeanInRange);
            return this;
        }

        public Builder setMetricSumInRange(MetricRangeResponse metricSumInRange) {
            this.metricSumInRange = Objects.requireNonNull(metricSumInRange);
            return this;
        }

        public Builder setWindowPeriod(String windowPeriod) {
            this.windowPeriod = Objects.requireNonNull(windowPeriod);
            return this;
        }

        public WindowsBasedSliResponse build() {
            return new WindowsBasedSliResponse(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
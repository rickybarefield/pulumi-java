// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowAmplitudeConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowDatadogConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowDynatraceConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowGoogleAnalyticsConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowInforNexusConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowMarketoConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowS3ConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSAPODataConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSalesforceConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowServiceNowConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSingularConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowSlackConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowTrendmicroConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowVeevaConnectorOperator;
import io.pulumi.awsnative.appflow.enums.FlowZendeskConnectorOperator;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowConnectorOperator {
    private final @Nullable FlowAmplitudeConnectorOperator amplitude;
    private final @Nullable FlowDatadogConnectorOperator datadog;
    private final @Nullable FlowDynatraceConnectorOperator dynatrace;
    private final @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics;
    private final @Nullable FlowInforNexusConnectorOperator inforNexus;
    private final @Nullable FlowMarketoConnectorOperator marketo;
    private final @Nullable FlowS3ConnectorOperator s3;
    private final @Nullable FlowSAPODataConnectorOperator sAPOData;
    private final @Nullable FlowSalesforceConnectorOperator salesforce;
    private final @Nullable FlowServiceNowConnectorOperator serviceNow;
    private final @Nullable FlowSingularConnectorOperator singular;
    private final @Nullable FlowSlackConnectorOperator slack;
    private final @Nullable FlowTrendmicroConnectorOperator trendmicro;
    private final @Nullable FlowVeevaConnectorOperator veeva;
    private final @Nullable FlowZendeskConnectorOperator zendesk;

    @OutputCustomType.Constructor({"amplitude","datadog","dynatrace","googleAnalytics","inforNexus","marketo","s3","sAPOData","salesforce","serviceNow","singular","slack","trendmicro","veeva","zendesk"})
    private FlowConnectorOperator(
        @Nullable FlowAmplitudeConnectorOperator amplitude,
        @Nullable FlowDatadogConnectorOperator datadog,
        @Nullable FlowDynatraceConnectorOperator dynatrace,
        @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics,
        @Nullable FlowInforNexusConnectorOperator inforNexus,
        @Nullable FlowMarketoConnectorOperator marketo,
        @Nullable FlowS3ConnectorOperator s3,
        @Nullable FlowSAPODataConnectorOperator sAPOData,
        @Nullable FlowSalesforceConnectorOperator salesforce,
        @Nullable FlowServiceNowConnectorOperator serviceNow,
        @Nullable FlowSingularConnectorOperator singular,
        @Nullable FlowSlackConnectorOperator slack,
        @Nullable FlowTrendmicroConnectorOperator trendmicro,
        @Nullable FlowVeevaConnectorOperator veeva,
        @Nullable FlowZendeskConnectorOperator zendesk) {
        this.amplitude = amplitude;
        this.datadog = datadog;
        this.dynatrace = dynatrace;
        this.googleAnalytics = googleAnalytics;
        this.inforNexus = inforNexus;
        this.marketo = marketo;
        this.s3 = s3;
        this.sAPOData = sAPOData;
        this.salesforce = salesforce;
        this.serviceNow = serviceNow;
        this.singular = singular;
        this.slack = slack;
        this.trendmicro = trendmicro;
        this.veeva = veeva;
        this.zendesk = zendesk;
    }

    public Optional<FlowAmplitudeConnectorOperator> getAmplitude() {
        return Optional.ofNullable(this.amplitude);
    }
    public Optional<FlowDatadogConnectorOperator> getDatadog() {
        return Optional.ofNullable(this.datadog);
    }
    public Optional<FlowDynatraceConnectorOperator> getDynatrace() {
        return Optional.ofNullable(this.dynatrace);
    }
    public Optional<FlowGoogleAnalyticsConnectorOperator> getGoogleAnalytics() {
        return Optional.ofNullable(this.googleAnalytics);
    }
    public Optional<FlowInforNexusConnectorOperator> getInforNexus() {
        return Optional.ofNullable(this.inforNexus);
    }
    public Optional<FlowMarketoConnectorOperator> getMarketo() {
        return Optional.ofNullable(this.marketo);
    }
    public Optional<FlowS3ConnectorOperator> getS3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<FlowSAPODataConnectorOperator> getSAPOData() {
        return Optional.ofNullable(this.sAPOData);
    }
    public Optional<FlowSalesforceConnectorOperator> getSalesforce() {
        return Optional.ofNullable(this.salesforce);
    }
    public Optional<FlowServiceNowConnectorOperator> getServiceNow() {
        return Optional.ofNullable(this.serviceNow);
    }
    public Optional<FlowSingularConnectorOperator> getSingular() {
        return Optional.ofNullable(this.singular);
    }
    public Optional<FlowSlackConnectorOperator> getSlack() {
        return Optional.ofNullable(this.slack);
    }
    public Optional<FlowTrendmicroConnectorOperator> getTrendmicro() {
        return Optional.ofNullable(this.trendmicro);
    }
    public Optional<FlowVeevaConnectorOperator> getVeeva() {
        return Optional.ofNullable(this.veeva);
    }
    public Optional<FlowZendeskConnectorOperator> getZendesk() {
        return Optional.ofNullable(this.zendesk);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowConnectorOperator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowAmplitudeConnectorOperator amplitude;
        private @Nullable FlowDatadogConnectorOperator datadog;
        private @Nullable FlowDynatraceConnectorOperator dynatrace;
        private @Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics;
        private @Nullable FlowInforNexusConnectorOperator inforNexus;
        private @Nullable FlowMarketoConnectorOperator marketo;
        private @Nullable FlowS3ConnectorOperator s3;
        private @Nullable FlowSAPODataConnectorOperator sAPOData;
        private @Nullable FlowSalesforceConnectorOperator salesforce;
        private @Nullable FlowServiceNowConnectorOperator serviceNow;
        private @Nullable FlowSingularConnectorOperator singular;
        private @Nullable FlowSlackConnectorOperator slack;
        private @Nullable FlowTrendmicroConnectorOperator trendmicro;
        private @Nullable FlowVeevaConnectorOperator veeva;
        private @Nullable FlowZendeskConnectorOperator zendesk;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowConnectorOperator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amplitude = defaults.amplitude;
    	      this.datadog = defaults.datadog;
    	      this.dynatrace = defaults.dynatrace;
    	      this.googleAnalytics = defaults.googleAnalytics;
    	      this.inforNexus = defaults.inforNexus;
    	      this.marketo = defaults.marketo;
    	      this.s3 = defaults.s3;
    	      this.sAPOData = defaults.sAPOData;
    	      this.salesforce = defaults.salesforce;
    	      this.serviceNow = defaults.serviceNow;
    	      this.singular = defaults.singular;
    	      this.slack = defaults.slack;
    	      this.trendmicro = defaults.trendmicro;
    	      this.veeva = defaults.veeva;
    	      this.zendesk = defaults.zendesk;
        }

        public Builder setAmplitude(@Nullable FlowAmplitudeConnectorOperator amplitude) {
            this.amplitude = amplitude;
            return this;
        }

        public Builder setDatadog(@Nullable FlowDatadogConnectorOperator datadog) {
            this.datadog = datadog;
            return this;
        }

        public Builder setDynatrace(@Nullable FlowDynatraceConnectorOperator dynatrace) {
            this.dynatrace = dynatrace;
            return this;
        }

        public Builder setGoogleAnalytics(@Nullable FlowGoogleAnalyticsConnectorOperator googleAnalytics) {
            this.googleAnalytics = googleAnalytics;
            return this;
        }

        public Builder setInforNexus(@Nullable FlowInforNexusConnectorOperator inforNexus) {
            this.inforNexus = inforNexus;
            return this;
        }

        public Builder setMarketo(@Nullable FlowMarketoConnectorOperator marketo) {
            this.marketo = marketo;
            return this;
        }

        public Builder setS3(@Nullable FlowS3ConnectorOperator s3) {
            this.s3 = s3;
            return this;
        }

        public Builder setSAPOData(@Nullable FlowSAPODataConnectorOperator sAPOData) {
            this.sAPOData = sAPOData;
            return this;
        }

        public Builder setSalesforce(@Nullable FlowSalesforceConnectorOperator salesforce) {
            this.salesforce = salesforce;
            return this;
        }

        public Builder setServiceNow(@Nullable FlowServiceNowConnectorOperator serviceNow) {
            this.serviceNow = serviceNow;
            return this;
        }

        public Builder setSingular(@Nullable FlowSingularConnectorOperator singular) {
            this.singular = singular;
            return this;
        }

        public Builder setSlack(@Nullable FlowSlackConnectorOperator slack) {
            this.slack = slack;
            return this;
        }

        public Builder setTrendmicro(@Nullable FlowTrendmicroConnectorOperator trendmicro) {
            this.trendmicro = trendmicro;
            return this;
        }

        public Builder setVeeva(@Nullable FlowVeevaConnectorOperator veeva) {
            this.veeva = veeva;
            return this;
        }

        public Builder setZendesk(@Nullable FlowZendeskConnectorOperator zendesk) {
            this.zendesk = zendesk;
            return this;
        }

        public FlowConnectorOperator build() {
            return new FlowConnectorOperator(amplitude, datadog, dynatrace, googleAnalytics, inforNexus, marketo, s3, sAPOData, salesforce, serviceNow, singular, slack, trendmicro, veeva, zendesk);
        }
    }
}
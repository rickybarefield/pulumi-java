// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CategoricalStatsConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KAnonymityConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KMapEstimationConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LDiversityConfigArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2NumericalStatsConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2PrivacyMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PrivacyMetricArgs Empty = new GooglePrivacyDlpV2PrivacyMetricArgs();

    @InputImport(name="categoricalStatsConfig")
    private final @Nullable Input<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig;

    public Input<GooglePrivacyDlpV2CategoricalStatsConfigArgs> getCategoricalStatsConfig() {
        return this.categoricalStatsConfig == null ? Input.empty() : this.categoricalStatsConfig;
    }

    @InputImport(name="deltaPresenceEstimationConfig")
    private final @Nullable Input<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig;

    public Input<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> getDeltaPresenceEstimationConfig() {
        return this.deltaPresenceEstimationConfig == null ? Input.empty() : this.deltaPresenceEstimationConfig;
    }

    @InputImport(name="kAnonymityConfig")
    private final @Nullable Input<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig;

    public Input<GooglePrivacyDlpV2KAnonymityConfigArgs> getKAnonymityConfig() {
        return this.kAnonymityConfig == null ? Input.empty() : this.kAnonymityConfig;
    }

    @InputImport(name="kMapEstimationConfig")
    private final @Nullable Input<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig;

    public Input<GooglePrivacyDlpV2KMapEstimationConfigArgs> getKMapEstimationConfig() {
        return this.kMapEstimationConfig == null ? Input.empty() : this.kMapEstimationConfig;
    }

    @InputImport(name="lDiversityConfig")
    private final @Nullable Input<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig;

    public Input<GooglePrivacyDlpV2LDiversityConfigArgs> getLDiversityConfig() {
        return this.lDiversityConfig == null ? Input.empty() : this.lDiversityConfig;
    }

    @InputImport(name="numericalStatsConfig")
    private final @Nullable Input<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig;

    public Input<GooglePrivacyDlpV2NumericalStatsConfigArgs> getNumericalStatsConfig() {
        return this.numericalStatsConfig == null ? Input.empty() : this.numericalStatsConfig;
    }

    public GooglePrivacyDlpV2PrivacyMetricArgs(
        @Nullable Input<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig,
        @Nullable Input<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig,
        @Nullable Input<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig,
        @Nullable Input<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig,
        @Nullable Input<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig,
        @Nullable Input<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig) {
        this.categoricalStatsConfig = categoricalStatsConfig;
        this.deltaPresenceEstimationConfig = deltaPresenceEstimationConfig;
        this.kAnonymityConfig = kAnonymityConfig;
        this.kMapEstimationConfig = kMapEstimationConfig;
        this.lDiversityConfig = lDiversityConfig;
        this.numericalStatsConfig = numericalStatsConfig;
    }

    private GooglePrivacyDlpV2PrivacyMetricArgs() {
        this.categoricalStatsConfig = Input.empty();
        this.deltaPresenceEstimationConfig = Input.empty();
        this.kAnonymityConfig = Input.empty();
        this.kMapEstimationConfig = Input.empty();
        this.lDiversityConfig = Input.empty();
        this.numericalStatsConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PrivacyMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig;
        private @Nullable Input<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig;
        private @Nullable Input<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig;
        private @Nullable Input<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig;
        private @Nullable Input<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig;
        private @Nullable Input<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PrivacyMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalStatsConfig = defaults.categoricalStatsConfig;
    	      this.deltaPresenceEstimationConfig = defaults.deltaPresenceEstimationConfig;
    	      this.kAnonymityConfig = defaults.kAnonymityConfig;
    	      this.kMapEstimationConfig = defaults.kMapEstimationConfig;
    	      this.lDiversityConfig = defaults.lDiversityConfig;
    	      this.numericalStatsConfig = defaults.numericalStatsConfig;
        }

        public Builder setCategoricalStatsConfig(@Nullable Input<GooglePrivacyDlpV2CategoricalStatsConfigArgs> categoricalStatsConfig) {
            this.categoricalStatsConfig = categoricalStatsConfig;
            return this;
        }

        public Builder setCategoricalStatsConfig(@Nullable GooglePrivacyDlpV2CategoricalStatsConfigArgs categoricalStatsConfig) {
            this.categoricalStatsConfig = Input.ofNullable(categoricalStatsConfig);
            return this;
        }

        public Builder setDeltaPresenceEstimationConfig(@Nullable Input<GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs> deltaPresenceEstimationConfig) {
            this.deltaPresenceEstimationConfig = deltaPresenceEstimationConfig;
            return this;
        }

        public Builder setDeltaPresenceEstimationConfig(@Nullable GooglePrivacyDlpV2DeltaPresenceEstimationConfigArgs deltaPresenceEstimationConfig) {
            this.deltaPresenceEstimationConfig = Input.ofNullable(deltaPresenceEstimationConfig);
            return this;
        }

        public Builder setKAnonymityConfig(@Nullable Input<GooglePrivacyDlpV2KAnonymityConfigArgs> kAnonymityConfig) {
            this.kAnonymityConfig = kAnonymityConfig;
            return this;
        }

        public Builder setKAnonymityConfig(@Nullable GooglePrivacyDlpV2KAnonymityConfigArgs kAnonymityConfig) {
            this.kAnonymityConfig = Input.ofNullable(kAnonymityConfig);
            return this;
        }

        public Builder setKMapEstimationConfig(@Nullable Input<GooglePrivacyDlpV2KMapEstimationConfigArgs> kMapEstimationConfig) {
            this.kMapEstimationConfig = kMapEstimationConfig;
            return this;
        }

        public Builder setKMapEstimationConfig(@Nullable GooglePrivacyDlpV2KMapEstimationConfigArgs kMapEstimationConfig) {
            this.kMapEstimationConfig = Input.ofNullable(kMapEstimationConfig);
            return this;
        }

        public Builder setLDiversityConfig(@Nullable Input<GooglePrivacyDlpV2LDiversityConfigArgs> lDiversityConfig) {
            this.lDiversityConfig = lDiversityConfig;
            return this;
        }

        public Builder setLDiversityConfig(@Nullable GooglePrivacyDlpV2LDiversityConfigArgs lDiversityConfig) {
            this.lDiversityConfig = Input.ofNullable(lDiversityConfig);
            return this;
        }

        public Builder setNumericalStatsConfig(@Nullable Input<GooglePrivacyDlpV2NumericalStatsConfigArgs> numericalStatsConfig) {
            this.numericalStatsConfig = numericalStatsConfig;
            return this;
        }

        public Builder setNumericalStatsConfig(@Nullable GooglePrivacyDlpV2NumericalStatsConfigArgs numericalStatsConfig) {
            this.numericalStatsConfig = Input.ofNullable(numericalStatsConfig);
            return this;
        }

        public GooglePrivacyDlpV2PrivacyMetricArgs build() {
            return new GooglePrivacyDlpV2PrivacyMetricArgs(categoricalStatsConfig, deltaPresenceEstimationConfig, kAnonymityConfig, kMapEstimationConfig, lDiversityConfig, numericalStatsConfig);
        }
    }
}
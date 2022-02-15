// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AssetModelTumblingWindow;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssetModelMetricWindow {
    private final @Nullable AssetModelTumblingWindow tumbling;

    @OutputCustomType.Constructor({"tumbling"})
    private AssetModelMetricWindow(@Nullable AssetModelTumblingWindow tumbling) {
        this.tumbling = tumbling;
    }

    public Optional<AssetModelTumblingWindow> getTumbling() {
        return Optional.ofNullable(this.tumbling);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelMetricWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssetModelTumblingWindow tumbling;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelMetricWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tumbling = defaults.tumbling;
        }

        public Builder setTumbling(@Nullable AssetModelTumblingWindow tumbling) {
            this.tumbling = tumbling;
            return this;
        }

        public AssetModelMetricWindow build() {
            return new AssetModelMetricWindow(tumbling);
        }
    }
}
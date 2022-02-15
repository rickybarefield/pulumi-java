// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2betaColorInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaColorInfoArgs Empty = new GoogleCloudRetailV2betaColorInfoArgs();

    @InputImport(name="colorFamilies")
    private final @Nullable Input<List<String>> colorFamilies;

    public Input<List<String>> getColorFamilies() {
        return this.colorFamilies == null ? Input.empty() : this.colorFamilies;
    }

    @InputImport(name="colors")
    private final @Nullable Input<List<String>> colors;

    public Input<List<String>> getColors() {
        return this.colors == null ? Input.empty() : this.colors;
    }

    public GoogleCloudRetailV2betaColorInfoArgs(
        @Nullable Input<List<String>> colorFamilies,
        @Nullable Input<List<String>> colors) {
        this.colorFamilies = colorFamilies;
        this.colors = colors;
    }

    private GoogleCloudRetailV2betaColorInfoArgs() {
        this.colorFamilies = Input.empty();
        this.colors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaColorInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> colorFamilies;
        private @Nullable Input<List<String>> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaColorInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder setColorFamilies(@Nullable Input<List<String>> colorFamilies) {
            this.colorFamilies = colorFamilies;
            return this;
        }

        public Builder setColorFamilies(@Nullable List<String> colorFamilies) {
            this.colorFamilies = Input.ofNullable(colorFamilies);
            return this;
        }

        public Builder setColors(@Nullable Input<List<String>> colors) {
            this.colors = colors;
            return this;
        }

        public Builder setColors(@Nullable List<String> colors) {
            this.colors = Input.ofNullable(colors);
            return this;
        }

        public GoogleCloudRetailV2betaColorInfoArgs build() {
            return new GoogleCloudRetailV2betaColorInfoArgs(colorFamilies, colors);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusteringArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusteringArgs Empty = new ClusteringArgs();

    @InputImport(name="fields")
    private final @Nullable Input<List<String>> fields;

    public Input<List<String>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    public ClusteringArgs(@Nullable Input<List<String>> fields) {
        this.fields = fields;
    }

    private ClusteringArgs() {
        this.fields = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusteringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> fields;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusteringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
        }

        public Builder setFields(@Nullable Input<List<String>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setFields(@Nullable List<String> fields) {
            this.fields = Input.ofNullable(fields);
            return this;
        }

        public ClusteringArgs build() {
            return new ClusteringArgs(fields);
        }
    }
}
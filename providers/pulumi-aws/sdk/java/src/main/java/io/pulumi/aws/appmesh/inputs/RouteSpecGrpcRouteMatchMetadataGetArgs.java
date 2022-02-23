// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteMatchMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchMetadataGetArgs Empty = new RouteSpecGrpcRouteMatchMetadataGetArgs();

    /**
     * If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
     * 
     */
    @InputImport(name="invert")
    private final @Nullable Input<Boolean> invert;

    public Input<Boolean> getInvert() {
        return this.invert == null ? Input.empty() : this.invert;
    }

    /**
     * The data to match from the request.
     * 
     */
    @InputImport(name="match")
    private final @Nullable Input<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match;

    public Input<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> getMatch() {
        return this.match == null ? Input.empty() : this.match;
    }

    /**
     * The name of the route. Must be between 1 and 50 characters in length.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public RouteSpecGrpcRouteMatchMetadataGetArgs(
        @Nullable Input<Boolean> invert,
        @Nullable Input<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match,
        Input<String> name) {
        this.invert = invert;
        this.match = match;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RouteSpecGrpcRouteMatchMetadataGetArgs() {
        this.invert = Input.empty();
        this.match = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> invert;
        private @Nullable Input<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder setInvert(@Nullable Input<Boolean> invert) {
            this.invert = invert;
            return this;
        }

        public Builder setInvert(@Nullable Boolean invert) {
            this.invert = Input.ofNullable(invert);
            return this;
        }

        public Builder setMatch(@Nullable Input<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match) {
            this.match = match;
            return this;
        }

        public Builder setMatch(@Nullable RouteSpecGrpcRouteMatchMetadataMatchGetArgs match) {
            this.match = Input.ofNullable(match);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public RouteSpecGrpcRouteMatchMetadataGetArgs build() {
            return new RouteSpecGrpcRouteMatchMetadataGetArgs(invert, match, name);
        }
    }
}
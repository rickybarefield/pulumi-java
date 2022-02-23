// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RouteSpecHttp2RouteMatchHeaderMatchRange {
    /**
     * The end of the range.
     * 
     */
    private final Integer end;
    /**
     * The start of the range.
     * 
     */
    private final Integer start;

    @OutputCustomType.Constructor({"end","start"})
    private RouteSpecHttp2RouteMatchHeaderMatchRange(
        Integer end,
        Integer start) {
        this.end = Objects.requireNonNull(end);
        this.start = Objects.requireNonNull(start);
    }

    /**
     * The end of the range.
     * 
     */
    public Integer getEnd() {
        return this.end;
    }
    /**
     * The start of the range.
     * 
     */
    public Integer getStart() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteMatchHeaderMatchRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer end;
        private Integer start;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteMatchHeaderMatchRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setEnd(Integer end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public RouteSpecHttp2RouteMatchHeaderMatchRange build() {
            return new RouteSpecHttp2RouteMatchHeaderMatchRange(end, start);
        }
    }
}
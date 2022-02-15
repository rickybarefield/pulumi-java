// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocalDiskResponse {
    private final Integer diskCount;
    private final Integer diskSizeGb;
    private final String diskType;

    @OutputCustomType.Constructor({"diskCount","diskSizeGb","diskType"})
    private LocalDiskResponse(
        Integer diskCount,
        Integer diskSizeGb,
        String diskType) {
        this.diskCount = Objects.requireNonNull(diskCount);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
    }

    public Integer getDiskCount() {
        return this.diskCount;
    }
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskCount;
        private Integer diskSizeGb;
        private String diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCount = defaults.diskCount;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
        }

        public Builder setDiskCount(Integer diskCount) {
            this.diskCount = Objects.requireNonNull(diskCount);
            return this;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public LocalDiskResponse build() {
            return new LocalDiskResponse(diskCount, diskSizeGb, diskType);
        }
    }
}
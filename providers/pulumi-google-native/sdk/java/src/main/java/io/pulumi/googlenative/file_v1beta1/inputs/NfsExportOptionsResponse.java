// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class NfsExportOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final NfsExportOptionsResponse Empty = new NfsExportOptionsResponse();

    @InputImport(name="accessMode", required=true)
    private final String accessMode;

    public String getAccessMode() {
        return this.accessMode;
    }

    @InputImport(name="anonGid", required=true)
    private final String anonGid;

    public String getAnonGid() {
        return this.anonGid;
    }

    @InputImport(name="anonUid", required=true)
    private final String anonUid;

    public String getAnonUid() {
        return this.anonUid;
    }

    @InputImport(name="ipRanges", required=true)
    private final List<String> ipRanges;

    public List<String> getIpRanges() {
        return this.ipRanges;
    }

    @InputImport(name="squashMode", required=true)
    private final String squashMode;

    public String getSquashMode() {
        return this.squashMode;
    }

    public NfsExportOptionsResponse(
        String accessMode,
        String anonGid,
        String anonUid,
        List<String> ipRanges,
        String squashMode) {
        this.accessMode = Objects.requireNonNull(accessMode, "expected parameter 'accessMode' to be non-null");
        this.anonGid = Objects.requireNonNull(anonGid, "expected parameter 'anonGid' to be non-null");
        this.anonUid = Objects.requireNonNull(anonUid, "expected parameter 'anonUid' to be non-null");
        this.ipRanges = Objects.requireNonNull(ipRanges, "expected parameter 'ipRanges' to be non-null");
        this.squashMode = Objects.requireNonNull(squashMode, "expected parameter 'squashMode' to be non-null");
    }

    private NfsExportOptionsResponse() {
        this.accessMode = null;
        this.anonGid = null;
        this.anonUid = null;
        this.ipRanges = List.of();
        this.squashMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsExportOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessMode;
        private String anonGid;
        private String anonUid;
        private List<String> ipRanges;
        private String squashMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsExportOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.anonGid = defaults.anonGid;
    	      this.anonUid = defaults.anonUid;
    	      this.ipRanges = defaults.ipRanges;
    	      this.squashMode = defaults.squashMode;
        }

        public Builder setAccessMode(String accessMode) {
            this.accessMode = Objects.requireNonNull(accessMode);
            return this;
        }

        public Builder setAnonGid(String anonGid) {
            this.anonGid = Objects.requireNonNull(anonGid);
            return this;
        }

        public Builder setAnonUid(String anonUid) {
            this.anonUid = Objects.requireNonNull(anonUid);
            return this;
        }

        public Builder setIpRanges(List<String> ipRanges) {
            this.ipRanges = Objects.requireNonNull(ipRanges);
            return this;
        }

        public Builder setSquashMode(String squashMode) {
            this.squashMode = Objects.requireNonNull(squashMode);
            return this;
        }

        public NfsExportOptionsResponse build() {
            return new NfsExportOptionsResponse(accessMode, anonGid, anonUid, ipRanges, squashMode);
        }
    }
}
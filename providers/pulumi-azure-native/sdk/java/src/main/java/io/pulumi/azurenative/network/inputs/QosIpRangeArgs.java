// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QosIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final QosIpRangeArgs Empty = new QosIpRangeArgs();

    @InputImport(name="endIP")
    private final @Nullable Input<String> endIP;

    public Input<String> getEndIP() {
        return this.endIP == null ? Input.empty() : this.endIP;
    }

    @InputImport(name="startIP")
    private final @Nullable Input<String> startIP;

    public Input<String> getStartIP() {
        return this.startIP == null ? Input.empty() : this.startIP;
    }

    public QosIpRangeArgs(
        @Nullable Input<String> endIP,
        @Nullable Input<String> startIP) {
        this.endIP = endIP;
        this.startIP = startIP;
    }

    private QosIpRangeArgs() {
        this.endIP = Input.empty();
        this.startIP = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endIP;
        private @Nullable Input<String> startIP;

        public Builder() {
    	      // Empty
        }

        public Builder(QosIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIP = defaults.endIP;
    	      this.startIP = defaults.startIP;
        }

        public Builder setEndIP(@Nullable Input<String> endIP) {
            this.endIP = endIP;
            return this;
        }

        public Builder setEndIP(@Nullable String endIP) {
            this.endIP = Input.ofNullable(endIP);
            return this;
        }

        public Builder setStartIP(@Nullable Input<String> startIP) {
            this.startIP = startIP;
            return this;
        }

        public Builder setStartIP(@Nullable String startIP) {
            this.startIP = Input.ofNullable(startIP);
            return this;
        }

        public QosIpRangeArgs build() {
            return new QosIpRangeArgs(endIP, startIP);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchConfigurationRootBlockDevice extends io.pulumi.resources.InvokeArgs {

    public static final GetLaunchConfigurationRootBlockDevice Empty = new GetLaunchConfigurationRootBlockDevice();

    /**
     * Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    @InputImport(name="deleteOnTermination", required=true)
    private final Boolean deleteOnTermination;

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * Whether the volume is Encrypted.
     * 
     */
    @InputImport(name="encrypted", required=true)
    private final Boolean encrypted;

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * The provisioned IOPs of the volume.
     * 
     */
    @InputImport(name="iops", required=true)
    private final Integer iops;

    public Integer getIops() {
        return this.iops;
    }

    /**
     * The Throughput of the volume.
     * 
     */
    @InputImport(name="throughput", required=true)
    private final Boolean throughput;

    public Boolean getThroughput() {
        return this.throughput;
    }

    /**
     * The Size of the volume.
     * 
     */
    @InputImport(name="volumeSize", required=true)
    private final Integer volumeSize;

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * The Type of the volume.
     * 
     */
    @InputImport(name="volumeType", required=true)
    private final String volumeType;

    public String getVolumeType() {
        return this.volumeType;
    }

    public GetLaunchConfigurationRootBlockDevice(
        Boolean deleteOnTermination,
        Boolean encrypted,
        Integer iops,
        Boolean throughput,
        Integer volumeSize,
        String volumeType) {
        this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination, "expected parameter 'deleteOnTermination' to be non-null");
        this.encrypted = Objects.requireNonNull(encrypted, "expected parameter 'encrypted' to be non-null");
        this.iops = Objects.requireNonNull(iops, "expected parameter 'iops' to be non-null");
        this.throughput = Objects.requireNonNull(throughput, "expected parameter 'throughput' to be non-null");
        this.volumeSize = Objects.requireNonNull(volumeSize, "expected parameter 'volumeSize' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private GetLaunchConfigurationRootBlockDevice() {
        this.deleteOnTermination = null;
        this.encrypted = null;
        this.iops = null;
        this.throughput = null;
        this.volumeSize = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationRootBlockDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleteOnTermination;
        private Boolean encrypted;
        private Integer iops;
        private Boolean throughput;
        private Integer volumeSize;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationRootBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setDeleteOnTermination(Boolean deleteOnTermination) {
            this.deleteOnTermination = Objects.requireNonNull(deleteOnTermination);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setIops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }

        public Builder setThroughput(Boolean throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }

        public Builder setVolumeSize(Integer volumeSize) {
            this.volumeSize = Objects.requireNonNull(volumeSize);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }
        public GetLaunchConfigurationRootBlockDevice build() {
            return new GetLaunchConfigurationRootBlockDevice(deleteOnTermination, encrypted, iops, throughput, volumeSize, volumeType);
        }
    }
}
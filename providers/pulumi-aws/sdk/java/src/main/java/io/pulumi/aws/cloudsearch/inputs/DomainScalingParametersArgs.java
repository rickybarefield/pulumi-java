// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainScalingParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainScalingParametersArgs Empty = new DomainScalingParametersArgs();

    /**
     * The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    @InputImport(name="desiredInstanceType")
    private final @Nullable Input<String> desiredInstanceType;

    public Input<String> getDesiredInstanceType() {
        return this.desiredInstanceType == null ? Input.empty() : this.desiredInstanceType;
    }

    /**
     * The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    @InputImport(name="desiredPartitionCount")
    private final @Nullable Input<Integer> desiredPartitionCount;

    public Input<Integer> getDesiredPartitionCount() {
        return this.desiredPartitionCount == null ? Input.empty() : this.desiredPartitionCount;
    }

    /**
     * The number of replicas you want to preconfigure for each index partition.
     * 
     */
    @InputImport(name="desiredReplicationCount")
    private final @Nullable Input<Integer> desiredReplicationCount;

    public Input<Integer> getDesiredReplicationCount() {
        return this.desiredReplicationCount == null ? Input.empty() : this.desiredReplicationCount;
    }

    public DomainScalingParametersArgs(
        @Nullable Input<String> desiredInstanceType,
        @Nullable Input<Integer> desiredPartitionCount,
        @Nullable Input<Integer> desiredReplicationCount) {
        this.desiredInstanceType = desiredInstanceType;
        this.desiredPartitionCount = desiredPartitionCount;
        this.desiredReplicationCount = desiredReplicationCount;
    }

    private DomainScalingParametersArgs() {
        this.desiredInstanceType = Input.empty();
        this.desiredPartitionCount = Input.empty();
        this.desiredReplicationCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainScalingParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> desiredInstanceType;
        private @Nullable Input<Integer> desiredPartitionCount;
        private @Nullable Input<Integer> desiredReplicationCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainScalingParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredInstanceType = defaults.desiredInstanceType;
    	      this.desiredPartitionCount = defaults.desiredPartitionCount;
    	      this.desiredReplicationCount = defaults.desiredReplicationCount;
        }

        public Builder setDesiredInstanceType(@Nullable Input<String> desiredInstanceType) {
            this.desiredInstanceType = desiredInstanceType;
            return this;
        }

        public Builder setDesiredInstanceType(@Nullable String desiredInstanceType) {
            this.desiredInstanceType = Input.ofNullable(desiredInstanceType);
            return this;
        }

        public Builder setDesiredPartitionCount(@Nullable Input<Integer> desiredPartitionCount) {
            this.desiredPartitionCount = desiredPartitionCount;
            return this;
        }

        public Builder setDesiredPartitionCount(@Nullable Integer desiredPartitionCount) {
            this.desiredPartitionCount = Input.ofNullable(desiredPartitionCount);
            return this;
        }

        public Builder setDesiredReplicationCount(@Nullable Input<Integer> desiredReplicationCount) {
            this.desiredReplicationCount = desiredReplicationCount;
            return this;
        }

        public Builder setDesiredReplicationCount(@Nullable Integer desiredReplicationCount) {
            this.desiredReplicationCount = Input.ofNullable(desiredReplicationCount);
            return this;
        }
        public DomainScalingParametersArgs build() {
            return new DomainScalingParametersArgs(desiredInstanceType, desiredPartitionCount, desiredReplicationCount);
        }
    }
}
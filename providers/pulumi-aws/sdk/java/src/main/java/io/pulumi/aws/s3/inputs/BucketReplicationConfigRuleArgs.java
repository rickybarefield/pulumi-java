// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDeleteMarkerReplicationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleExistingObjectReplicationArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleFilterArgs;
import io.pulumi.aws.s3.inputs.BucketReplicationConfigRuleSourceSelectionCriteriaArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketReplicationConfigRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleArgs Empty = new BucketReplicationConfigRuleArgs();

    /**
     * Whether delete markers are replicated. This argument is only valid with V2 replication configurations (i.e., when `filter` is used)documented below.
     * 
     */
    @InputImport(name="deleteMarkerReplication")
    private final @Nullable Input<BucketReplicationConfigRuleDeleteMarkerReplicationArgs> deleteMarkerReplication;

    public Input<BucketReplicationConfigRuleDeleteMarkerReplicationArgs> getDeleteMarkerReplication() {
        return this.deleteMarkerReplication == null ? Input.empty() : this.deleteMarkerReplication;
    }

    /**
     * Specifies the destination for the rule documented below.
     * 
     */
    @InputImport(name="destination", required=true)
    private final Input<BucketReplicationConfigRuleDestinationArgs> destination;

    public Input<BucketReplicationConfigRuleDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Replicate existing objects in the source bucket according to the rule configurations documented below.
     * 
     */
    @InputImport(name="existingObjectReplication")
    private final @Nullable Input<BucketReplicationConfigRuleExistingObjectReplicationArgs> existingObjectReplication;

    public Input<BucketReplicationConfigRuleExistingObjectReplicationArgs> getExistingObjectReplication() {
        return this.existingObjectReplication == null ? Input.empty() : this.existingObjectReplication;
    }

    /**
     * Filter that identifies subset of objects to which the replication rule applies documented below.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<BucketReplicationConfigRuleFilterArgs> filter;

    public Input<BucketReplicationConfigRuleFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Object key name prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Specifies special object selection criteria documented below.
     * 
     */
    @InputImport(name="sourceSelectionCriteria")
    private final @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaArgs> sourceSelectionCriteria;

    public Input<BucketReplicationConfigRuleSourceSelectionCriteriaArgs> getSourceSelectionCriteria() {
        return this.sourceSelectionCriteria == null ? Input.empty() : this.sourceSelectionCriteria;
    }

    /**
     * The status of the rule. Either `"Enabled"` or `"Disabled"`. The rule is ignored if status is not "Enabled".
     * 
     */
    @InputImport(name="status", required=true)
    private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    public BucketReplicationConfigRuleArgs(
        @Nullable Input<BucketReplicationConfigRuleDeleteMarkerReplicationArgs> deleteMarkerReplication,
        Input<BucketReplicationConfigRuleDestinationArgs> destination,
        @Nullable Input<BucketReplicationConfigRuleExistingObjectReplicationArgs> existingObjectReplication,
        @Nullable Input<BucketReplicationConfigRuleFilterArgs> filter,
        @Nullable Input<String> id,
        @Nullable Input<String> prefix,
        @Nullable Input<Integer> priority,
        @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaArgs> sourceSelectionCriteria,
        Input<String> status) {
        this.deleteMarkerReplication = deleteMarkerReplication;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.existingObjectReplication = existingObjectReplication;
        this.filter = filter;
        this.id = id;
        this.prefix = prefix;
        this.priority = priority;
        this.sourceSelectionCriteria = sourceSelectionCriteria;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BucketReplicationConfigRuleArgs() {
        this.deleteMarkerReplication = Input.empty();
        this.destination = Input.empty();
        this.existingObjectReplication = Input.empty();
        this.filter = Input.empty();
        this.id = Input.empty();
        this.prefix = Input.empty();
        this.priority = Input.empty();
        this.sourceSelectionCriteria = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketReplicationConfigRuleDeleteMarkerReplicationArgs> deleteMarkerReplication;
        private Input<BucketReplicationConfigRuleDestinationArgs> destination;
        private @Nullable Input<BucketReplicationConfigRuleExistingObjectReplicationArgs> existingObjectReplication;
        private @Nullable Input<BucketReplicationConfigRuleFilterArgs> filter;
        private @Nullable Input<String> id;
        private @Nullable Input<String> prefix;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaArgs> sourceSelectionCriteria;
        private Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteMarkerReplication = defaults.deleteMarkerReplication;
    	      this.destination = defaults.destination;
    	      this.existingObjectReplication = defaults.existingObjectReplication;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.prefix = defaults.prefix;
    	      this.priority = defaults.priority;
    	      this.sourceSelectionCriteria = defaults.sourceSelectionCriteria;
    	      this.status = defaults.status;
        }

        public Builder setDeleteMarkerReplication(@Nullable Input<BucketReplicationConfigRuleDeleteMarkerReplicationArgs> deleteMarkerReplication) {
            this.deleteMarkerReplication = deleteMarkerReplication;
            return this;
        }

        public Builder setDeleteMarkerReplication(@Nullable BucketReplicationConfigRuleDeleteMarkerReplicationArgs deleteMarkerReplication) {
            this.deleteMarkerReplication = Input.ofNullable(deleteMarkerReplication);
            return this;
        }

        public Builder setDestination(Input<BucketReplicationConfigRuleDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(BucketReplicationConfigRuleDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setExistingObjectReplication(@Nullable Input<BucketReplicationConfigRuleExistingObjectReplicationArgs> existingObjectReplication) {
            this.existingObjectReplication = existingObjectReplication;
            return this;
        }

        public Builder setExistingObjectReplication(@Nullable BucketReplicationConfigRuleExistingObjectReplicationArgs existingObjectReplication) {
            this.existingObjectReplication = Input.ofNullable(existingObjectReplication);
            return this;
        }

        public Builder setFilter(@Nullable Input<BucketReplicationConfigRuleFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable BucketReplicationConfigRuleFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setSourceSelectionCriteria(@Nullable Input<BucketReplicationConfigRuleSourceSelectionCriteriaArgs> sourceSelectionCriteria) {
            this.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        public Builder setSourceSelectionCriteria(@Nullable BucketReplicationConfigRuleSourceSelectionCriteriaArgs sourceSelectionCriteria) {
            this.sourceSelectionCriteria = Input.ofNullable(sourceSelectionCriteria);
            return this;
        }

        public Builder setStatus(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public BucketReplicationConfigRuleArgs build() {
            return new BucketReplicationConfigRuleArgs(deleteMarkerReplication, destination, existingObjectReplication, filter, id, prefix, priority, sourceSelectionCriteria, status);
        }
    }
}
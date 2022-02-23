// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb;

import io.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
import io.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs;
import io.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs;
import io.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs;
import io.pulumi.aws.dynamodb.inputs.TableReplicaArgs;
import io.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs;
import io.pulumi.aws.dynamodb.inputs.TableTtlArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<List<TableAttributeArgs>> attributes;

    public Input<List<TableAttributeArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @InputImport(name="billingMode")
    private final @Nullable Input<String> billingMode;

    public Input<String> getBillingMode() {
        return this.billingMode == null ? Input.empty() : this.billingMode;
    }

    /**
     * Describe a GSI for the table;
     * subject to the normal limits on the number of GSIs, projected
     * attributes, etc.
     * 
     */
    @InputImport(name="globalSecondaryIndexes")
    private final @Nullable Input<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes;

    public Input<List<TableGlobalSecondaryIndexArgs>> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? Input.empty() : this.globalSecondaryIndexes;
    }

    /**
     * The name of the hash key in the index; must be
     * defined as an attribute in the resource.
     * 
     */
    @InputImport(name="hashKey")
    private final @Nullable Input<String> hashKey;

    public Input<String> getHashKey() {
        return this.hashKey == null ? Input.empty() : this.hashKey;
    }

    /**
     * Describe an LSI on the table;
     * these can only be allocated *at creation* so you cannot change this
     * definition after you have created the resource.
     * 
     */
    @InputImport(name="localSecondaryIndexes")
    private final @Nullable Input<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes;

    public Input<List<TableLocalSecondaryIndexArgs>> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes == null ? Input.empty() : this.localSecondaryIndexes;
    }

    /**
     * The name of the index
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Enable point-in-time recovery options.
     * 
     */
    @InputImport(name="pointInTimeRecovery")
    private final @Nullable Input<TablePointInTimeRecoveryArgs> pointInTimeRecovery;

    public Input<TablePointInTimeRecoveryArgs> getPointInTimeRecovery() {
        return this.pointInTimeRecovery == null ? Input.empty() : this.pointInTimeRecovery;
    }

    /**
     * The name of the range key; must be defined
     * 
     */
    @InputImport(name="rangeKey")
    private final @Nullable Input<String> rangeKey;

    public Input<String> getRangeKey() {
        return this.rangeKey == null ? Input.empty() : this.rangeKey;
    }

    /**
     * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="readCapacity")
    private final @Nullable Input<Integer> readCapacity;

    public Input<Integer> getReadCapacity() {
        return this.readCapacity == null ? Input.empty() : this.readCapacity;
    }

    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
     * 
     */
    @InputImport(name="replicas")
    private final @Nullable Input<List<TableReplicaArgs>> replicas;

    public Input<List<TableReplicaArgs>> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * The time of the point-in-time recovery point to restore.
     * 
     */
    @InputImport(name="restoreDateTime")
    private final @Nullable Input<String> restoreDateTime;

    public Input<String> getRestoreDateTime() {
        return this.restoreDateTime == null ? Input.empty() : this.restoreDateTime;
    }

    /**
     * The name of the table to restore. Must match the name of an existing table.
     * 
     */
    @InputImport(name="restoreSourceName")
    private final @Nullable Input<String> restoreSourceName;

    public Input<String> getRestoreSourceName() {
        return this.restoreSourceName == null ? Input.empty() : this.restoreSourceName;
    }

    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @InputImport(name="restoreToLatestTime")
    private final @Nullable Input<Boolean> restoreToLatestTime;

    public Input<Boolean> getRestoreToLatestTime() {
        return this.restoreToLatestTime == null ? Input.empty() : this.restoreToLatestTime;
    }

    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
     * 
     */
    @InputImport(name="serverSideEncryption")
    private final @Nullable Input<TableServerSideEncryptionArgs> serverSideEncryption;

    public Input<TableServerSideEncryptionArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Input.empty() : this.serverSideEncryption;
    }

    /**
     * Indicates whether Streams are to be enabled (true) or disabled (false).
     * 
     */
    @InputImport(name="streamEnabled")
    private final @Nullable Input<Boolean> streamEnabled;

    public Input<Boolean> getStreamEnabled() {
        return this.streamEnabled == null ? Input.empty() : this.streamEnabled;
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @InputImport(name="streamViewType")
    private final @Nullable Input<String> streamViewType;

    public Input<String> getStreamViewType() {
        return this.streamViewType == null ? Input.empty() : this.streamViewType;
    }

    /**
     * The storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @InputImport(name="tableClass")
    private final @Nullable Input<String> tableClass;

    public Input<String> getTableClass() {
        return this.tableClass == null ? Input.empty() : this.tableClass;
    }

    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Defines ttl, has two properties, and can only be specified once:
     * 
     */
    @InputImport(name="ttl")
    private final @Nullable Input<TableTtlArgs> ttl;

    public Input<TableTtlArgs> getTtl() {
        return this.ttl == null ? Input.empty() : this.ttl;
    }

    /**
     * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="writeCapacity")
    private final @Nullable Input<Integer> writeCapacity;

    public Input<Integer> getWriteCapacity() {
        return this.writeCapacity == null ? Input.empty() : this.writeCapacity;
    }

    public TableArgs(
        @Nullable Input<List<TableAttributeArgs>> attributes,
        @Nullable Input<String> billingMode,
        @Nullable Input<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes,
        @Nullable Input<String> hashKey,
        @Nullable Input<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes,
        @Nullable Input<String> name,
        @Nullable Input<TablePointInTimeRecoveryArgs> pointInTimeRecovery,
        @Nullable Input<String> rangeKey,
        @Nullable Input<Integer> readCapacity,
        @Nullable Input<List<TableReplicaArgs>> replicas,
        @Nullable Input<String> restoreDateTime,
        @Nullable Input<String> restoreSourceName,
        @Nullable Input<Boolean> restoreToLatestTime,
        @Nullable Input<TableServerSideEncryptionArgs> serverSideEncryption,
        @Nullable Input<Boolean> streamEnabled,
        @Nullable Input<String> streamViewType,
        @Nullable Input<String> tableClass,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<TableTtlArgs> ttl,
        @Nullable Input<Integer> writeCapacity) {
        this.attributes = attributes;
        this.billingMode = billingMode;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.hashKey = hashKey;
        this.localSecondaryIndexes = localSecondaryIndexes;
        this.name = name;
        this.pointInTimeRecovery = pointInTimeRecovery;
        this.rangeKey = rangeKey;
        this.readCapacity = readCapacity;
        this.replicas = replicas;
        this.restoreDateTime = restoreDateTime;
        this.restoreSourceName = restoreSourceName;
        this.restoreToLatestTime = restoreToLatestTime;
        this.serverSideEncryption = serverSideEncryption;
        this.streamEnabled = streamEnabled;
        this.streamViewType = streamViewType;
        this.tableClass = tableClass;
        this.tags = tags;
        this.ttl = ttl;
        this.writeCapacity = writeCapacity;
    }

    private TableArgs() {
        this.attributes = Input.empty();
        this.billingMode = Input.empty();
        this.globalSecondaryIndexes = Input.empty();
        this.hashKey = Input.empty();
        this.localSecondaryIndexes = Input.empty();
        this.name = Input.empty();
        this.pointInTimeRecovery = Input.empty();
        this.rangeKey = Input.empty();
        this.readCapacity = Input.empty();
        this.replicas = Input.empty();
        this.restoreDateTime = Input.empty();
        this.restoreSourceName = Input.empty();
        this.restoreToLatestTime = Input.empty();
        this.serverSideEncryption = Input.empty();
        this.streamEnabled = Input.empty();
        this.streamViewType = Input.empty();
        this.tableClass = Input.empty();
        this.tags = Input.empty();
        this.ttl = Input.empty();
        this.writeCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<TableAttributeArgs>> attributes;
        private @Nullable Input<String> billingMode;
        private @Nullable Input<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes;
        private @Nullable Input<String> hashKey;
        private @Nullable Input<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes;
        private @Nullable Input<String> name;
        private @Nullable Input<TablePointInTimeRecoveryArgs> pointInTimeRecovery;
        private @Nullable Input<String> rangeKey;
        private @Nullable Input<Integer> readCapacity;
        private @Nullable Input<List<TableReplicaArgs>> replicas;
        private @Nullable Input<String> restoreDateTime;
        private @Nullable Input<String> restoreSourceName;
        private @Nullable Input<Boolean> restoreToLatestTime;
        private @Nullable Input<TableServerSideEncryptionArgs> serverSideEncryption;
        private @Nullable Input<Boolean> streamEnabled;
        private @Nullable Input<String> streamViewType;
        private @Nullable Input<String> tableClass;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<TableTtlArgs> ttl;
        private @Nullable Input<Integer> writeCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.billingMode = defaults.billingMode;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.hashKey = defaults.hashKey;
    	      this.localSecondaryIndexes = defaults.localSecondaryIndexes;
    	      this.name = defaults.name;
    	      this.pointInTimeRecovery = defaults.pointInTimeRecovery;
    	      this.rangeKey = defaults.rangeKey;
    	      this.readCapacity = defaults.readCapacity;
    	      this.replicas = defaults.replicas;
    	      this.restoreDateTime = defaults.restoreDateTime;
    	      this.restoreSourceName = defaults.restoreSourceName;
    	      this.restoreToLatestTime = defaults.restoreToLatestTime;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.streamEnabled = defaults.streamEnabled;
    	      this.streamViewType = defaults.streamViewType;
    	      this.tableClass = defaults.tableClass;
    	      this.tags = defaults.tags;
    	      this.ttl = defaults.ttl;
    	      this.writeCapacity = defaults.writeCapacity;
        }

        public Builder setAttributes(@Nullable Input<List<TableAttributeArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<TableAttributeArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setBillingMode(@Nullable Input<String> billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        public Builder setBillingMode(@Nullable String billingMode) {
            this.billingMode = Input.ofNullable(billingMode);
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable Input<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        public Builder setGlobalSecondaryIndexes(@Nullable List<TableGlobalSecondaryIndexArgs> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = Input.ofNullable(globalSecondaryIndexes);
            return this;
        }

        public Builder setHashKey(@Nullable Input<String> hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        public Builder setHashKey(@Nullable String hashKey) {
            this.hashKey = Input.ofNullable(hashKey);
            return this;
        }

        public Builder setLocalSecondaryIndexes(@Nullable Input<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes) {
            this.localSecondaryIndexes = localSecondaryIndexes;
            return this;
        }

        public Builder setLocalSecondaryIndexes(@Nullable List<TableLocalSecondaryIndexArgs> localSecondaryIndexes) {
            this.localSecondaryIndexes = Input.ofNullable(localSecondaryIndexes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPointInTimeRecovery(@Nullable Input<TablePointInTimeRecoveryArgs> pointInTimeRecovery) {
            this.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }

        public Builder setPointInTimeRecovery(@Nullable TablePointInTimeRecoveryArgs pointInTimeRecovery) {
            this.pointInTimeRecovery = Input.ofNullable(pointInTimeRecovery);
            return this;
        }

        public Builder setRangeKey(@Nullable Input<String> rangeKey) {
            this.rangeKey = rangeKey;
            return this;
        }

        public Builder setRangeKey(@Nullable String rangeKey) {
            this.rangeKey = Input.ofNullable(rangeKey);
            return this;
        }

        public Builder setReadCapacity(@Nullable Input<Integer> readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }

        public Builder setReadCapacity(@Nullable Integer readCapacity) {
            this.readCapacity = Input.ofNullable(readCapacity);
            return this;
        }

        public Builder setReplicas(@Nullable Input<List<TableReplicaArgs>> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setReplicas(@Nullable List<TableReplicaArgs> replicas) {
            this.replicas = Input.ofNullable(replicas);
            return this;
        }

        public Builder setRestoreDateTime(@Nullable Input<String> restoreDateTime) {
            this.restoreDateTime = restoreDateTime;
            return this;
        }

        public Builder setRestoreDateTime(@Nullable String restoreDateTime) {
            this.restoreDateTime = Input.ofNullable(restoreDateTime);
            return this;
        }

        public Builder setRestoreSourceName(@Nullable Input<String> restoreSourceName) {
            this.restoreSourceName = restoreSourceName;
            return this;
        }

        public Builder setRestoreSourceName(@Nullable String restoreSourceName) {
            this.restoreSourceName = Input.ofNullable(restoreSourceName);
            return this;
        }

        public Builder setRestoreToLatestTime(@Nullable Input<Boolean> restoreToLatestTime) {
            this.restoreToLatestTime = restoreToLatestTime;
            return this;
        }

        public Builder setRestoreToLatestTime(@Nullable Boolean restoreToLatestTime) {
            this.restoreToLatestTime = Input.ofNullable(restoreToLatestTime);
            return this;
        }

        public Builder setServerSideEncryption(@Nullable Input<TableServerSideEncryptionArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder setServerSideEncryption(@Nullable TableServerSideEncryptionArgs serverSideEncryption) {
            this.serverSideEncryption = Input.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder setStreamEnabled(@Nullable Input<Boolean> streamEnabled) {
            this.streamEnabled = streamEnabled;
            return this;
        }

        public Builder setStreamEnabled(@Nullable Boolean streamEnabled) {
            this.streamEnabled = Input.ofNullable(streamEnabled);
            return this;
        }

        public Builder setStreamViewType(@Nullable Input<String> streamViewType) {
            this.streamViewType = streamViewType;
            return this;
        }

        public Builder setStreamViewType(@Nullable String streamViewType) {
            this.streamViewType = Input.ofNullable(streamViewType);
            return this;
        }

        public Builder setTableClass(@Nullable Input<String> tableClass) {
            this.tableClass = tableClass;
            return this;
        }

        public Builder setTableClass(@Nullable String tableClass) {
            this.tableClass = Input.ofNullable(tableClass);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTtl(@Nullable Input<TableTtlArgs> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder setTtl(@Nullable TableTtlArgs ttl) {
            this.ttl = Input.ofNullable(ttl);
            return this;
        }

        public Builder setWriteCapacity(@Nullable Input<Integer> writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }

        public Builder setWriteCapacity(@Nullable Integer writeCapacity) {
            this.writeCapacity = Input.ofNullable(writeCapacity);
            return this;
        }
        public TableArgs build() {
            return new TableArgs(attributes, billingMode, globalSecondaryIndexes, hashKey, localSecondaryIndexes, name, pointInTimeRecovery, rangeKey, readCapacity, replicas, restoreDateTime, restoreSourceName, restoreToLatestTime, serverSideEncryption, streamEnabled, streamViewType, tableClass, tags, ttl, writeCapacity);
        }
    }
}
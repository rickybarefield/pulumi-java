// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs();

    /**
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
     * 
     */
    @InputImport(name="blockSizeBytes")
    private final @Nullable Input<Integer> blockSizeBytes;

    public Input<Integer> getBlockSizeBytes() {
        return this.blockSizeBytes == null ? Input.empty() : this.blockSizeBytes;
    }

    /**
     * A list of column names for which you want Kinesis Data Firehose to create bloom filters.
     * 
     */
    @InputImport(name="bloomFilterColumns")
    private final @Nullable Input<List<String>> bloomFilterColumns;

    public Input<List<String>> getBloomFilterColumns() {
        return this.bloomFilterColumns == null ? Input.empty() : this.bloomFilterColumns;
    }

    /**
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default value is `0.05`, the minimum is `0`, and the maximum is `1`.
     * 
     */
    @InputImport(name="bloomFilterFalsePositiveProbability")
    private final @Nullable Input<Double> bloomFilterFalsePositiveProbability;

    public Input<Double> getBloomFilterFalsePositiveProbability() {
        return this.bloomFilterFalsePositiveProbability == null ? Input.empty() : this.bloomFilterFalsePositiveProbability;
    }

    /**
     * The compression code to use over data blocks. The possible values are `UNCOMPRESSED`, `SNAPPY`, and `GZIP`, with the default being `SNAPPY`. Use `SNAPPY` for higher decompression speed. Use `GZIP` if the compression ratio is more important than speed.
     * 
     */
    @InputImport(name="compression")
    private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * A float that represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set this threshold to `1`.
     * 
     */
    @InputImport(name="dictionaryKeyThreshold")
    private final @Nullable Input<Double> dictionaryKeyThreshold;

    public Input<Double> getDictionaryKeyThreshold() {
        return this.dictionaryKeyThreshold == null ? Input.empty() : this.dictionaryKeyThreshold;
    }

    /**
     * Set this to `true` to indicate that you want stripes to be padded to the HDFS block boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is `false`.
     * 
     */
    @InputImport(name="enablePadding")
    private final @Nullable Input<Boolean> enablePadding;

    public Input<Boolean> getEnablePadding() {
        return this.enablePadding == null ? Input.empty() : this.enablePadding;
    }

    /**
     * The version of the file to write. The possible values are `V0_11` and `V0_12`. The default is `V0_12`.
     * 
     */
    @InputImport(name="formatVersion")
    private final @Nullable Input<String> formatVersion;

    public Input<String> getFormatVersion() {
        return this.formatVersion == null ? Input.empty() : this.formatVersion;
    }

    /**
     * A float between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The default value is `0.05`, which means 5 percent of stripe size. For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local task. Kinesis Data Firehose ignores this parameter when `enable_padding` is `false`.
     * 
     */
    @InputImport(name="paddingTolerance")
    private final @Nullable Input<Double> paddingTolerance;

    public Input<Double> getPaddingTolerance() {
        return this.paddingTolerance == null ? Input.empty() : this.paddingTolerance;
    }

    /**
     * The number of rows between index entries. The default is `10000` and the minimum is `1000`.
     * 
     */
    @InputImport(name="rowIndexStride")
    private final @Nullable Input<Integer> rowIndexStride;

    public Input<Integer> getRowIndexStride() {
        return this.rowIndexStride == null ? Input.empty() : this.rowIndexStride;
    }

    /**
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * 
     */
    @InputImport(name="stripeSizeBytes")
    private final @Nullable Input<Integer> stripeSizeBytes;

    public Input<Integer> getStripeSizeBytes() {
        return this.stripeSizeBytes == null ? Input.empty() : this.stripeSizeBytes;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs(
        @Nullable Input<Integer> blockSizeBytes,
        @Nullable Input<List<String>> bloomFilterColumns,
        @Nullable Input<Double> bloomFilterFalsePositiveProbability,
        @Nullable Input<String> compression,
        @Nullable Input<Double> dictionaryKeyThreshold,
        @Nullable Input<Boolean> enablePadding,
        @Nullable Input<String> formatVersion,
        @Nullable Input<Double> paddingTolerance,
        @Nullable Input<Integer> rowIndexStride,
        @Nullable Input<Integer> stripeSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
        this.bloomFilterColumns = bloomFilterColumns;
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
        this.compression = compression;
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
        this.enablePadding = enablePadding;
        this.formatVersion = formatVersion;
        this.paddingTolerance = paddingTolerance;
        this.rowIndexStride = rowIndexStride;
        this.stripeSizeBytes = stripeSizeBytes;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs() {
        this.blockSizeBytes = Input.empty();
        this.bloomFilterColumns = Input.empty();
        this.bloomFilterFalsePositiveProbability = Input.empty();
        this.compression = Input.empty();
        this.dictionaryKeyThreshold = Input.empty();
        this.enablePadding = Input.empty();
        this.formatVersion = Input.empty();
        this.paddingTolerance = Input.empty();
        this.rowIndexStride = Input.empty();
        this.stripeSizeBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> blockSizeBytes;
        private @Nullable Input<List<String>> bloomFilterColumns;
        private @Nullable Input<Double> bloomFilterFalsePositiveProbability;
        private @Nullable Input<String> compression;
        private @Nullable Input<Double> dictionaryKeyThreshold;
        private @Nullable Input<Boolean> enablePadding;
        private @Nullable Input<String> formatVersion;
        private @Nullable Input<Double> paddingTolerance;
        private @Nullable Input<Integer> rowIndexStride;
        private @Nullable Input<Integer> stripeSizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockSizeBytes = defaults.blockSizeBytes;
    	      this.bloomFilterColumns = defaults.bloomFilterColumns;
    	      this.bloomFilterFalsePositiveProbability = defaults.bloomFilterFalsePositiveProbability;
    	      this.compression = defaults.compression;
    	      this.dictionaryKeyThreshold = defaults.dictionaryKeyThreshold;
    	      this.enablePadding = defaults.enablePadding;
    	      this.formatVersion = defaults.formatVersion;
    	      this.paddingTolerance = defaults.paddingTolerance;
    	      this.rowIndexStride = defaults.rowIndexStride;
    	      this.stripeSizeBytes = defaults.stripeSizeBytes;
        }

        public Builder setBlockSizeBytes(@Nullable Input<Integer> blockSizeBytes) {
            this.blockSizeBytes = blockSizeBytes;
            return this;
        }

        public Builder setBlockSizeBytes(@Nullable Integer blockSizeBytes) {
            this.blockSizeBytes = Input.ofNullable(blockSizeBytes);
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable Input<List<String>> bloomFilterColumns) {
            this.bloomFilterColumns = bloomFilterColumns;
            return this;
        }

        public Builder setBloomFilterColumns(@Nullable List<String> bloomFilterColumns) {
            this.bloomFilterColumns = Input.ofNullable(bloomFilterColumns);
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Input<Double> bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
            return this;
        }

        public Builder setBloomFilterFalsePositiveProbability(@Nullable Double bloomFilterFalsePositiveProbability) {
            this.bloomFilterFalsePositiveProbability = Input.ofNullable(bloomFilterFalsePositiveProbability);
            return this;
        }

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Input<Double> dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = dictionaryKeyThreshold;
            return this;
        }

        public Builder setDictionaryKeyThreshold(@Nullable Double dictionaryKeyThreshold) {
            this.dictionaryKeyThreshold = Input.ofNullable(dictionaryKeyThreshold);
            return this;
        }

        public Builder setEnablePadding(@Nullable Input<Boolean> enablePadding) {
            this.enablePadding = enablePadding;
            return this;
        }

        public Builder setEnablePadding(@Nullable Boolean enablePadding) {
            this.enablePadding = Input.ofNullable(enablePadding);
            return this;
        }

        public Builder setFormatVersion(@Nullable Input<String> formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }

        public Builder setFormatVersion(@Nullable String formatVersion) {
            this.formatVersion = Input.ofNullable(formatVersion);
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Input<Double> paddingTolerance) {
            this.paddingTolerance = paddingTolerance;
            return this;
        }

        public Builder setPaddingTolerance(@Nullable Double paddingTolerance) {
            this.paddingTolerance = Input.ofNullable(paddingTolerance);
            return this;
        }

        public Builder setRowIndexStride(@Nullable Input<Integer> rowIndexStride) {
            this.rowIndexStride = rowIndexStride;
            return this;
        }

        public Builder setRowIndexStride(@Nullable Integer rowIndexStride) {
            this.rowIndexStride = Input.ofNullable(rowIndexStride);
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Input<Integer> stripeSizeBytes) {
            this.stripeSizeBytes = stripeSizeBytes;
            return this;
        }

        public Builder setStripeSizeBytes(@Nullable Integer stripeSizeBytes) {
            this.stripeSizeBytes = Input.ofNullable(stripeSizeBytes);
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationSerializerOrcSerDeGetArgs(blockSizeBytes, bloomFilterColumns, bloomFilterFalsePositiveProbability, compression, dictionaryKeyThreshold, enablePadding, formatVersion, paddingTolerance, rowIndexStride, stripeSizeBytes);
        }
    }
}
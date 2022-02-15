// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum DataQualityJobDefinitionEndpointInputS3DataDistributionType {
        FullyReplicated("FullyReplicated"),
        ShardedByS3Key("ShardedByS3Key");

        private final String value;

        DataQualityJobDefinitionEndpointInputS3DataDistributionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataQualityJobDefinitionEndpointInputS3DataDistributionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
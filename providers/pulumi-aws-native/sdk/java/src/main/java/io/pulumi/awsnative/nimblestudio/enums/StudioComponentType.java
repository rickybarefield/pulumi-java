// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum StudioComponentType {
        ActiveDirectory("ACTIVE_DIRECTORY"),
        SharedFileSystem("SHARED_FILE_SYSTEM"),
        ComputeFarm("COMPUTE_FARM"),
        LicenseService("LICENSE_SERVICE"),
        Custom("CUSTOM");

        private final String value;

        StudioComponentType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StudioComponentType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
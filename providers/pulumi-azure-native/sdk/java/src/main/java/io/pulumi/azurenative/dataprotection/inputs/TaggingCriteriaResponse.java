// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.RetentionTagResponse;
import io.pulumi.azurenative.dataprotection.inputs.ScheduleBasedBackupCriteriaResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaggingCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final TaggingCriteriaResponse Empty = new TaggingCriteriaResponse();

    @InputImport(name="criteria")
    private final @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria;

    public List<ScheduleBasedBackupCriteriaResponse> getCriteria() {
        return this.criteria == null ? List.of() : this.criteria;
    }

    @InputImport(name="isDefault", required=true)
    private final Boolean isDefault;

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    @InputImport(name="tagInfo", required=true)
    private final RetentionTagResponse tagInfo;

    public RetentionTagResponse getTagInfo() {
        return this.tagInfo;
    }

    @InputImport(name="taggingPriority", required=true)
    private final Double taggingPriority;

    public Double getTaggingPriority() {
        return this.taggingPriority;
    }

    public TaggingCriteriaResponse(
        @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria,
        Boolean isDefault,
        RetentionTagResponse tagInfo,
        Double taggingPriority) {
        this.criteria = criteria;
        this.isDefault = Objects.requireNonNull(isDefault, "expected parameter 'isDefault' to be non-null");
        this.tagInfo = Objects.requireNonNull(tagInfo, "expected parameter 'tagInfo' to be non-null");
        this.taggingPriority = Objects.requireNonNull(taggingPriority, "expected parameter 'taggingPriority' to be non-null");
    }

    private TaggingCriteriaResponse() {
        this.criteria = List.of();
        this.isDefault = null;
        this.tagInfo = null;
        this.taggingPriority = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaggingCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScheduleBasedBackupCriteriaResponse> criteria;
        private Boolean isDefault;
        private RetentionTagResponse tagInfo;
        private Double taggingPriority;

        public Builder() {
    	      // Empty
        }

        public Builder(TaggingCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteria = defaults.criteria;
    	      this.isDefault = defaults.isDefault;
    	      this.tagInfo = defaults.tagInfo;
    	      this.taggingPriority = defaults.taggingPriority;
        }

        public Builder setCriteria(@Nullable List<ScheduleBasedBackupCriteriaResponse> criteria) {
            this.criteria = criteria;
            return this;
        }

        public Builder setIsDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }

        public Builder setTagInfo(RetentionTagResponse tagInfo) {
            this.tagInfo = Objects.requireNonNull(tagInfo);
            return this;
        }

        public Builder setTaggingPriority(Double taggingPriority) {
            this.taggingPriority = Objects.requireNonNull(taggingPriority);
            return this;
        }

        public TaggingCriteriaResponse build() {
            return new TaggingCriteriaResponse(criteria, isDefault, tagInfo, taggingPriority);
        }
    }
}
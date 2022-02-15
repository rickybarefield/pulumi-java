// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.IncidentLabelResponse;
import io.pulumi.azurenative.securityinsights.inputs.IncidentOwnerInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationRuleModifyPropertiesActionResponseActionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AutomationRuleModifyPropertiesActionResponseActionConfiguration Empty = new AutomationRuleModifyPropertiesActionResponseActionConfiguration();

    @InputImport(name="classification")
    private final @Nullable String classification;

    public Optional<String> getClassification() {
        return this.classification == null ? Optional.empty() : Optional.ofNullable(this.classification);
    }

    @InputImport(name="classificationComment")
    private final @Nullable String classificationComment;

    public Optional<String> getClassificationComment() {
        return this.classificationComment == null ? Optional.empty() : Optional.ofNullable(this.classificationComment);
    }

    @InputImport(name="classificationReason")
    private final @Nullable String classificationReason;

    public Optional<String> getClassificationReason() {
        return this.classificationReason == null ? Optional.empty() : Optional.ofNullable(this.classificationReason);
    }

    @InputImport(name="labels")
    private final @Nullable List<IncidentLabelResponse> labels;

    public List<IncidentLabelResponse> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }

    @InputImport(name="owner")
    private final @Nullable IncidentOwnerInfoResponse owner;

    public Optional<IncidentOwnerInfoResponse> getOwner() {
        return this.owner == null ? Optional.empty() : Optional.ofNullable(this.owner);
    }

    @InputImport(name="severity")
    private final @Nullable String severity;

    public Optional<String> getSeverity() {
        return this.severity == null ? Optional.empty() : Optional.ofNullable(this.severity);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public AutomationRuleModifyPropertiesActionResponseActionConfiguration(
        @Nullable String classification,
        @Nullable String classificationComment,
        @Nullable String classificationReason,
        @Nullable List<IncidentLabelResponse> labels,
        @Nullable IncidentOwnerInfoResponse owner,
        @Nullable String severity,
        @Nullable String status) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.labels = labels;
        this.owner = owner;
        this.severity = severity;
        this.status = status;
    }

    private AutomationRuleModifyPropertiesActionResponseActionConfiguration() {
        this.classification = null;
        this.classificationComment = null;
        this.classificationReason = null;
        this.labels = List.of();
        this.owner = null;
        this.severity = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable String classificationReason;
        private @Nullable List<IncidentLabelResponse> labels;
        private @Nullable IncidentOwnerInfoResponse owner;
        private @Nullable String severity;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.labels = defaults.labels;
    	      this.owner = defaults.owner;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
        }

        public Builder setClassification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }

        public Builder setClassificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }

        public Builder setClassificationReason(@Nullable String classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }

        public Builder setLabels(@Nullable List<IncidentLabelResponse> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setOwner(@Nullable IncidentOwnerInfoResponse owner) {
            this.owner = owner;
            return this;
        }

        public Builder setSeverity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public AutomationRuleModifyPropertiesActionResponseActionConfiguration build() {
            return new AutomationRuleModifyPropertiesActionResponseActionConfiguration(classification, classificationComment, classificationReason, labels, owner, severity, status);
        }
    }
}
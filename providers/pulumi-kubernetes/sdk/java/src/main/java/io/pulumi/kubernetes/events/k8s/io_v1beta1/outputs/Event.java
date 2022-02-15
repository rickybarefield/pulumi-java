// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.events.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.EventSource;
import io.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import io.pulumi.kubernetes.events.k8s.io_v1beta1.outputs.EventSeries;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Event {
    private final @Nullable String action;
    private final @Nullable String apiVersion;
    private final @Nullable Integer deprecatedCount;
    private final @Nullable String deprecatedFirstTimestamp;
    private final @Nullable String deprecatedLastTimestamp;
    private final @Nullable EventSource deprecatedSource;
    private final String eventTime;
    private final @Nullable String kind;
    private final @Nullable ObjectMeta metadata;
    private final @Nullable String note;
    private final @Nullable String reason;
    private final @Nullable ObjectReference regarding;
    private final @Nullable ObjectReference related;
    private final @Nullable String reportingController;
    private final @Nullable String reportingInstance;
    private final @Nullable EventSeries series;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"action","apiVersion","deprecatedCount","deprecatedFirstTimestamp","deprecatedLastTimestamp","deprecatedSource","eventTime","kind","metadata","note","reason","regarding","related","reportingController","reportingInstance","series","type"})
    private Event(
        @Nullable String action,
        @Nullable String apiVersion,
        @Nullable Integer deprecatedCount,
        @Nullable String deprecatedFirstTimestamp,
        @Nullable String deprecatedLastTimestamp,
        @Nullable EventSource deprecatedSource,
        String eventTime,
        @Nullable String kind,
        @Nullable ObjectMeta metadata,
        @Nullable String note,
        @Nullable String reason,
        @Nullable ObjectReference regarding,
        @Nullable ObjectReference related,
        @Nullable String reportingController,
        @Nullable String reportingInstance,
        @Nullable EventSeries series,
        @Nullable String type) {
        this.action = action;
        this.apiVersion = apiVersion;
        this.deprecatedCount = deprecatedCount;
        this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
        this.deprecatedLastTimestamp = deprecatedLastTimestamp;
        this.deprecatedSource = deprecatedSource;
        this.eventTime = Objects.requireNonNull(eventTime);
        this.kind = kind;
        this.metadata = metadata;
        this.note = note;
        this.reason = reason;
        this.regarding = regarding;
        this.related = related;
        this.reportingController = reportingController;
        this.reportingInstance = reportingInstance;
        this.series = series;
        this.type = type;
    }

    public Optional<String> getAction() {
        return Optional.ofNullable(this.action);
    }
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    public Optional<Integer> getDeprecatedCount() {
        return Optional.ofNullable(this.deprecatedCount);
    }
    public Optional<String> getDeprecatedFirstTimestamp() {
        return Optional.ofNullable(this.deprecatedFirstTimestamp);
    }
    public Optional<String> getDeprecatedLastTimestamp() {
        return Optional.ofNullable(this.deprecatedLastTimestamp);
    }
    public Optional<EventSource> getDeprecatedSource() {
        return Optional.ofNullable(this.deprecatedSource);
    }
    public String getEventTime() {
        return this.eventTime;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    public Optional<String> getNote() {
        return Optional.ofNullable(this.note);
    }
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    public Optional<ObjectReference> getRegarding() {
        return Optional.ofNullable(this.regarding);
    }
    public Optional<ObjectReference> getRelated() {
        return Optional.ofNullable(this.related);
    }
    public Optional<String> getReportingController() {
        return Optional.ofNullable(this.reportingController);
    }
    public Optional<String> getReportingInstance() {
        return Optional.ofNullable(this.reportingInstance);
    }
    public Optional<EventSeries> getSeries() {
        return Optional.ofNullable(this.series);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Event defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String apiVersion;
        private @Nullable Integer deprecatedCount;
        private @Nullable String deprecatedFirstTimestamp;
        private @Nullable String deprecatedLastTimestamp;
        private @Nullable EventSource deprecatedSource;
        private String eventTime;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable String note;
        private @Nullable String reason;
        private @Nullable ObjectReference regarding;
        private @Nullable ObjectReference related;
        private @Nullable String reportingController;
        private @Nullable String reportingInstance;
        private @Nullable EventSeries series;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(Event defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.apiVersion = defaults.apiVersion;
    	      this.deprecatedCount = defaults.deprecatedCount;
    	      this.deprecatedFirstTimestamp = defaults.deprecatedFirstTimestamp;
    	      this.deprecatedLastTimestamp = defaults.deprecatedLastTimestamp;
    	      this.deprecatedSource = defaults.deprecatedSource;
    	      this.eventTime = defaults.eventTime;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.note = defaults.note;
    	      this.reason = defaults.reason;
    	      this.regarding = defaults.regarding;
    	      this.related = defaults.related;
    	      this.reportingController = defaults.reportingController;
    	      this.reportingInstance = defaults.reportingInstance;
    	      this.series = defaults.series;
    	      this.type = defaults.type;
        }

        public Builder setAction(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setDeprecatedCount(@Nullable Integer deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }

        public Builder setDeprecatedFirstTimestamp(@Nullable String deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }

        public Builder setDeprecatedLastTimestamp(@Nullable String deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }

        public Builder setDeprecatedSource(@Nullable EventSource deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }

        public Builder setEventTime(String eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setMetadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setNote(@Nullable String note) {
            this.note = note;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setRegarding(@Nullable ObjectReference regarding) {
            this.regarding = regarding;
            return this;
        }

        public Builder setRelated(@Nullable ObjectReference related) {
            this.related = related;
            return this;
        }

        public Builder setReportingController(@Nullable String reportingController) {
            this.reportingController = reportingController;
            return this;
        }

        public Builder setReportingInstance(@Nullable String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        public Builder setSeries(@Nullable EventSeries series) {
            this.series = series;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Event build() {
            return new Event(action, apiVersion, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, eventTime, kind, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }
}
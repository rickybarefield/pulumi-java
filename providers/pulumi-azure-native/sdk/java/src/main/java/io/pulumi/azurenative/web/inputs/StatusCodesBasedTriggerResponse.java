// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StatusCodesBasedTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusCodesBasedTriggerResponse Empty = new StatusCodesBasedTriggerResponse();

    @InputImport(name="count")
    private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    @InputImport(name="status")
    private final @Nullable Integer status;

    public Optional<Integer> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="subStatus")
    private final @Nullable Integer subStatus;

    public Optional<Integer> getSubStatus() {
        return this.subStatus == null ? Optional.empty() : Optional.ofNullable(this.subStatus);
    }

    @InputImport(name="timeInterval")
    private final @Nullable String timeInterval;

    public Optional<String> getTimeInterval() {
        return this.timeInterval == null ? Optional.empty() : Optional.ofNullable(this.timeInterval);
    }

    @InputImport(name="win32Status")
    private final @Nullable Integer win32Status;

    public Optional<Integer> getWin32Status() {
        return this.win32Status == null ? Optional.empty() : Optional.ofNullable(this.win32Status);
    }

    public StatusCodesBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String path,
        @Nullable Integer status,
        @Nullable Integer subStatus,
        @Nullable String timeInterval,
        @Nullable Integer win32Status) {
        this.count = count;
        this.path = path;
        this.status = status;
        this.subStatus = subStatus;
        this.timeInterval = timeInterval;
        this.win32Status = win32Status;
    }

    private StatusCodesBasedTriggerResponse() {
        this.count = null;
        this.path = null;
        this.status = null;
        this.subStatus = null;
        this.timeInterval = null;
        this.win32Status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusCodesBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String path;
        private @Nullable Integer status;
        private @Nullable Integer subStatus;
        private @Nullable String timeInterval;
        private @Nullable Integer win32Status;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusCodesBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.path = defaults.path;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
    	      this.timeInterval = defaults.timeInterval;
    	      this.win32Status = defaults.win32Status;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setStatus(@Nullable Integer status) {
            this.status = status;
            return this;
        }

        public Builder setSubStatus(@Nullable Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public Builder setWin32Status(@Nullable Integer win32Status) {
            this.win32Status = win32Status;
            return this;
        }

        public StatusCodesBasedTriggerResponse build() {
            return new StatusCodesBasedTriggerResponse(count, path, status, subStatus, timeInterval, win32Status);
        }
    }
}
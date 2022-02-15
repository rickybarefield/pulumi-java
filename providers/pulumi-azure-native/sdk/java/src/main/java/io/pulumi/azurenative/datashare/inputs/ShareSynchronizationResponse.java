// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareSynchronizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShareSynchronizationResponse Empty = new ShareSynchronizationResponse();

    @InputImport(name="consumerEmail")
    private final @Nullable String consumerEmail;

    public Optional<String> getConsumerEmail() {
        return this.consumerEmail == null ? Optional.empty() : Optional.ofNullable(this.consumerEmail);
    }

    @InputImport(name="consumerName")
    private final @Nullable String consumerName;

    public Optional<String> getConsumerName() {
        return this.consumerName == null ? Optional.empty() : Optional.ofNullable(this.consumerName);
    }

    @InputImport(name="consumerTenantName")
    private final @Nullable String consumerTenantName;

    public Optional<String> getConsumerTenantName() {
        return this.consumerTenantName == null ? Optional.empty() : Optional.ofNullable(this.consumerTenantName);
    }

    @InputImport(name="durationMs")
    private final @Nullable Integer durationMs;

    public Optional<Integer> getDurationMs() {
        return this.durationMs == null ? Optional.empty() : Optional.ofNullable(this.durationMs);
    }

    @InputImport(name="endTime")
    private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="startTime")
    private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    @InputImport(name="synchronizationId")
    private final @Nullable String synchronizationId;

    public Optional<String> getSynchronizationId() {
        return this.synchronizationId == null ? Optional.empty() : Optional.ofNullable(this.synchronizationId);
    }

    @InputImport(name="synchronizationMode", required=true)
    private final String synchronizationMode;

    public String getSynchronizationMode() {
        return this.synchronizationMode;
    }

    public ShareSynchronizationResponse(
        @Nullable String consumerEmail,
        @Nullable String consumerName,
        @Nullable String consumerTenantName,
        @Nullable Integer durationMs,
        @Nullable String endTime,
        @Nullable String message,
        @Nullable String startTime,
        @Nullable String status,
        @Nullable String synchronizationId,
        String synchronizationMode) {
        this.consumerEmail = consumerEmail;
        this.consumerName = consumerName;
        this.consumerTenantName = consumerTenantName;
        this.durationMs = durationMs;
        this.endTime = endTime;
        this.message = message;
        this.startTime = startTime;
        this.status = status;
        this.synchronizationId = synchronizationId;
        this.synchronizationMode = Objects.requireNonNull(synchronizationMode, "expected parameter 'synchronizationMode' to be non-null");
    }

    private ShareSynchronizationResponse() {
        this.consumerEmail = null;
        this.consumerName = null;
        this.consumerTenantName = null;
        this.durationMs = null;
        this.endTime = null;
        this.message = null;
        this.startTime = null;
        this.status = null;
        this.synchronizationId = null;
        this.synchronizationMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSynchronizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumerEmail;
        private @Nullable String consumerName;
        private @Nullable String consumerTenantName;
        private @Nullable Integer durationMs;
        private @Nullable String endTime;
        private @Nullable String message;
        private @Nullable String startTime;
        private @Nullable String status;
        private @Nullable String synchronizationId;
        private String synchronizationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSynchronizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerEmail = defaults.consumerEmail;
    	      this.consumerName = defaults.consumerName;
    	      this.consumerTenantName = defaults.consumerTenantName;
    	      this.durationMs = defaults.durationMs;
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.synchronizationId = defaults.synchronizationId;
    	      this.synchronizationMode = defaults.synchronizationMode;
        }

        public Builder setConsumerEmail(@Nullable String consumerEmail) {
            this.consumerEmail = consumerEmail;
            return this;
        }

        public Builder setConsumerName(@Nullable String consumerName) {
            this.consumerName = consumerName;
            return this;
        }

        public Builder setConsumerTenantName(@Nullable String consumerTenantName) {
            this.consumerTenantName = consumerTenantName;
            return this;
        }

        public Builder setDurationMs(@Nullable Integer durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSynchronizationId(@Nullable String synchronizationId) {
            this.synchronizationId = synchronizationId;
            return this;
        }

        public Builder setSynchronizationMode(String synchronizationMode) {
            this.synchronizationMode = Objects.requireNonNull(synchronizationMode);
            return this;
        }

        public ShareSynchronizationResponse build() {
            return new ShareSynchronizationResponse(consumerEmail, consumerName, consumerTenantName, durationMs, endTime, message, startTime, status, synchronizationId, synchronizationMode);
        }
    }
}
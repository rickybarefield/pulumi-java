// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationSettingsResponse {
    private final @Nullable String emailRecipient;
    private final @Nullable String notificationLocale;
    private final @Nullable String status;
    private final @Nullable Integer timeInMinutes;
    private final @Nullable String webhookUrl;

    @OutputCustomType.Constructor({"emailRecipient","notificationLocale","status","timeInMinutes","webhookUrl"})
    private NotificationSettingsResponse(
        @Nullable String emailRecipient,
        @Nullable String notificationLocale,
        @Nullable String status,
        @Nullable Integer timeInMinutes,
        @Nullable String webhookUrl) {
        this.emailRecipient = emailRecipient;
        this.notificationLocale = notificationLocale;
        this.status = status;
        this.timeInMinutes = timeInMinutes;
        this.webhookUrl = webhookUrl;
    }

    public Optional<String> getEmailRecipient() {
        return Optional.ofNullable(this.emailRecipient);
    }
    public Optional<String> getNotificationLocale() {
        return Optional.ofNullable(this.notificationLocale);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<Integer> getTimeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }
    public Optional<String> getWebhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailRecipient;
        private @Nullable String notificationLocale;
        private @Nullable String status;
        private @Nullable Integer timeInMinutes;
        private @Nullable String webhookUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailRecipient = defaults.emailRecipient;
    	      this.notificationLocale = defaults.notificationLocale;
    	      this.status = defaults.status;
    	      this.timeInMinutes = defaults.timeInMinutes;
    	      this.webhookUrl = defaults.webhookUrl;
        }

        public Builder setEmailRecipient(@Nullable String emailRecipient) {
            this.emailRecipient = emailRecipient;
            return this;
        }

        public Builder setNotificationLocale(@Nullable String notificationLocale) {
            this.notificationLocale = notificationLocale;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTimeInMinutes(@Nullable Integer timeInMinutes) {
            this.timeInMinutes = timeInMinutes;
            return this;
        }

        public Builder setWebhookUrl(@Nullable String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }

        public NotificationSettingsResponse build() {
            return new NotificationSettingsResponse(emailRecipient, notificationLocale, status, timeInMinutes, webhookUrl);
        }
    }
}
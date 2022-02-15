// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackupItemResponse {
    private final Integer backupId;
    private final String blobName;
    private final String correlationId;
    private final String created;
    private final List<DatabaseBackupSettingResponse> databases;
    private final String finishedTimeStamp;
    private final String id;
    private final @Nullable String kind;
    private final String lastRestoreTimeStamp;
    private final String log;
    private final String name;
    private final Boolean scheduled;
    private final Double sizeInBytes;
    private final String status;
    private final String storageAccountUrl;
    private final String type;
    private final Double websiteSizeInBytes;

    @OutputCustomType.Constructor({"backupId","blobName","correlationId","created","databases","finishedTimeStamp","id","kind","lastRestoreTimeStamp","log","name","scheduled","sizeInBytes","status","storageAccountUrl","type","websiteSizeInBytes"})
    private BackupItemResponse(
        Integer backupId,
        String blobName,
        String correlationId,
        String created,
        List<DatabaseBackupSettingResponse> databases,
        String finishedTimeStamp,
        String id,
        @Nullable String kind,
        String lastRestoreTimeStamp,
        String log,
        String name,
        Boolean scheduled,
        Double sizeInBytes,
        String status,
        String storageAccountUrl,
        String type,
        Double websiteSizeInBytes) {
        this.backupId = Objects.requireNonNull(backupId);
        this.blobName = Objects.requireNonNull(blobName);
        this.correlationId = Objects.requireNonNull(correlationId);
        this.created = Objects.requireNonNull(created);
        this.databases = Objects.requireNonNull(databases);
        this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
        this.log = Objects.requireNonNull(log);
        this.name = Objects.requireNonNull(name);
        this.scheduled = Objects.requireNonNull(scheduled);
        this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
        this.status = Objects.requireNonNull(status);
        this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
        this.type = Objects.requireNonNull(type);
        this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
    }

    public Integer getBackupId() {
        return this.backupId;
    }
    public String getBlobName() {
        return this.blobName;
    }
    public String getCorrelationId() {
        return this.correlationId;
    }
    public String getCreated() {
        return this.created;
    }
    public List<DatabaseBackupSettingResponse> getDatabases() {
        return this.databases;
    }
    public String getFinishedTimeStamp() {
        return this.finishedTimeStamp;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getLastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }
    public String getLog() {
        return this.log;
    }
    public String getName() {
        return this.name;
    }
    public Boolean getScheduled() {
        return this.scheduled;
    }
    public Double getSizeInBytes() {
        return this.sizeInBytes;
    }
    public String getStatus() {
        return this.status;
    }
    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }
    public String getType() {
        return this.type;
    }
    public Double getWebsiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backupId;
        private String blobName;
        private String correlationId;
        private String created;
        private List<DatabaseBackupSettingResponse> databases;
        private String finishedTimeStamp;
        private String id;
        private @Nullable String kind;
        private String lastRestoreTimeStamp;
        private String log;
        private String name;
        private Boolean scheduled;
        private Double sizeInBytes;
        private String status;
        private String storageAccountUrl;
        private String type;
        private Double websiteSizeInBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.blobName = defaults.blobName;
    	      this.correlationId = defaults.correlationId;
    	      this.created = defaults.created;
    	      this.databases = defaults.databases;
    	      this.finishedTimeStamp = defaults.finishedTimeStamp;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastRestoreTimeStamp = defaults.lastRestoreTimeStamp;
    	      this.log = defaults.log;
    	      this.name = defaults.name;
    	      this.scheduled = defaults.scheduled;
    	      this.sizeInBytes = defaults.sizeInBytes;
    	      this.status = defaults.status;
    	      this.storageAccountUrl = defaults.storageAccountUrl;
    	      this.type = defaults.type;
    	      this.websiteSizeInBytes = defaults.websiteSizeInBytes;
        }

        public Builder setBackupId(Integer backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setBlobName(String blobName) {
            this.blobName = Objects.requireNonNull(blobName);
            return this;
        }

        public Builder setCorrelationId(String correlationId) {
            this.correlationId = Objects.requireNonNull(correlationId);
            return this;
        }

        public Builder setCreated(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDatabases(List<DatabaseBackupSettingResponse> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder setFinishedTimeStamp(String finishedTimeStamp) {
            this.finishedTimeStamp = Objects.requireNonNull(finishedTimeStamp);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLastRestoreTimeStamp(String lastRestoreTimeStamp) {
            this.lastRestoreTimeStamp = Objects.requireNonNull(lastRestoreTimeStamp);
            return this;
        }

        public Builder setLog(String log) {
            this.log = Objects.requireNonNull(log);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScheduled(Boolean scheduled) {
            this.scheduled = Objects.requireNonNull(scheduled);
            return this;
        }

        public Builder setSizeInBytes(Double sizeInBytes) {
            this.sizeInBytes = Objects.requireNonNull(sizeInBytes);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStorageAccountUrl(String storageAccountUrl) {
            this.storageAccountUrl = Objects.requireNonNull(storageAccountUrl);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWebsiteSizeInBytes(Double websiteSizeInBytes) {
            this.websiteSizeInBytes = Objects.requireNonNull(websiteSizeInBytes);
            return this;
        }

        public BackupItemResponse build() {
            return new BackupItemResponse(backupId, blobName, correlationId, created, databases, finishedTimeStamp, id, kind, lastRestoreTimeStamp, log, name, scheduled, sizeInBytes, status, storageAccountUrl, type, websiteSizeInBytes);
        }
    }
}
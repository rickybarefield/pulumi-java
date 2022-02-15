// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPysparkJobLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplateJobPysparkJob {
    private final @Nullable List<String> archiveUris;
    private final @Nullable List<String> args;
    private final @Nullable List<String> fileUris;
    private final @Nullable List<String> jarFileUris;
    private final @Nullable WorkflowTemplateJobPysparkJobLoggingConfig loggingConfig;
    private final String mainPythonFileUri;
    private final @Nullable Map<String,String> properties;
    private final @Nullable List<String> pythonFileUris;

    @OutputCustomType.Constructor({"archiveUris","args","fileUris","jarFileUris","loggingConfig","mainPythonFileUri","properties","pythonFileUris"})
    private WorkflowTemplateJobPysparkJob(
        @Nullable List<String> archiveUris,
        @Nullable List<String> args,
        @Nullable List<String> fileUris,
        @Nullable List<String> jarFileUris,
        @Nullable WorkflowTemplateJobPysparkJobLoggingConfig loggingConfig,
        String mainPythonFileUri,
        @Nullable Map<String,String> properties,
        @Nullable List<String> pythonFileUris) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
        this.properties = properties;
        this.pythonFileUris = pythonFileUris;
    }

    public List<String> getArchiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    public List<String> getArgs() {
        return this.args == null ? List.of() : this.args;
    }
    public List<String> getFileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    public List<String> getJarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    public Optional<WorkflowTemplateJobPysparkJobLoggingConfig> getLoggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    public String getMainPythonFileUri() {
        return this.mainPythonFileUri;
    }
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public List<String> getPythonFileUris() {
        return this.pythonFileUris == null ? List.of() : this.pythonFileUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPysparkJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> args;
        private @Nullable List<String> fileUris;
        private @Nullable List<String> jarFileUris;
        private @Nullable WorkflowTemplateJobPysparkJobLoggingConfig loggingConfig;
        private String mainPythonFileUri;
        private @Nullable Map<String,String> properties;
        private @Nullable List<String> pythonFileUris;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPysparkJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainPythonFileUri = defaults.mainPythonFileUri;
    	      this.properties = defaults.properties;
    	      this.pythonFileUris = defaults.pythonFileUris;
        }

        public Builder setArchiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = args;
            return this;
        }

        public Builder setFileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setLoggingConfig(@Nullable WorkflowTemplateJobPysparkJobLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setMainPythonFileUri(String mainPythonFileUri) {
            this.mainPythonFileUri = Objects.requireNonNull(mainPythonFileUri);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setPythonFileUris(@Nullable List<String> pythonFileUris) {
            this.pythonFileUris = pythonFileUris;
            return this;
        }

        public WorkflowTemplateJobPysparkJob build() {
            return new WorkflowTemplateJobPysparkJob(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainPythonFileUri, properties, pythonFileUris);
        }
    }
}
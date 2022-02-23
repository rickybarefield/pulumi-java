// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobCommand {
    /**
     * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `max_capacity` needs to be set if `pythonshell` is chosen.
     * 
     */
    private final @Nullable String name;
    /**
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * 
     */
    private final @Nullable String pythonVersion;
    /**
     * Specifies the S3 path to a script that executes a job.
     * 
     */
    private final String scriptLocation;

    @OutputCustomType.Constructor({"name","pythonVersion","scriptLocation"})
    private JobCommand(
        @Nullable String name,
        @Nullable String pythonVersion,
        String scriptLocation) {
        this.name = name;
        this.pythonVersion = pythonVersion;
        this.scriptLocation = Objects.requireNonNull(scriptLocation);
    }

    /**
     * The name of the job command. Defaults to `glueetl`. Use `pythonshell` for Python Shell Job Type, `max_capacity` needs to be set if `pythonshell` is chosen.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * 
     */
    public Optional<String> getPythonVersion() {
        return Optional.ofNullable(this.pythonVersion);
    }
    /**
     * Specifies the S3 path to a script that executes a job.
     * 
     */
    public String getScriptLocation() {
        return this.scriptLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCommand defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String pythonVersion;
        private String scriptLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCommand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.pythonVersion = defaults.pythonVersion;
    	      this.scriptLocation = defaults.scriptLocation;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPythonVersion(@Nullable String pythonVersion) {
            this.pythonVersion = pythonVersion;
            return this;
        }

        public Builder setScriptLocation(String scriptLocation) {
            this.scriptLocation = Objects.requireNonNull(scriptLocation);
            return this;
        }
        public JobCommand build() {
            return new JobCommand(name, pythonVersion, scriptLocation);
        }
    }
}
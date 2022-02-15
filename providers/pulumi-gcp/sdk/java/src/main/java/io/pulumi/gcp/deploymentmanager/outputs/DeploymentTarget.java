// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.deploymentmanager.outputs.DeploymentTargetConfig;
import io.pulumi.gcp.deploymentmanager.outputs.DeploymentTargetImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentTarget {
    private final DeploymentTargetConfig config;
    private final @Nullable List<DeploymentTargetImport> imports;

    @OutputCustomType.Constructor({"config","imports"})
    private DeploymentTarget(
        DeploymentTargetConfig config,
        @Nullable List<DeploymentTargetImport> imports) {
        this.config = Objects.requireNonNull(config);
        this.imports = imports;
    }

    public DeploymentTargetConfig getConfig() {
        return this.config;
    }
    public List<DeploymentTargetImport> getImports() {
        return this.imports == null ? List.of() : this.imports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentTargetConfig config;
        private @Nullable List<DeploymentTargetImport> imports;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.imports = defaults.imports;
        }

        public Builder setConfig(DeploymentTargetConfig config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setImports(@Nullable List<DeploymentTargetImport> imports) {
            this.imports = imports;
            return this;
        }

        public DeploymentTarget build() {
            return new DeploymentTarget(config, imports);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.Capabilities;
import io.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import io.pulumi.kubernetes.core_v1.outputs.SeccompProfile;
import io.pulumi.kubernetes.core_v1.outputs.WindowsSecurityContextOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityContext {
    private final @Nullable Boolean allowPrivilegeEscalation;
    private final @Nullable Capabilities capabilities;
    private final @Nullable Boolean privileged;
    private final @Nullable String procMount;
    private final @Nullable Boolean readOnlyRootFilesystem;
    private final @Nullable Integer runAsGroup;
    private final @Nullable Boolean runAsNonRoot;
    private final @Nullable Integer runAsUser;
    private final @Nullable SELinuxOptions seLinuxOptions;
    private final @Nullable SeccompProfile seccompProfile;
    private final @Nullable WindowsSecurityContextOptions windowsOptions;

    @OutputCustomType.Constructor({"allowPrivilegeEscalation","capabilities","privileged","procMount","readOnlyRootFilesystem","runAsGroup","runAsNonRoot","runAsUser","seLinuxOptions","seccompProfile","windowsOptions"})
    private SecurityContext(
        @Nullable Boolean allowPrivilegeEscalation,
        @Nullable Capabilities capabilities,
        @Nullable Boolean privileged,
        @Nullable String procMount,
        @Nullable Boolean readOnlyRootFilesystem,
        @Nullable Integer runAsGroup,
        @Nullable Boolean runAsNonRoot,
        @Nullable Integer runAsUser,
        @Nullable SELinuxOptions seLinuxOptions,
        @Nullable SeccompProfile seccompProfile,
        @Nullable WindowsSecurityContextOptions windowsOptions) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.windowsOptions = windowsOptions;
    }

    public Optional<Boolean> getAllowPrivilegeEscalation() {
        return Optional.ofNullable(this.allowPrivilegeEscalation);
    }
    public Optional<Capabilities> getCapabilities() {
        return Optional.ofNullable(this.capabilities);
    }
    public Optional<Boolean> getPrivileged() {
        return Optional.ofNullable(this.privileged);
    }
    public Optional<String> getProcMount() {
        return Optional.ofNullable(this.procMount);
    }
    public Optional<Boolean> getReadOnlyRootFilesystem() {
        return Optional.ofNullable(this.readOnlyRootFilesystem);
    }
    public Optional<Integer> getRunAsGroup() {
        return Optional.ofNullable(this.runAsGroup);
    }
    public Optional<Boolean> getRunAsNonRoot() {
        return Optional.ofNullable(this.runAsNonRoot);
    }
    public Optional<Integer> getRunAsUser() {
        return Optional.ofNullable(this.runAsUser);
    }
    public Optional<SELinuxOptions> getSeLinuxOptions() {
        return Optional.ofNullable(this.seLinuxOptions);
    }
    public Optional<SeccompProfile> getSeccompProfile() {
        return Optional.ofNullable(this.seccompProfile);
    }
    public Optional<WindowsSecurityContextOptions> getWindowsOptions() {
        return Optional.ofNullable(this.windowsOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPrivilegeEscalation;
        private @Nullable Capabilities capabilities;
        private @Nullable Boolean privileged;
        private @Nullable String procMount;
        private @Nullable Boolean readOnlyRootFilesystem;
        private @Nullable Integer runAsGroup;
        private @Nullable Boolean runAsNonRoot;
        private @Nullable Integer runAsUser;
        private @Nullable SELinuxOptions seLinuxOptions;
        private @Nullable SeccompProfile seccompProfile;
        private @Nullable WindowsSecurityContextOptions windowsOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPrivilegeEscalation = defaults.allowPrivilegeEscalation;
    	      this.capabilities = defaults.capabilities;
    	      this.privileged = defaults.privileged;
    	      this.procMount = defaults.procMount;
    	      this.readOnlyRootFilesystem = defaults.readOnlyRootFilesystem;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        public Builder setAllowPrivilegeEscalation(@Nullable Boolean allowPrivilegeEscalation) {
            this.allowPrivilegeEscalation = allowPrivilegeEscalation;
            return this;
        }

        public Builder setCapabilities(@Nullable Capabilities capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder setPrivileged(@Nullable Boolean privileged) {
            this.privileged = privileged;
            return this;
        }

        public Builder setProcMount(@Nullable String procMount) {
            this.procMount = procMount;
            return this;
        }

        public Builder setReadOnlyRootFilesystem(@Nullable Boolean readOnlyRootFilesystem) {
            this.readOnlyRootFilesystem = readOnlyRootFilesystem;
            return this;
        }

        public Builder setRunAsGroup(@Nullable Integer runAsGroup) {
            this.runAsGroup = runAsGroup;
            return this;
        }

        public Builder setRunAsNonRoot(@Nullable Boolean runAsNonRoot) {
            this.runAsNonRoot = runAsNonRoot;
            return this;
        }

        public Builder setRunAsUser(@Nullable Integer runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        public Builder setSeLinuxOptions(@Nullable SELinuxOptions seLinuxOptions) {
            this.seLinuxOptions = seLinuxOptions;
            return this;
        }

        public Builder setSeccompProfile(@Nullable SeccompProfile seccompProfile) {
            this.seccompProfile = seccompProfile;
            return this;
        }

        public Builder setWindowsOptions(@Nullable WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        public SecurityContext build() {
            return new SecurityContext(allowPrivilegeEscalation, capabilities, privileged, procMount, readOnlyRootFilesystem, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, windowsOptions);
        }
    }
}
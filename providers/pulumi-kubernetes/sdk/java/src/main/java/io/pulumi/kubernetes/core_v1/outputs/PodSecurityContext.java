// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.SELinuxOptions;
import io.pulumi.kubernetes.core_v1.outputs.SeccompProfile;
import io.pulumi.kubernetes.core_v1.outputs.Sysctl;
import io.pulumi.kubernetes.core_v1.outputs.WindowsSecurityContextOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodSecurityContext {
    private final @Nullable Integer fsGroup;
    private final @Nullable String fsGroupChangePolicy;
    private final @Nullable Integer runAsGroup;
    private final @Nullable Boolean runAsNonRoot;
    private final @Nullable Integer runAsUser;
    private final @Nullable SELinuxOptions seLinuxOptions;
    private final @Nullable SeccompProfile seccompProfile;
    private final @Nullable List<Integer> supplementalGroups;
    private final @Nullable List<Sysctl> sysctls;
    private final @Nullable WindowsSecurityContextOptions windowsOptions;

    @OutputCustomType.Constructor({"fsGroup","fsGroupChangePolicy","runAsGroup","runAsNonRoot","runAsUser","seLinuxOptions","seccompProfile","supplementalGroups","sysctls","windowsOptions"})
    private PodSecurityContext(
        @Nullable Integer fsGroup,
        @Nullable String fsGroupChangePolicy,
        @Nullable Integer runAsGroup,
        @Nullable Boolean runAsNonRoot,
        @Nullable Integer runAsUser,
        @Nullable SELinuxOptions seLinuxOptions,
        @Nullable SeccompProfile seccompProfile,
        @Nullable List<Integer> supplementalGroups,
        @Nullable List<Sysctl> sysctls,
        @Nullable WindowsSecurityContextOptions windowsOptions) {
        this.fsGroup = fsGroup;
        this.fsGroupChangePolicy = fsGroupChangePolicy;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.supplementalGroups = supplementalGroups;
        this.sysctls = sysctls;
        this.windowsOptions = windowsOptions;
    }

    public Optional<Integer> getFsGroup() {
        return Optional.ofNullable(this.fsGroup);
    }
    public Optional<String> getFsGroupChangePolicy() {
        return Optional.ofNullable(this.fsGroupChangePolicy);
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
    public List<Integer> getSupplementalGroups() {
        return this.supplementalGroups == null ? List.of() : this.supplementalGroups;
    }
    public List<Sysctl> getSysctls() {
        return this.sysctls == null ? List.of() : this.sysctls;
    }
    public Optional<WindowsSecurityContextOptions> getWindowsOptions() {
        return Optional.ofNullable(this.windowsOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSecurityContext defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fsGroup;
        private @Nullable String fsGroupChangePolicy;
        private @Nullable Integer runAsGroup;
        private @Nullable Boolean runAsNonRoot;
        private @Nullable Integer runAsUser;
        private @Nullable SELinuxOptions seLinuxOptions;
        private @Nullable SeccompProfile seccompProfile;
        private @Nullable List<Integer> supplementalGroups;
        private @Nullable List<Sysctl> sysctls;
        private @Nullable WindowsSecurityContextOptions windowsOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSecurityContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsGroup = defaults.fsGroup;
    	      this.fsGroupChangePolicy = defaults.fsGroupChangePolicy;
    	      this.runAsGroup = defaults.runAsGroup;
    	      this.runAsNonRoot = defaults.runAsNonRoot;
    	      this.runAsUser = defaults.runAsUser;
    	      this.seLinuxOptions = defaults.seLinuxOptions;
    	      this.seccompProfile = defaults.seccompProfile;
    	      this.supplementalGroups = defaults.supplementalGroups;
    	      this.sysctls = defaults.sysctls;
    	      this.windowsOptions = defaults.windowsOptions;
        }

        public Builder setFsGroup(@Nullable Integer fsGroup) {
            this.fsGroup = fsGroup;
            return this;
        }

        public Builder setFsGroupChangePolicy(@Nullable String fsGroupChangePolicy) {
            this.fsGroupChangePolicy = fsGroupChangePolicy;
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

        public Builder setSupplementalGroups(@Nullable List<Integer> supplementalGroups) {
            this.supplementalGroups = supplementalGroups;
            return this;
        }

        public Builder setSysctls(@Nullable List<Sysctl> sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        public Builder setWindowsOptions(@Nullable WindowsSecurityContextOptions windowsOptions) {
            this.windowsOptions = windowsOptions;
            return this;
        }

        public PodSecurityContext build() {
            return new PodSecurityContext(fsGroup, fsGroupChangePolicy, runAsGroup, runAsNonRoot, runAsUser, seLinuxOptions, seccompProfile, supplementalGroups, sysctls, windowsOptions);
        }
    }
}
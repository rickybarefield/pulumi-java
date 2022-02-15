// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsSecurityContextOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsSecurityContextOptionsArgs Empty = new WindowsSecurityContextOptionsArgs();

    @InputImport(name="gmsaCredentialSpec")
    private final @Nullable Input<String> gmsaCredentialSpec;

    public Input<String> getGmsaCredentialSpec() {
        return this.gmsaCredentialSpec == null ? Input.empty() : this.gmsaCredentialSpec;
    }

    @InputImport(name="gmsaCredentialSpecName")
    private final @Nullable Input<String> gmsaCredentialSpecName;

    public Input<String> getGmsaCredentialSpecName() {
        return this.gmsaCredentialSpecName == null ? Input.empty() : this.gmsaCredentialSpecName;
    }

    @InputImport(name="hostProcess")
    private final @Nullable Input<Boolean> hostProcess;

    public Input<Boolean> getHostProcess() {
        return this.hostProcess == null ? Input.empty() : this.hostProcess;
    }

    @InputImport(name="runAsUserName")
    private final @Nullable Input<String> runAsUserName;

    public Input<String> getRunAsUserName() {
        return this.runAsUserName == null ? Input.empty() : this.runAsUserName;
    }

    public WindowsSecurityContextOptionsArgs(
        @Nullable Input<String> gmsaCredentialSpec,
        @Nullable Input<String> gmsaCredentialSpecName,
        @Nullable Input<Boolean> hostProcess,
        @Nullable Input<String> runAsUserName) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        this.hostProcess = hostProcess;
        this.runAsUserName = runAsUserName;
    }

    private WindowsSecurityContextOptionsArgs() {
        this.gmsaCredentialSpec = Input.empty();
        this.gmsaCredentialSpecName = Input.empty();
        this.hostProcess = Input.empty();
        this.runAsUserName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsSecurityContextOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> gmsaCredentialSpec;
        private @Nullable Input<String> gmsaCredentialSpecName;
        private @Nullable Input<Boolean> hostProcess;
        private @Nullable Input<String> runAsUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsSecurityContextOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gmsaCredentialSpec = defaults.gmsaCredentialSpec;
    	      this.gmsaCredentialSpecName = defaults.gmsaCredentialSpecName;
    	      this.hostProcess = defaults.hostProcess;
    	      this.runAsUserName = defaults.runAsUserName;
        }

        public Builder setGmsaCredentialSpec(@Nullable Input<String> gmsaCredentialSpec) {
            this.gmsaCredentialSpec = gmsaCredentialSpec;
            return this;
        }

        public Builder setGmsaCredentialSpec(@Nullable String gmsaCredentialSpec) {
            this.gmsaCredentialSpec = Input.ofNullable(gmsaCredentialSpec);
            return this;
        }

        public Builder setGmsaCredentialSpecName(@Nullable Input<String> gmsaCredentialSpecName) {
            this.gmsaCredentialSpecName = gmsaCredentialSpecName;
            return this;
        }

        public Builder setGmsaCredentialSpecName(@Nullable String gmsaCredentialSpecName) {
            this.gmsaCredentialSpecName = Input.ofNullable(gmsaCredentialSpecName);
            return this;
        }

        public Builder setHostProcess(@Nullable Input<Boolean> hostProcess) {
            this.hostProcess = hostProcess;
            return this;
        }

        public Builder setHostProcess(@Nullable Boolean hostProcess) {
            this.hostProcess = Input.ofNullable(hostProcess);
            return this;
        }

        public Builder setRunAsUserName(@Nullable Input<String> runAsUserName) {
            this.runAsUserName = runAsUserName;
            return this;
        }

        public Builder setRunAsUserName(@Nullable String runAsUserName) {
            this.runAsUserName = Input.ofNullable(runAsUserName);
            return this;
        }

        public WindowsSecurityContextOptionsArgs build() {
            return new WindowsSecurityContextOptionsArgs(gmsaCredentialSpec, gmsaCredentialSpecName, hostProcess, runAsUserName);
        }
    }
}
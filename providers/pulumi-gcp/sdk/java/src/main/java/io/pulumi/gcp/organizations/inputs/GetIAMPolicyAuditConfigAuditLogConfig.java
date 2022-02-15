// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIAMPolicyAuditConfigAuditLogConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetIAMPolicyAuditConfigAuditLogConfig Empty = new GetIAMPolicyAuditConfigAuditLogConfig();

    @InputImport(name="exemptedMembers")
    private final @Nullable List<String> exemptedMembers;

    public List<String> getExemptedMembers() {
        return this.exemptedMembers == null ? List.of() : this.exemptedMembers;
    }

    @InputImport(name="logType", required=true)
    private final String logType;

    public String getLogType() {
        return this.logType;
    }

    public GetIAMPolicyAuditConfigAuditLogConfig(
        @Nullable List<String> exemptedMembers,
        String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = Objects.requireNonNull(logType, "expected parameter 'logType' to be non-null");
    }

    private GetIAMPolicyAuditConfigAuditLogConfig() {
        this.exemptedMembers = List.of();
        this.logType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyAuditConfigAuditLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyAuditConfigAuditLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder setExemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder setLogType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }

        public GetIAMPolicyAuditConfigAuditLogConfig build() {
            return new GetIAMPolicyAuditConfigAuditLogConfig(exemptedMembers, logType);
        }
    }
}
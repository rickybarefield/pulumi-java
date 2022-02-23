// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class GetDomainSnapshotOption extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainSnapshotOption Empty = new GetDomainSnapshotOption();

    /**
     * Hour during which the service takes an automated daily snapshot of the indices in the domain.
     * 
     */
    @InputImport(name="automatedSnapshotStartHour", required=true)
    private final Integer automatedSnapshotStartHour;

    public Integer getAutomatedSnapshotStartHour() {
        return this.automatedSnapshotStartHour;
    }

    public GetDomainSnapshotOption(Integer automatedSnapshotStartHour) {
        this.automatedSnapshotStartHour = Objects.requireNonNull(automatedSnapshotStartHour, "expected parameter 'automatedSnapshotStartHour' to be non-null");
    }

    private GetDomainSnapshotOption() {
        this.automatedSnapshotStartHour = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainSnapshotOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer automatedSnapshotStartHour;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainSnapshotOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedSnapshotStartHour = defaults.automatedSnapshotStartHour;
        }

        public Builder setAutomatedSnapshotStartHour(Integer automatedSnapshotStartHour) {
            this.automatedSnapshotStartHour = Objects.requireNonNull(automatedSnapshotStartHour);
            return this;
        }
        public GetDomainSnapshotOption build() {
            return new GetDomainSnapshotOption(automatedSnapshotStartHour);
        }
    }
}
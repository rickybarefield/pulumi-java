// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1IssueAssignmentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudContactcenterinsightsV1IssueModelResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1IssueModelResultResponse Empty = new GoogleCloudContactcenterinsightsV1IssueModelResultResponse();

    @InputImport(name="issueModel", required=true)
    private final String issueModel;

    public String getIssueModel() {
        return this.issueModel;
    }

    @InputImport(name="issues", required=true)
    private final List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues;

    public List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> getIssues() {
        return this.issues;
    }

    public GoogleCloudContactcenterinsightsV1IssueModelResultResponse(
        String issueModel,
        List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues) {
        this.issueModel = Objects.requireNonNull(issueModel, "expected parameter 'issueModel' to be non-null");
        this.issues = Objects.requireNonNull(issues, "expected parameter 'issues' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1IssueModelResultResponse() {
        this.issueModel = null;
        this.issues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1IssueModelResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String issueModel;
        private List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1IssueModelResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueModel = defaults.issueModel;
    	      this.issues = defaults.issues;
        }

        public Builder setIssueModel(String issueModel) {
            this.issueModel = Objects.requireNonNull(issueModel);
            return this;
        }

        public Builder setIssues(List<GoogleCloudContactcenterinsightsV1IssueAssignmentResponse> issues) {
            this.issues = Objects.requireNonNull(issues);
            return this;
        }

        public GoogleCloudContactcenterinsightsV1IssueModelResultResponse build() {
            return new GoogleCloudContactcenterinsightsV1IssueModelResultResponse(issueModel, issues);
        }
    }
}
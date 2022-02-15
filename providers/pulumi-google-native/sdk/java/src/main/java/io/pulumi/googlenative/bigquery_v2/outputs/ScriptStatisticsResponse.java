// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ScriptStackFrameResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ScriptStatisticsResponse {
    private final String evaluationKind;
    private final List<ScriptStackFrameResponse> stackFrames;

    @OutputCustomType.Constructor({"evaluationKind","stackFrames"})
    private ScriptStatisticsResponse(
        String evaluationKind,
        List<ScriptStackFrameResponse> stackFrames) {
        this.evaluationKind = Objects.requireNonNull(evaluationKind);
        this.stackFrames = Objects.requireNonNull(stackFrames);
    }

    public String getEvaluationKind() {
        return this.evaluationKind;
    }
    public List<ScriptStackFrameResponse> getStackFrames() {
        return this.stackFrames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String evaluationKind;
        private List<ScriptStackFrameResponse> stackFrames;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationKind = defaults.evaluationKind;
    	      this.stackFrames = defaults.stackFrames;
        }

        public Builder setEvaluationKind(String evaluationKind) {
            this.evaluationKind = Objects.requireNonNull(evaluationKind);
            return this;
        }

        public Builder setStackFrames(List<ScriptStackFrameResponse> stackFrames) {
            this.stackFrames = Objects.requireNonNull(stackFrames);
            return this;
        }

        public ScriptStatisticsResponse build() {
            return new ScriptStatisticsResponse(evaluationKind, stackFrames);
        }
    }
}
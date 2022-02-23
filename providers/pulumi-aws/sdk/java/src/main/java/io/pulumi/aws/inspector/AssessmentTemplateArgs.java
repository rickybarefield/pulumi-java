// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentTemplateArgs Empty = new AssessmentTemplateArgs();

    /**
     * The duration of the inspector run.
     * 
     */
    @InputImport(name="duration", required=true)
    private final Input<Integer> duration;

    public Input<Integer> getDuration() {
        return this.duration;
    }

    /**
     * The name of the assessment template.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The rules to be used during the run.
     * 
     */
    @InputImport(name="rulesPackageArns", required=true)
    private final Input<List<String>> rulesPackageArns;

    public Input<List<String>> getRulesPackageArns() {
        return this.rulesPackageArns;
    }

    /**
     * Key-value map of tags for the Inspector assessment template. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The assessment target ARN to attach the template to.
     * 
     */
    @InputImport(name="targetArn", required=true)
    private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public AssessmentTemplateArgs(
        Input<Integer> duration,
        @Nullable Input<String> name,
        Input<List<String>> rulesPackageArns,
        @Nullable Input<Map<String,String>> tags,
        Input<String> targetArn) {
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.name = name;
        this.rulesPackageArns = Objects.requireNonNull(rulesPackageArns, "expected parameter 'rulesPackageArns' to be non-null");
        this.tags = tags;
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private AssessmentTemplateArgs() {
        this.duration = Input.empty();
        this.name = Input.empty();
        this.rulesPackageArns = Input.empty();
        this.tags = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> duration;
        private @Nullable Input<String> name;
        private Input<List<String>> rulesPackageArns;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.rulesPackageArns = defaults.rulesPackageArns;
    	      this.tags = defaults.tags;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setDuration(Input<Integer> duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setDuration(Integer duration) {
            this.duration = Input.of(Objects.requireNonNull(duration));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRulesPackageArns(Input<List<String>> rulesPackageArns) {
            this.rulesPackageArns = Objects.requireNonNull(rulesPackageArns);
            return this;
        }

        public Builder setRulesPackageArns(List<String> rulesPackageArns) {
            this.rulesPackageArns = Input.of(Objects.requireNonNull(rulesPackageArns));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public AssessmentTemplateArgs build() {
            return new AssessmentTemplateArgs(duration, name, rulesPackageArns, tags, targetArn);
        }
    }
}
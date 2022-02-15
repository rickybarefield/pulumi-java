// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2RegexArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RegexArgs Empty = new GooglePrivacyDlpV2RegexArgs();

    @InputImport(name="groupIndexes")
    private final @Nullable Input<List<Integer>> groupIndexes;

    public Input<List<Integer>> getGroupIndexes() {
        return this.groupIndexes == null ? Input.empty() : this.groupIndexes;
    }

    @InputImport(name="pattern")
    private final @Nullable Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern == null ? Input.empty() : this.pattern;
    }

    public GooglePrivacyDlpV2RegexArgs(
        @Nullable Input<List<Integer>> groupIndexes,
        @Nullable Input<String> pattern) {
        this.groupIndexes = groupIndexes;
        this.pattern = pattern;
    }

    private GooglePrivacyDlpV2RegexArgs() {
        this.groupIndexes = Input.empty();
        this.pattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RegexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Integer>> groupIndexes;
        private @Nullable Input<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RegexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIndexes = defaults.groupIndexes;
    	      this.pattern = defaults.pattern;
        }

        public Builder setGroupIndexes(@Nullable Input<List<Integer>> groupIndexes) {
            this.groupIndexes = groupIndexes;
            return this;
        }

        public Builder setGroupIndexes(@Nullable List<Integer> groupIndexes) {
            this.groupIndexes = Input.ofNullable(groupIndexes);
            return this;
        }

        public Builder setPattern(@Nullable Input<String> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder setPattern(@Nullable String pattern) {
            this.pattern = Input.ofNullable(pattern);
            return this;
        }

        public GooglePrivacyDlpV2RegexArgs build() {
            return new GooglePrivacyDlpV2RegexArgs(groupIndexes, pattern);
        }
    }
}
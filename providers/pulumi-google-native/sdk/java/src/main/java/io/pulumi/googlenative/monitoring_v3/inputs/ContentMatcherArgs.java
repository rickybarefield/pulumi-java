// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.enums.ContentMatcherMatcher;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentMatcherArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentMatcherArgs Empty = new ContentMatcherArgs();

    @InputImport(name="content")
    private final @Nullable Input<String> content;

    public Input<String> getContent() {
        return this.content == null ? Input.empty() : this.content;
    }

    @InputImport(name="matcher")
    private final @Nullable Input<ContentMatcherMatcher> matcher;

    public Input<ContentMatcherMatcher> getMatcher() {
        return this.matcher == null ? Input.empty() : this.matcher;
    }

    public ContentMatcherArgs(
        @Nullable Input<String> content,
        @Nullable Input<ContentMatcherMatcher> matcher) {
        this.content = content;
        this.matcher = matcher;
    }

    private ContentMatcherArgs() {
        this.content = Input.empty();
        this.matcher = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> content;
        private @Nullable Input<ContentMatcherMatcher> matcher;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentMatcherArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.matcher = defaults.matcher;
        }

        public Builder setContent(@Nullable Input<String> content) {
            this.content = content;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = Input.ofNullable(content);
            return this;
        }

        public Builder setMatcher(@Nullable Input<ContentMatcherMatcher> matcher) {
            this.matcher = matcher;
            return this;
        }

        public Builder setMatcher(@Nullable ContentMatcherMatcher matcher) {
            this.matcher = Input.ofNullable(matcher);
            return this;
        }

        public ContentMatcherArgs build() {
            return new ContentMatcherArgs(content, matcher);
        }
    }
}
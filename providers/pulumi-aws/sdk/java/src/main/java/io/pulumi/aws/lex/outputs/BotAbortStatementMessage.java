// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotAbortStatementMessage {
    /**
     * The text of the message.
     * 
     */
    private final String content;
    /**
     * The content type of the message string.
     * 
     */
    private final String contentType;
    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response.
     * 
     */
    private final @Nullable Integer groupNumber;

    @OutputCustomType.Constructor({"content","contentType","groupNumber"})
    private BotAbortStatementMessage(
        String content,
        String contentType,
        @Nullable Integer groupNumber) {
        this.content = Objects.requireNonNull(content);
        this.contentType = Objects.requireNonNull(contentType);
        this.groupNumber = groupNumber;
    }

    /**
     * The text of the message.
     * 
     */
    public String getContent() {
        return this.content;
    }
    /**
     * The content type of the message string.
     * 
     */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response.
     * 
     */
    public Optional<Integer> getGroupNumber() {
        return Optional.ofNullable(this.groupNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAbortStatementMessage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentType;
        private @Nullable Integer groupNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAbortStatementMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.groupNumber = defaults.groupNumber;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setGroupNumber(@Nullable Integer groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }
        public BotAbortStatementMessage build() {
            return new BotAbortStatementMessage(content, contentType, groupNumber);
        }
    }
}
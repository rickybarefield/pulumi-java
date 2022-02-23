// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleSnsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleSnsActionArgs Empty = new ReceiptRuleSnsActionArgs();

    /**
     * The encoding to use for the email within the Amazon SNS notification. Default value is `UTF-8`.
     * 
     */
    @InputImport(name="encoding")
    private final @Nullable Input<String> encoding;

    public Input<String> getEncoding() {
        return this.encoding == null ? Input.empty() : this.encoding;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @InputImport(name="position", required=true)
    private final Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @InputImport(name="topicArn", required=true)
    private final Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn;
    }

    public ReceiptRuleSnsActionArgs(
        @Nullable Input<String> encoding,
        Input<Integer> position,
        Input<String> topicArn) {
        this.encoding = encoding;
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private ReceiptRuleSnsActionArgs() {
        this.encoding = Input.empty();
        this.position = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleSnsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encoding;
        private Input<Integer> position;
        private Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleSnsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setEncoding(@Nullable Input<String> encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder setEncoding(@Nullable String encoding) {
            this.encoding = Input.ofNullable(encoding);
            return this;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }

        public Builder setTopicArn(Input<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }

        public Builder setTopicArn(String topicArn) {
            this.topicArn = Input.of(Objects.requireNonNull(topicArn));
            return this;
        }
        public ReceiptRuleSnsActionArgs build() {
            return new ReceiptRuleSnsActionArgs(encoding, position, topicArn);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryLogState extends io.pulumi.resources.ResourceArgs {

    public static final QueryLogState Empty = new QueryLogState();

    /**
     * The Amazon Resource Name (ARN) of the Query Logging Config.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * CloudWatch log group ARN to send query logs.
     * 
     */
    @InputImport(name="cloudwatchLogGroupArn")
    private final @Nullable Input<String> cloudwatchLogGroupArn;

    public Input<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn == null ? Input.empty() : this.cloudwatchLogGroupArn;
    }

    /**
     * Route53 hosted zone ID to enable query logs.
     * 
     */
    @InputImport(name="zoneId")
    private final @Nullable Input<String> zoneId;

    public Input<String> getZoneId() {
        return this.zoneId == null ? Input.empty() : this.zoneId;
    }

    public QueryLogState(
        @Nullable Input<String> arn,
        @Nullable Input<String> cloudwatchLogGroupArn,
        @Nullable Input<String> zoneId) {
        this.arn = arn;
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.zoneId = zoneId;
    }

    private QueryLogState() {
        this.arn = Input.empty();
        this.cloudwatchLogGroupArn = Input.empty();
        this.zoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryLogState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> cloudwatchLogGroupArn;
        private @Nullable Input<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryLogState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable Input<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        public Builder setCloudwatchLogGroupArn(@Nullable String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Input.ofNullable(cloudwatchLogGroupArn);
            return this;
        }

        public Builder setZoneId(@Nullable Input<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setZoneId(@Nullable String zoneId) {
            this.zoneId = Input.ofNullable(zoneId);
            return this;
        }
        public QueryLogState build() {
            return new QueryLogState(arn, cloudwatchLogGroupArn, zoneId);
        }
    }
}
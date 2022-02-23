// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScramSecretAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ScramSecretAssociationState Empty = new ScramSecretAssociationState();

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @InputImport(name="clusterArn")
    private final @Nullable Input<String> clusterArn;

    public Input<String> getClusterArn() {
        return this.clusterArn == null ? Input.empty() : this.clusterArn;
    }

    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @InputImport(name="secretArnLists")
    private final @Nullable Input<List<String>> secretArnLists;

    public Input<List<String>> getSecretArnLists() {
        return this.secretArnLists == null ? Input.empty() : this.secretArnLists;
    }

    public ScramSecretAssociationState(
        @Nullable Input<String> clusterArn,
        @Nullable Input<List<String>> secretArnLists) {
        this.clusterArn = clusterArn;
        this.secretArnLists = secretArnLists;
    }

    private ScramSecretAssociationState() {
        this.clusterArn = Input.empty();
        this.secretArnLists = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScramSecretAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clusterArn;
        private @Nullable Input<List<String>> secretArnLists;

        public Builder() {
    	      // Empty
        }

        public Builder(ScramSecretAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterArn = defaults.clusterArn;
    	      this.secretArnLists = defaults.secretArnLists;
        }

        public Builder setClusterArn(@Nullable Input<String> clusterArn) {
            this.clusterArn = clusterArn;
            return this;
        }

        public Builder setClusterArn(@Nullable String clusterArn) {
            this.clusterArn = Input.ofNullable(clusterArn);
            return this;
        }

        public Builder setSecretArnLists(@Nullable Input<List<String>> secretArnLists) {
            this.secretArnLists = secretArnLists;
            return this;
        }

        public Builder setSecretArnLists(@Nullable List<String> secretArnLists) {
            this.secretArnLists = Input.ofNullable(secretArnLists);
            return this;
        }
        public ScramSecretAssociationState build() {
            return new ScramSecretAssociationState(clusterArn, secretArnLists);
        }
    }
}
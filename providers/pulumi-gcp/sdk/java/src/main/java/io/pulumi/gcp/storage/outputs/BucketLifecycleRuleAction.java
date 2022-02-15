// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketLifecycleRuleAction {
    private final @Nullable String storageClass;
    private final String type;

    @OutputCustomType.Constructor({"storageClass","type"})
    private BucketLifecycleRuleAction(
        @Nullable String storageClass,
        String type) {
        this.storageClass = storageClass;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getStorageClass() {
        return Optional.ofNullable(this.storageClass);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageClass;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.type = defaults.type;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BucketLifecycleRuleAction build() {
            return new BucketLifecycleRuleAction(storageClass, type);
        }
    }
}
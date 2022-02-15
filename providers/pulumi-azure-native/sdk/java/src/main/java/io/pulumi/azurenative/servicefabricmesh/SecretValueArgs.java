// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretValueArgs Empty = new SecretValueArgs();

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="secretResourceName", required=true)
    private final Input<String> secretResourceName;

    public Input<String> getSecretResourceName() {
        return this.secretResourceName;
    }

    @InputImport(name="secretValueResourceName")
    private final @Nullable Input<String> secretValueResourceName;

    public Input<String> getSecretValueResourceName() {
        return this.secretValueResourceName == null ? Input.empty() : this.secretValueResourceName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SecretValueArgs(
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<String> secretResourceName,
        @Nullable Input<String> secretValueResourceName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> value) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.secretResourceName = Objects.requireNonNull(secretResourceName, "expected parameter 'secretResourceName' to be non-null");
        this.secretValueResourceName = secretValueResourceName;
        this.tags = tags;
        this.value = value;
    }

    private SecretValueArgs() {
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.secretResourceName = Input.empty();
        this.secretValueResourceName = Input.empty();
        this.tags = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<String> secretResourceName;
        private @Nullable Input<String> secretValueResourceName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretResourceName = defaults.secretResourceName;
    	      this.secretValueResourceName = defaults.secretValueResourceName;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSecretResourceName(Input<String> secretResourceName) {
            this.secretResourceName = Objects.requireNonNull(secretResourceName);
            return this;
        }

        public Builder setSecretResourceName(String secretResourceName) {
            this.secretResourceName = Input.of(Objects.requireNonNull(secretResourceName));
            return this;
        }

        public Builder setSecretValueResourceName(@Nullable Input<String> secretValueResourceName) {
            this.secretValueResourceName = secretValueResourceName;
            return this;
        }

        public Builder setSecretValueResourceName(@Nullable String secretValueResourceName) {
            this.secretValueResourceName = Input.ofNullable(secretValueResourceName);
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

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public SecretValueArgs build() {
            return new SecretValueArgs(location, resourceGroupName, secretResourceName, secretValueResourceName, tags, value);
        }
    }
}
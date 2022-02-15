// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.KeyToPathResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SecretVolumeSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretVolumeSourceResponse Empty = new SecretVolumeSourceResponse();

    @InputImport(name="defaultMode", required=true)
    private final Integer defaultMode;

    public Integer getDefaultMode() {
        return this.defaultMode;
    }

    @InputImport(name="items", required=true)
    private final List<KeyToPathResponse> items;

    public List<KeyToPathResponse> getItems() {
        return this.items;
    }

    @InputImport(name="optional", required=true)
    private final Boolean optional;

    public Boolean getOptional() {
        return this.optional;
    }

    @InputImport(name="secretName", required=true)
    private final String secretName;

    public String getSecretName() {
        return this.secretName;
    }

    public SecretVolumeSourceResponse(
        Integer defaultMode,
        List<KeyToPathResponse> items,
        Boolean optional,
        String secretName) {
        this.defaultMode = Objects.requireNonNull(defaultMode, "expected parameter 'defaultMode' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.optional = Objects.requireNonNull(optional, "expected parameter 'optional' to be non-null");
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private SecretVolumeSourceResponse() {
        this.defaultMode = null;
        this.items = List.of();
        this.optional = null;
        this.secretName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer defaultMode;
        private List<KeyToPathResponse> items;
        private Boolean optional;
        private String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.items = defaults.items;
    	      this.optional = defaults.optional;
    	      this.secretName = defaults.secretName;
        }

        public Builder setDefaultMode(Integer defaultMode) {
            this.defaultMode = Objects.requireNonNull(defaultMode);
            return this;
        }

        public Builder setItems(List<KeyToPathResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder setOptional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }

        public Builder setSecretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public SecretVolumeSourceResponse build() {
            return new SecretVolumeSourceResponse(defaultMode, items, optional, secretName);
        }
    }
}
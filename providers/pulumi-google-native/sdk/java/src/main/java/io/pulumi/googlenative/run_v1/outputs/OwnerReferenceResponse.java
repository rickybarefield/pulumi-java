// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class OwnerReferenceResponse {
    private final String apiVersion;
    private final Boolean blockOwnerDeletion;
    private final Boolean controller;
    private final String kind;
    private final String name;
    private final String uid;

    @OutputCustomType.Constructor({"apiVersion","blockOwnerDeletion","controller","kind","name","uid"})
    private OwnerReferenceResponse(
        String apiVersion,
        Boolean blockOwnerDeletion,
        Boolean controller,
        String kind,
        String name,
        String uid) {
        this.apiVersion = Objects.requireNonNull(apiVersion);
        this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
        this.controller = Objects.requireNonNull(controller);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.uid = Objects.requireNonNull(uid);
    }

    public String getApiVersion() {
        return this.apiVersion;
    }
    public Boolean getBlockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }
    public Boolean getController() {
        return this.controller;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getUid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OwnerReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private Boolean blockOwnerDeletion;
        private Boolean controller;
        private String kind;
        private String name;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(OwnerReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.blockOwnerDeletion = defaults.blockOwnerDeletion;
    	      this.controller = defaults.controller;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.uid = defaults.uid;
        }

        public Builder setApiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }

        public Builder setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
            this.blockOwnerDeletion = Objects.requireNonNull(blockOwnerDeletion);
            return this;
        }

        public Builder setController(Boolean controller) {
            this.controller = Objects.requireNonNull(controller);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public OwnerReferenceResponse build() {
            return new OwnerReferenceResponse(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
        }
    }
}
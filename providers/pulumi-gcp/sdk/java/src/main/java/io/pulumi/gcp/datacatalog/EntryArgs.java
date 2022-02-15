// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryArgs Empty = new EntryArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="entryGroup", required=true)
    private final Input<String> entryGroup;

    public Input<String> getEntryGroup() {
        return this.entryGroup;
    }

    @InputImport(name="entryId", required=true)
    private final Input<String> entryId;

    public Input<String> getEntryId() {
        return this.entryId;
    }

    @InputImport(name="gcsFilesetSpec")
    private final @Nullable Input<EntryGcsFilesetSpecArgs> gcsFilesetSpec;

    public Input<EntryGcsFilesetSpecArgs> getGcsFilesetSpec() {
        return this.gcsFilesetSpec == null ? Input.empty() : this.gcsFilesetSpec;
    }

    @InputImport(name="linkedResource")
    private final @Nullable Input<String> linkedResource;

    public Input<String> getLinkedResource() {
        return this.linkedResource == null ? Input.empty() : this.linkedResource;
    }

    @InputImport(name="schema")
    private final @Nullable Input<String> schema;

    public Input<String> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="userSpecifiedSystem")
    private final @Nullable Input<String> userSpecifiedSystem;

    public Input<String> getUserSpecifiedSystem() {
        return this.userSpecifiedSystem == null ? Input.empty() : this.userSpecifiedSystem;
    }

    @InputImport(name="userSpecifiedType")
    private final @Nullable Input<String> userSpecifiedType;

    public Input<String> getUserSpecifiedType() {
        return this.userSpecifiedType == null ? Input.empty() : this.userSpecifiedType;
    }

    public EntryArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> entryGroup,
        Input<String> entryId,
        @Nullable Input<EntryGcsFilesetSpecArgs> gcsFilesetSpec,
        @Nullable Input<String> linkedResource,
        @Nullable Input<String> schema,
        @Nullable Input<String> type,
        @Nullable Input<String> userSpecifiedSystem,
        @Nullable Input<String> userSpecifiedType) {
        this.description = description;
        this.displayName = displayName;
        this.entryGroup = Objects.requireNonNull(entryGroup, "expected parameter 'entryGroup' to be non-null");
        this.entryId = Objects.requireNonNull(entryId, "expected parameter 'entryId' to be non-null");
        this.gcsFilesetSpec = gcsFilesetSpec;
        this.linkedResource = linkedResource;
        this.schema = schema;
        this.type = type;
        this.userSpecifiedSystem = userSpecifiedSystem;
        this.userSpecifiedType = userSpecifiedType;
    }

    private EntryArgs() {
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.entryGroup = Input.empty();
        this.entryId = Input.empty();
        this.gcsFilesetSpec = Input.empty();
        this.linkedResource = Input.empty();
        this.schema = Input.empty();
        this.type = Input.empty();
        this.userSpecifiedSystem = Input.empty();
        this.userSpecifiedType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> entryGroup;
        private Input<String> entryId;
        private @Nullable Input<EntryGcsFilesetSpecArgs> gcsFilesetSpec;
        private @Nullable Input<String> linkedResource;
        private @Nullable Input<String> schema;
        private @Nullable Input<String> type;
        private @Nullable Input<String> userSpecifiedSystem;
        private @Nullable Input<String> userSpecifiedType;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entryGroup = defaults.entryGroup;
    	      this.entryId = defaults.entryId;
    	      this.gcsFilesetSpec = defaults.gcsFilesetSpec;
    	      this.linkedResource = defaults.linkedResource;
    	      this.schema = defaults.schema;
    	      this.type = defaults.type;
    	      this.userSpecifiedSystem = defaults.userSpecifiedSystem;
    	      this.userSpecifiedType = defaults.userSpecifiedType;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setEntryGroup(Input<String> entryGroup) {
            this.entryGroup = Objects.requireNonNull(entryGroup);
            return this;
        }

        public Builder setEntryGroup(String entryGroup) {
            this.entryGroup = Input.of(Objects.requireNonNull(entryGroup));
            return this;
        }

        public Builder setEntryId(Input<String> entryId) {
            this.entryId = Objects.requireNonNull(entryId);
            return this;
        }

        public Builder setEntryId(String entryId) {
            this.entryId = Input.of(Objects.requireNonNull(entryId));
            return this;
        }

        public Builder setGcsFilesetSpec(@Nullable Input<EntryGcsFilesetSpecArgs> gcsFilesetSpec) {
            this.gcsFilesetSpec = gcsFilesetSpec;
            return this;
        }

        public Builder setGcsFilesetSpec(@Nullable EntryGcsFilesetSpecArgs gcsFilesetSpec) {
            this.gcsFilesetSpec = Input.ofNullable(gcsFilesetSpec);
            return this;
        }

        public Builder setLinkedResource(@Nullable Input<String> linkedResource) {
            this.linkedResource = linkedResource;
            return this;
        }

        public Builder setLinkedResource(@Nullable String linkedResource) {
            this.linkedResource = Input.ofNullable(linkedResource);
            return this;
        }

        public Builder setSchema(@Nullable Input<String> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable String schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserSpecifiedSystem(@Nullable Input<String> userSpecifiedSystem) {
            this.userSpecifiedSystem = userSpecifiedSystem;
            return this;
        }

        public Builder setUserSpecifiedSystem(@Nullable String userSpecifiedSystem) {
            this.userSpecifiedSystem = Input.ofNullable(userSpecifiedSystem);
            return this;
        }

        public Builder setUserSpecifiedType(@Nullable Input<String> userSpecifiedType) {
            this.userSpecifiedType = userSpecifiedType;
            return this;
        }

        public Builder setUserSpecifiedType(@Nullable String userSpecifiedType) {
            this.userSpecifiedType = Input.ofNullable(userSpecifiedType);
            return this;
        }

        public EntryArgs build() {
            return new EntryArgs(description, displayName, entryGroup, entryId, gcsFilesetSpec, linkedResource, schema, type, userSpecifiedSystem, userSpecifiedType);
        }
    }
}
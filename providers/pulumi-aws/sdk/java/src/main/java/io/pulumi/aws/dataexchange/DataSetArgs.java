// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dataexchange;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetArgs Empty = new DataSetArgs();

    /**
     * The type of asset that is added to a data set. Valid values are: `S3_SNAPSHOT`, `REDSHIFT_DATA_SHARE`, and `API_GATEWAY_API`.
     * 
     */
    @InputImport(name="assetType", required=true)
    private final Input<String> assetType;

    public Input<String> getAssetType() {
        return this.assetType;
    }

    /**
     * A description for the data set.
     * 
     */
    @InputImport(name="description", required=true)
    private final Input<String> description;

    public Input<String> getDescription() {
        return this.description;
    }

    /**
     * The name of the data set.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public DataSetArgs(
        Input<String> assetType,
        Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.assetType = Objects.requireNonNull(assetType, "expected parameter 'assetType' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private DataSetArgs() {
        this.assetType = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> assetType;
        private Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetType = defaults.assetType;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setAssetType(Input<String> assetType) {
            this.assetType = Objects.requireNonNull(assetType);
            return this;
        }

        public Builder setAssetType(String assetType) {
            this.assetType = Input.of(Objects.requireNonNull(assetType));
            return this;
        }

        public Builder setDescription(Input<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Input.of(Objects.requireNonNull(description));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public DataSetArgs build() {
            return new DataSetArgs(assetType, description, name, tags, tagsAll);
        }
    }
}
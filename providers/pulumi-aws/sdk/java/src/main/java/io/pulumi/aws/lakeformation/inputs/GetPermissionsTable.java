// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPermissionsTable extends io.pulumi.resources.InvokeArgs {

    public static final GetPermissionsTable Empty = new GetPermissionsTable();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @InputImport(name="catalogId", required=true)
    private final String catalogId;

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    @InputImport(name="databaseName", required=true)
    private final String databaseName;

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Name of the table resource.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    @InputImport(name="wildcard")
    private final @Nullable Boolean wildcard;

    public Optional<Boolean> getWildcard() {
        return this.wildcard == null ? Optional.empty() : Optional.ofNullable(this.wildcard);
    }

    public GetPermissionsTable(
        String catalogId,
        String databaseName,
        String name,
        @Nullable Boolean wildcard) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.wildcard = wildcard;
    }

    private GetPermissionsTable() {
        this.catalogId = null;
        this.databaseName = null;
        this.name = null;
        this.wildcard = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String databaseName;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setWildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }
        public GetPermissionsTable build() {
            return new GetPermissionsTable(catalogId, databaseName, name, wildcard);
        }
    }
}
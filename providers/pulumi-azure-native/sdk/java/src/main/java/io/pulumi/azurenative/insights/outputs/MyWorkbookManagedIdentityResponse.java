// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MyWorkbookUserAssignedIdentitiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MyWorkbookManagedIdentityResponse {
    private final @Nullable String type;
    private final @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

    @OutputCustomType.Constructor({"type","userAssignedIdentities"})
    private MyWorkbookManagedIdentityResponse(
        @Nullable String type,
        @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<MyWorkbookUserAssignedIdentitiesResponse> getUserAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MyWorkbookManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(MyWorkbookManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable MyWorkbookUserAssignedIdentitiesResponse userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public MyWorkbookManagedIdentityResponse build() {
            return new MyWorkbookManagedIdentityResponse(type, userAssignedIdentities);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1.enums.VersionKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VersionArgs Empty = new VersionArgs();

    @InputImport(name="epoch")
    private final @Nullable Input<Integer> epoch;

    public Input<Integer> getEpoch() {
        return this.epoch == null ? Input.empty() : this.epoch;
    }

    @InputImport(name="fullName")
    private final @Nullable Input<String> fullName;

    public Input<String> getFullName() {
        return this.fullName == null ? Input.empty() : this.fullName;
    }

    @InputImport(name="inclusive")
    private final @Nullable Input<Boolean> inclusive;

    public Input<Boolean> getInclusive() {
        return this.inclusive == null ? Input.empty() : this.inclusive;
    }

    @InputImport(name="kind", required=true)
    private final Input<VersionKind> kind;

    public Input<VersionKind> getKind() {
        return this.kind;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="revision")
    private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    public VersionArgs(
        @Nullable Input<Integer> epoch,
        @Nullable Input<String> fullName,
        @Nullable Input<Boolean> inclusive,
        Input<VersionKind> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> revision) {
        this.epoch = epoch;
        this.fullName = fullName;
        this.inclusive = inclusive;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.revision = revision;
    }

    private VersionArgs() {
        this.epoch = Input.empty();
        this.fullName = Input.empty();
        this.inclusive = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.revision = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> epoch;
        private @Nullable Input<String> fullName;
        private @Nullable Input<Boolean> inclusive;
        private Input<VersionKind> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(VersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.epoch = defaults.epoch;
    	      this.fullName = defaults.fullName;
    	      this.inclusive = defaults.inclusive;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder setEpoch(@Nullable Input<Integer> epoch) {
            this.epoch = epoch;
            return this;
        }

        public Builder setEpoch(@Nullable Integer epoch) {
            this.epoch = Input.ofNullable(epoch);
            return this;
        }

        public Builder setFullName(@Nullable Input<String> fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setFullName(@Nullable String fullName) {
            this.fullName = Input.ofNullable(fullName);
            return this;
        }

        public Builder setInclusive(@Nullable Input<Boolean> inclusive) {
            this.inclusive = inclusive;
            return this;
        }

        public Builder setInclusive(@Nullable Boolean inclusive) {
            this.inclusive = Input.ofNullable(inclusive);
            return this;
        }

        public Builder setKind(Input<VersionKind> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(VersionKind kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setRevision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder setRevision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public VersionArgs build() {
            return new VersionArgs(epoch, fullName, inclusive, kind, name, revision);
        }
    }
}
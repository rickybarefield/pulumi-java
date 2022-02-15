// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.inputs;

import io.pulumi.azurenative.customproviders.enums.ValidationType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomRPValidationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomRPValidationsArgs Empty = new CustomRPValidationsArgs();

    @InputImport(name="specification", required=true)
    private final Input<String> specification;

    public Input<String> getSpecification() {
        return this.specification;
    }

    @InputImport(name="validationType")
    private final @Nullable Input<Either<String,ValidationType>> validationType;

    public Input<Either<String,ValidationType>> getValidationType() {
        return this.validationType == null ? Input.empty() : this.validationType;
    }

    public CustomRPValidationsArgs(
        Input<String> specification,
        @Nullable Input<Either<String,ValidationType>> validationType) {
        this.specification = Objects.requireNonNull(specification, "expected parameter 'specification' to be non-null");
        this.validationType = validationType;
    }

    private CustomRPValidationsArgs() {
        this.specification = Input.empty();
        this.validationType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPValidationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> specification;
        private @Nullable Input<Either<String,ValidationType>> validationType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPValidationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specification = defaults.specification;
    	      this.validationType = defaults.validationType;
        }

        public Builder setSpecification(Input<String> specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }

        public Builder setSpecification(String specification) {
            this.specification = Input.of(Objects.requireNonNull(specification));
            return this;
        }

        public Builder setValidationType(@Nullable Input<Either<String,ValidationType>> validationType) {
            this.validationType = validationType;
            return this;
        }

        public Builder setValidationType(@Nullable Either<String,ValidationType> validationType) {
            this.validationType = Input.ofNullable(validationType);
            return this;
        }

        public CustomRPValidationsArgs build() {
            return new CustomRPValidationsArgs(specification, validationType);
        }
    }
}
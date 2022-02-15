// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleGetArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherGetArgs Empty = new RegionUrlMapPathMatcherGetArgs();

    @InputImport(name="defaultService")
    private final @Nullable Input<String> defaultService;

    public Input<String> getDefaultService() {
        return this.defaultService == null ? Input.empty() : this.defaultService;
    }

    @InputImport(name="defaultUrlRedirect")
    private final @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs> defaultUrlRedirect;

    public Input<RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect == null ? Input.empty() : this.defaultUrlRedirect;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="pathRules")
    private final @Nullable Input<List<RegionUrlMapPathMatcherPathRuleGetArgs>> pathRules;

    public Input<List<RegionUrlMapPathMatcherPathRuleGetArgs>> getPathRules() {
        return this.pathRules == null ? Input.empty() : this.pathRules;
    }

    @InputImport(name="routeRules")
    private final @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleGetArgs>> routeRules;

    public Input<List<RegionUrlMapPathMatcherRouteRuleGetArgs>> getRouteRules() {
        return this.routeRules == null ? Input.empty() : this.routeRules;
    }

    public RegionUrlMapPathMatcherGetArgs(
        @Nullable Input<String> defaultService,
        @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs> defaultUrlRedirect,
        @Nullable Input<String> description,
        Input<String> name,
        @Nullable Input<List<RegionUrlMapPathMatcherPathRuleGetArgs>> pathRules,
        @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleGetArgs>> routeRules) {
        this.defaultService = defaultService;
        this.defaultUrlRedirect = defaultUrlRedirect;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.pathRules = pathRules;
        this.routeRules = routeRules;
    }

    private RegionUrlMapPathMatcherGetArgs() {
        this.defaultService = Input.empty();
        this.defaultUrlRedirect = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.pathRules = Input.empty();
        this.routeRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> defaultService;
        private @Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs> defaultUrlRedirect;
        private @Nullable Input<String> description;
        private Input<String> name;
        private @Nullable Input<List<RegionUrlMapPathMatcherPathRuleGetArgs>> pathRules;
        private @Nullable Input<List<RegionUrlMapPathMatcherRouteRuleGetArgs>> routeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultService = defaults.defaultService;
    	      this.defaultUrlRedirect = defaults.defaultUrlRedirect;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.routeRules = defaults.routeRules;
        }

        public Builder setDefaultService(@Nullable Input<String> defaultService) {
            this.defaultService = defaultService;
            return this;
        }

        public Builder setDefaultService(@Nullable String defaultService) {
            this.defaultService = Input.ofNullable(defaultService);
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable Input<RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs> defaultUrlRedirect) {
            this.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        public Builder setDefaultUrlRedirect(@Nullable RegionUrlMapPathMatcherDefaultUrlRedirectGetArgs defaultUrlRedirect) {
            this.defaultUrlRedirect = Input.ofNullable(defaultUrlRedirect);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPathRules(@Nullable Input<List<RegionUrlMapPathMatcherPathRuleGetArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setPathRules(@Nullable List<RegionUrlMapPathMatcherPathRuleGetArgs> pathRules) {
            this.pathRules = Input.ofNullable(pathRules);
            return this;
        }

        public Builder setRouteRules(@Nullable Input<List<RegionUrlMapPathMatcherRouteRuleGetArgs>> routeRules) {
            this.routeRules = routeRules;
            return this;
        }

        public Builder setRouteRules(@Nullable List<RegionUrlMapPathMatcherRouteRuleGetArgs> routeRules) {
            this.routeRules = Input.ofNullable(routeRules);
            return this;
        }

        public RegionUrlMapPathMatcherGetArgs build() {
            return new RegionUrlMapPathMatcherGetArgs(defaultService, defaultUrlRedirect, description, name, pathRules, routeRules);
        }
    }
}
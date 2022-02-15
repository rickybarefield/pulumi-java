// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.RegionUrlMapArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapState;
import io.pulumi.gcp.compute.outputs.RegionUrlMapDefaultUrlRedirect;
import io.pulumi.gcp.compute.outputs.RegionUrlMapHostRule;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcher;
import io.pulumi.gcp.compute.outputs.RegionUrlMapTest;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:compute/regionUrlMap:RegionUrlMap")
public class RegionUrlMap extends io.pulumi.resources.CustomResource {
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="defaultService", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultService;

    public Output</* @Nullable */ String> getDefaultService() {
        return this.defaultService;
    }
    @OutputExport(name="defaultUrlRedirect", type=RegionUrlMapDefaultUrlRedirect.class, parameters={})
    private Output</* @Nullable */ RegionUrlMapDefaultUrlRedirect> defaultUrlRedirect;

    public Output</* @Nullable */ RegionUrlMapDefaultUrlRedirect> getDefaultUrlRedirect() {
        return this.defaultUrlRedirect;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    @OutputExport(name="hostRules", type=List.class, parameters={RegionUrlMapHostRule.class})
    private Output</* @Nullable */ List<RegionUrlMapHostRule>> hostRules;

    public Output</* @Nullable */ List<RegionUrlMapHostRule>> getHostRules() {
        return this.hostRules;
    }
    @OutputExport(name="mapId", type=Integer.class, parameters={})
    private Output<Integer> mapId;

    public Output<Integer> getMapId() {
        return this.mapId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="pathMatchers", type=List.class, parameters={RegionUrlMapPathMatcher.class})
    private Output</* @Nullable */ List<RegionUrlMapPathMatcher>> pathMatchers;

    public Output</* @Nullable */ List<RegionUrlMapPathMatcher>> getPathMatchers() {
        return this.pathMatchers;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="tests", type=List.class, parameters={RegionUrlMapTest.class})
    private Output</* @Nullable */ List<RegionUrlMapTest>> tests;

    public Output</* @Nullable */ List<RegionUrlMapTest>> getTests() {
        return this.tests;
    }

    public RegionUrlMap(String name, @Nullable RegionUrlMapArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionUrlMap:RegionUrlMap", name, args == null ? RegionUrlMapArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegionUrlMap(String name, Input<String> id, @Nullable RegionUrlMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionUrlMap:RegionUrlMap", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RegionUrlMap get(String name, Input<String> id, @Nullable RegionUrlMapState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionUrlMap(name, id, state, options);
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.HmacKeyArgs;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="google-native:storage/v1:HmacKey")
public class HmacKey extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessId", type=String.class, parameters={})
    private Output<String> accessId;

    public Output<String> getAccessId() {
        return this.accessId;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="serviceAccountEmail", type=String.class, parameters={})
    private Output<String> serviceAccountEmail;

    public Output<String> getServiceAccountEmail() {
        return this.serviceAccountEmail;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    public Output<String> getTimeCreated() {
        return this.timeCreated;
    }
    @OutputExport(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    public Output<String> getUpdated() {
        return this.updated;
    }

    public HmacKey(String name, HmacKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:HmacKey", name, args == null ? HmacKeyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private HmacKey(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:HmacKey", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static HmacKey get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HmacKey(name, id, options);
    }
}
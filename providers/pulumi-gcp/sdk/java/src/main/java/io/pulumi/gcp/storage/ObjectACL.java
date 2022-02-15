// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.storage.ObjectACLArgs;
import io.pulumi.gcp.storage.inputs.ObjectACLState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="gcp:storage/objectACL:ObjectACL")
public class ObjectACL extends io.pulumi.resources.CustomResource {
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket;
    }
    @OutputExport(name="object", type=String.class, parameters={})
    private Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }
    @OutputExport(name="predefinedAcl", type=String.class, parameters={})
    private Output</* @Nullable */ String> predefinedAcl;

    public Output</* @Nullable */ String> getPredefinedAcl() {
        return this.predefinedAcl;
    }
    @OutputExport(name="roleEntities", type=List.class, parameters={String.class})
    private Output<List<String>> roleEntities;

    public Output<List<String>> getRoleEntities() {
        return this.roleEntities;
    }

    public ObjectACL(String name, ObjectACLArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectACL:ObjectACL", name, args == null ? ObjectACLArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ObjectACL(String name, Input<String> id, @Nullable ObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:storage/objectACL:ObjectACL", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ObjectACL get(String name, Input<String> id, @Nullable ObjectACLState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ObjectACL(name, id, state, options);
    }
}
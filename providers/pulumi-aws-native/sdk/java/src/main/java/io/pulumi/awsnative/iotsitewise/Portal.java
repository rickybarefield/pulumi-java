// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotsitewise.PortalArgs;
import io.pulumi.awsnative.iotsitewise.outputs.AlarmsProperties;
import io.pulumi.awsnative.iotsitewise.outputs.PortalTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:iotsitewise:Portal")
public class Portal extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alarms", type=AlarmsProperties.class, parameters={})
    private Output</* @Nullable */ AlarmsProperties> alarms;

    public Output</* @Nullable */ AlarmsProperties> getAlarms() {
        return this.alarms;
    }
    @OutputExport(name="notificationSenderEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationSenderEmail;

    public Output</* @Nullable */ String> getNotificationSenderEmail() {
        return this.notificationSenderEmail;
    }
    @OutputExport(name="portalArn", type=String.class, parameters={})
    private Output<String> portalArn;

    public Output<String> getPortalArn() {
        return this.portalArn;
    }
    @OutputExport(name="portalAuthMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> portalAuthMode;

    public Output</* @Nullable */ String> getPortalAuthMode() {
        return this.portalAuthMode;
    }
    @OutputExport(name="portalClientId", type=String.class, parameters={})
    private Output<String> portalClientId;

    public Output<String> getPortalClientId() {
        return this.portalClientId;
    }
    @OutputExport(name="portalContactEmail", type=String.class, parameters={})
    private Output<String> portalContactEmail;

    public Output<String> getPortalContactEmail() {
        return this.portalContactEmail;
    }
    @OutputExport(name="portalDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> portalDescription;

    public Output</* @Nullable */ String> getPortalDescription() {
        return this.portalDescription;
    }
    @OutputExport(name="portalId", type=String.class, parameters={})
    private Output<String> portalId;

    public Output<String> getPortalId() {
        return this.portalId;
    }
    @OutputExport(name="portalName", type=String.class, parameters={})
    private Output<String> portalName;

    public Output<String> getPortalName() {
        return this.portalName;
    }
    @OutputExport(name="portalStartUrl", type=String.class, parameters={})
    private Output<String> portalStartUrl;

    public Output<String> getPortalStartUrl() {
        return this.portalStartUrl;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="tags", type=List.class, parameters={PortalTag.class})
    private Output</* @Nullable */ List<PortalTag>> tags;

    public Output</* @Nullable */ List<PortalTag>> getTags() {
        return this.tags;
    }

    public Portal(String name, PortalArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Portal", name, args == null ? PortalArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Portal(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotsitewise:Portal", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Portal get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Portal(name, id, options);
    }
}
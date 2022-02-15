// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.applicationinsights.ApplicationArgs;
import io.pulumi.awsnative.applicationinsights.outputs.ApplicationComponentMonitoringSetting;
import io.pulumi.awsnative.applicationinsights.outputs.ApplicationCustomComponent;
import io.pulumi.awsnative.applicationinsights.outputs.ApplicationLogPatternSet;
import io.pulumi.awsnative.applicationinsights.outputs.ApplicationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:applicationinsights:Application")
public class Application extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationARN", type=String.class, parameters={})
    private Output<String> applicationARN;

    public Output<String> getApplicationARN() {
        return this.applicationARN;
    }
    @OutputExport(name="autoConfigurationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoConfigurationEnabled;

    public Output</* @Nullable */ Boolean> getAutoConfigurationEnabled() {
        return this.autoConfigurationEnabled;
    }
    @OutputExport(name="cWEMonitorEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> cWEMonitorEnabled;

    public Output</* @Nullable */ Boolean> getCWEMonitorEnabled() {
        return this.cWEMonitorEnabled;
    }
    @OutputExport(name="componentMonitoringSettings", type=List.class, parameters={ApplicationComponentMonitoringSetting.class})
    private Output</* @Nullable */ List<ApplicationComponentMonitoringSetting>> componentMonitoringSettings;

    public Output</* @Nullable */ List<ApplicationComponentMonitoringSetting>> getComponentMonitoringSettings() {
        return this.componentMonitoringSettings;
    }
    @OutputExport(name="customComponents", type=List.class, parameters={ApplicationCustomComponent.class})
    private Output</* @Nullable */ List<ApplicationCustomComponent>> customComponents;

    public Output</* @Nullable */ List<ApplicationCustomComponent>> getCustomComponents() {
        return this.customComponents;
    }
    @OutputExport(name="logPatternSets", type=List.class, parameters={ApplicationLogPatternSet.class})
    private Output</* @Nullable */ List<ApplicationLogPatternSet>> logPatternSets;

    public Output</* @Nullable */ List<ApplicationLogPatternSet>> getLogPatternSets() {
        return this.logPatternSets;
    }
    @OutputExport(name="opsCenterEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> opsCenterEnabled;

    public Output</* @Nullable */ Boolean> getOpsCenterEnabled() {
        return this.opsCenterEnabled;
    }
    @OutputExport(name="opsItemSNSTopicArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> opsItemSNSTopicArn;

    public Output</* @Nullable */ String> getOpsItemSNSTopicArn() {
        return this.opsItemSNSTopicArn;
    }
    @OutputExport(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }
    @OutputExport(name="tags", type=List.class, parameters={ApplicationTag.class})
    private Output</* @Nullable */ List<ApplicationTag>> tags;

    public Output</* @Nullable */ List<ApplicationTag>> getTags() {
        return this.tags;
    }

    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:applicationinsights:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Application(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:applicationinsights:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Application get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}
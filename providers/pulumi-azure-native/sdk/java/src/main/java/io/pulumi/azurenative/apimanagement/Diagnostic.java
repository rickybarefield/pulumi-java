// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.DiagnosticArgs;
import io.pulumi.azurenative.apimanagement.outputs.PipelineDiagnosticSettingsResponse;
import io.pulumi.azurenative.apimanagement.outputs.SamplingSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:apimanagement:Diagnostic")
public class Diagnostic extends io.pulumi.resources.CustomResource {
    @OutputExport(name="alwaysLog", type=String.class, parameters={})
    private Output</* @Nullable */ String> alwaysLog;

    public Output</* @Nullable */ String> getAlwaysLog() {
        return this.alwaysLog;
    }
    @OutputExport(name="backend", type=PipelineDiagnosticSettingsResponse.class, parameters={})
    private Output</* @Nullable */ PipelineDiagnosticSettingsResponse> backend;

    public Output</* @Nullable */ PipelineDiagnosticSettingsResponse> getBackend() {
        return this.backend;
    }
    @OutputExport(name="frontend", type=PipelineDiagnosticSettingsResponse.class, parameters={})
    private Output</* @Nullable */ PipelineDiagnosticSettingsResponse> frontend;

    public Output</* @Nullable */ PipelineDiagnosticSettingsResponse> getFrontend() {
        return this.frontend;
    }
    @OutputExport(name="httpCorrelationProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpCorrelationProtocol;

    public Output</* @Nullable */ String> getHttpCorrelationProtocol() {
        return this.httpCorrelationProtocol;
    }
    @OutputExport(name="logClientIp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> logClientIp;

    public Output</* @Nullable */ Boolean> getLogClientIp() {
        return this.logClientIp;
    }
    @OutputExport(name="loggerId", type=String.class, parameters={})
    private Output<String> loggerId;

    public Output<String> getLoggerId() {
        return this.loggerId;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="operationNameFormat", type=String.class, parameters={})
    private Output</* @Nullable */ String> operationNameFormat;

    public Output</* @Nullable */ String> getOperationNameFormat() {
        return this.operationNameFormat;
    }
    @OutputExport(name="sampling", type=SamplingSettingsResponse.class, parameters={})
    private Output</* @Nullable */ SamplingSettingsResponse> sampling;

    public Output</* @Nullable */ SamplingSettingsResponse> getSampling() {
        return this.sampling;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="verbosity", type=String.class, parameters={})
    private Output</* @Nullable */ String> verbosity;

    public Output</* @Nullable */ String> getVerbosity() {
        return this.verbosity;
    }

    public Diagnostic(String name, DiagnosticArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Diagnostic", name, args == null ? DiagnosticArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Diagnostic(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:apimanagement:Diagnostic", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20170301:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180101:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20180601preview:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20190101:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20191201preview:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20200601preview:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20201201:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210101preview:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210401preview:Diagnostic").build()),
                Input.of(Alias.builder().setType("azure-native:apimanagement/v20210801:Diagnostic").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Diagnostic get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Diagnostic(name, id, options);
    }
}